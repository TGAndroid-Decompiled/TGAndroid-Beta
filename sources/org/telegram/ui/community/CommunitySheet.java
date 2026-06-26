package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;

public class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private ButtonWithCounterView addChatToCommunityButton;
    private final Paint backgroundPaint;
    private TLRPC.ChatFull chatInfo;
    private final ChatsToAddListPage chatsPage;
    private ArrayList chatsToAddToCommunity;
    private boolean collapsedInDialogs;
    private final long communityId;
    private final CommunityPage communityPage;
    private TLRPC.Chat currentChat;
    private final View fakeAnchorView;
    private final BaseFragment parentFragment;
    private CommunityUtils.PendingRequests pendingRequestsList;
    private final PendingRequestsPage requestsPage;
    private ViewPagerFixed viewPager;

    @Override
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    public static void access$1800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickCommunity(uItem, view, i, f, f2);
    }

    public static void access$1900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsCommunity(arrayList, universalAdapter);
    }

    public static void access$2700(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickChatToAdd(uItem, view, i, f, f2);
    }

    public static void access$2800(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsChatsToAdd(arrayList, universalAdapter);
    }

    public static void access$3800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickRequest(uItem, view, i, f, f2);
    }

    public static void access$3900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsRequests(arrayList, universalAdapter);
    }

    public CommunitySheet(final BaseFragment baseFragment, long j) {
        super(baseFragment.getContext(), true, true, baseFragment.getResourceProvider());
        this.backgroundPaint = new Paint(1);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        Context context = baseFragment.getContext();
        init(context);
        this.fakeAnchorView = new View(getContext());
        Context context2 = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        CommunityUtils.PendingRequests pendingRequests = new CommunityUtils.PendingRequests(context2, resourcesProvider, BulletinFactory.of((FrameLayout) this.containerView, resourcesProvider), this.currentAccount, j);
        this.pendingRequestsList = pendingRequests;
        pendingRequests.setDelegate(new CommunityUtils.PendingRequests.Delegate() {
            @Override
            public void updateAdapter() {
                CommunitySheet.this.requestsPage.listView.adapter.update(true);
                CommunitySheet.this.communityPage.listView.adapter.update(true);
            }

            @Override
            public void close() {
                CommunitySheet.this.viewPager.scrollToPosition(0);
            }

            @Override
            public void onClickGroupOwner(long j2) {
                baseFragment.presentFragment(ChatActivity.of(j2));
                CommunitySheet.this.lambda$new$0();
            }
        });
        this.communityId = j;
        this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        this.chatInfo = MessagesController.getInstance(this.currentAccount).getChatFull(j);
        TLRPC.Chat chat = this.currentChat;
        this.collapsedInDialogs = chat != null && chat.collapsed_in_dialogs;
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        this.requestsPage = new PendingRequestsPage(context);
        this.communityPage = new CommunityPage(context);
        this.chatsPage = new ChatsToAddListPage(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return 3;
            }

            @Override
            public int getItemViewType(int i) {
                if (i == 2) {
                    return 2;
                }
                return i == 0 ? 0 : 1;
            }

            @Override
            public View createView(int i) {
                if (i == 2) {
                    return CommunitySheet.this.chatsPage;
                }
                return i == 0 ? CommunitySheet.this.communityPage : CommunitySheet.this.requestsPage;
            }

            @Override
            public void bindView(View view, int i, int i2) {
                ((Page) view).bind(i2);
            }
        });
        this.pendingRequestsList.loadNext();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j, 0, true);
        Bulletin.addDelegate((FrameLayout) this.containerView, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                return AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f);
            }
        });
    }

    public void fillItemsCommunity(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String pluralString;
        ArrayList<TL_communities.CommunityPeer> arrayList2;
        arrayList.add(UItem.asSpace(99, Math.min(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(176.0f), (int) (AndroidUtilities.displaySize.y * 0.25f))));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        if (this.pendingRequestsList.isSingle()) {
            arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            this.pendingRequestsList.fillItems(arrayList);
            arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
        } else if (this.pendingRequestsList.getTotalCount() > 0) {
            int totalCount = this.pendingRequestsList.getTotalCount();
            int unreadCount = this.pendingRequestsList.getUnreadCount();
            IconBackgroundColors iconBackgroundColors = IconBackgroundColors.BLUE_ALT;
            int i = R.drawable.filled_requests_24;
            if (totalCount == unreadCount) {
                pluralString = LocaleController.getString(R.string.CommunityPendingRequests);
            } else {
                pluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", totalCount, new Object[0]);
            }
            arrayList.add(CommunityRequestsCell.Factory.of(100, iconBackgroundColors, i, pluralString, unreadCount > 0 ? Integer.toString(unreadCount) : null, true));
            arrayList.add(UItem.asSpace(5, AndroidUtilities.dp(14.33f)));
        }
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (chatFull == null || (arrayList2 = chatFull.linked_peers) == null) {
            return;
        }
        CommunityUtils.fillLinkedPeers(this.currentAccount, arrayList, arrayList2, true);
    }

    public void fillItemsRequests(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(48.0f)));
        if (ChatObject.canBlockUsers(this.currentChat)) {
            arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fillItemsRequests$0();
                }
            }), true)));
        } else {
            arrayList.add(UItem.asShadow(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
        }
        arrayList.add(UItem.asCustom(2, this.fakeAnchorView));
        arrayList.add(UItem.asHeader(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", this.pendingRequestsList.getTotalCount(), new Object[0])));
        this.pendingRequestsList.fillItems(arrayList);
    }

    public void lambda$fillItemsRequests$0() {
        Bundle bundle = new Bundle();
        bundle.putLong("community_id", this.communityId);
        this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
        lambda$new$0();
    }

    public void fillItemsChatsToAdd(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        ArrayList arrayList2 = this.chatsToAddToCommunity;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(UItem.asProfileCell((TLRPC.Chat) it.next()));
            }
        }
    }

    public void onClickChatToAdd(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            final TLRPC.Chat chat = (TLRPC.Chat) obj;
            new CommunityAddOptionsSheet(getContext(), this.currentChat, chat, new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    this.f$0.lambda$onClickChatToAdd$1(chat, (Boolean) obj2);
                }
            }).show();
        }
    }

    public void lambda$onClickChatToAdd$1(TLRPC.Chat chat, Boolean bool) {
        linkToCommunity(chat, this.communityId, bool.booleanValue());
    }

    public void onClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        if (checkPendingRequestClick(uItem)) {
            return;
        }
        int i2 = uItem.id;
        if (i2 == 101) {
            this.collapsedInDialogs = !this.collapsedInDialogs;
            MessagesController.getInstance(this.currentAccount).toggleCommunityCollapsedInDialogs(this.communityId, this.collapsedInDialogs);
            if (view instanceof TextCheckCell2) {
                ((TextCheckCell2) view).getCheckBox().setChecked(this.collapsedInDialogs, true);
                return;
            } else {
                this.communityPage.listView.adapter.update(false);
                return;
            }
        }
        if (i2 == 100) {
            this.viewPager.scrollToPosition(1);
            this.pendingRequestsList.markAsViewed();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (ChatObject.isInChat(chat) || ChatObject.isPublic(chat)) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.id);
                this.parentFragment.presentFragment(new ChatActivity(bundle));
                lambda$new$0();
                return;
            }
            new JoinGroupAlert(getContext(), chat, null, this.parentFragment, this.resourcesProvider).show();
        }
    }

    public boolean onLongClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        boolean z = false;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            final long j = -chat.id;
            boolean zCanRemoveChatFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentChat);
            if (!zCanRemoveChatFromCommunity) {
                return false;
            }
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, view);
            z = true;
            if (zCanRemoveChatFromCommunity) {
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onLongClickCommunity$4(j);
                    }
                });
            }
            itemOptionsMakeOptions.setScrimViewBackground(this.communityPage.listView.getClipBackground(view, true));
            itemOptionsMakeOptions.show();
        }
        return z;
    }

    public void lambda$onLongClickCommunity$4(final long j) {
        AlertsCreator.showSimpleConfirmAlert(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(R.string.CommunityMenuRemoveFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLongClickCommunity$3(j);
            }
        });
    }

    public void lambda$onLongClickCommunity$3(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onLongClickCommunity$2((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$onLongClickCommunity$2(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
        }
    }

    public void onClickRequest(UItem uItem, View view, int i, float f, float f2) {
        checkPendingRequestClick(uItem);
    }

    private boolean checkPendingRequestClick(UItem uItem) {
        Object obj = uItem.object;
        if (!(obj instanceof CommunityPendingRequestCell.Data)) {
            return false;
        }
        final CommunityPendingRequestCell.Data data = (CommunityPendingRequestCell.Data) obj;
        TLRPC.Chat chat = data.chatToAdd;
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            this.parentFragment.presentFragment(ChatActivity.of(-chat.id));
            return true;
        }
        new CommunityInviteOnlySheet(getContext(), chat, data.requestFromUser, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkPendingRequestClick$5(data);
            }
        }).show();
        return true;
    }

    public void lambda$checkPendingRequestClick$5(CommunityPendingRequestCell.Data data) {
        this.parentFragment.presentFragment(ChatActivity.of(data.requestFromUser.id));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.chatInfo = chatFull;
                this.communityPage.listView.adapter.update(true);
            }
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentPosition() > 0) {
            this.viewPager.scrollToPosition(r0.getCurrentPosition() - 1);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    protected boolean canDismissWithSwipe() {
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    private void init(Context context) {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        Paint paint = this.backgroundPaint;
        int i = Theme.key_windowBackgroundGray;
        paint.setColor(Theme.getColor(i, this.resourcesProvider));
        fixNavigationBar(Theme.getColor(i, this.resourcesProvider));
        this.containerView = new ContainerView(context);
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            protected boolean canScrollForward(MotionEvent motionEvent) {
                return false;
            }

            @Override
            protected void onScrollEnd() {
                super.onScrollEnd();
                if (getCurrentPosition() == 1) {
                    CommunitySheet.this.communityPage.listView.adapter.update(false);
                }
            }

            @Override
            public void onTabAnimationUpdate(boolean z) {
                ((BottomSheet) CommunitySheet.this).containerView.invalidate();
            }

            @Override
            protected boolean canScrollBackward(MotionEvent motionEvent) {
                return getCurrentPosition() != 2;
            }
        };
        this.viewPager = viewPagerFixed;
        int i2 = this.backgroundPaddingLeft;
        viewPagerFixed.setPadding(i2, 0, i2, 0);
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
    }

    @Override
    public void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.dismissInternal();
    }

    class CommunityPage extends Page {
        private BackupImageView avatarImage;

        public CommunityPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$1900(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$1800(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, new Utilities.Callback5Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return CommunitySheet.CommunityPage.lambda$new$2(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(DialogObject.getName(CommunitySheet.this.currentChat));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("community_id", CommunitySheet.this.communityId);
                        CommunitySheet.this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                        CommunitySheet.this.lambda$new$0();
                    }
                }
            });
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.avatarImage.setForUserOrChat(CommunitySheet.this.currentChat, new AvatarDrawable(CommunitySheet.this.currentChat));
            this.actionBar.addView(this.avatarImage, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            if (ChatObject.hasAdminRights(CommunitySheet.this.currentChat)) {
                actionBarMenuCreateMenu.addItem(2, R.drawable.msg_download_settings);
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            if (ChatObject.canUserDoAdminAction(CommunitySheet.this.currentChat, 27)) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.filled_add_album);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                buttonWithCounterView.setText(spannableStringBuilder);
            } else {
                buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            }
            CommunitySheet.this.addChatToCommunityButton = buttonWithCounterView;
            CommunitySheet.this.addChatToCommunityButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(view);
                }
            });
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        public static Boolean lambda$new$2(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
            return Boolean.valueOf(communitySheet.onLongClickCommunity(uItem, view, i, f, f2));
        }

        public void lambda$new$3(View view) {
            CommunitySheet.this.onAddChatToCommunityButtonClick();
        }
    }

    public void onAddChatToCommunityButtonClick() {
        if (!ChatObject.canUserDoAdminAction(this.currentChat, 27)) {
            lambda$new$0();
        } else {
            loadChatsToAddToCommunity();
        }
    }

    private void loadChatsToAddToCommunity() {
        if (this.addChatToCommunityButton.isLoading()) {
            return;
        }
        this.addChatToCommunityButton.setLoading(true);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_channels_getAdminedPublicChannels, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$loadChatsToAddToCommunity$6((TLRPC.messages_Chats) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$loadChatsToAddToCommunity$6(TLRPC.messages_Chats messages_chats, TLRPC.TL_error tL_error) {
        this.addChatToCommunityButton.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
            return;
        }
        if (messages_chats != null) {
            MessagesController.getInstance(this.currentAccount).putChats(messages_chats.chats, true);
            this.chatsToAddToCommunity = new ArrayList();
            Iterator<TLRPC.Chat> it = messages_chats.chats.iterator();
            while (it.hasNext()) {
                TLRPC.Chat next = it.next();
                if (!ChatObject.isChannelAndNotMegaGroup(next) && !ChatObject.isMonoForum(next)) {
                    this.chatsToAddToCommunity.add(next);
                }
            }
            this.chatsPage.listView.adapter.update(false);
            this.viewPager.scrollToPosition(2);
        }
    }

    class ChatsToAddListPage extends Page {
        public ChatsToAddListPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$2800(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$2700(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition(0);
                    }
                }
            });
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        public void lambda$new$2(View view) {
            CommunitySheet.this.viewPager.scrollToPosition(0);
        }
    }

    class PendingRequestsPage extends Page {
        public PendingRequestsPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$3900(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$3800(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    CommunitySheet.this.pendingRequestsList.checkLoadNext(PendingRequestsPage.this.listView);
                }
            });
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        CommunitySheet.this.communityPage.listView.adapter.update(false);
                        CommunitySheet.this.viewPager.scrollToPosition(0);
                    }
                }
            });
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setNeutral();
            buttonWithCounterView.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
            buttonWithCounterView.setRound();
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
            buttonWithCounterView2.setRound();
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(view);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            this.contentView.addView(linearLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
            afterInit();
        }

        public void lambda$new$2(View view) {
            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(false);
        }

        public void lambda$new$3(View view) {
            CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(true);
        }
    }

    private abstract class Page extends FrameLayout {
        protected ActionBar actionBar;
        protected final FrameLayout contentView;
        protected ChatActivityFadeView fadeView;
        protected UniversalRecyclerView listView;
        public int pageType;
        private boolean scrolling;
        public boolean wasAtBottom;
        public boolean wasAtTop;

        public Page(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.contentView = frameLayout;
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setClipToPadding(true);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(getContext());
            this.fadeView = chatActivityFadeView;
            chatActivityFadeView.setupColorKey(Theme.key_windowBackgroundGray);
            this.fadeView.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + AndroidUtilities.navigationBarHeight);
            this.fadeView.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
            this.fadeView.setFadeZoneTop(AndroidUtilities.dp(64.0f) + AndroidUtilities.statusBarHeight);
            this.fadeView.setFadeHeightTop(AndroidUtilities.dp(20.0f), false);
            frameLayout.addView(this.fadeView, LayoutHelper.createFrameMatchParent());
        }

        protected void afterInit() {
            this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (i == 0) {
                        Page page = Page.this;
                        page.wasAtTop = page.atTop();
                        Page page2 = Page.this;
                        page2.wasAtBottom = page2.atBottom();
                    }
                    Page.this.scrolling = i != 0;
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                @Override
                public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
                    return true;
                }

                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                    Page.this.listView.invalidate();
                }

                @Override
                protected void onChangeAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override
                protected void onAddAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }

                @Override
                protected void onRemoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    ((BottomSheet) CommunitySheet.this).containerView.invalidate();
                    Page.this.contentView.invalidate();
                }
            };
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.listView.setItemAnimator(defaultItemAnimator);
        }

        public float top() {
            float fMin = AndroidUtilities.displaySize.y;
            for (int i = 0; i < this.listView.getChildCount(); i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(childAt);
                if (childViewHolder != null) {
                    UItem item = this.listView.adapter.getItem(childViewHolder.getAdapterPosition());
                    if (item != null && item.id != 99) {
                        fMin = Math.min(this.contentView.getPaddingTop() + childAt.getY(), fMin);
                    }
                }
            }
            return fMin;
        }

        public void bind(int i) {
            this.pageType = i;
        }

        public void updateTops() {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, top()));
            }
        }

        public boolean atTop() {
            return !this.listView.canScrollVertically(-1);
        }

        public boolean atBottom() {
            return !this.listView.canScrollVertically(1);
        }
    }

    private class ContainerView extends FrameLayout {
        private final AnimatedFloat isActionBar;
        private final Path path;
        private float top;

        public ContainerView(Context context) {
            super(context);
            this.isActionBar = new AnimatedFloat(this, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.path = new Path();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            View[] viewPages = CommunitySheet.this.viewPager.getViewPages();
            this.top = 0.0f;
            for (View view : viewPages) {
                if (view != null) {
                    Page page = (Page) view;
                    this.top += page.top() * Utilities.clamp(1.0f - Math.abs(page.getTranslationX() / page.getMeasuredWidth()), 1.0f, 0.0f);
                    if (page.getVisibility() == 0) {
                        page.updateTops();
                    }
                }
            }
            float f = this.isActionBar.set(this.top <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f);
            this.top = Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((BottomSheet) CommunitySheet.this).backgroundPaddingLeft, this.top, getWidth() - ((BottomSheet) CommunitySheet.this).backgroundPaddingLeft, getHeight() + AndroidUtilities.dp(8.0f));
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, f);
            canvas.drawRoundRect(rectF, fLerp, fLerp, CommunitySheet.this.backgroundPaint);
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(this.path);
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.top) {
                CommunitySheet.this.lambda$new$0();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    private void linkToCommunity(TLRPC.Chat chat, final long j, final boolean z) {
        long j2 = -chat.id;
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j3) {
                    this.f$0.lambda$linkToCommunity$7(alertDialog, j, z, j3);
                }
            });
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$linkToCommunity$8((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$linkToCommunity$7(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunity(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    public void lambda$linkToCommunity$8(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onLinkSuccess(2);
                return;
            } else {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
                return;
            }
        }
        onLinkSuccess(1);
    }

    private void onLinkSuccess(int i) {
        CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), i);
        this.viewPager.scrollToPosition(0);
    }
}
