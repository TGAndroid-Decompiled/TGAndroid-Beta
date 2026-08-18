package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.DialogsRequestedEmptyCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RequestPeerRequirementsCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.ArchiveHelp;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public class DialogsAdapter extends RecyclerListView.SelectionAdapter implements DialogCell.DialogCellDelegate {
    private static final boolean ALLOW_UPDATE_IN_BACKGROUND = BuildVars.DEBUG_PRIVATE_VERSION;
    private boolean allowForwardAsStories;
    private Drawable arrowDrawable;
    private boolean collapsedView;
    public final long communityId;
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
    boolean isCalculatingDiff;
    public boolean isEmpty;
    private boolean isOnlySelect;
    private boolean isReordering;
    private boolean isTransitionSupport;
    private long lastSortTime;
    private Context mContext;
    private ArrayList onlineContacts;
    private long openedDialogId;
    private DialogsActivity parentFragment;
    private DialogsPreloader preloader;
    private PullForegroundDrawable pullForegroundDrawable;
    RecyclerListView recyclerListView;
    private TLRPC.RequestPeerType requestPeerType;
    private ArrayList selectedDialogs;
    boolean updateListPending;
    private boolean firstUpdate = true;
    ArrayList itemInternals = new ArrayList();
    ArrayList oldItems = new ArrayList();
    int stableIdPointer = 10;
    LongSparseIntArray dialogsStableIds = new LongSparseIntArray();
    HashMap dialogsHeaderStableIds = new HashMap();
    public int lastDialogsEmptyType = -1;

    public ViewPager getArchiveHintCellPager() {
        return null;
    }

    public boolean isDataSetChanged() {
        return true;
    }

    protected void onArchiveSettingsClick() {
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    public void onCreateGroupForThisClick() {
    }

    protected void onOpenBot(TLRPC.User user) {
    }

    protected boolean showOpenBotButton() {
        return false;
    }

    public DialogsAdapter(DialogsActivity dialogsActivity, Context context, int i, int i2, boolean z, ArrayList arrayList, int i3, TLRPC.RequestPeerType requestPeerType) {
        this.mContext = context;
        this.parentFragment = dialogsActivity;
        this.dialogsType = i;
        this.folderId = i2;
        this.isOnlySelect = z;
        this.hasHints = i2 == 0 && i == 0 && !z;
        this.selectedDialogs = arrayList;
        this.currentAccount = i3;
        this.communityId = dialogsActivity != null ? dialogsActivity.getCommunityId() : 0L;
        if (i2 == 0) {
            this.preloader = new DialogsPreloader();
        }
        this.requestPeerType = requestPeerType;
    }

    public void setRecyclerListView(RecyclerListView recyclerListView) {
        this.recyclerListView = recyclerListView;
    }

    public void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public void onReorderStateChanged(boolean z) {
        this.isReordering = z;
    }

    public int fixPosition(int i) {
        if (this.hasChatlistHint) {
            i--;
        }
        if (this.hasHints) {
            i -= MessagesController.getInstance(this.currentAccount).hintDialogs.size() + 2;
        }
        if (this.allowForwardAsStories && this.dialogsType == 3) {
            i--;
        }
        int i2 = this.dialogsType;
        if (i2 == 11 || i2 == 13) {
            return i - 2;
        }
        return i2 == 12 ? i - 1 : i;
    }

    public void setDialogsType(int i) {
        this.dialogsType = i;
        notifyDataSetChanged();
    }

    public void setAllowForwardAsStories(boolean z) {
        this.allowForwardAsStories = z;
    }

    public boolean isAllowForwardAsStories() {
        return this.allowForwardAsStories;
    }

    public int getDialogsType() {
        return this.dialogsType;
    }

    public int getDialogsCount() {
        return this.dialogsCount;
    }

    @Override
    public long getItemId(int i) {
        return ((ItemInternal) this.itemInternals.get(i)).stableId;
    }

    @Override
    public int getItemCount() {
        int size = this.itemInternals.size();
        this.currentCount = size;
        return size;
    }

    public int findDialogPosition(long j) {
        for (int i = 0; i < this.itemInternals.size(); i++) {
            if (((ItemInternal) this.itemInternals.get(i)).dialog != null && ((ItemInternal) this.itemInternals.get(i)).dialog.id == j) {
                return i;
            }
        }
        return -1;
    }

    public int fixScrollGap(RecyclerListView recyclerListView, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
        int paddingTop = ((recyclerListView.getPaddingTop() + i2) - (i * iDp)) - i;
        if (z) {
            paddingTop += iDp;
        }
        int paddingTop2 = recyclerListView.getPaddingTop();
        return paddingTop > paddingTop2 ? (i2 + paddingTop2) - paddingTop : i2;
    }

    private class ItemInternal extends AdapterWithDiffUtils.Item {
        private TLRPC.Chat chat;
        TL_chatlists.TL_chatlists_chatlistUpdates chatlistUpdates;
        TLRPC.TL_contact contact;
        TLRPC.Dialog dialog;
        private long dialogId;
        private int emptyType;
        private boolean isFolder;
        boolean isForumCell;
        private boolean pinned;
        TLRPC.RecentMeUrl recentMeUrl;
        private final int stableId;
        private String title;
        private TLRPC.User user;

        public ItemInternal(TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
            super(17, true);
            this.chatlistUpdates = tL_chatlists_chatlistUpdates;
            int i = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i + 1;
            this.stableId = i;
        }

        public ItemInternal(int i, String str) {
            super(i, false);
            Integer num = (Integer) DialogsAdapter.this.dialogsHeaderStableIds.get(str);
            if (num != null) {
                this.stableId = num.intValue();
            } else {
                int i2 = DialogsAdapter.this.stableIdPointer;
                DialogsAdapter.this.stableIdPointer = i2 + 1;
                this.stableId = i2;
                DialogsAdapter.this.dialogsHeaderStableIds.put(str, Integer.valueOf(i2));
            }
            this.title = str;
        }

        public ItemInternal(int i, TLRPC.User user) {
            super(i, false);
            this.user = user;
            long j = user.id;
            this.dialogId = j;
            int i2 = DialogsAdapter.this.dialogsStableIds.get(j, -1);
            if (i2 >= 0) {
                this.stableId = i2;
                return;
            }
            int i3 = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i3 + 1;
            this.stableId = i3;
            DialogsAdapter.this.dialogsStableIds.put(user.id, i3);
        }

        public ItemInternal(int i, TLRPC.Chat chat) {
            super(i, false);
            this.chat = chat;
            long j = -chat.id;
            this.dialogId = j;
            int i2 = DialogsAdapter.this.dialogsStableIds.get(j, -1);
            if (i2 >= 0) {
                this.stableId = i2;
                return;
            }
            int i3 = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i3 + 1;
            this.stableId = i3;
            DialogsAdapter.this.dialogsStableIds.put(-chat.id, i3);
        }

        public ItemInternal(int i, TLRPC.Dialog dialog) {
            super(i, true);
            this.dialog = dialog;
            if (dialog != null) {
                int i2 = DialogsAdapter.this.dialogsStableIds.get(dialog.id, -1);
                if (i2 >= 0) {
                    this.stableId = i2;
                } else {
                    int i3 = DialogsAdapter.this.stableIdPointer;
                    DialogsAdapter.this.stableIdPointer = i3 + 1;
                    this.stableId = i3;
                    DialogsAdapter.this.dialogsStableIds.put(dialog.id, i3);
                }
            } else if (i == 19) {
                this.stableId = 5;
            } else {
                int i4 = DialogsAdapter.this.stableIdPointer;
                DialogsAdapter.this.stableIdPointer = i4 + 1;
                this.stableId = i4;
            }
            if (dialog != null) {
                if (DialogsAdapter.this.dialogsType == 7 || DialogsAdapter.this.dialogsType == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(DialogsAdapter.this.currentAccount).selectedDialogFilter[DialogsAdapter.this.dialogsType == 8 ? (char) 1 : (char) 0];
                    this.pinned = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                } else {
                    this.pinned = dialog.pinned;
                }
                this.isFolder = dialog.isFolder;
                this.isForumCell = MessagesController.getInstance(DialogsAdapter.this.currentAccount).isForum(dialog.id);
            }
        }

        public ItemInternal(int i, TLRPC.RecentMeUrl recentMeUrl) {
            super(i, true);
            this.recentMeUrl = recentMeUrl;
            int i2 = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i2 + 1;
            this.stableId = i2;
        }

        public ItemInternal(int i) {
            super(i, true);
            this.emptyType = i;
            if (i == 10) {
                this.stableId = 1;
            } else {
                if (this.viewType == 19) {
                    this.stableId = 5;
                    return;
                }
                int i2 = DialogsAdapter.this.stableIdPointer;
                DialogsAdapter.this.stableIdPointer = i2 + 1;
                this.stableId = i2;
            }
        }

        public ItemInternal(int i, int i2) {
            super(i, true);
            this.emptyType = i2;
            int i3 = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i3 + 1;
            this.stableId = i3;
        }

        public ItemInternal(int i, TLRPC.TL_contact tL_contact) {
            super(i, true);
            this.contact = tL_contact;
            if (tL_contact != null) {
                int i2 = DialogsAdapter.this.dialogsStableIds.get(tL_contact.user_id, -1);
                if (i2 > 0) {
                    this.stableId = i2;
                    return;
                }
                int i3 = DialogsAdapter.this.stableIdPointer;
                DialogsAdapter.this.stableIdPointer = i3 + 1;
                this.stableId = i3;
                DialogsAdapter.this.dialogsStableIds.put(this.contact.user_id, i3);
                return;
            }
            int i4 = DialogsAdapter.this.stableIdPointer;
            DialogsAdapter.this.stableIdPointer = i4 + 1;
            this.stableId = i4;
        }

        boolean compare(ItemInternal itemInternal) {
            TLRPC.TL_contact tL_contact;
            String str;
            TLRPC.Dialog dialog;
            TLRPC.Dialog dialog2;
            int i = this.viewType;
            if (i != itemInternal.viewType) {
                return false;
            }
            if (i == 0) {
                TLRPC.Dialog dialog3 = this.dialog;
                return dialog3 != null && (dialog2 = itemInternal.dialog) != null && dialog3.id == dialog2.id && this.isFolder == itemInternal.isFolder && this.isForumCell == itemInternal.isForumCell && this.pinned == itemInternal.pinned;
            }
            if (i == 14) {
                TLRPC.Dialog dialog4 = this.dialog;
                return dialog4 != null && (dialog = itemInternal.dialog) != null && dialog4.id == dialog.id && dialog4.isFolder == dialog.isFolder;
            }
            if (i == 4) {
                TLRPC.RecentMeUrl recentMeUrl = this.recentMeUrl;
                return (recentMeUrl == null || itemInternal.recentMeUrl == null || (str = recentMeUrl.url) == null || !str.equals(str)) ? false : true;
            }
            if (i == 6) {
                TLRPC.TL_contact tL_contact2 = this.contact;
                return (tL_contact2 == null || (tL_contact = itemInternal.contact) == null || tL_contact2.user_id != tL_contact.user_id) ? false : true;
            }
            if (i == 5) {
                return this.emptyType == itemInternal.emptyType;
            }
            return i != 10;
        }

        public int hashCode() {
            return Objects.hash(this.dialog, this.chat, this.recentMeUrl, this.contact, this.title);
        }
    }

    public Object getItem(int i) {
        if (i >= 0 && i < this.itemInternals.size()) {
            ItemInternal itemInternal = (ItemInternal) this.itemInternals.get(i);
            if (itemInternal.title != null) {
                return itemInternal.title;
            }
            if (itemInternal.chat != null) {
                return itemInternal.chat;
            }
            if (itemInternal.user != null) {
                return itemInternal.user;
            }
            TLRPC.Dialog dialog = itemInternal.dialog;
            if (dialog != null) {
                return dialog;
            }
            if (itemInternal.contact != null) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(itemInternal.contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = itemInternal.recentMeUrl;
            if (recentMeUrl != null) {
                return recentMeUrl;
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
                            return DialogsAdapter.lambda$sortOnlineContacts$0(messagesController, currentTime, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
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

    public static int lambda$sortOnlineContacts$0(MessagesController messagesController, int i, TLRPC.TL_contact tL_contact, TLRPC.TL_contact tL_contact2) {
        int i2;
        int i3;
        TLRPC.User user = messagesController.getUser(Long.valueOf(tL_contact2.user_id));
        TLRPC.User user2 = messagesController.getUser(Long.valueOf(tL_contact.user_id));
        if (user == null) {
            i2 = 0;
        } else if (user.self) {
            i2 = i + 50000;
        } else {
            TLRPC.UserStatus userStatus = user.status;
            if (userStatus != null) {
                i2 = userStatus.expires;
            } else {
                i2 = 0;
            }
        }
        if (user2 == null) {
            i3 = 0;
        } else if (user2.self) {
            i3 = i + 50000;
        } else {
            TLRPC.UserStatus userStatus2 = user2.status;
            if (userStatus2 != null) {
                i3 = userStatus2.expires;
            } else {
                i3 = 0;
            }
        }
        if (i2 > 0 && i3 > 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if (i2 < 0 && i3 < 0) {
            if (i2 > i3) {
                return 1;
            }
            return i2 < i3 ? -1 : 0;
        }
        if ((i2 >= 0 || i3 <= 0) && (i2 != 0 || i3 == 0)) {
            return (i3 < 0 || i2 != 0) ? 1 : 0;
        }
        return -1;
    }

    public void setDialogsListFrozen(boolean z) {
        this.dialogsListFrozen = z;
    }

    public boolean getDialogsListIsFrozen() {
        return this.dialogsListFrozen;
    }

    public void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    public void updateList(final Runnable runnable) {
        if (this.isCalculatingDiff) {
            this.updateListPending = true;
            return;
        }
        this.isCalculatingDiff = true;
        ArrayList arrayList = new ArrayList();
        this.oldItems = arrayList;
        arrayList.addAll(this.itemInternals);
        updateItemList();
        final ArrayList arrayList2 = new ArrayList(this.itemInternals);
        this.itemInternals = this.oldItems;
        final DiffUtil.Callback callback = new DiffUtil.Callback() {
            @Override
            public int getOldListSize() {
                return DialogsAdapter.this.oldItems.size();
            }

            @Override
            public int getNewListSize() {
                return arrayList2.size();
            }

            @Override
            public boolean areItemsTheSame(int i, int i2) {
                return ((ItemInternal) DialogsAdapter.this.oldItems.get(i)).compare((ItemInternal) arrayList2.get(i2));
            }

            @Override
            public boolean areContentsTheSame(int i, int i2) {
                return ((ItemInternal) DialogsAdapter.this.oldItems.get(i)).viewType == ((ItemInternal) arrayList2.get(i2)).viewType;
            }
        };
        if (this.itemInternals.size() < 50 || !ALLOW_UPDATE_IN_BACKGROUND) {
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(callback);
            this.isCalculatingDiff = false;
            if (runnable != null) {
                runnable.run();
            }
            this.itemInternals = arrayList2;
            diffResultCalculateDiff.dispatchUpdatesTo(this);
            return;
        }
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateList$2(callback, runnable, arrayList2);
            }
        });
    }

    public void lambda$updateList$2(DiffUtil.Callback callback, final Runnable runnable, final ArrayList arrayList) {
        final DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(callback);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateList$1(runnable, arrayList, diffResultCalculateDiff);
            }
        });
    }

    public void lambda$updateList$1(Runnable runnable, ArrayList arrayList, DiffUtil.DiffResult diffResult) {
        if (this.isCalculatingDiff) {
            this.isCalculatingDiff = false;
            if (runnable != null) {
                runnable.run();
            }
            this.itemInternals = arrayList;
            diffResult.dispatchUpdatesTo(this);
            if (this.updateListPending) {
                this.updateListPending = false;
                updateList(runnable);
            }
        }
    }

    @Override
    public void notifyDataSetChanged() {
        if (this.isCalculatingDiff) {
            this.itemInternals = new ArrayList();
        }
        this.isCalculatingDiff = false;
        updateItemList();
        super.notifyDataSetChanged();
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        if (view instanceof DialogCell) {
            DialogCell dialogCell = (DialogCell) view;
            dialogCell.onReorderStateChanged(this.isReordering, false);
            dialogCell.checkCurrentDialogIndex(this.dialogsListFrozen);
            dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialogCell.getDialogId())), false);
        }
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 7 || itemViewType == 10 || itemViewType == 11 || itemViewType == 13 || itemViewType == 15 || itemViewType == 16 || itemViewType == 18 || itemViewType == 19 || itemViewType == 20) ? false : true;
    }

    public void lambda$onCreateViewHolder$3(View view) {
        MessagesController.getInstance(this.currentAccount).hintDialogs.clear();
        MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? flickerLoadingView;
        switch (i) {
            case 0:
            case 21:
                int i2 = this.dialogsType;
                if (i2 == 2 || i2 == 15) {
                    flickerLoadingView = new ProfileSearchCell(this.mContext);
                } else {
                    DialogCell dialogCell = new DialogCell(this.parentFragment, this.mContext, true, false, this.currentAccount, null);
                    if (showOpenBotButton()) {
                        dialogCell.allowBotOpenButton(true, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.onOpenBot((TLRPC.User) obj);
                            }
                        });
                    }
                    dialogCell.setArchivedPullAnimation(this.pullForegroundDrawable);
                    dialogCell.setPreloader(this.preloader);
                    dialogCell.setDialogCellDelegate(this);
                    dialogCell.setIsTransitionSupport(this.isTransitionSupport);
                    if (i == 21) {
                        dialogCell.setIsShareToStoryCell();
                    }
                    if (this.communityId != 0) {
                        dialogCell.insideCommunityList = true;
                    }
                    flickerLoadingView = dialogCell;
                }
                if (this.dialogsType == 15) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                }
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
                }
                break;
            case 2:
                flickerLoadingView = new HeaderCell(this.mContext);
                flickerLoadingView.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(this.mContext);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                flickerLoadingView.addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$onCreateViewHolder$3(view);
                    }
                });
                break;
            case 3:
                flickerLoadingView = new FrameLayout(this.mContext) {
                    @Override
                    protected void onMeasure(int i4, int i5) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(12.0f), 1073741824));
                    }
                };
                flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                View view = new View(this.mContext);
                view.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                flickerLoadingView.addView(view, LayoutHelper.createFrame(-1, -1.0f));
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
                DialogsActivity dialogsActivity = this.parentFragment;
                if (dialogsActivity == null || !dialogsActivity.isReplyTo) {
                    flickerLoadingView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                }
                break;
            case 8:
                flickerLoadingView = new ShadowSectionCell(this.mContext);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable);
                break;
            case 9:
            case 12:
            default:
                flickerLoadingView = new TextCell(this.mContext);
                if (this.dialogsType == 15) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                }
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
                            int iDp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                            this.originalX = bounds.left;
                            this.originalY = bounds.top;
                            DialogsAdapter.this.arrowDrawable.setBounds(this.originalX + iDp, this.originalY + AndroidUtilities.dp(1.0f), this.originalX + iDp + bounds.width(), this.originalY + AndroidUtilities.dp(1.0f) + bounds.height());
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j = jElapsedRealtime - this.lastUpdateTime;
                            if (j > 17) {
                                j = 17;
                            }
                            this.lastUpdateTime = jElapsedRealtime;
                            if (this.movement == 0) {
                                float f = this.moveProgress + (j / 664.0f);
                                this.moveProgress = f;
                                if (f >= 1.0f) {
                                    this.movement = 1;
                                    this.moveProgress = 1.0f;
                                }
                            } else {
                                float f2 = this.moveProgress - (j / 664.0f);
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
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable2.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable2);
                break;
            case 14:
                flickerLoadingView = new HeaderCell(this.mContext, Theme.key_graySectionText, 16, 0, false);
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
            case 18:
                flickerLoadingView = new View(this.mContext) {
                    @Override
                    protected void onMeasure(int i4, int i5) {
                        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
                    }
                };
                break;
            case 19:
                flickerLoadingView = new LastEmptyView(this.mContext);
                flickerLoadingView.addView(new ArchiveHelp(this.mContext, this.currentAccount, null, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.onArchiveSettingsClick();
                    }
                }, null), LayoutHelper.createFrame(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                flickerLoadingView = new GraySectionCell(this.mContext);
                break;
            case 22:
                flickerLoadingView = new HeaderCell(this.mContext);
                break;
            case 23:
                DialogCell dialogCell2 = new DialogCell(this.parentFragment, this.mContext, true, false, this.currentAccount, null);
                if (this.communityId != 0) {
                    dialogCell2.insideCommunityList = true;
                    dialogCell2.insideCommunityListNoDialog = true;
                }
                flickerLoadingView = dialogCell2;
                break;
        }
        flickerLoadingView.setLayoutParams(new RecyclerView.LayoutParams(-1, (i == 5 || i == 19) ? -1 : -2));
        return new RecyclerListView.Holder(flickerLoadingView);
    }

    public int dialogsEmptyType() {
        int i = this.dialogsType;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId) ? 2 : 3;
        }
        if (this.folderId == 1) {
            return 2;
        }
        return this.onlineContacts != null ? 1 : 0;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.Chat chat;
        String str;
        Object obj;
        String str2;
        String userName;
        boolean z;
        String lowerCase;
        TLRPC.Chat chat2;
        DialogsActivity dialogsActivity;
        DialogsActivity dialogsActivity2;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getItem(i);
            Object item = getItem(i + 1);
            TLRPC.Dialog dialog2 = item instanceof TLRPC.Dialog ? (TLRPC.Dialog) item : null;
            int i2 = this.dialogsType;
            if (i2 == 2 || i2 == 15) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                long dialogId = profileSearchCell.getDialogId();
                if (dialog.id != 0) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
                    if (chat != null && chat.migrated_to != null && (chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.migrated_to.channel_id))) != null) {
                        chat = chat2;
                    }
                } else {
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (ChatObject.isChannel(chat) && !chat.megagroup) {
                        int i3 = chat.participants_count;
                        if (i3 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Subscribers", i3);
                        } else if (!ChatObject.isPublic(chat)) {
                            lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                        } else {
                            lowerCase = LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                        }
                    } else {
                        int i4 = chat.participants_count;
                        if (i4 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Members", i4);
                        } else if (chat.has_geo) {
                            lowerCase = LocaleController.getString(R.string.MegaLocation);
                        } else if (!ChatObject.isPublic(chat)) {
                            lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                        } else {
                            lowerCase = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        }
                    }
                    str = lowerCase;
                    obj = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
                    String userStatus = "";
                    if (user != null) {
                        userName = UserObject.getUserName(user);
                        if (!UserObject.isReplyUser(user)) {
                            if (user.bot) {
                                userStatus = LocaleController.getString(R.string.Bot);
                            } else {
                                userStatus = LocaleController.formatUserStatus(this.currentAccount, user);
                            }
                        }
                        obj = user;
                        str = userStatus;
                    } else {
                        str = "";
                        obj = null;
                        str2 = null;
                    }
                    if (dialog2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                    profileSearchCell.setData(obj, null, str2, str, false, false);
                    profileSearchCell.setChecked(this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId())), dialogId == profileSearchCell.getDialogId());
                }
                str2 = userName;
                if (dialog2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                profileSearchCell.useSeparator = z;
                profileSearchCell.setData(obj, null, str2, str, false, false);
                profileSearchCell.setChecked(this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId())), dialogId == profileSearchCell.getDialogId());
            } else {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.isHiddenInCommunity = this.communityId != 0 && ChatObject.isHiddenInCommunity(this.currentAccount, dialog.id);
                dialogCell.useSeparator = false;
                dialogCell.fullSeparator = false;
                if (this.dialogsType == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(dialog.id == this.openedDialogId);
                }
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialog.id)), false);
                if (i == 1 && (dialogsActivity2 = this.parentFragment) != null && dialogsActivity2.isReplyTo && dialogsActivity2.replyMessageAuthor != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter currentFilter = getCurrentFilter();
                    if (currentFilter == null || currentFilter.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(this.parentFragment.replyMessageAuthor));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else if (i == 1 && (dialogsActivity = this.parentFragment) != null && this.dialogsType == 3 && dialogsActivity.forwardOriginalChannel != 0 && dialog.top_message == 0) {
                    MessagesController.DialogFilter currentFilter2 = getCurrentFilter();
                    if (currentFilter2 == null || currentFilter2.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(this.parentFragment.forwardOriginalChannel));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else {
                    dialogCell.setCustomMessage(null);
                }
                dialogCell.setDialog(dialog, this.dialogsType, this.folderId);
                dialogCell.checkHeight();
                boolean z2 = dialogCell.collapsed;
                boolean z3 = this.collapsedView;
                if (z2 != z3) {
                    dialogCell.collapsed = z3;
                    dialogCell.requestLayout();
                }
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    dialogsPreloader.add(dialog.id);
                }
            }
        } else if (itemViewType == 4) {
            ((DialogMeUrlCell) viewHolder.itemView).setRecentMeUrl((TLRPC.RecentMeUrl) getItem(i));
        } else if (itemViewType == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) viewHolder.itemView;
            int i5 = this.lastDialogsEmptyType;
            int iDialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = iDialogsEmptyType;
            dialogsEmptyCell.setType(iDialogsEmptyType, this.isOnlySelect);
            int i6 = this.dialogsType;
            if (i6 != 7 && i6 != 8) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onBindViewHolder$4();
                    }
                });
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new Consumer() {
                    @Override
                    public final void accept(Object obj2) {
                        this.f$0.lambda$onBindViewHolder$5((Float) obj2);
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
            ((UserCell) viewHolder.itemView).setData((TLRPC.User) getItem(i), null, null, 0);
        } else if (itemViewType == 7) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            int i7 = this.dialogsType;
            if (i7 != 11 && i7 != 12 && i7 != 13) {
                headerCell.setText(LocaleController.getString((this.dialogsCount == 0 && this.forceUpdatingContacts) ? R.string.ConnectingYourContacts : R.string.YourContacts));
            } else if (i == 0) {
                headerCell.setText(LocaleController.getString(R.string.ImportHeader));
            } else {
                headerCell.setText(LocaleController.getString(R.string.ImportHeaderContacts));
            }
        } else if (itemViewType == 11) {
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            textInfoPrivacyCell.setText(LocaleController.getString(R.string.TapOnThePencilButton));
            if (this.arrowDrawable == null) {
                Drawable drawable = this.mContext.getResources().getDrawable(R.drawable.arrow_newchat);
                this.arrowDrawable = drawable;
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4), PorterDuff.Mode.MULTIPLY));
            }
            LinkSpanDrawable.LinksTextView textView = textInfoPrivacyCell.getTextView();
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            DialogsActivity dialogsActivity3 = this.parentFragment;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (dialogsActivity3 == null || !dialogsActivity3.storiesEnabled) ? this.arrowDrawable : null, (Drawable) null);
            textView.getLayoutParams().width = -2;
        } else if (itemViewType != 12) {
            switch (itemViewType) {
                case 14:
                    HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
                    headerCell2.setTextSize(14.0f);
                    headerCell2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
                    headerCell2.setBackgroundColor(Theme.getColor(Theme.key_graySection));
                    int i8 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
                    if (i8 == 0) {
                        headerCell2.setText(LocaleController.getString(R.string.MyChannels));
                    } else if (i8 == 1) {
                        headerCell2.setText(LocaleController.getString(R.string.MyGroups));
                    } else if (i8 == 2) {
                        headerCell2.setText(LocaleController.getString(R.string.FilterGroups));
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
                    TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = ((ItemInternal) this.itemInternals.get(i)).chatlistUpdates;
                    if (tL_chatlists_chatlistUpdates != null) {
                        int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                        dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]));
                    }
                    break;
                default:
                    switch (itemViewType) {
                        case 20:
                            GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                            DialogsActivity dialogsActivity4 = this.parentFragment;
                            if (dialogsActivity4 != null && dialogsActivity4.isReplyTo) {
                                if (i == 0) {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                } else {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                }
                            } else if (this.dialogsType == 3) {
                                if (i == 0) {
                                    graySectionCell.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
                                } else {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                }
                            }
                            break;
                        case 21:
                            DialogCell dialogCell2 = (DialogCell) viewHolder.itemView;
                            DialogCell.CustomDialog customDialog = new DialogCell.CustomDialog();
                            customDialog.name = LocaleController.getString(R.string.StoriesForwardTitle);
                            customDialog.message = LocaleController.getString(R.string.StoriesForwardText);
                            dialogCell2.useSeparator = false;
                            dialogCell2.fullSeparator = false;
                            dialogCell2.setDialog(customDialog);
                            dialogCell2.checkHeight();
                            break;
                        case 22:
                            ((HeaderCell) viewHolder.itemView).setText((String) getItem(i));
                            break;
                        case 23:
                            Object item2 = getItem(i);
                            DialogCell dialogCell3 = (DialogCell) viewHolder.itemView;
                            if (item2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) item2;
                                dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(this.currentAccount, chat3);
                                dialogCell3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat3.participants_count, new Object[0]));
                                dialogCell3.setDialog(-chat3.id, null, 0, false, false);
                            } else {
                                TLRPC.User user2 = (TLRPC.User) item2;
                                dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(this.currentAccount, user2);
                                dialogCell3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                dialogCell3.setDialog(user2.id, null, 0, false, false);
                            }
                            break;
                    }
                    break;
            }
        } else {
            View view = viewHolder.itemView;
            if (!(view instanceof TextCell)) {
                return;
            }
            TextCell textCell = (TextCell) view;
            int i9 = Theme.key_windowBackgroundWhiteBlueText4;
            textCell.setColors(i9, i9);
            TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
            if (requestPeerType != null) {
                if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.CreateChannelForThis), R.drawable.msg_channel_create, true);
                } else {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.CreateGroupForThis), R.drawable.msg_groups_create, true);
                }
            } else {
                textCell.setTextAndIcon(LocaleController.getString(R.string.CreateGroupForImport), R.drawable.msg_groups_create, this.dialogsCount != 0);
            }
            textCell.setIsInDialogs();
            textCell.setOffsetFromImage(75);
        }
        if (i >= this.dialogsCount + 1) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    public void lambda$onBindViewHolder$4() {
        this.parentFragment.setScrollDisabled(false);
    }

    public void lambda$onBindViewHolder$5(Float f) {
        this.parentFragment.setContactsAlpha(f.floatValue());
    }

    public TL_chatlists.TL_chatlists_chatlistUpdates getChatlistUpdate() {
        ItemInternal itemInternal = (ItemInternal) this.itemInternals.get(0);
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
        return ((ItemInternal) this.itemInternals.get(i)).viewType;
    }

    public void moveDialogs(RecyclerListView recyclerListView, int i, int i2) {
        ArrayList dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, false);
        int iFixPosition = fixPosition(i);
        int iFixPosition2 = fixPosition(i2);
        TLRPC.Dialog dialog = (TLRPC.Dialog) dialogsArray.get(iFixPosition);
        TLRPC.Dialog dialog2 = (TLRPC.Dialog) dialogsArray.get(iFixPosition2);
        int i3 = this.dialogsType;
        if (i3 == 7 || i3 == 8) {
            MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType == 8 ? (char) 1 : (char) 0];
            int i4 = dialogFilter.pinnedDialogs.get(dialog.id);
            dialogFilter.pinnedDialogs.put(dialog.id, dialogFilter.pinnedDialogs.get(dialog2.id));
            dialogFilter.pinnedDialogs.put(dialog2.id, i4);
        } else {
            int i5 = dialog.pinnedNum;
            dialog.pinnedNum = dialog2.pinnedNum;
            dialog2.pinnedNum = i5;
        }
        Collections.swap(dialogsArray, iFixPosition, iFixPosition2);
        updateList(null);
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

    @Override
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        MessagesController.getInstance(this.currentAccount);
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStories(dialogCell.getDialogId())) {
            this.parentFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            this.parentFragment.getOrCreateStoryViewer().open(this.parentFragment.getContext(), dialogCell.getDialogId(), StoriesListPlaceProvider.of((RecyclerListView) dialogCell.getParent()));
        }
    }

    @Override
    public void showChatPreview(DialogCell dialogCell) {
        this.parentFragment.showChatPreview(dialogCell);
    }

    @Override
    public void openHiddenStories() {
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        if (storiesController.getHiddenList().isEmpty()) {
            return;
        }
        boolean z = storiesController.getUnreadState(DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get(0)).peer)) != 0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < storiesController.getHiddenList().size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) storiesController.getHiddenList().get(i)).peer);
            if (!z || storiesController.getUnreadState(peerDialogId) != 0) {
                arrayList.add(Long.valueOf(peerDialogId));
            }
        }
        this.parentFragment.getOrCreateStoryViewer().open(this.mContext, null, arrayList, 0, null, null, StoriesListPlaceProvider.of(this.recyclerListView, true), false);
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
        private final int MAX_REQUEST_COUNT = 4;
        private final int MAX_NETWORK_REQUEST_COUNT = 6;
        private final int NETWORK_REQUESTS_RESET_TIME = 60000;
        HashSet dialogsReadyMap = new HashSet();
        HashSet preloadedErrorMap = new HashSet();
        HashSet loadingDialogs = new HashSet();
        ArrayList preloadDialogsPool = new ArrayList();
        Runnable clearNetworkRequestCount = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
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
            Long l = (Long) this.preloadDialogsPool.remove(0);
            long jLongValue = l.longValue();
            this.currentRequestCount++;
            this.loadingDialogs.add(l);
            MessagesController.getInstance(UserConfig.selectedAccount).ensureMessagesLoaded(jLongValue, 0, new AnonymousClass1(jLongValue));
        }

        class AnonymousClass1 implements MessagesController.MessagesLoadedCallback {
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
                        this.f$0.lambda$onMessagesLoaded$0(z, j);
                    }
                });
            }

            public void lambda$onMessagesLoaded$0(boolean z, long j) {
                if (!z) {
                    DialogsPreloader dialogsPreloader = DialogsPreloader.this;
                    int i = dialogsPreloader.networkRequestCount + 1;
                    dialogsPreloader.networkRequestCount = i;
                    if (i >= 6) {
                        AndroidUtilities.cancelRunOnUIThread(dialogsPreloader.clearNetworkRequestCount);
                        AndroidUtilities.runOnUIThread(DialogsPreloader.this.clearNetworkRequestCount, 60000L);
                    }
                }
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.dialogsReadyMap.add(Long.valueOf(j));
                    DialogsPreloader.this.updateList();
                    DialogsPreloader dialogsPreloader2 = DialogsPreloader.this;
                    dialogsPreloader2.currentRequestCount--;
                    dialogsPreloader2.start();
                }
            }

            @Override
            public void onError() {
                final long j = this.val$dialog_id;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onError$1(j);
                    }
                });
            }

            public void lambda$onError$1(long j) {
                if (DialogsPreloader.this.loadingDialogs.remove(Long.valueOf(j))) {
                    DialogsPreloader.this.preloadedErrorMap.add(Long.valueOf(j));
                    DialogsPreloader dialogsPreloader = DialogsPreloader.this;
                    dialogsPreloader.currentRequestCount--;
                    dialogsPreloader.start();
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

    private MessagesController.DialogFilter getCurrentFilter() {
        int i = this.dialogsType;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType - 7];
        }
        return null;
    }

    public class LastEmptyView extends FrameLayout {
        public boolean moving;

        public LastEmptyView(Context context) {
            super(context);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int currentActionBarHeight;
            int i3;
            int size = DialogsAdapter.this.itemInternals.size();
            boolean z = DialogsAdapter.this.folderId == 0 && DialogsAdapter.this.dialogsType == 0 && MessagesController.getInstance(DialogsAdapter.this.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i4 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            boolean z2 = DialogsAdapter.this.collapsedView;
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            int i5 = paddingTop - i4;
            if (DialogsAdapter.this.folderId == 1 && size == 1 && ((ItemInternal) DialogsAdapter.this.itemInternals.get(0)).viewType == 19) {
                currentActionBarHeight = View.MeasureSpec.getSize(i2);
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = view.getMeasuredHeight();
                }
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                if (DialogsAdapter.this.parentFragment.hasStories) {
                    currentActionBarHeight += AndroidUtilities.dp(81.0f);
                }
            } else if (size == 0 || (i5 == 0 && !z)) {
                currentActionBarHeight = 0;
            } else {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int i6 = size2 - i4;
                int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                int iDp2 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    if (((ItemInternal) DialogsAdapter.this.itemInternals.get(i7)).viewType == 0) {
                        if (!((ItemInternal) DialogsAdapter.this.itemInternals.get(i7)).isForumCell || z2) {
                            iDp2 += iDp;
                        } else {
                            iDp2 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                    } else if (((ItemInternal) DialogsAdapter.this.itemInternals.get(i7)).viewType == 1) {
                        iDp2 += iDp;
                    }
                }
                int size3 = iDp2 + (size - 1);
                if (DialogsAdapter.this.onlineContacts != null) {
                    size3 += (DialogsAdapter.this.onlineContacts.size() * AndroidUtilities.dp(58.0f)) + (DialogsAdapter.this.onlineContacts.size() - 1) + AndroidUtilities.dp(52.0f);
                }
                int i8 = z ? iDp + 1 : 0;
                if (size3 < i6) {
                    currentActionBarHeight = ((i6 - size3) + i8) - paddingBottom;
                    if (i5 != 0) {
                        currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                        if (!z2 && !DialogsAdapter.this.isTransitionSupport) {
                            currentActionBarHeight -= ActionBar.getCurrentActionBarHeight();
                            if (getParent() instanceof DialogsActivity.DialogsRecyclerView) {
                                i3 = ((DialogsActivity.DialogsRecyclerView) getParent()).additionalPadding;
                                currentActionBarHeight -= i3;
                            }
                        } else if (z2) {
                            currentActionBarHeight -= i5;
                        }
                    }
                } else {
                    int i9 = size3 - i6;
                    if (i9 < i8) {
                        currentActionBarHeight = (i8 - i9) - paddingBottom;
                        if (i5 != 0) {
                            currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                            if (!z2 && !DialogsAdapter.this.isTransitionSupport) {
                                currentActionBarHeight -= ActionBar.getCurrentActionBarHeight();
                                if (getParent() instanceof DialogsActivity.DialogsRecyclerView) {
                                    i3 = ((DialogsActivity.DialogsRecyclerView) getParent()).additionalPadding;
                                    currentActionBarHeight -= i3;
                                }
                            } else if (z2) {
                                currentActionBarHeight -= i5;
                            }
                        }
                    } else {
                        currentActionBarHeight = 0;
                    }
                }
            }
            int iDp3 = currentActionBarHeight >= 0 ? currentActionBarHeight : 0;
            if (DialogsAdapter.this.isTransitionSupport) {
                iDp3 += AndroidUtilities.dp(1000.0f);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp3, 1073741824));
        }
    }

    private void updateItemListForCommunity() {
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        this.itemInternals.clear();
        updateHasHints();
        MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(this.currentAccount).buildCommunityPeers(this.communityId);
        this.dialogsCount = communityPeersDialogBuildCommunityPeers.getDialogsCount();
        this.isEmpty = false;
        int i = this.dialogsType == 3 ? 2 : 4;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                arrayList = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
                string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
            } else if (i2 == 1) {
                arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
                string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
            } else if (i2 == 2) {
                arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
                string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
            } else {
                arrayList = communityPeersDialogBuildCommunityPeers.chatsOther;
                string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
            }
            if (!arrayList.isEmpty()) {
                this.itemInternals.add(new ItemInternal(22, string));
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i3);
                    TLRPC.Dialog dialog = communityPeerDialog.dialog;
                    if (dialog != null) {
                        this.itemInternals.add(new ItemInternal(0, dialog));
                    } else {
                        TLRPC.Chat chat = communityPeerDialog.chat;
                        if (chat != null) {
                            this.itemInternals.add(new ItemInternal(23, chat));
                        } else {
                            TLRPC.User user = communityPeerDialog.user;
                            if (user != null) {
                                this.itemInternals.add(new ItemInternal(23, user));
                            }
                        }
                    }
                }
            }
        }
    }

    private void updateItemList() {
        ArrayList dialogsArray;
        DialogsActivity dialogsActivity;
        TLRPC.Dialog tL_dialog;
        int i;
        boolean z;
        TLRPC.RequestPeerType requestPeerType;
        ItemInternal itemInternal;
        TLRPC.Dialog dialog;
        int i2;
        int i3;
        int i4;
        DialogsActivity dialogsActivity2;
        TLRPC.Dialog tL_dialog2;
        int i5;
        if (this.communityId != 0) {
            updateItemListForCommunity();
            return;
        }
        this.itemInternals.clear();
        updateHasHints();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j = this.communityId;
        if (j != 0) {
            dialogsArray = messagesController.getDialogsByCommunity(j);
        } else {
            dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen);
            if (dialogsArray == null) {
                dialogsArray = new ArrayList();
            }
        }
        int size = dialogsArray.size();
        this.dialogsCount = size;
        int i6 = 0;
        this.isEmpty = false;
        if (size == 0 && this.parentFragment.isArchive()) {
            this.itemInternals.add(new ItemInternal(19));
            return;
        }
        if (!this.hasHints && this.dialogsType == 0 && (i5 = this.folderId) == 0 && messagesController.isDialogsEndReached(i5) && !this.forceUpdatingContacts) {
            if (messagesController.getAllFoldersDialogsCount() <= 10 && ContactsController.getInstance(this.currentAccount).doneLoadingContacts && !ContactsController.getInstance(this.currentAccount).contacts.isEmpty()) {
                this.onlineContacts = new ArrayList(ContactsController.getInstance(this.currentAccount).contacts);
                long j2 = UserConfig.getInstance(this.currentAccount).clientUserId;
                int size2 = this.onlineContacts.size();
                int i7 = 0;
                while (i7 < size2) {
                    long j3 = ((TLRPC.TL_contact) this.onlineContacts.get(i7)).user_id;
                    if (j3 == j2 || messagesController.dialogs_dict.get(j3) != null) {
                        this.onlineContacts.remove(i7);
                        i7--;
                        size2--;
                    }
                    i7++;
                }
                if (this.onlineContacts.isEmpty()) {
                    this.onlineContacts = null;
                } else {
                    sortOnlineContacts(false);
                }
            } else {
                this.onlineContacts = null;
            }
        }
        MessagesController.DialogFilter currentFilter = getCurrentFilter();
        if ((currentFilter == null || currentFilter.isDefault()) && (dialogsActivity = this.parentFragment) != null && dialogsActivity.isReplyTo && dialogsActivity.replyMessageAuthor != 0) {
            this.itemInternals.add(new ItemInternal(20));
            int i8 = 0;
            while (true) {
                if (i8 >= dialogsArray.size()) {
                    tL_dialog = null;
                    break;
                } else {
                    if (dialogsArray.get(i8).id == this.parentFragment.replyMessageAuthor) {
                        tL_dialog = dialogsArray.get(i8);
                        break;
                    }
                    i8++;
                }
            }
            if (tL_dialog == null) {
                tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = this.parentFragment.replyMessageAuthor;
            }
            this.itemInternals.add(new ItemInternal(0, tL_dialog));
            this.itemInternals.add(new ItemInternal(20));
        } else if ((currentFilter == null || currentFilter.isDefault()) && (dialogsActivity2 = this.parentFragment) != null && this.dialogsType == 3 && dialogsActivity2.forwardOriginalChannel != 0) {
            this.itemInternals.add(new ItemInternal(20));
            int i9 = 0;
            while (true) {
                if (i9 >= dialogsArray.size()) {
                    tL_dialog2 = null;
                    break;
                } else {
                    if (dialogsArray.get(i9).id == this.parentFragment.forwardOriginalChannel) {
                        tL_dialog2 = dialogsArray.get(i9);
                        break;
                    }
                    i9++;
                }
            }
            if (tL_dialog2 == null) {
                tL_dialog2 = new TLRPC.TL_dialog();
                tL_dialog2.id = this.parentFragment.forwardOriginalChannel;
            }
            this.itemInternals.add(new ItemInternal(0, tL_dialog2));
            this.itemInternals.add(new ItemInternal(20));
        }
        this.hasChatlistHint = false;
        int i10 = this.dialogsType;
        if ((i10 == 7 || i10 == 8) && currentFilter != null && currentFilter.isChatlist()) {
            messagesController.checkChatlistFolderUpdate(currentFilter.id, false);
            TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(currentFilter.id);
            if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                this.hasChatlistHint = true;
                this.itemInternals.add(new ItemInternal(chatlistFolderUpdates));
            }
        }
        if (this.requestPeerType != null) {
            this.itemInternals.add(new ItemInternal(15));
        }
        if (this.collapsedView || this.isTransitionSupport) {
            for (int i11 = 0; i11 < dialogsArray.size(); i11++) {
                if (this.dialogsType == 2 && (dialogsArray.get(i11) instanceof DialogsActivity.DialogsHeader)) {
                    this.itemInternals.add(new ItemInternal(14, dialogsArray.get(i11)));
                } else {
                    this.itemInternals.add(new ItemInternal(0, dialogsArray.get(i11)));
                }
            }
            this.itemInternals.add(new ItemInternal(10));
            return;
        }
        if (this.dialogsCount == 0 && this.forceUpdatingContacts) {
            this.isEmpty = true;
            if (this.requestPeerType != null) {
                this.itemInternals.add(new ItemInternal(16));
            } else {
                this.itemInternals.add(new ItemInternal(5, dialogsEmptyType()));
            }
            this.itemInternals.add(new ItemInternal(8));
            this.itemInternals.add(new ItemInternal(7));
            this.itemInternals.add(new ItemInternal(13));
        } else {
            ArrayList arrayList = this.onlineContacts;
            if (arrayList != null && !arrayList.isEmpty() && (i = this.dialogsType) != 7 && i != 8) {
                if (this.dialogsCount == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        this.itemInternals.add(new ItemInternal(16));
                    } else {
                        this.itemInternals.add(new ItemInternal(5, dialogsEmptyType()));
                    }
                    this.itemInternals.add(new ItemInternal(8));
                    this.itemInternals.add(new ItemInternal(7));
                } else {
                    for (int i12 = 0; i12 < dialogsArray.size(); i12++) {
                        this.itemInternals.add(new ItemInternal(0, dialogsArray.get(i12)));
                    }
                    this.itemInternals.add(new ItemInternal(8));
                    this.itemInternals.add(new ItemInternal(7));
                }
                for (int i13 = 0; i13 < this.onlineContacts.size(); i13++) {
                    this.itemInternals.add(new ItemInternal(6, (TLRPC.TL_contact) this.onlineContacts.get(i13)));
                }
                this.itemInternals.add(new ItemInternal(10));
                z = true;
            } else if (this.hasHints) {
                int size3 = MessagesController.getInstance(this.currentAccount).hintDialogs.size();
                this.itemInternals.add(new ItemInternal(2));
                for (int i14 = 0; i14 < size3; i14++) {
                    this.itemInternals.add(new ItemInternal(4, MessagesController.getInstance(this.currentAccount).hintDialogs.get(i14)));
                }
                this.itemInternals.add(new ItemInternal(3));
            } else {
                int i15 = this.dialogsType;
                if (i15 == 11 || i15 == 13) {
                    this.itemInternals.add(new ItemInternal(7));
                    this.itemInternals.add(new ItemInternal(12));
                } else if (i15 == 12) {
                    this.itemInternals.add(new ItemInternal(7));
                }
            }
            requestPeerType = this.requestPeerType;
            if ((!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.dialogsCount > 0) {
                this.itemInternals.add(new ItemInternal(12));
            }
            if (this.allowForwardAsStories && this.dialogsType == 3) {
                this.itemInternals.add(new ItemInternal(21));
            }
            if (!z) {
                for (i2 = 0; i2 < dialogsArray.size(); i2++) {
                    if (this.dialogsType != 2 && (dialogsArray.get(i2) instanceof DialogsActivity.DialogsHeader)) {
                        this.itemInternals.add(new ItemInternal(14, dialogsArray.get(i2)));
                    } else {
                        this.itemInternals.add(new ItemInternal(0, dialogsArray.get(i2)));
                    }
                }
                if (this.communityId != 0 && !this.forceShowEmptyCell && (i4 = this.dialogsType) != 7 && i4 != 8 && !MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId)) {
                    if (this.dialogsCount != 0) {
                        this.itemInternals.add(new ItemInternal(1));
                    }
                    this.itemInternals.add(new ItemInternal(10));
                } else {
                    i3 = this.dialogsCount;
                    if (i3 == 0) {
                        this.isEmpty = true;
                        if (this.requestPeerType != null) {
                            this.itemInternals.add(new ItemInternal(16));
                        } else {
                            this.itemInternals.add(new ItemInternal(5, dialogsEmptyType()));
                        }
                    } else {
                        if (this.folderId == 0 && i3 > 10 && this.dialogsType == 0) {
                            this.itemInternals.add(new ItemInternal(11));
                        }
                        this.itemInternals.add(new ItemInternal(10));
                    }
                }
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
            while (i6 < this.itemInternals.size()) {
                itemInternal = (ItemInternal) this.itemInternals.get(i6);
                if (itemInternal.viewType != 0 && (dialog = itemInternal.dialog) != null && messagesController.isHiddenByUndo(dialog.id)) {
                    this.itemInternals.remove(i6);
                    i6--;
                }
                i6++;
            }
        }
        z = false;
        requestPeerType = this.requestPeerType;
        if (!(requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            this.itemInternals.add(new ItemInternal(12));
        } else {
            this.itemInternals.add(new ItemInternal(12));
        }
        if (this.allowForwardAsStories) {
            this.itemInternals.add(new ItemInternal(21));
        }
        if (!z) {
            while (i2 < dialogsArray.size()) {
                if (this.dialogsType != 2) {
                    this.itemInternals.add(new ItemInternal(0, dialogsArray.get(i2)));
                } else {
                    this.itemInternals.add(new ItemInternal(0, dialogsArray.get(i2)));
                }
            }
            if (this.communityId != 0) {
                i3 = this.dialogsCount;
                if (i3 == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        this.itemInternals.add(new ItemInternal(16));
                    } else {
                        this.itemInternals.add(new ItemInternal(5, dialogsEmptyType()));
                    }
                } else {
                    if (this.folderId == 0) {
                        this.itemInternals.add(new ItemInternal(11));
                    }
                    this.itemInternals.add(new ItemInternal(10));
                }
            } else {
                i3 = this.dialogsCount;
                if (i3 == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        this.itemInternals.add(new ItemInternal(16));
                    } else {
                        this.itemInternals.add(new ItemInternal(5, dialogsEmptyType()));
                    }
                } else {
                    if (this.folderId == 0) {
                        this.itemInternals.add(new ItemInternal(11));
                    }
                    this.itemInternals.add(new ItemInternal(10));
                }
            }
        }
        if (messagesController.hiddenUndoChats.isEmpty()) {
            while (i6 < this.itemInternals.size()) {
                itemInternal = (ItemInternal) this.itemInternals.get(i6);
                if (itemInternal.viewType != 0) {
                }
                i6++;
            }
        }
    }

    public int getItemHeight(int i) {
        int iDp;
        if (((ItemInternal) this.itemInternals.get(i)).viewType != 0) {
            return 0;
        }
        if (((ItemInternal) this.itemInternals.get(i)).isForumCell && !this.collapsedView) {
            iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
        } else {
            iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
        }
        return iDp + 1;
    }
}
