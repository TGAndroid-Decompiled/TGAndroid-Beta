package org.telegram.ui.Adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$RecentMeUrl;
import org.telegram.tgnet.TLRPC$RequestPeerType;
import org.telegram.tgnet.TLRPC$TL_chatlists_chatlistUpdates;
import org.telegram.tgnet.TLRPC$TL_contact;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeBroadcast;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Cells.ArchiveHintCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.DialogsRequestedEmptyCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RequestPeerRequirementsCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
public class DialogsAdapter extends RecyclerListView.SelectionAdapter implements DialogCell.DialogCellDelegate {
    private ArchiveHintCell archiveHintCell;
    private Drawable arrowDrawable;
    private boolean collapsedView;
    private int currentAccount;
    private int currentCount;
    private int dialogsCount;
    private boolean dialogsListFrozen;
    private int dialogsType;
    private int folderId;
    private boolean forceShowEmptyCell;
    private boolean forceUpdatingContacts;
    private boolean hasChatlistHint;
    private boolean hasHints;
    public boolean isEmpty;
    private boolean isOnlySelect;
    private boolean isReordering;
    private boolean isTransitionSupport;
    private long lastSortTime;
    private Context mContext;
    private ArrayList<TLRPC$TL_contact> onlineContacts;
    private long openedDialogId;
    private DialogsActivity parentFragment;
    private DialogsPreloader preloader;
    private PullForegroundDrawable pullForegroundDrawable;
    private TLRPC$RequestPeerType requestPeerType;
    private ArrayList<Long> selectedDialogs;
    private boolean showArchiveHint;
    ArrayList<ItemInternal> itemInternals = new ArrayList<>();
    ArrayList<ItemInternal> oldItems = new ArrayList<>();
    public int lastDialogsEmptyType = -1;

    public boolean isDataSetChanged() {
        return true;
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    public void onCreateGroupForThisClick() {
    }

    public void setRecyclerListView(RecyclerListView recyclerListView) {
    }

    public DialogsAdapter(DialogsActivity dialogsActivity, Context context, int i, int i2, boolean z, ArrayList<Long> arrayList, int i3, TLRPC$RequestPeerType tLRPC$RequestPeerType) {
        this.mContext = context;
        this.parentFragment = dialogsActivity;
        this.dialogsType = i;
        this.folderId = i2;
        this.isOnlySelect = z;
        this.hasHints = i2 == 0 && i == 0 && !z;
        this.selectedDialogs = arrayList;
        this.currentAccount = i3;
        if (i2 == 1) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            this.showArchiveHint = globalMainSettings.getBoolean("archivehint", true);
            globalMainSettings.edit().putBoolean("archivehint", false).commit();
        }
        if (i2 == 0) {
            this.preloader = new DialogsPreloader();
        }
        this.requestPeerType = tLRPC$RequestPeerType;
    }

    public void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public void onReorderStateChanged(boolean z) {
        this.isReordering = z;
    }

    public int fixPosition(int i) {
        int i2;
        if (this.hasChatlistHint) {
            i--;
        }
        if (this.hasHints) {
            i -= MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
        }
        return (this.showArchiveHint || (i2 = this.dialogsType) == 11 || i2 == 13) ? i - 2 : i2 == 12 ? i - 1 : i;
    }

    public void setDialogsType(int i) {
        this.dialogsType = i;
        notifyDataSetChanged();
    }

    public int getDialogsType() {
        return this.dialogsType;
    }

    public int getDialogsCount() {
        return this.dialogsCount;
    }

    @Override
    public int getItemCount() {
        int size = this.itemInternals.size();
        this.currentCount = size;
        return size;
    }

    public int findDialogPosition(long j) {
        for (int i = 0; i < this.itemInternals.size(); i++) {
            if (this.itemInternals.get(i).dialog != null && this.itemInternals.get(i).dialog.id == j) {
                return i;
            }
        }
        return -1;
    }

    public int fixScrollGap(RecyclerListView recyclerListView, int i, int i2, boolean z, boolean z2) {
        int dp;
        int itemCount = getItemCount() - i;
        int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
        int paddingTop = (((recyclerListView.getPaddingTop() + i2) + (itemCount * dp2)) + itemCount) - 1;
        int paddingTop2 = ((recyclerListView.getPaddingTop() + i2) - (i * dp2)) - i;
        if (z2) {
            dp = paddingTop - AndroidUtilities.dp(44.0f);
        } else {
            dp = paddingTop + AndroidUtilities.dp(44.0f);
        }
        if (z) {
            paddingTop2 += dp2;
        }
        if (paddingTop2 > recyclerListView.getPaddingTop()) {
            return (i2 + recyclerListView.getPaddingTop()) - paddingTop2;
        }
        return dp < recyclerListView.getMeasuredHeight() ? i2 + (recyclerListView.getMeasuredHeight() - dp) : i2;
    }

