package org.telegram.ui.Adapters;

import android.animation.ValueAnimator;
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
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
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
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.ArchiveHintCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.DialogMeUrlCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DialogsEmptyCell$$ExternalSyntheticLambda3;
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
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.web.AddressBarList;

public class DialogsAdapter extends RecyclerListView.SelectionAdapter implements DialogCell.DialogCellDelegate {
    private static final boolean ALLOW_UPDATE_IN_BACKGROUND = BuildVars.DEBUG_PRIVATE_VERSION;
    public static final int VIEW_TYPE_ARCHIVE_FULLSCREEN = 19;
    public static final int VIEW_TYPE_CONTACTS_FLICKER = 13;
    public static final int VIEW_TYPE_DIALOG = 0;
    public static final int VIEW_TYPE_DIALOG_COMMUNITY = 23;
    public static final int VIEW_TYPE_DIVIDER = 3;
    public static final int VIEW_TYPE_EMPTY = 5;
    public static final int VIEW_TYPE_FLICKER = 1;
    public static final int VIEW_TYPE_FOLDER_UPDATE_HINT = 17;
    public static final int VIEW_TYPE_FORWARD_TO_STORIES_CELL = 21;
    public static final int VIEW_TYPE_GRAY_SECTION = 20;
    public static final int VIEW_TYPE_HEADER = 7;
    public static final int VIEW_TYPE_HEADER_2 = 14;
    public static final int VIEW_TYPE_HEADER_3 = 22;
    public static final int VIEW_TYPE_LAST_EMPTY = 10;
    public static final int VIEW_TYPE_ME_URL = 4;
    public static final int VIEW_TYPE_NEW_CHAT_HINT = 11;
    public static final int VIEW_TYPE_RECENTLY_VIEWED = 2;
    public static final int VIEW_TYPE_REQUIRED_EMPTY = 16;
    public static final int VIEW_TYPE_REQUIREMENTS = 15;
    public static final int VIEW_TYPE_SHADOW = 8;
    public static final int VIEW_TYPE_STORIES = 18;
    public static final int VIEW_TYPE_TEXT = 12;
    public static final int VIEW_TYPE_USER = 6;
    private boolean allowForwardAsStories;
    private ArchiveHintCell archiveHintCell;
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
    private ArrayList<TLRPC.TL_contact> onlineContacts;
    private long openedDialogId;
    private DialogsActivity parentFragment;
    private DialogsPreloader preloader;
    private int prevContactsCount;
    private int prevDialogsCount;
    private PullForegroundDrawable pullForegroundDrawable;
    RecyclerListView recyclerListView;
    private TLRPC.RequestPeerType requestPeerType;
    private ArrayList<Long> selectedDialogs;
    boolean updateListPending;
    private boolean firstUpdate = true;
    ArrayList<ItemInternal> itemInternals = new ArrayList<>();
    ArrayList<ItemInternal> oldItems = new ArrayList<>();
    int stableIdPointer = 10;
    LongSparseIntArray dialogsStableIds = new LongSparseIntArray();
    HashMap<String, Integer> dialogsHeaderStableIds = new HashMap<>();
    public int lastDialogsEmptyType = -1;

    public final class AnonymousClass3 extends DialogsRequestedEmptyCell {
        public AnonymousClass3(Context context) {
            super(context);
        }
    }

    public final class DialogsPreloader {
        public final HashSet dialogsReadyMap = new HashSet();
        public final HashSet preloadedErrorMap = new HashSet();
        public final HashSet loadingDialogs = new HashSet();
        public final ArrayList preloadDialogsPool = new ArrayList();
        public final ActivityCompat$$ExternalSyntheticLambda0 clearNetworkRequestCount = new ActivityCompat$$ExternalSyntheticLambda0(this, 26);
    }

    public final class LastEmptyView extends FrameLayout {
        public boolean moving;