    public class ItemInternal extends AdapterWithDiffUtils.Item {
        TLRPC$TL_chatlists_chatlistUpdates chatlistUpdates;
        TLRPC$TL_contact contact;
        TLRPC$Dialog dialog;
        private boolean isFolder;
        boolean isForumCell;
        private boolean pinned;
        TLRPC$RecentMeUrl recentMeUrl;

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC$TL_chatlists_chatlistUpdates tLRPC$TL_chatlists_chatlistUpdates) {
            super(17, true);
            this.chatlistUpdates = tLRPC$TL_chatlists_chatlistUpdates;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, TLRPC$Dialog tLRPC$Dialog) {
            super(i, true);
            boolean z = true;
            this.dialog = tLRPC$Dialog;
            if (tLRPC$Dialog != null) {
                if (dialogsAdapter.dialogsType == 7 || dialogsAdapter.dialogsType == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(dialogsAdapter.currentAccount).selectedDialogFilter[dialogsAdapter.dialogsType == 8 ? (char) 1 : (char) 0];
                    this.pinned = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(tLRPC$Dialog.id) < 0) ? false : false;
                } else {
                    this.pinned = tLRPC$Dialog.pinned;
                }
                this.isFolder = tLRPC$Dialog.isFolder;
                this.isForumCell = MessagesController.getInstance(dialogsAdapter.currentAccount).isForum(tLRPC$Dialog.id);
            }
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, TLRPC$RecentMeUrl tLRPC$RecentMeUrl) {
            super(i, true);
            this.recentMeUrl = tLRPC$RecentMeUrl;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i) {
            super(i, true);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, TLRPC$TL_contact tLRPC$TL_contact) {
            super(i, true);
            this.contact = tLRPC$TL_contact;
        }

        boolean compare(ItemInternal itemInternal) {
            TLRPC$TL_contact tLRPC$TL_contact;
            String str;
            TLRPC$Dialog tLRPC$Dialog;
            TLRPC$Dialog tLRPC$Dialog2;
            int i = this.viewType;
            if (i != itemInternal.viewType) {
                return false;
            }
            if (i == 0) {
                TLRPC$Dialog tLRPC$Dialog3 = this.dialog;
                return tLRPC$Dialog3 != null && (tLRPC$Dialog2 = itemInternal.dialog) != null && tLRPC$Dialog3.id == tLRPC$Dialog2.id && this.isFolder == itemInternal.isFolder && this.isForumCell == itemInternal.isForumCell && this.pinned == itemInternal.pinned;
            } else if (i == 14) {
                TLRPC$Dialog tLRPC$Dialog4 = this.dialog;
                return tLRPC$Dialog4 != null && (tLRPC$Dialog = itemInternal.dialog) != null && tLRPC$Dialog4.id == tLRPC$Dialog.id && tLRPC$Dialog4.isFolder == tLRPC$Dialog.isFolder;
            } else if (i == 4) {
                TLRPC$RecentMeUrl tLRPC$RecentMeUrl = this.recentMeUrl;
                return (tLRPC$RecentMeUrl == null || itemInternal.recentMeUrl == null || (str = tLRPC$RecentMeUrl.url) == null || !str.equals(str)) ? false : true;
            } else if (i == 6) {
                TLRPC$TL_contact tLRPC$TL_contact2 = this.contact;
                return (tLRPC$TL_contact2 == null || (tLRPC$TL_contact = itemInternal.contact) == null || tLRPC$TL_contact2.user_id != tLRPC$TL_contact.user_id) ? false : true;
            } else {
                return true;
            }
        }

        public int hashCode() {
            return Objects.hash(this.dialog, this.recentMeUrl, this.contact);
        }
    }

    public TLObject getItem(int i) {
        if (i >= 0 && i < this.itemInternals.size()) {
            if (this.itemInternals.get(i).dialog != null) {
                return this.itemInternals.get(i).dialog;
            }
            if (this.itemInternals.get(i).contact != null) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.itemInternals.get(i).contact.user_id));
            }
            if (this.itemInternals.get(i).recentMeUrl != null) {
                return this.itemInternals.get(i).recentMeUrl;
            }
        }
        return null;
    }

    public void sortOnlineContacts(boolean z) {
        if (this.onlineContacts != null) {
            if (!z || SystemClock.elapsedRealtime() - this.lastSortTime >= 2000) {
                this.lastSortTime = SystemClock.elapsedRealtime();
                try {
                    final int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                    Collections.sort(this.onlineContacts, new Comparator() {
                        @Override
                        public final int compare(Object obj, Object obj2) {
                            int lambda$sortOnlineContacts$0;
                            lambda$sortOnlineContacts$0 = DialogsAdapter.lambda$sortOnlineContacts$0(MessagesController.this, currentTime, (TLRPC$TL_contact) obj, (TLRPC$TL_contact) obj2);
                            return lambda$sortOnlineContacts$0;
                        }
                    });
                    if (z) {
                        notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static int lambda$sortOnlineContacts$0(org.telegram.messenger.MessagesController r2, int r3, org.telegram.tgnet.TLRPC$TL_contact r4, org.telegram.tgnet.TLRPC$TL_contact r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsAdapter.lambda$sortOnlineContacts$0(org.telegram.messenger.MessagesController, int, org.telegram.tgnet.TLRPC$TL_contact, org.telegram.tgnet.TLRPC$TL_contact):int");
    }

    public void setDialogsListFrozen(boolean z) {
        this.dialogsListFrozen = z;
    }

    public boolean getDialogsListIsFrozen() {
        return this.dialogsListFrozen;
    }

    public ViewPager getArchiveHintCellPager() {
        ArchiveHintCell archiveHintCell = this.archiveHintCell;
        if (archiveHintCell != null) {
            return archiveHintCell.getViewPager();
        }
        return null;
    }

    public void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    public void updateList(RecyclerListView recyclerListView, boolean z, float f) {
        this.oldItems.clear();
        this.oldItems.addAll(this.itemInternals);
        updateItemList();
        if (recyclerListView != null && recyclerListView.getScrollState() == 0 && recyclerListView.getChildCount() > 0 && recyclerListView.getLayoutManager() != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerListView.getLayoutManager();
            View view = null;
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i2 = -1;
            for (int i3 = 0; i3 < recyclerListView.getChildCount(); i3++) {
                int childAdapterPosition = recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(i3));
                View childAt = recyclerListView.getChildAt(i3);
                if (childAdapterPosition != -1 && childAt != null && childAt.getTop() < i) {
                    i = childAt.getTop();
                    i2 = childAdapterPosition;
                    view = childAt;
                }
            }
            if (view != null) {
                float top = (view.getTop() - recyclerListView.getPaddingTop()) + f;
                if (z && i2 == 0) {
                    if ((view.getTop() - recyclerListView.getPaddingTop()) + f < AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f)) {
                        i2 = 1;
                        linearLayoutManager.scrollToPositionWithOffset(i2, (int) f);
                    }
                }
                f = top;
                linearLayoutManager.scrollToPositionWithOffset(i2, (int) f);
            }
        }
        DiffUtil.calculateDiff(new DiffUtil.Callback() {
            @Override
            public int getOldListSize() {
                return DialogsAdapter.this.oldItems.size();
            }

            @Override
            public int getNewListSize() {
                return DialogsAdapter.this.itemInternals.size();
            }

            @Override
            public boolean areItemsTheSame(int i4, int i5) {
                return DialogsAdapter.this.oldItems.get(i4).compare(DialogsAdapter.this.itemInternals.get(i5));
            }

            @Override
            public boolean areContentsTheSame(int i4, int i5) {
                return DialogsAdapter.this.oldItems.get(i4).viewType == DialogsAdapter.this.itemInternals.get(i5).viewType;
            }
        }).dispatchUpdatesTo(this);
    }

    @Override
    public void notifyDataSetChanged() {
        updateItemList();
        super.notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof DialogCell) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.onReorderStateChanged(this.isReordering, false);
            fixPosition(viewHolder.getAdapterPosition());
            dialogCell.checkCurrentDialogIndex(this.dialogsListFrozen);
            dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialogCell.getDialogId())), false);
        }
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 7 || itemViewType == 9 || itemViewType == 10 || itemViewType == 11 || itemViewType == 13 || itemViewType == 15 || itemViewType == 16) ? false : true;
    }

    public void lambda$onCreateViewHolder$1(View view) {
        MessagesController.getInstance(this.currentAccount).hintDialogs.clear();
        MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        ?? flickerLoadingView;
        View view2;
        switch (i) {
            case 0:
                int i2 = this.dialogsType;
                if (i2 == 2 || i2 == 15) {
                    view = new ProfileSearchCell(this.mContext);
                } else {
                    ?? dialogCell = new DialogCell(this.parentFragment, this.mContext, true, false, this.currentAccount, null);
                    dialogCell.setArchivedPullAnimation(this.pullForegroundDrawable);
                    dialogCell.setPreloader(this.preloader);
                    dialogCell.setDialogCellDelegate(this);
                    dialogCell.setIsTransitionSupport(this.isTransitionSupport);
                    view = dialogCell;
                }
                view2 = view;
                if (this.dialogsType == 15) {
                    view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    view2 = view;
                }
                flickerLoadingView = view2;
                break;
            case 1:
            case 13:
                flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                int i3 = i == 13 ? 18 : 7;
                flickerLoadingView.setViewType(i3);
                if (i3 == 18) {
                    flickerLoadingView.setIgnoreHeightCheck(true);
                }
                if (i == 13) {
                    flickerLoadingView.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                flickerLoadingView = new HeaderCell(this.mContext);
                flickerLoadingView.setText(LocaleController.getString("RecentlyViewed", R.string.RecentlyViewed));
                TextView textView = new TextView(this.mContext);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
                textView.setText(LocaleController.getString("RecentlyViewedHide", R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                flickerLoadingView.addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        DialogsAdapter.this.lambda$onCreateViewHolder$1(view3);
                    }
                });
                break;
            case 3:
                flickerLoadingView = new FrameLayout(this, this.mContext) {
                    @Override
                    protected void onMeasure(int i4, int i5) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                    }
                };
                flickerLoadingView.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
                View view3 = new View(this.mContext);
                view3.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, R.drawable.greydivider, "windowBackgroundGrayShadow"));
                flickerLoadingView.addView(view3, LayoutHelper.createFrame(-1, -1.0f));
                break;
            case 4:
                flickerLoadingView = new DialogMeUrlCell(this.mContext);
                break;
            case 5:
                flickerLoadingView = new DialogsEmptyCell(this.mContext);
                break;
            case 6:
                flickerLoadingView = new UserCell(this.mContext, 8, 0, false);
                break;
            case 7:
                flickerLoadingView = new HeaderCell(this.mContext);
                flickerLoadingView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                break;
            case 8:
                flickerLoadingView = new ShadowSectionCell(this.mContext);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, R.drawable.greydivider, "windowBackgroundGrayShadow"));
                combinedDrawable.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable);
                break;
            case 9:
                flickerLoadingView = new ArchiveHintCell(this.mContext);
                this.archiveHintCell = flickerLoadingView;
                break;
            case 10:
                flickerLoadingView = new LastEmptyView(this.mContext);
                break;
            case 11:
                flickerLoadingView = new TextInfoPrivacyCell(this.mContext) {
                    private long lastUpdateTime;
                    private float moveProgress;
                    private int movement;
                    private int originalX;
                    private int originalY;

                    @Override
                    protected void afterTextDraw() {
                        if (DialogsAdapter.this.arrowDrawable != null) {
                            Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                            Drawable drawable = DialogsAdapter.this.arrowDrawable;
                            int i4 = this.originalX;
                            drawable.setBounds(i4, this.originalY, bounds.width() + i4, this.originalY + bounds.height());
                        }
                    }

                    @Override
                    protected void onTextDraw() {
                        if (DialogsAdapter.this.arrowDrawable != null) {
                            Rect bounds = DialogsAdapter.this.arrowDrawable.getBounds();
                            int dp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                            this.originalX = bounds.left;
                            this.originalY = bounds.top;
                            DialogsAdapter.this.arrowDrawable.setBounds(this.originalX + dp, this.originalY + AndroidUtilities.dp(1.0f), this.originalX + dp + bounds.width(), this.originalY + AndroidUtilities.dp(1.0f) + bounds.height());
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j = elapsedRealtime - this.lastUpdateTime;
                            if (j > 17) {
                                j = 17;
                            }
                            this.lastUpdateTime = elapsedRealtime;
                            if (this.movement == 0) {
                                float f = this.moveProgress + (((float) j) / 664.0f);
                                this.moveProgress = f;
                                if (f >= 1.0f) {
                                    this.movement = 1;
                                    this.moveProgress = 1.0f;
                                }
                            } else {
                                float f2 = this.moveProgress - (((float) j) / 664.0f);
                                this.moveProgress = f2;
                                if (f2 <= 0.0f) {
                                    this.movement = 0;
                                    this.moveProgress = 0.0f;
                                }
                            }
                            getTextView().invalidate();
                        }
                    }
                };
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, R.drawable.greydivider, "windowBackgroundGrayShadow"));
                combinedDrawable2.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable2);
                break;
            case 12:
            default:
                View textCell = new TextCell(this.mContext);
                view2 = textCell;
                if (this.dialogsType == 15) {
                    textCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    view2 = textCell;
                }
                flickerLoadingView = view2;
                break;
            case 14:
                flickerLoadingView = new HeaderCell(this.mContext, "key_graySectionText", 16, 0, false);
                flickerLoadingView.setHeight(32);
                flickerLoadingView.setClickable(false);
                break;
            case 15:
                flickerLoadingView = new RequestPeerRequirementsCell(this.mContext);
                break;
            case 16:
                flickerLoadingView = new DialogsRequestedEmptyCell(this.mContext) {
                    @Override
                    protected void onButtonClick() {
                        DialogsAdapter.this.onCreateGroupForThisClick();
                    }
                };
                break;
            case 17:
                flickerLoadingView = new DialogsHintCell(this.mContext);
                break;
        }
        flickerLoadingView.setLayoutParams(new RecyclerView.LayoutParams(-1, i == 5 ? -1 : -2));
        return new RecyclerListView.Holder(flickerLoadingView);
    }

    public int dialogsEmptyType() {
        int i = this.dialogsType;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId) ? 2 : 3;
        } else if (this.folderId == 1) {
            return 2;
        } else {
            return this.onlineContacts != null ? 1 : 0;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$Chat tLRPC$Chat;
        String str;
        String str2;
        TLRPC$User tLRPC$User;
        String formatUserStatus;
        String lowerCase;
        TLRPC$Chat chat;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) getItem(i);
            TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) getItem(i + 1);
            int i2 = this.dialogsType;
            if (i2 == 2 || i2 == 15) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                long dialogId = profileSearchCell.getDialogId();
                if (tLRPC$Dialog.id != 0) {
                    tLRPC$Chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id));
                    if (tLRPC$Chat != null && tLRPC$Chat.migrated_to != null && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(tLRPC$Chat.migrated_to.channel_id))) != null) {
                        tLRPC$Chat = chat;
                    }
                } else {
                    tLRPC$Chat = null;
                }
                if (tLRPC$Chat != null) {
                    String str3 = tLRPC$Chat.title;
                    if (ChatObject.isChannel(tLRPC$Chat) && !tLRPC$Chat.megagroup) {
                        int i3 = tLRPC$Chat.participants_count;
                        if (i3 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Subscribers", i3);
                        } else if (!ChatObject.isPublic(tLRPC$Chat)) {
                            lowerCase = LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate).toLowerCase();
                        } else {
                            lowerCase = LocaleController.getString("ChannelPublic", R.string.ChannelPublic).toLowerCase();
                        }
                    } else {
                        int i4 = tLRPC$Chat.participants_count;
                        if (i4 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Members", i4);
                        } else if (tLRPC$Chat.has_geo) {
                            lowerCase = LocaleController.getString("MegaLocation", R.string.MegaLocation);
                        } else if (!ChatObject.isPublic(tLRPC$Chat)) {
                            lowerCase = LocaleController.getString("MegaPrivate", R.string.MegaPrivate).toLowerCase();
                        } else {
                            lowerCase = LocaleController.getString("MegaPublic", R.string.MegaPublic).toLowerCase();
                        }
                    }
                    str2 = lowerCase;
                    str = str3;
                    tLRPC$User = tLRPC$Chat;
                } else {
                    TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$Dialog.id));
                    if (user != null) {
                        String userName = UserObject.getUserName(user);
                        if (UserObject.isReplyUser(user)) {
                            str = userName;
                            str2 = "";
                            tLRPC$User = user;
                        } else {
                            if (user.bot) {
                                formatUserStatus = LocaleController.getString("Bot", R.string.Bot);
                            } else {
                                formatUserStatus = LocaleController.formatUserStatus(this.currentAccount, user);
                            }
                            tLRPC$User = user;
                            str = userName;
                            str2 = formatUserStatus;
                        }
                    } else {
                        str = null;
                        str2 = "";
                        tLRPC$User = null;
                    }
                }
                profileSearchCell.useSeparator = tLRPC$Dialog2 != null;
                profileSearchCell.setData(tLRPC$User, null, str, str2, false, false);
                profileSearchCell.setChecked(this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId())), dialogId == profileSearchCell.getDialogId());
            } else {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.useSeparator = tLRPC$Dialog2 != null;
                dialogCell.fullSeparator = (!tLRPC$Dialog.pinned || tLRPC$Dialog2 == null || tLRPC$Dialog2.pinned) ? false : true;
                if (i2 == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(tLRPC$Dialog.id == this.openedDialogId);
                }
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(tLRPC$Dialog.id)), false);
                dialogCell.setDialog(tLRPC$Dialog, this.dialogsType, this.folderId);
                dialogCell.checkHeight();
                boolean z = dialogCell.collapsed;
                boolean z2 = this.collapsedView;
                if (z != z2) {
                    dialogCell.collapsed = z2;
                    dialogCell.requestLayout();
                }
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    dialogsPreloader.add(tLRPC$Dialog.id);
                }
            }
        } else if (itemViewType == 4) {
            ((DialogMeUrlCell) viewHolder.itemView).setRecentMeUrl((TLRPC$RecentMeUrl) getItem(i));
        } else if (itemViewType == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) viewHolder.itemView;
            int i5 = this.lastDialogsEmptyType;
            int dialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = dialogsEmptyType;
            dialogsEmptyCell.setType(dialogsEmptyType, this.isOnlySelect);
            int i6 = this.dialogsType;
            if (i6 != 7 && i6 != 8) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.this.lambda$onBindViewHolder$2();
                    }
                });
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        DialogsAdapter.this.lambda$onBindViewHolder$3((Float) obj);
                    }
                });
                if (!dialogsEmptyCell.isUtyanAnimationTriggered() && this.dialogsCount == 0) {
                    this.parentFragment.setContactsAlpha(0.0f);
                    this.parentFragment.setScrollDisabled(true);
                }
                if (this.onlineContacts != null && i5 == 0) {
                    if (!dialogsEmptyCell.isUtyanAnimationTriggered()) {
                        dialogsEmptyCell.startUtyanCollapseAnimation(true);
                    }
                } else if (this.forceUpdatingContacts) {
                    if (this.dialogsCount == 0) {
                        dialogsEmptyCell.startUtyanCollapseAnimation(false);
                    }
                } else if (dialogsEmptyCell.isUtyanAnimationTriggered() && this.lastDialogsEmptyType == 0) {
                    dialogsEmptyCell.startUtyanExpandAnimation();
                }
            }
        } else if (itemViewType == 6) {
            ((UserCell) viewHolder.itemView).setData((TLRPC$User) getItem(i), null, null, 0);
        } else if (itemViewType == 7) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            int i7 = this.dialogsType;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                headerCell.setText(LocaleController.getString((this.dialogsCount == 0 && this.forceUpdatingContacts) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i == 0) {
                headerCell.setText(LocaleController.getString("ImportHeader", R.string.ImportHeader));
            } else {
                headerCell.setText(LocaleController.getString("ImportHeaderContacts", R.string.ImportHeaderContacts));
            }
        } else if (itemViewType == 11) {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setText(LocaleController.getString("TapOnThePencil", R.string.TapOnThePencil));
            if (this.arrowDrawable == null) {
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.arrow_newchat);
                this.arrowDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText4"), PorterDuff.Mode.MULTIPLY));
            }
            TextView textView = textInfoPrivacyCell.getTextView();
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.arrowDrawable, (Drawable) null);
            textView.getLayoutParams().width = -2;
        } else if (itemViewType != 12) {
            switch (itemViewType) {
                case 14:
                    HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
                    headerCell2.setTextSize(14.0f);
                    headerCell2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
                    headerCell2.setBackgroundColor(Theme.getColor("graySection"));
                    int i8 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
                    if (i8 == 0) {
                        headerCell2.setText(LocaleController.getString("MyChannels", R.string.MyChannels));
                        break;
                    } else if (i8 == 1) {
                        headerCell2.setText(LocaleController.getString("MyGroups", R.string.MyGroups));
                        break;
                    } else if (i8 == 2) {
                        headerCell2.setText(LocaleController.getString("FilterGroups", R.string.FilterGroups));
                        break;
                    }
                    break;
                case 15:
                    ((RequestPeerRequirementsCell) viewHolder.itemView).set(this.requestPeerType);
                    break;
                case 16:
                    ((DialogsRequestedEmptyCell) viewHolder.itemView).set(this.requestPeerType);
                    break;
                case 17:
                    DialogsHintCell dialogsHintCell = (DialogsHintCell) viewHolder.itemView;
                    TLRPC$TL_chatlists_chatlistUpdates tLRPC$TL_chatlists_chatlistUpdates = this.itemInternals.get(i).chatlistUpdates;
                    if (tLRPC$TL_chatlists_chatlistUpdates != null) {
                        int size = tLRPC$TL_chatlists_chatlistUpdates.missing_peers.size();
                        dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), "windowBackgroundWhiteValueText", 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                        break;
                    }
                    break;
            }
        } else {
            TextCell textCell = (TextCell) viewHolder.itemView;
            textCell.setColors("windowBackgroundWhiteBlueText4", "windowBackgroundWhiteBlueText4");
            TLRPC$RequestPeerType tLRPC$RequestPeerType = this.requestPeerType;
            if (tLRPC$RequestPeerType != null) {
                if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeBroadcast) {
                    textCell.setTextAndIcon(LocaleController.getString("CreateChannelForThis", R.string.CreateChannelForThis), R.drawable.msg_channel_create, true);
                } else {
                    textCell.setTextAndIcon(LocaleController.getString("CreateGroupForThis", R.string.CreateGroupForThis), R.drawable.msg_groups_create, true);
                }
            } else {
                textCell.setTextAndIcon(LocaleController.getString("CreateGroupForImport", R.string.CreateGroupForImport), R.drawable.msg_groups_create, this.dialogsCount != 0);
            }
            textCell.setIsInDialogs();
            textCell.setOffsetFromImage(75);
        }
        if (i >= this.dialogsCount + 1) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    public void lambda$onBindViewHolder$2() {
        this.parentFragment.setScrollDisabled(false);
    }

    public void lambda$onBindViewHolder$3(Float f) {
        this.parentFragment.setContactsAlpha(f.floatValue());
    }

    public TLRPC$TL_chatlists_chatlistUpdates getChatlistUpdate() {
        ItemInternal itemInternal = this.itemInternals.get(0);
        if (itemInternal == null || itemInternal.viewType != 17) {
            return null;
        }
        return itemInternal.chatlistUpdates;
    }

    public void setForceUpdatingContacts(boolean z) {
        this.forceUpdatingContacts = z;
    }

    @Override
    public int getItemViewType(int i) {
        return this.itemInternals.get(i).viewType;
    }

    public void moveDialogs(RecyclerListView recyclerListView, int i, int i2) {
        ArrayList<TLRPC$Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, false);
        int fixPosition = fixPosition(i);
        int fixPosition2 = fixPosition(i2);
        TLRPC$Dialog tLRPC$Dialog = dialogsArray.get(fixPosition);
        TLRPC$Dialog tLRPC$Dialog2 = dialogsArray.get(fixPosition2);
        int i3 = this.dialogsType;
        if (i3 == 7 || i3 == 8) {
            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
            int i4 = dialogFilter.pinnedDialogs.get(tLRPC$Dialog.id);
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog.id, dialogFilter.pinnedDialogs.get(tLRPC$Dialog2.id));
            dialogFilter.pinnedDialogs.put(tLRPC$Dialog2.id, i4);
        } else {
            int i5 = tLRPC$Dialog.pinnedNum;
            tLRPC$Dialog.pinnedNum = tLRPC$Dialog2.pinnedNum;
            tLRPC$Dialog2.pinnedNum = i5;
        }
        Collections.swap(dialogsArray, fixPosition, fixPosition2);
        updateList(recyclerListView, false, 0.0f);
    }

    @Override
    public void notifyItemMoved(int i, int i2) {
        super.notifyItemMoved(i, i2);
    }

    public void setArchivedPullDrawable(PullForegroundDrawable pullForegroundDrawable) {
        this.pullForegroundDrawable = pullForegroundDrawable;
    }

    public void didDatabaseCleared() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.clear();
        }
    }

    public void resume() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.resume();
        }
    }

    public void pause() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.pause();
        }
    }

    @Override
    public boolean canClickButtonInside() {
        return this.selectedDialogs.isEmpty();
    }

    public void setIsTransitionSupport() {
        this.isTransitionSupport = true;
    }

    public void setCollapsedView(boolean z, RecyclerListView recyclerListView) {
        this.collapsedView = z;
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getChildAt(i)).collapsed = z;
            }
        }
        for (int i2 = 0; i2 < recyclerListView.getCachedChildCount(); i2++) {
            if (recyclerListView.getCachedChildAt(i2) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getCachedChildAt(i2)).collapsed = z;
            }
        }
        for (int i3 = 0; i3 < recyclerListView.getHiddenChildCount(); i3++) {
            if (recyclerListView.getHiddenChildAt(i3) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getHiddenChildAt(i3)).collapsed = z;
            }
        }
        for (int i4 = 0; i4 < recyclerListView.getAttachedScrapChildCount(); i4++) {
            if (recyclerListView.getAttachedScrapChildAt(i4) instanceof DialogCell) {
                ((DialogCell) recyclerListView.getAttachedScrapChildAt(i4)).collapsed = z;
            }
        }
    }

    public static class DialogsPreloader {
        int currentRequestCount;
        int networkRequestCount;
        boolean resumed;
        HashSet<Long> dialogsReadyMap = new HashSet<>();
        HashSet<Long> preloadedErrorMap = new HashSet<>();
        HashSet<Long> loadingDialogs = new HashSet<>();
        ArrayList<Long> preloadDialogsPool = new ArrayList<>();
        Runnable clearNetworkRequestCount = new Runnable() {
            @Override
            public final void run() {
                DialogsAdapter.DialogsPreloader.this.lambda$new$0();
            }
        };

        private boolean preloadIsAvilable() {
            return false;
        }

        public void updateList() {
        }

        public void lambda$new$0() {
            this.networkRequestCount = 0;
            start();
        }

        public void add(long j) {
            if (isReady(j) || this.preloadedErrorMap.contains(Long.valueOf(j)) || this.loadingDialogs.contains(Long.valueOf(j)) || this.preloadDialogsPool.contains(Long.valueOf(j))) {
                return;
            }
            this.preloadDialogsPool.add(Long.valueOf(j));
            start();
        }

        public void start() {
            if (!preloadIsAvilable() || !this.resumed || this.preloadDialogsPool.isEmpty() || this.currentRequestCount >= 4 || this.networkRequestCount > 6) {
                return;
            }
            long longValue = this.preloadDialogsPool.remove(0).longValue();
            this.currentRequestCount++;
            this.loadingDialogs.add(Long.valueOf(longValue));
            MessagesController.getInstance(UserConfig.selectedAccount).ensureMessagesLoaded(longValue, 0, new AnonymousClass1(longValue));
        }

        public class AnonymousClass1 implements MessagesController.MessagesLoadedCallback {
            final long val$dialog_id;

            AnonymousClass1(long j) {
                this.val$dialog_id = j;
            }

            @Override
            public void onMessagesLoaded(final boolean z) {
                final long j = this.val$dialog_id;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.DialogsPreloader.AnonymousClass1.this.lambda$onMessagesLoaded$0(z, j);
                    }
                });
            }

            public void lambda$onMessagesLoaded$0(boolean z, long j) {
                DialogsPreloader dialogsPreloader;
                if (!z) {
                    DialogsPreloader dialogsPreloader2 = DialogsPreloader.this;
                    int i = dialogsPreloader2.networkRequestCount + 1;
                    dialogsPreloader2.networkRequestCount = i;
                    if (i >= 6) {
                        AndroidUtilities.cancelRunOnUIThread(dialogsPreloader2.clearNetworkRequestCount);
                        AndroidUtilities.runOnUIThread(DialogsPreloader.this.clearNetworkRequestCount, 60000L);
                    }
                }
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.dialogsReadyMap.add(Long.valueOf(j));
                    DialogsPreloader.this.updateList();
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }

            @Override
            public void onError() {
                final long j = this.val$dialog_id;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsAdapter.DialogsPreloader.AnonymousClass1.this.lambda$onError$1(j);
                    }
                });
            }

            public void lambda$onError$1(long j) {
                DialogsPreloader dialogsPreloader;
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.preloadedErrorMap.add(Long.valueOf(j));
                    dialogsPreloader.currentRequestCount--;
                    DialogsPreloader.this.start();
                }
            }
        }

        public boolean isReady(long j) {
            return this.dialogsReadyMap.contains(Long.valueOf(j));
        }

        public void remove(long j) {
            this.preloadDialogsPool.remove(Long.valueOf(j));
        }

        public void clear() {
            this.dialogsReadyMap.clear();
            this.preloadedErrorMap.clear();
            this.loadingDialogs.clear();
            this.preloadDialogsPool.clear();
            this.currentRequestCount = 0;
            this.networkRequestCount = 0;
            AndroidUtilities.cancelRunOnUIThread(this.clearNetworkRequestCount);
            updateList();
        }

        public void resume() {
            this.resumed = true;
            start();
        }

        public void pause() {
            this.resumed = false;
        }
    }

    public int getCurrentCount() {
        return this.currentCount;
    }

    public void setForceShowEmptyCell(boolean z) {
        this.forceShowEmptyCell = z;
    }

    public class LastEmptyView extends View {
        public boolean moving;

        public LastEmptyView(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = DialogsAdapter.this.itemInternals.size();
            int i3 = 0;
            boolean z = DialogsAdapter.this.dialogsType == 0 && MessagesController.getInstance(DialogsAdapter.this.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i4 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            int paddingTop = view.getPaddingTop() - i4;
            if (size != 0 && (paddingTop != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                }
                int i5 = size2 - i4;
                int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    if (DialogsAdapter.this.itemInternals.get(i7).viewType == 0) {
                        i6 = (!DialogsAdapter.this.itemInternals.get(i7).isForumCell || DialogsAdapter.this.collapsedView) ? i6 + dp : i6 + AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                    }
                }
                int i8 = i6 + (size - 1);
                if (DialogsAdapter.this.onlineContacts != null) {
                    i8 += (DialogsAdapter.this.onlineContacts.size() * AndroidUtilities.dp(58.0f)) + (DialogsAdapter.this.onlineContacts.size() - 1) + AndroidUtilities.dp(52.0f);
                }
                int i9 = z ? dp + 1 : 0;
                if (i8 < i5) {
                    int i10 = (i5 - i8) + i9;
                    if (paddingTop == 0 || (i10 = i10 - AndroidUtilities.statusBarHeight) >= 0) {
                        i3 = i10;
                    }
                } else {
                    int i11 = i8 - i5;
                    if (i11 < i9) {
                        int i12 = i9 - i11;
                        if (paddingTop != 0) {
                            i12 -= AndroidUtilities.statusBarHeight;
                        }
                        if (i12 >= 0) {
                            i3 = i12;
                        }
                    }
                }
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
        }
    }

    private void updateItemList() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Adapters.DialogsAdapter.updateItemList():void");
    }
}