        public LastEmptyView(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int currentActionBarHeight;
            int i3;
            DialogsAdapter dialogsAdapter = DialogsAdapter.this;
            int size = dialogsAdapter.itemInternals.size();
            boolean z = dialogsAdapter.folderId == 0 && dialogsAdapter.dialogsType == 0 && MessagesController.getInstance(dialogsAdapter.currentAccount).dialogs_dict.get(DialogObject.makeFolderDialogId(1)) != null;
            View view = (View) getParent();
            int i4 = view instanceof BlurredRecyclerView ? ((BlurredRecyclerView) view).blurTopPadding : 0;
            boolean z2 = dialogsAdapter.collapsedView;
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            int i5 = paddingTop - i4;
            if (dialogsAdapter.folderId == 1 && size == 1 && dialogsAdapter.itemInternals.get(0).viewType == 19) {
                currentActionBarHeight = View.MeasureSpec.getSize(i2);
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = view.getMeasuredHeight();
                }
                if (currentActionBarHeight == 0) {
                    currentActionBarHeight = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                if (dialogsAdapter.parentFragment.hasStories) {
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
                    if (dialogsAdapter.itemInternals.get(i7).viewType == 0) {
                        if (!dialogsAdapter.itemInternals.get(i7).isForumCell || z2) {
                            iDp2 += iDp;
                        } else {
                            iDp2 += AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
                        }
                    } else if (dialogsAdapter.itemInternals.get(i7).viewType == 1) {
                        iDp2 += iDp;
                    }
                }
                int iM = (size - 1) + iDp2;
                if (dialogsAdapter.onlineContacts != null) {
                    iM = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(52.0f, (dialogsAdapter.onlineContacts.size() - 1) + (AndroidUtilities.dp(58.0f) * dialogsAdapter.onlineContacts.size()), iM);
                }
                int i8 = z ? iDp + 1 : 0;
                if (iM < i6) {
                    currentActionBarHeight = ((i6 - iM) + i8) - paddingBottom;
                    if (i5 != 0) {
                        currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                        if (!z2 && !dialogsAdapter.isTransitionSupport) {
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
                    int i9 = iM - i6;
                    if (i9 < i8) {
                        currentActionBarHeight = (i8 - i9) - paddingBottom;
                        if (i5 != 0) {
                            currentActionBarHeight -= AndroidUtilities.statusBarHeight;
                            if (!z2 && !dialogsAdapter.isTransitionSupport) {
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
            if (dialogsAdapter.isTransitionSupport) {
                iDp3 += AndroidUtilities.dp(1000.0f);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iDp3, 1073741824));
        }
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

    @Override
    public boolean canClickButtonInside() {
        return this.selectedDialogs.isEmpty();
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

    public void didDatabaseCleared() {
        DialogsPreloader dialogsPreloader = this.preloader;
        if (dialogsPreloader != null) {
            dialogsPreloader.dialogsReadyMap.clear();
            dialogsPreloader.preloadedErrorMap.clear();
            dialogsPreloader.loadingDialogs.clear();
            dialogsPreloader.preloadDialogsPool.clear();
            AndroidUtilities.cancelRunOnUIThread(dialogsPreloader.clearNetworkRequestCount);
        }
    }

    public int findDialogPosition(long j) {
        for (int i = 0; i < this.itemInternals.size(); i++) {
            if (this.itemInternals.get(i).dialog != null && this.itemInternals.get(i).dialog.id == j) {
                return i;
            }
        }
        return -1;
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

    public int fixScrollGap(RecyclerListView recyclerListView, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
        int paddingTop = ((recyclerListView.getPaddingTop() + i2) - (i * iDp)) - i;
        if (z) {
            paddingTop += iDp;
        }
        int paddingTop2 = recyclerListView.getPaddingTop();
        return paddingTop > paddingTop2 ? (i2 + paddingTop2) - paddingTop : i2;
    }

    public ViewPager getArchiveHintCellPager() {
        return null;
    }

    public TL_chatlists.TL_chatlists_chatlistUpdates getChatlistUpdate() {
        ItemInternal itemInternal = this.itemInternals.get(0);
        if (itemInternal == null || itemInternal.viewType != 17) {
            return null;
        }
        return itemInternal.chatlistUpdates;
    }

    public int getCurrentCount() {
        return this.currentCount;
    }

    public final MessagesController.DialogFilter getCurrentFilter() {
        int i = this.dialogsType;
        if (i == 7 || i == 8) {
            return MessagesController.getInstance(this.currentAccount).selectedDialogFilter[this.dialogsType - 7];
        }
        return null;
    }

    public int getDialogsCount() {
        return this.dialogsCount;
    }

    public boolean getDialogsListIsFrozen() {
        return this.dialogsListFrozen;
    }

    public int getDialogsType() {
        return this.dialogsType;
    }

    public Object getItem(int i) {
        if (i >= 0 && i < this.itemInternals.size()) {
            ItemInternal itemInternal = this.itemInternals.get(i);
            String str = itemInternal.title;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = itemInternal.chat;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = itemInternal.user;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = itemInternal.dialog;
            if (dialog != null) {
                return dialog;
            }
            TLRPC.TL_contact tL_contact = itemInternal.contact;
            if (tL_contact != null) {
                return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = itemInternal.recentMeUrl;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    @Override
    public int getItemCount() {
        int size = this.itemInternals.size();
        this.currentCount = size;
        return size;
    }

    public int getItemHeight(int i) {
        int iDp;
        if (this.itemInternals.get(i).viewType != 0) {
            return 0;
        }
        if (!this.itemInternals.get(i).isForumCell || this.collapsedView) {
            iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
        } else {
            iDp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 86.0f : 91.0f);
        }
        return iDp + 1;
    }

    @Override
    public long getItemId(int i) {
        return this.itemInternals.get(i).stableId;
    }

    @Override
    public int getItemViewType(int i) {
        return this.itemInternals.get(i).viewType;
    }

    public boolean isAllowForwardAsStories() {
        return this.allowForwardAsStories;
    }

    public boolean isDataSetChanged() {
        return true;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return (itemViewType == 1 || itemViewType == 5 || itemViewType == 3 || itemViewType == 8 || itemViewType == 7 || itemViewType == 10 || itemViewType == 11 || itemViewType == 13 || itemViewType == 15 || itemViewType == 16 || itemViewType == 18 || itemViewType == 19 || itemViewType == 20) ? false : true;
    }

    public final void lambda$onBindViewHolder$4() {
        this.parentFragment.setScrollDisabled(false);
    }

    public final void lambda$onBindViewHolder$5(Float f) {
        this.parentFragment.setContactsAlpha(f.floatValue());
    }

    public final void lambda$onCreateViewHolder$3(View view) {
        MessagesController.getInstance(this.currentAccount).hintDialogs.clear();
        MessagesController.getGlobalMainSettings().edit().remove("installReferer").commit();
        notifyDataSetChanged();
    }

    public final void lambda$updateList$1(Runnable runnable, ArrayList arrayList, DiffUtil.DiffResult diffResult) {
        if (this.isCalculatingDiff) {
            this.isCalculatingDiff = false;
            if (runnable != null) {
                runnable.run();
            }
            this.itemInternals = arrayList;
            diffResult.getClass();
            diffResult.dispatchUpdatesTo(new OpReorderer(this));
            if (this.updateListPending) {
                this.updateListPending = false;
                updateList(runnable);
            }
        }
    }

    public final void lambda$updateList$2(DiffUtil.Callback callback, Runnable runnable, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(10, this, runnable, arrayList, DiffUtil.calculateDiff(callback, true)));
    }

    public void moveDialogs(RecyclerListView recyclerListView, int i, int i2) {
        ArrayList<TLRPC.Dialog> dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, false);
        int iFixPosition = fixPosition(i);
        int iFixPosition2 = fixPosition(i2);
        TLRPC.Dialog dialog = dialogsArray.get(iFixPosition);
        TLRPC.Dialog dialog2 = dialogsArray.get(iFixPosition2);
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
    public void notifyDataSetChanged() {
        if (this.isCalculatingDiff) {
            this.itemInternals = new ArrayList<>();
        }
        this.isCalculatingDiff = false;
        updateItemList();
        super.notifyDataSetChanged();
    }

    @Override
    public void notifyItemMoved(int i, int i2) {
        super.notifyItemMoved(i, i2);
    }

    public void onArchiveSettingsClick() {
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        TLRPC.Dialog dialog;
        TLRPC.Chat chat;
        CharSequence string;
        Object obj;
        CharSequence charSequence;
        CharSequence userName;
        boolean z;
        boolean zContains;
        boolean z2;
        CheckBox2 checkBox2;
        CharSequence lowerCase;
        DialogsActivity dialogsActivity;
        DialogsActivity dialogsActivity2;
        int i3;
        String string2;
        Object[] objArr = 0;
        int i4 = 1;
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) getItem(i);
            Object item = getItem(i + 1);
            TLRPC.Dialog dialog3 = item instanceof TLRPC.Dialog ? (TLRPC.Dialog) item : null;
            int i5 = this.dialogsType;
            if (i5 == 2 || i5 == 15) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                long dialogId = profileSearchCell.getDialogId();
                i2 = 1;
                if (dialog2.id != 0) {
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog2.id));
                    if (chat == null || chat.migrated_to == null) {
                        dialog = dialog3;
                    } else {
                        dialog = dialog3;
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.migrated_to.channel_id));
                        if (chat2 != null) {
                            chat = chat2;
                        }
                    }
                } else {
                    dialog = dialog3;
                    chat = null;
                }
                if (chat != null) {
                    userName = chat.title;
                    if (!ChatObject.isChannel(chat) || chat.megagroup) {
                        int i6 = chat.participants_count;
                        if (i6 != 0) {
                            lowerCase = LocaleController.formatPluralStringComma("Members", i6);
                        } else if (chat.has_geo) {
                            lowerCase = LocaleController.getString(R.string.MegaLocation);
                        } else {
                            lowerCase = !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                        }
                    } else {
                        int i7 = chat.participants_count;
                        lowerCase = i7 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i7) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                    }
                    string = lowerCase;
                    obj = chat;
                } else {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog2.id));
                    if (user != null) {
                        userName = UserObject.getUserName(user);
                        obj = user;
                        string = UserObject.isReplyUser(user) ? "" : user.bot ? LocaleController.getString(R.string.Bot) : LocaleController.formatUserStatus(this.currentAccount, user);
                    } else {
                        string = "";
                        obj = null;
                        charSequence = null;
                    }
                    if (dialog != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                    profileSearchCell.setData(obj, null, charSequence, string, false, false);
                    zContains = this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                    if (dialogId == profileSearchCell.getDialogId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    checkBox2 = profileSearchCell.checkBox;
                    if (checkBox2 != null) {
                        checkBox2.setChecked(zContains, z2);
                    }
                }
                charSequence = userName;
                if (dialog != null) {
                    z = true;
                } else {
                    z = false;
                }
                profileSearchCell.useSeparator = z;
                profileSearchCell.setData(obj, null, charSequence, string, false, false);
                zContains = this.selectedDialogs.contains(Long.valueOf(profileSearchCell.getDialogId()));
                if (dialogId == profileSearchCell.getDialogId()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                checkBox2 = profileSearchCell.checkBox;
                if (checkBox2 != null) {
                    checkBox2.setChecked(zContains, z2);
                }
            } else {
                DialogCell dialogCell = (DialogCell) viewHolder.itemView;
                dialogCell.isHiddenInCommunity = this.communityId != 0 && ChatObject.isHiddenInCommunity(this.currentAccount, dialog2.id);
                dialogCell.useSeparator = false;
                dialogCell.fullSeparator = false;
                if (this.dialogsType == 0 && AndroidUtilities.isTablet()) {
                    dialogCell.setDialogSelected(dialog2.id == this.openedDialogId);
                }
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(dialog2.id)), false);
                if (i == 1 && (dialogsActivity2 = this.parentFragment) != null && dialogsActivity2.isReplyTo && dialogsActivity2.replyMessageAuthor != 0 && dialog2.top_message == 0) {
                    MessagesController.DialogFilter currentFilter = getCurrentFilter();
                    if (currentFilter == null || currentFilter.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(this.parentFragment.replyMessageAuthor));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else if (i == 1 && (dialogsActivity = this.parentFragment) != null && this.dialogsType == 3 && dialogsActivity.forwardOriginalChannel != 0 && dialog2.top_message == 0) {
                    MessagesController.DialogFilter currentFilter2 = getCurrentFilter();
                    if (currentFilter2 == null || currentFilter2.isDefault()) {
                        dialogCell.setCustomMessage(DialogObject.getStatus(this.parentFragment.forwardOriginalChannel));
                    } else {
                        dialogCell.setCustomMessage(null);
                    }
                } else {
                    dialogCell.setCustomMessage(null);
                }
                dialogCell.setDialog(dialog2, this.dialogsType, this.folderId);
                dialogCell.checkHeight();
                boolean z3 = dialogCell.collapsed;
                boolean z4 = this.collapsedView;
                if (z3 != z4) {
                    dialogCell.collapsed = z4;
                    dialogCell.requestLayout();
                }
                DialogsPreloader dialogsPreloader = this.preloader;
                if (dialogsPreloader != null && i < 10) {
                    long j = dialog2.id;
                    if (!dialogsPreloader.dialogsReadyMap.contains(Long.valueOf(j)) && !dialogsPreloader.preloadedErrorMap.contains(Long.valueOf(j)) && !dialogsPreloader.loadingDialogs.contains(Long.valueOf(j))) {
                        ArrayList arrayList = dialogsPreloader.preloadDialogsPool;
                        if (!arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                        }
                    }
                }
            }
            if (i >= this.dialogsCount + i2) {
                viewHolder.itemView.setAlpha(1.0f);
            }
        }
        if (itemViewType == 4) {
            ((DialogMeUrlCell) viewHolder.itemView).setRecentMeUrl((TLRPC.RecentMeUrl) getItem(i));
        } else if (itemViewType == 5) {
            DialogsEmptyCell dialogsEmptyCell = (DialogsEmptyCell) viewHolder.itemView;
            int i8 = this.lastDialogsEmptyType;
            int iDialogsEmptyType = dialogsEmptyType();
            this.lastDialogsEmptyType = iDialogsEmptyType;
            boolean z5 = this.isOnlySelect;
            if (dialogsEmptyCell.currentType != iDialogsEmptyType) {
                dialogsEmptyCell.currentType = iDialogsEmptyType;
                TextView textView = dialogsEmptyCell.titleView;
                RLottieImageView rLottieImageView = dialogsEmptyCell.imageView;
                if (iDialogsEmptyType == 0 || iDialogsEmptyType == 1) {
                    i3 = R.raw.utyan_newborn;
                    string2 = LocaleController.getString(R.string.NoChatsHelp);
                    textView.setText(LocaleController.getString(R.string.NoChats));
                } else if (iDialogsEmptyType != 2) {
                    rLottieImageView.setAutoRepeat(true);
                    i3 = R.raw.filter_new;
                    string2 = LocaleController.getString(R.string.FilterAddingChatsInfo);
                    textView.setText(LocaleController.getString(R.string.FilterAddingChats));
                } else {
                    rLottieImageView.setAutoRepeat(false);
                    i3 = R.raw.filter_no_chats;
                    if (z5) {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToForward));
                        string2 = LocaleController.getString(R.string.FilterNoChatsToForwardInfo);
                    } else {
                        textView.setText(LocaleController.getString(R.string.FilterNoChatsToDisplay));
                        string2 = LocaleController.getString(R.string.FilterNoChatsToDisplayInfo);
                    }
                }
                TextViewSwitcher textViewSwitcher = dialogsEmptyCell.subtitleView;
                if (i3 != 0) {
                    rLottieImageView.setVisibility(0);
                    if (dialogsEmptyCell.currentType == 1) {
                        if (dialogsEmptyCell.utyanAnimationTriggered) {
                            dialogsEmptyCell.utyanCollapseProgress = 1.0f;
                            String string3 = LocaleController.getString(R.string.NoChatsContactsHelp);
                            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                                string3 = string3.replace('\n', ' ');
                            }
                            textViewSwitcher.setText(string3, true);
                            dialogsEmptyCell.requestLayout();
                        } else {
                            dialogsEmptyCell.startUtyanCollapseAnimation(true);
                        }
                    }
                    if (dialogsEmptyCell.prevIcon != i3) {
                        rLottieImageView.setAnimation(i3, 100, 100);
                        rLottieImageView.playAnimation();
                        dialogsEmptyCell.prevIcon = i3;
                    }
                } else {
                    rLottieImageView.setVisibility(8);
                }
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                    string2 = string2.replace('\n', ' ');
                }
                textViewSwitcher.setText(string2, false);
            }
            int i9 = this.dialogsType;
            if (i9 != 7 && i9 != 8) {
                dialogsEmptyCell.setOnUtyanAnimationEndListener(new DialogsAdapter$$ExternalSyntheticLambda2(this, 0));
                dialogsEmptyCell.setOnUtyanAnimationUpdateListener(new SendGiftSheet$$ExternalSyntheticLambda12(this, i4));
                if (!dialogsEmptyCell.utyanAnimationTriggered && this.dialogsCount == 0) {
                    this.parentFragment.setContactsAlpha(0.0f);
                    this.parentFragment.setScrollDisabled(true);
                }
                if (this.onlineContacts == null || i8 != 0) {
                    if (this.forceUpdatingContacts) {
                        if (this.dialogsCount == 0) {
                            dialogsEmptyCell.startUtyanCollapseAnimation(false);
                        }
                    } else if (dialogsEmptyCell.utyanAnimationTriggered && this.lastDialogsEmptyType == 0) {
                        ValueAnimator valueAnimator = dialogsEmptyCell.utyanAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        dialogsEmptyCell.utyanAnimationTriggered = false;
                        ValueAnimator duration = ValueAnimator.ofFloat(dialogsEmptyCell.utyanCollapseProgress, 0.0f).setDuration(250L);
                        dialogsEmptyCell.utyanAnimator = duration;
                        duration.setInterpolator(Easings.easeOutQuad);
                        dialogsEmptyCell.utyanAnimator.addUpdateListener(new DialogsEmptyCell$$ExternalSyntheticLambda3(dialogsEmptyCell, 1));
                        dialogsEmptyCell.utyanAnimator.addListener(new DialogsEmptyCell.AnonymousClass1(dialogsEmptyCell, objArr == true ? 1 : 0));
                        dialogsEmptyCell.utyanAnimator.start();
                    }
                } else if (!dialogsEmptyCell.utyanAnimationTriggered) {
                    dialogsEmptyCell.startUtyanCollapseAnimation(true);
                }
            }
        } else if (itemViewType == 6) {
            ((UserCell) viewHolder.itemView).setData((TLRPC.User) getItem(i), null, null, 0);
        } else if (itemViewType == 7) {
            HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
            int i10 = this.dialogsType;
            if (i10 != 11 && i10 != 12 && i10 != 13) {
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
                drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false), PorterDuff.Mode.MULTIPLY));
            }
            LinkSpanDrawable.LinksTextView textView2 = textInfoPrivacyCell.getTextView();
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
            DialogsActivity dialogsActivity3 = this.parentFragment;
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (dialogsActivity3 == null || !dialogsActivity3.storiesEnabled) ? this.arrowDrawable : null, (Drawable) null);
            textView2.getLayoutParams().width = -2;
        } else if (itemViewType != 12) {
            switch (itemViewType) {
                case 14:
                    HeaderCell headerCell2 = (HeaderCell) viewHolder.itemView;
                    headerCell2.setTextSize(14.0f);
                    headerCell2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
                    headerCell2.setBackgroundColor(Theme.getColor(null, Theme.key_graySection, false));
                    int i11 = ((DialogsActivity.DialogsHeader) getItem(i)).headerType;
                    if (i11 == 0) {
                        headerCell2.setText(LocaleController.getString(R.string.MyChannels));
                    } else if (i11 == 1) {
                        headerCell2.setText(LocaleController.getString(R.string.MyGroups));
                    } else if (i11 == 2) {
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
                    TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates = this.itemInternals.get(i).chatlistUpdates;
                    if (tL_chatlists_chatlistUpdates != null) {
                        int size = tL_chatlists_chatlistUpdates.missing_peers.size();
                        dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("FolderUpdatesTitle", size, new Object[0]), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.formatPluralString("FolderUpdatesSubtitle", size, new Object[0]), true, false);
                    }
                    break;
                default:
                    switch (itemViewType) {
                        case 20:
                            GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                            DialogsActivity dialogsActivity4 = this.parentFragment;
                            if (dialogsActivity4 != null && dialogsActivity4.isReplyTo) {
                                if (i != 0) {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                } else {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogMessageAuthor));
                                }
                            } else if (this.dialogsType == 3) {
                                if (i != 0) {
                                    graySectionCell.setText(LocaleController.getString(R.string.ReplyDialogYourChats));
                                } else {
                                    graySectionCell.setText(LocaleController.getString(R.string.ForwardDialogYourChannel));
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
                            if (!(item2 instanceof TLRPC.Chat)) {
                                TLRPC.User user2 = (TLRPC.User) item2;
                                dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(this.currentAccount, user2);
                                dialogCell3.setCustomMessageWithoutRebuild(LocaleController.getString(R.string.Bot));
                                dialogCell3.setDialog(user2.id, null, 0, false, false);
                            } else {
                                TLRPC.Chat chat3 = (TLRPC.Chat) item2;
                                dialogCell3.isHiddenInCommunity = ChatObject.isHiddenInCommunity(this.currentAccount, chat3);
                                dialogCell3.setCustomMessageWithoutRebuild(LocaleController.formatPluralString("Members", chat3.participants_count, new Object[0]));
                                dialogCell3.setDialog(-chat3.id, null, 0, false, false);
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
            int i12 = Theme.key_windowBackgroundWhiteBlueText4;
            textCell.setColors(i12, i12);
            TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
            if (requestPeerType == null) {
                textCell.setTextAndIcon(LocaleController.getString(R.string.CreateGroupForImport), R.drawable.msg_groups_create, this.dialogsCount != 0);
            } else if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.CreateChannelForThis), R.drawable.msg_channel_create, true);
            } else {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.CreateGroupForThis), R.drawable.msg_groups_create, true);
            }
            textCell.setIsInDialogs();
            textCell.setOffsetFromImage(75);
        }
        i2 = 1;
        if (i >= this.dialogsCount + i2) {
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    public void onCreateGroupForThisClick() {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? flickerLoadingView;
        Object userCell;
        Object graySectionCell;
        switch (i) {
            case 0:
            case 21:
                int i2 = this.dialogsType;
                if (i2 == 2 || i2 == 15) {
                    flickerLoadingView = new ProfileSearchCell(this.mContext, null);
                } else {
                    DialogCell dialogCell = new DialogCell(this.parentFragment, this.mContext, false, this.currentAccount, null);
                    if (showOpenBotButton()) {
                        dialogCell.allowBotOpenButton(true, new DialogCell$$ExternalSyntheticLambda6(this, 1));
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
                    flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
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
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(this.mContext);
                zzkb.m(15.0f, 1, textView);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueHeader, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                textView.setGravity(16 | (LocaleController.isRTL ? 3 : 5));
                headerCell.addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 2));
                graySectionCell = headerCell;
                flickerLoadingView = graySectionCell;
                break;
            case 3:
                flickerLoadingView = new ActionBar.AnonymousClass8(this.mContext, 1);
                flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
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
                userCell = new UserCell(8, 0, this.mContext, null, false, false);
                flickerLoadingView = userCell;
                break;
            case 7:
                flickerLoadingView = new HeaderCell(this.mContext);
                DialogsActivity dialogsActivity = this.parentFragment;
                if (dialogsActivity == null || !dialogsActivity.isReplyTo) {
                    flickerLoadingView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                }
                break;
            case 8:
                flickerLoadingView = new ShadowSectionCell(this.mContext, null, 0);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable);
                break;
            case 9:
            case 12:
            default:
                flickerLoadingView = new TextCell(this.mContext);
                if (this.dialogsType == 15) {
                    flickerLoadingView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                }
                break;
            case 10:
                flickerLoadingView = new LastEmptyView(this.mContext);
                break;
            case 11:
                flickerLoadingView = new TextInfoPrivacyCell(this.mContext) {
                    public long lastUpdateTime;
                    public float moveProgress;
                    public int movement;
                    public int originalX;
                    public int originalY;

                    @Override
                    public final void afterTextDraw() {
                        DialogsAdapter dialogsAdapter = DialogsAdapter.this;
                        if (dialogsAdapter.arrowDrawable != null) {
                            Rect bounds = dialogsAdapter.arrowDrawable.getBounds();
                            Drawable drawable = dialogsAdapter.arrowDrawable;
                            int i4 = this.originalX;
                            drawable.setBounds(i4, this.originalY, bounds.width() + i4, bounds.height() + this.originalY);
                        }
                    }

                    @Override
                    public final void onTextDraw() {
                        DialogsAdapter dialogsAdapter = DialogsAdapter.this;
                        if (dialogsAdapter.arrowDrawable != null) {
                            Rect bounds = dialogsAdapter.arrowDrawable.getBounds();
                            int iDp = (int) (this.moveProgress * AndroidUtilities.dp(3.0f));
                            this.originalX = bounds.left;
                            this.originalY = bounds.top;
                            dialogsAdapter.arrowDrawable.setBounds(this.originalX + iDp, AndroidUtilities.dp(1.0f) + this.originalY, bounds.width() + this.originalX + iDp, bounds.height() + AndroidUtilities.dp(1.0f) + this.originalY);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j = jElapsedRealtime - this.lastUpdateTime;
                            if (j > 17) {
                                j = 17;
                            }
                            this.lastUpdateTime = jElapsedRealtime;
                            if (this.movement == 0) {
                                float f = (j / 664.0f) + this.moveProgress;
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
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                combinedDrawable2.setFullsize(true);
                flickerLoadingView.setBackgroundDrawable(combinedDrawable2);
                break;
            case 14:
                HeaderCell headerCell2 = new HeaderCell(this.mContext, Theme.key_graySectionText, 16, 0, false);
                headerCell2.setHeight(32);
                headerCell2.setClickable(false);
                userCell = headerCell2;
                flickerLoadingView = userCell;
                break;
            case 15:
                flickerLoadingView = new RequestPeerRequirementsCell(this.mContext);
                break;
            case 16:
                flickerLoadingView = new AnonymousClass3(this.mContext);
                break;
            case 17:
                flickerLoadingView = new DialogsHintCell(this.mContext);
                break;
            case 18:
                flickerLoadingView = new AddressBarList.AnonymousClass2(this.mContext, 2);
                break;
            case 19:
                flickerLoadingView = new LastEmptyView(this.mContext);
                flickerLoadingView.addView(new ArchiveHelp(this.mContext, this.currentAccount, null, new DialogsAdapter$$ExternalSyntheticLambda2(this, 1), null), LayoutHelper.createFrame(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                graySectionCell = new GraySectionCell(this.mContext, 16, null);
                flickerLoadingView = graySectionCell;
                break;
            case 22:
                flickerLoadingView = new HeaderCell(this.mContext);
                break;
            case 23:
                DialogCell dialogCell2 = new DialogCell(this.parentFragment, this.mContext, false, this.currentAccount, null);
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

    public void onOpenBot(TLRPC.User user) {
    }

    public void onReorderStateChanged(boolean z) {
        this.isReordering = z;
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
    public void openHiddenStories() {
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        if (storiesController.hiddenListStories.isEmpty()) {
            return;
        }
        ArrayList arrayList = storiesController.hiddenListStories;
        boolean z = storiesController.getUnreadState(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i)).peer);
            if (!z || storiesController.getUnreadState(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.parentFragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, this.mContext, null, arrayList2, 0, null, null, new StoriesListPlaceProvider(this.recyclerListView, true), false);
    }

    @Override
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        MessagesController.getInstance(this.currentAccount);
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStories(dialogCell.getDialogId())) {
            StoryViewer orCreateStoryViewer = this.parentFragment.getOrCreateStoryViewer();
            if (runnable != null) {
                orCreateStoryViewer.doOnAnimationReadyRunnables.add(runnable);
            } else {
                orCreateStoryViewer.getClass();
            }
            this.parentFragment.getOrCreateStoryViewer().open(this.parentFragment.getContext(), dialogCell.getDialogId(), new StoriesListPlaceProvider((RecyclerListView) dialogCell.getParent(), false));
        }
    }

    public void pause() {
    }

    public void resume() {
    }

    public void setAllowForwardAsStories(boolean z) {
        this.allowForwardAsStories = z;
    }

    public void setArchivedPullDrawable(PullForegroundDrawable pullForegroundDrawable) {
        this.pullForegroundDrawable = pullForegroundDrawable;
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

    public void setDialogsListFrozen(boolean z) {
        this.dialogsListFrozen = z;
    }

    public void setDialogsType(int i) {
        this.dialogsType = i;
        notifyDataSetChanged();
    }

    public void setForceShowEmptyCell(boolean z) {
        this.forceShowEmptyCell = z;
    }

    public void setForceUpdatingContacts(boolean z) {
        this.forceUpdatingContacts = z;
    }

    public void setIsTransitionSupport() {
        this.isTransitionSupport = true;
    }

    public void setOpenedDialogId(long j) {
        this.openedDialogId = j;
    }

    public void setRecyclerListView(RecyclerListView recyclerListView) {
        this.recyclerListView = recyclerListView;
    }

    @Override
    public void showChatPreview(DialogCell dialogCell) {
        this.parentFragment.showChatPreview(dialogCell);
    }

    public boolean showOpenBotButton() {
        return false;
    }

    public void sortOnlineContacts(boolean z) {
        if (this.onlineContacts != null) {
            if (!z || SystemClock.elapsedRealtime() - this.lastSortTime >= 2000) {
                this.lastSortTime = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    Collections.sort(this.onlineContacts, new DialogsAdapter$$ExternalSyntheticLambda0(MessagesController.getInstance(this.currentAccount), currentTime, 0));
                    if (z) {
                        notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public void updateHasHints() {
        this.hasHints = this.folderId == 0 && this.dialogsType == 0 && !this.isOnlySelect && !MessagesController.getInstance(this.currentAccount).hintDialogs.isEmpty();
    }

    public final void updateItemList() {
        ArrayList<TLRPC.Dialog> dialogsArray;
        long j;
        DialogsActivity dialogsActivity;
        int i;
        boolean z;
        TLRPC.RequestPeerType requestPeerType;
        ItemInternal itemInternal;
        TLRPC.Dialog dialog;
        int i2;
        int i3;
        int i4;
        DialogsActivity dialogsActivity2;
        int i5;
        ArrayList<MessagesController.CommunityPeerDialog> arrayList;
        String string;
        int i6 = 0;
        long j2 = 0;
        if (this.communityId != 0) {
            this.itemInternals.clear();
            updateHasHints();
            MessagesController.CommunityPeersDialog communityPeersDialogBuildCommunityPeers = MessagesController.getInstance(this.currentAccount).buildCommunityPeers(this.communityId);
            this.dialogsCount = communityPeersDialogBuildCommunityPeers.getDialogsCount();
            this.isEmpty = false;
            int i7 = this.dialogsType == 3 ? 2 : 4;
            for (int i8 = 0; i8 < i7; i8++) {
                if (i8 == 0) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouAreIn;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouAreIn);
                } else if (i8 == 1) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanView;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanView);
                } else if (i8 == 2) {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsYouCanJoin;
                    string = LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin);
                } else {
                    arrayList = communityPeersDialogBuildCommunityPeers.chatsOther;
                    string = LocaleController.getString(R.string.CommunitySectionHiddenChats);
                }
                if (!arrayList.isEmpty()) {
                    this.itemInternals.add(new ItemInternal(this, string));
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        MessagesController.CommunityPeerDialog communityPeerDialog = arrayList.get(i9);
                        TLRPC.Dialog dialog2 = communityPeerDialog.dialog;
                        if (dialog2 != null) {
                            this.itemInternals.add(new ItemInternal(this, 0, dialog2));
                        } else {
                            TLRPC.Chat chat = communityPeerDialog.chat;
                            if (chat != null) {
                                this.itemInternals.add(new ItemInternal(this, chat));
                            } else {
                                TLRPC.User user = communityPeerDialog.user;
                                if (user != null) {
                                    this.itemInternals.add(new ItemInternal(this, user));
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.itemInternals.clear();
        updateHasHints();
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j3 = this.communityId;
        if (j3 != 0) {
            dialogsArray = messagesController.getDialogsByCommunity(j3);
        } else {
            dialogsArray = this.parentFragment.getDialogsArray(this.currentAccount, this.dialogsType, this.folderId, this.dialogsListFrozen);
            if (dialogsArray == null) {
                dialogsArray = new ArrayList<>();
            }
        }
        int size = dialogsArray.size();
        this.dialogsCount = size;
        this.isEmpty = false;
        if (size == 0 && this.parentFragment.isArchive()) {
            zzka.m(this, 19, this.itemInternals);
            return;
        }
        TLRPC.Dialog tL_dialog = null;
        if (this.hasHints || this.dialogsType != 0 || (i5 = this.folderId) != 0 || !messagesController.isDialogsEndReached(i5) || this.forceUpdatingContacts) {
            j = 0;
        } else if (messagesController.getAllFoldersDialogsCount() > 10 || !ContactsController.getInstance(this.currentAccount).doneLoadingContacts || ContactsController.getInstance(this.currentAccount).contacts.isEmpty()) {
            j = 0;
            this.onlineContacts = null;
        } else {
            this.onlineContacts = new ArrayList<>(ContactsController.getInstance(this.currentAccount).contacts);
            long j4 = UserConfig.getInstance(this.currentAccount).clientUserId;
            int size2 = this.onlineContacts.size();
            int i10 = 0;
            while (i10 < size2) {
                long j5 = j2;
                long j6 = this.onlineContacts.get(i10).user_id;
                if (j6 == j4 || messagesController.dialogs_dict.get(j6) != null) {
                    this.onlineContacts.remove(i10);
                    i10--;
                    size2--;
                }
                i10++;
                j2 = j5;
            }
            j = j2;
            if (this.onlineContacts.isEmpty()) {
                this.onlineContacts = null;
            } else {
                sortOnlineContacts(false);
            }
        }
        MessagesController.DialogFilter currentFilter = getCurrentFilter();
        if ((currentFilter == null || currentFilter.isDefault()) && (dialogsActivity = this.parentFragment) != null && dialogsActivity.isReplyTo && dialogsActivity.replyMessageAuthor != j) {
            zzka.m(this, 20, this.itemInternals);
            for (int i11 = 0; i11 < dialogsArray.size(); i11++) {
                if (dialogsArray.get(i11).id == this.parentFragment.replyMessageAuthor) {
                    tL_dialog = dialogsArray.get(i11);
                    break;
                }
            }
            if (tL_dialog == null) {
                tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = this.parentFragment.replyMessageAuthor;
            }
            this.itemInternals.add(new ItemInternal(this, 0, tL_dialog));
            zzka.m(this, 20, this.itemInternals);
        } else if ((currentFilter == null || currentFilter.isDefault()) && (dialogsActivity2 = this.parentFragment) != null && this.dialogsType == 3 && dialogsActivity2.forwardOriginalChannel != j) {
            zzka.m(this, 20, this.itemInternals);
            for (int i12 = 0; i12 < dialogsArray.size(); i12++) {
                if (dialogsArray.get(i12).id == this.parentFragment.forwardOriginalChannel) {
                    tL_dialog = dialogsArray.get(i12);
                    break;
                }
            }
            if (tL_dialog == null) {
                tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = this.parentFragment.forwardOriginalChannel;
            }
            this.itemInternals.add(new ItemInternal(this, 0, tL_dialog));
            zzka.m(this, 20, this.itemInternals);
        }
        this.hasChatlistHint = false;
        int i13 = this.dialogsType;
        if ((i13 == 7 || i13 == 8) && currentFilter != null && currentFilter.isChatlist()) {
            messagesController.checkChatlistFolderUpdate(currentFilter.id, false);
            TL_chatlists.TL_chatlists_chatlistUpdates chatlistFolderUpdates = messagesController.getChatlistFolderUpdates(currentFilter.id);
            if (chatlistFolderUpdates != null && chatlistFolderUpdates.missing_peers.size() > 0) {
                this.hasChatlistHint = true;
                this.itemInternals.add(new ItemInternal(this, chatlistFolderUpdates));
            }
        }
        if (this.requestPeerType != null) {
            zzka.m(this, 15, this.itemInternals);
        }
        if (this.collapsedView || this.isTransitionSupport) {
            for (int i14 = 0; i14 < dialogsArray.size(); i14++) {
                if (this.dialogsType == 2 && (dialogsArray.get(i14) instanceof DialogsActivity.DialogsHeader)) {
                    this.itemInternals.add(new ItemInternal(this, 14, dialogsArray.get(i14)));
                } else {
                    this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i14)));
                }
            }
            zzka.m(this, 10, this.itemInternals);
            return;
        }
        if (this.dialogsCount != 0 || !this.forceUpdatingContacts) {
            ArrayList<TLRPC.TL_contact> arrayList2 = this.onlineContacts;
            if (arrayList2 != null && !arrayList2.isEmpty() && (i = this.dialogsType) != 7 && i != 8) {
                if (this.dialogsCount == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        zzka.m(this, 16, this.itemInternals);
                    } else {
                        this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                    }
                    zzka.m(this, 8, this.itemInternals);
                    zzka.m(this, 7, this.itemInternals);
                } else {
                    for (int i15 = 0; i15 < dialogsArray.size(); i15++) {
                        this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i15)));
                    }
                    zzka.m(this, 8, this.itemInternals);
                    zzka.m(this, 7, this.itemInternals);
                }
                for (int i16 = 0; i16 < this.onlineContacts.size(); i16++) {
                    this.itemInternals.add(new ItemInternal(this, this.onlineContacts.get(i16)));
                }
                zzka.m(this, 10, this.itemInternals);
                z = true;
            } else if (this.hasHints) {
                int size3 = MessagesController.getInstance(this.currentAccount).hintDialogs.size();
                zzka.m(this, 2, this.itemInternals);
                for (int i17 = 0; i17 < size3; i17++) {
                    this.itemInternals.add(new ItemInternal(this, MessagesController.getInstance(this.currentAccount).hintDialogs.get(i17)));
                }
                zzka.m(this, 3, this.itemInternals);
            } else {
                int i18 = this.dialogsType;
                if (i18 == 11 || i18 == 13) {
                    zzka.m(this, 7, this.itemInternals);
                    zzka.m(this, 12, this.itemInternals);
                } else if (i18 == 12) {
                    zzka.m(this, 7, this.itemInternals);
                }
            }
            requestPeerType = this.requestPeerType;
            if (((requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) || (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat)) && this.dialogsCount > 0) {
                zzka.m(this, 12, this.itemInternals);
            }
            if (this.allowForwardAsStories && this.dialogsType == 3) {
                zzka.m(this, 21, this.itemInternals);
            }
            if (!z) {
                for (i2 = 0; i2 < dialogsArray.size(); i2++) {
                    if (this.dialogsType == 2 || !(dialogsArray.get(i2) instanceof DialogsActivity.DialogsHeader)) {
                        this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
                    } else {
                        this.itemInternals.add(new ItemInternal(this, 14, dialogsArray.get(i2)));
                    }
                }
                if (this.communityId == j || this.forceShowEmptyCell || (i4 = this.dialogsType) == 7 || i4 == 8 || MessagesController.getInstance(this.currentAccount).isDialogsEndReached(this.folderId)) {
                    i3 = this.dialogsCount;
                    if (i3 == 0) {
                        this.isEmpty = true;
                        if (this.requestPeerType != null) {
                            zzka.m(this, 16, this.itemInternals);
                        } else {
                            this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                        }
                    } else {
                        if (this.folderId == 0 && i3 > 10 && this.dialogsType == 0) {
                            zzka.m(this, 11, this.itemInternals);
                        }
                        zzka.m(this, 10, this.itemInternals);
                    }
                } else {
                    if (this.dialogsCount != 0) {
                        zzka.m(this, 1, this.itemInternals);
                    }
                    zzka.m(this, 10, this.itemInternals);
                }
            }
            if (messagesController.hiddenUndoChats.isEmpty()) {
            }
            while (i6 < this.itemInternals.size()) {
                itemInternal = this.itemInternals.get(i6);
                if (itemInternal.viewType != 0 && (dialog = itemInternal.dialog) != null && messagesController.isHiddenByUndo(dialog.id)) {
                    this.itemInternals.remove(i6);
                    i6--;
                }
                i6++;
            }
        }
        this.isEmpty = true;
        if (this.requestPeerType != null) {
            zzka.m(this, 16, this.itemInternals);
        } else {
            this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
        }
        zzka.m(this, 8, this.itemInternals);
        zzka.m(this, 7, this.itemInternals);
        zzka.m(this, 13, this.itemInternals);
        z = false;
        requestPeerType = this.requestPeerType;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            zzka.m(this, 12, this.itemInternals);
        } else {
            zzka.m(this, 12, this.itemInternals);
        }
        if (this.allowForwardAsStories) {
            zzka.m(this, 21, this.itemInternals);
        }
        if (!z) {
            while (i2 < dialogsArray.size()) {
                if (this.dialogsType == 2) {
                    this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
                } else {
                    this.itemInternals.add(new ItemInternal(this, 0, dialogsArray.get(i2)));
                }
            }
            if (this.communityId == j) {
                i3 = this.dialogsCount;
                if (i3 == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        zzka.m(this, 16, this.itemInternals);
                    } else {
                        this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                    }
                } else {
                    if (this.folderId == 0) {
                        zzka.m(this, 11, this.itemInternals);
                    }
                    zzka.m(this, 10, this.itemInternals);
                }
            } else {
                i3 = this.dialogsCount;
                if (i3 == 0) {
                    this.isEmpty = true;
                    if (this.requestPeerType != null) {
                        zzka.m(this, 16, this.itemInternals);
                    } else {
                        this.itemInternals.add(new ItemInternal(this, dialogsEmptyType(), 0));
                    }
                } else {
                    if (this.folderId == 0) {
                        zzka.m(this, 11, this.itemInternals);
                    }
                    zzka.m(this, 10, this.itemInternals);
                }
            }
        }
        if (messagesController.hiddenUndoChats.isEmpty()) {
            while (i6 < this.itemInternals.size()) {
                itemInternal = this.itemInternals.get(i6);
                if (itemInternal.viewType != 0) {
                }
                i6++;
            }
        }
    }

    public void updateList(Runnable runnable) {
        if (this.isCalculatingDiff) {
            this.updateListPending = true;
            return;
        }
        this.isCalculatingDiff = true;
        ArrayList<ItemInternal> arrayList = new ArrayList<>();
        this.oldItems = arrayList;
        arrayList.addAll(this.itemInternals);
        updateItemList();
        final ArrayList<ItemInternal> arrayList2 = new ArrayList<>(this.itemInternals);
        ArrayList<ItemInternal> arrayList3 = this.oldItems;
        this.itemInternals = arrayList3;
        DiffUtil.Callback callback = new DiffUtil.Callback() {
            @Override
            public final boolean areContentsTheSame(int i, int i2) {
                return DialogsAdapter.this.oldItems.get(i).viewType == ((ItemInternal) arrayList2.get(i2)).viewType;
            }

            @Override
            public final boolean areItemsTheSame(int i, int i2) {
                TLRPC.TL_contact tL_contact;
                String str;
                ItemInternal itemInternal = DialogsAdapter.this.oldItems.get(i);
                ItemInternal itemInternal2 = (ItemInternal) arrayList2.get(i2);
                int i3 = itemInternal.viewType;
                if (i3 != itemInternal2.viewType) {
                    return false;
                }
                TLRPC.Dialog dialog = itemInternal.dialog;
                TLRPC.Dialog dialog2 = itemInternal2.dialog;
                if (i3 == 0) {
                    return dialog != null && dialog2 != null && dialog.id == dialog2.id && itemInternal.isFolder == itemInternal2.isFolder && itemInternal.isForumCell == itemInternal2.isForumCell && itemInternal.pinned == itemInternal2.pinned;
                }
                if (i3 == 14) {
                    return dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder;
                }
                if (i3 == 4) {
                    TLRPC.RecentMeUrl recentMeUrl = itemInternal.recentMeUrl;
                    return (recentMeUrl == null || itemInternal2.recentMeUrl == null || (str = recentMeUrl.url) == null || !str.equals(str)) ? false : true;
                }
                if (i3 == 6) {
                    TLRPC.TL_contact tL_contact2 = itemInternal.contact;
                    return (tL_contact2 == null || (tL_contact = itemInternal2.contact) == null || tL_contact2.user_id != tL_contact.user_id) ? false : true;
                }
                if (i3 == 5) {
                    return itemInternal.emptyType == itemInternal2.emptyType;
                }
                return i3 != 10;
            }

            @Override
            public final int getNewListSize() {
                return arrayList2.size();
            }

            @Override
            public final int getOldListSize() {
                return DialogsAdapter.this.oldItems.size();
            }
        };
        if (arrayList3.size() >= 50 && ALLOW_UPDATE_IN_BACKGROUND) {
            Utilities.searchQueue.postRunnable(new Theme$$ExternalSyntheticLambda17(11, this, callback, runnable, arrayList2));
            return;
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(callback, true);
        this.isCalculatingDiff = false;
        if (runnable != null) {
            runnable.run();
        }
        this.itemInternals = arrayList2;
        diffResultCalculateDiff.dispatchUpdatesTo(new OpReorderer(this));
    }

    public final class ItemInternal extends AdapterWithDiffUtils.Item {
        public final TLRPC.Chat chat;
        public final TL_chatlists.TL_chatlists_chatlistUpdates chatlistUpdates;
        public final TLRPC.TL_contact contact;
        public final TLRPC.Dialog dialog;
        public final int emptyType;
        public final boolean isFolder;
        public final boolean isForumCell;
        public final boolean pinned;
        public final TLRPC.RecentMeUrl recentMeUrl;
        public final int stableId;
        public final String title;
        public final TLRPC.User user;

        public ItemInternal(DialogsAdapter dialogsAdapter, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
            super(17, true);
            this.chatlistUpdates = tL_chatlists_chatlistUpdates;
            int i = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i + 1;
            this.stableId = i;
        }

        public final int hashCode() {
            return Objects.hash(this.dialog, this.chat, this.recentMeUrl, this.contact, this.title);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, String str) {
            super(22, false);
            Integer num = dialogsAdapter.dialogsHeaderStableIds.get(str);
            if (num != null) {
                this.stableId = num.intValue();
            } else {
                int i = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i + 1;
                this.stableId = i;
                dialogsAdapter.dialogsHeaderStableIds.put(str, Integer.valueOf(i));
            }
            this.title = str;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.User user) {
            super(23, false);
            this.user = user;
            int i = dialogsAdapter.dialogsStableIds.get(user.id, -1);
            if (i >= 0) {
                this.stableId = i;
                return;
            }
            int i2 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i2 + 1;
            this.stableId = i2;
            dialogsAdapter.dialogsStableIds.put(user.id, i2);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.Chat chat) {
            super(23, false);
            this.chat = chat;
            int i = dialogsAdapter.dialogsStableIds.get(-chat.id, -1);
            if (i >= 0) {
                this.stableId = i;
                return;
            }
            int i2 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i2 + 1;
            this.stableId = i2;
            dialogsAdapter.dialogsStableIds.put(-chat.id, i2);
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, TLRPC.Dialog dialog) {
            super(i, true);
            this.dialog = dialog;
            if (dialog != null) {
                int i2 = dialogsAdapter.dialogsStableIds.get(dialog.id, -1);
                if (i2 >= 0) {
                    this.stableId = i2;
                } else {
                    int i3 = dialogsAdapter.stableIdPointer;
                    dialogsAdapter.stableIdPointer = i3 + 1;
                    this.stableId = i3;
                    dialogsAdapter.dialogsStableIds.put(dialog.id, i3);
                }
            } else if (i == 19) {
                this.stableId = 5;
            } else {
                int i4 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i4 + 1;
                this.stableId = i4;
            }
            if (dialog != null) {
                if (dialogsAdapter.dialogsType == 7 || dialogsAdapter.dialogsType == 8) {
                    MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(dialogsAdapter.currentAccount).selectedDialogFilter[dialogsAdapter.dialogsType == 8 ? (char) 1 : (char) 0];
                    this.pinned = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
                } else {
                    this.pinned = dialog.pinned;
                }
                this.isFolder = dialog.isFolder;
                this.isForumCell = MessagesController.getInstance(dialogsAdapter.currentAccount).isForum(dialog.id);
            }
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.RecentMeUrl recentMeUrl) {
            super(4, true);
            this.recentMeUrl = recentMeUrl;
            int i = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i + 1;
            this.stableId = i;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i) {
            super(i, true);
            this.emptyType = i;
            if (i == 10) {
                this.stableId = 1;
            } else {
                if (this.viewType == 19) {
                    this.stableId = 5;
                    return;
                }
                int i2 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i2 + 1;
                this.stableId = i2;
            }
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, int i, int i2) {
            super(5, true);
            this.emptyType = i;
            int i3 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i3 + 1;
            this.stableId = i3;
        }

        public ItemInternal(DialogsAdapter dialogsAdapter, TLRPC.TL_contact tL_contact) {
            super(6, true);
            this.contact = tL_contact;
            if (tL_contact != null) {
                int i = dialogsAdapter.dialogsStableIds.get(tL_contact.user_id, -1);
                if (i > 0) {
                    this.stableId = i;
                    return;
                }
                int i2 = dialogsAdapter.stableIdPointer;
                dialogsAdapter.stableIdPointer = i2 + 1;
                this.stableId = i2;
                dialogsAdapter.dialogsStableIds.put(tL_contact.user_id, i2);
                return;
            }
            int i3 = dialogsAdapter.stableIdPointer;
            dialogsAdapter.stableIdPointer = i3 + 1;
            this.stableId = i3;
        }
    }
}
