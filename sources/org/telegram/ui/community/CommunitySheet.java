package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.DialogCell;
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
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.IconBackgroundColors;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;

public class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private ButtonWithCounterView addChatToCommunityButton;
    private final BoolAnimator animatorSearchFieldVisible;
    private final BoolAnimator animatorSearchResultVisible;
    private final Paint backgroundPaint;
    private TLRPC.ChatFull chatInfo;
    private final ChatsToAddListPage chatsPage;
    private ArrayList chatsToAddToCommunity;
    private boolean collapsedInDialogs;
    private final long communityId;
    private final CommunityPage communityPage;
    private final FadeView communityPageFadeView;
    private TLRPC.Chat currentChat;
    private final View fakeAnchorView;
    private final FilteredSearchView filteredSearchView;
    private final GradientProtectionDrawable gradientProtectionDrawableBottom;
    private final GradientProtectionDrawable gradientProtectionDrawableTop;
    private String lastSearchString;
    private final BaseFragment parentFragment;
    private CommunityUtils.PendingRequests pendingRequestsList;
    private final PendingRequestsPage requestsPage;
    private final FragmentSearchField searchView;
    private Insets systemAndImeInsets;
    private Insets systemInsets;
    private ViewPagerFixed viewPager;

    @Override
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public static void access$2800(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickCommunity(uItem, view, i, f, f2);
    }

    public static void access$2900(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsCommunity(arrayList, universalAdapter);
    }

    public static void access$3700(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickChatToAdd(uItem, view, i, f, f2);
    }

    public static void access$3800(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsChatsToAdd(arrayList, universalAdapter);
    }

    public static void access$5000(CommunitySheet communitySheet, UItem uItem, View view, int i, float f, float f2) {
        communitySheet.onClickRequest(uItem, view, i, f, f2);
    }

    public static void access$5100(CommunitySheet communitySheet, ArrayList arrayList, UniversalAdapter universalAdapter) {
        communitySheet.fillItemsRequests(arrayList, universalAdapter);
    }

    public CommunitySheet(final BaseFragment baseFragment, long j) {
        super(baseFragment.getContext(), true, true, baseFragment.getResourceProvider());
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchFieldVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 350L);
        this.animatorSearchResultVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.gradientProtectionDrawableTop = new GradientProtectionDrawable(2);
        this.gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);
        this.backgroundPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndImeInsets = insets;
        this.systemInsets = insets;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        Context context = baseFragment.getContext();
        init(context);
        this.communityPageFadeView = new FadeView(context);
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        fragmentSearchField.setCloseButtonVisible(true);
        fragmentSearchField.setWhiteBackground();
        fragmentSearchField.editText.setHint(LocaleController.getString(R.string.Search));
        fragmentSearchField.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i, i2, i3);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CommunitySheet.this.onTextChanged(editable.toString());
            }
        });
        fragmentSearchField.setVisibility(8);
        FilteredSearchView filteredSearchView = new FilteredSearchView(baseFragment);
        this.filteredSearchView = filteredSearchView;
        filteredSearchView.setVisibility(8);
        filteredSearchView.setBackground(null);
        filteredSearchView.setChatPreviewDelegate(new SearchViewPager.ChatPreviewDelegate() {
            @Override
            public void finish() {
            }

            @Override
            public void move(float f) {
            }

            @Override
            public void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell) {
            }
        });
        filteredSearchView.setUiCallback(new FilteredSearchView.UiCallback() {
            @Override
            public boolean actionModeShowing() {
                return false;
            }

            @Override
            public boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
                return false;
            }

            @Override
            public void showActionMode() {
            }

            @Override
            public void toggleItemSelection(MessageObject messageObject, View view, int i) {
            }

            @Override
            public void goToMessage(MessageObject messageObject) {
                CommunitySheet.this.parentFragment.presentFragment(SearchViewPager.createFragmentFromMessage(((BottomSheet) CommunitySheet.this).currentAccount, messageObject));
                CommunitySheet.this.lambda$new$0();
            }
        });
        filteredSearchView.recyclerListView.setClipToPadding(false);
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
        FiltersView.MediaFilterData mediaFilterData = new FiltersView.MediaFilterData(R.drawable.search_users_filled, DialogObject.getShortName(chat), (TLRPC.MessagesFilter) null, 4);
        mediaFilterData.setUser(this.currentChat);
        mediaFilterData.removable = false;
        fragmentSearchField.addSearchFilter(mediaFilterData);
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
        fragmentSearchField.setCloseButtonOnClickListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
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
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
    }

    public void lambda$new$0() {
        this.communityPage.listView.layoutManager.scrollToPositionWithOffset(1, this.systemInsets.top);
        this.animatorSearchFieldVisible.setValue(false, true);
        this.animatorSearchResultVisible.setValue(false, true);
        setAllowNestedScroll(true);
        AndroidUtilities.hideKeyboard(this.searchView.editText);
        this.searchView.editText.clearFocus();
    }

    public void fillItemsCommunity(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String pluralString;
        arrayList.add(UItem.asSpace(99, Math.min(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(176.0f), (int) (AndroidUtilities.displaySize.y * 0.25f))));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        arrayList.add(UItem.asSwitchNoIcon(101, LocaleController.getString(R.string.CommunityShowAsOneChat)).setChecked(this.collapsedInDialogs));
        arrayList.add(UItem.asShadow(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
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
        CommunityUtils.fillLinkedPeers(this.currentAccount, arrayList, this.communityId, true);
    }

    public void fillItemsRequests(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(48.0f)));
        if (ChatObject.canBlockUsers(this.currentChat)) {
            arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$fillItemsRequests$1();
                }
            }), true)));
        } else {
            arrayList.add(UItem.asShadow(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
        }
        arrayList.add(UItem.asCustom(2, this.fakeAnchorView));
        arrayList.add(UItem.asHeader(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", this.pendingRequestsList.getTotalCount(), new Object[0])));
        this.pendingRequestsList.fillItems(arrayList);
    }

    public void lambda$fillItemsRequests$1() {
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
                    this.f$0.lambda$onClickChatToAdd$2(chat, (Boolean) obj2);
                }
            }).show();
        }
    }

    public void lambda$onClickChatToAdd$2(TLRPC.Chat chat, Boolean bool) {
        linkToCommunity(chat, this.communityId, bool.booleanValue());
    }

    public void onClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        TLRPC.Chat currentChat;
        int i2;
        if (checkPendingRequestClick(uItem)) {
            return;
        }
        int i3 = uItem.id;
        if (i3 == 101) {
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
        if (i3 == 100) {
            this.viewPager.scrollToPosition(1);
            this.pendingRequestsList.markAsViewed();
            return;
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            CommunityChatType communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, chat);
            if (communityChatType == CommunityChatType.YouAreIn || communityChatType == CommunityChatType.YouCanView) {
                BaseFragment baseFragment = this.parentFragment;
                if ((baseFragment instanceof ChatActivity) && (currentChat = ((ChatActivity) baseFragment).getCurrentChat()) != null && currentChat.id == chat.id) {
                    lambda$new$0();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", chat.id);
                if (ChatObject.isForum(chat)) {
                    if (ChatObject.areTabsEnabled(chat)) {
                        ChatActivity chatActivity = new ChatActivity(bundle);
                        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-chat.id, MessagesController.getInstance(this.currentAccount).getForumLastTopicId(chat.id)));
                        this.parentFragment.presentFragment(chatActivity);
                    } else {
                        this.parentFragment.presentFragment(new TopicsFragment(bundle));
                    }
                } else {
                    this.parentFragment.presentFragment(new ChatActivity(bundle));
                }
                lambda$new$0();
                return;
            }
            if (communityChatType == CommunityChatType.YouCanSendJoinRequest) {
                new JoinGroupAlert(getContext(), chat, null, this.parentFragment, this.resourcesProvider).setBulletinFactory(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider)).show();
                return;
            }
            if (communityChatType == CommunityChatType.HiddenUnavailable) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider);
                int i4 = R.raw.e_hand_2;
                if (zIsChannelAndNotMegaGroup) {
                    i2 = R.string.CommunityHiddenChannelUnavailable;
                } else {
                    i2 = R.string.CommunityHiddenGroupUnavailable;
                }
                bulletinFactoryOf.createSimpleBulletin(i4, LocaleController.getString(i2)).show();
            }
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
                        this.f$0.lambda$onLongClickCommunity$5(j);
                    }
                });
            }
            itemOptionsMakeOptions.setScrimViewBackground(this.communityPage.listView.getClipBackground(view, true));
            itemOptionsMakeOptions.show();
        }
        return z;
    }

    public void lambda$onLongClickCommunity$5(final long j) {
        AlertsCreator.showSimpleConfirmAlert(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onLongClickCommunity$4(j);
            }
        });
    }

    public void lambda$onLongClickCommunity$4(long j) {
        MessagesController.getInstance(this.currentAccount).unlinkCommunity(j, this.communityId, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$onLongClickCommunity$3((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$onLongClickCommunity$3(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
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
                this.f$0.lambda$checkPendingRequestClick$6(data);
            }
        }).show();
        return true;
    }

    public void lambda$checkPendingRequestClick$6(CommunityPendingRequestCell.Data data) {
        this.parentFragment.presentFragment(ChatActivity.of(data.requestFromUser.id));
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.chatInfo = chatFull;
                this.communityPage.listView.adapter.update(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) == 0 && (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) == 0) {
                return;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.communityId));
            this.currentChat = chat;
            this.communityPage.actionBar.setTitle(DialogObject.getName(chat));
            this.communityPage.avatarImage.setForUserOrChat(this.currentChat, this.communityPage.avatarDrawable);
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.viewPager.getCurrentPosition() > 0) {
            this.viewPager.scrollToPosition(0);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    protected boolean canDismissWithSwipe() {
        if (this.animatorSearchResultVisible.getValue()) {
            return false;
        }
        View currentView = this.viewPager.getCurrentView();
        if (currentView instanceof Page) {
            return ((Page) currentView).wasAtTop;
        }
        return true;
    }

    private void init(Context context) {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    class CommunityPage extends Page {
        private AvatarDrawable avatarDrawable;
        private BackupImageView avatarImage;

        public CommunityPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$2900(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$2800(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
            AndroidUtilities.removeFromParent(this.fadeView);
            this.contentView.addView(CommunitySheet.this.filteredSearchView, LayoutHelper.createFrameMatchParent());
            this.contentView.addView(this.listView, LayoutHelper.createFrameMatchParent());
            this.contentView.addView(CommunitySheet.this.communityPageFadeView, LayoutHelper.createFrameMatchParent());
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
                        return;
                    }
                    if (i == 3) {
                        CommunitySheet.this.animatorSearchFieldVisible.setValue(true, true);
                        CommunitySheet.this.animatorSearchResultVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet.this.onTextChanged(null, true);
                        CommunitySheet.this.searchView.editText.getText().clear();
                        CommunitySheet.this.searchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.searchView.editText);
                    }
                }
            });
            this.avatarDrawable = new AvatarDrawable(CommunitySheet.this.currentChat);
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.avatarImage.setForUserOrChat(CommunitySheet.this.currentChat, this.avatarDrawable);
            this.actionBar.addView(this.avatarImage, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.searchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.setGlassMode(true);
            actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            actionBarMenuCreateMenu.addItem(3, R.drawable.outline_header_search);
            if (ChatObject.hasAdminRights(CommunitySheet.this.currentChat)) {
                actionBarMenuCreateMenu.addItem(2, R.drawable.msg_download_settings);
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            if (ChatObject.canAddChatToCommunity(CommunitySheet.this.currentChat)) {
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

        @Override
        public float top() {
            return super.top() * FBool.not(CommunitySheet.this.animatorSearchResultVisible.getFloatValue());
        }

        @Override
        public void updateTops() {
            super.updateTops();
            CommunitySheet.this.searchView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f), top() + AndroidUtilities.dp(4.0f)));
        }
    }

    public void onAddChatToCommunityButtonClick() {
        if (!ChatObject.canAddChatToCommunity(this.currentChat)) {
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
        MessagesController.getInstance(this.currentAccount).fetchChatsToAddToCommunity(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$loadChatsToAddToCommunity$7((ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$loadChatsToAddToCommunity$7(ArrayList arrayList, TLRPC.TL_error tL_error) {
        this.addChatToCommunityButton.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
            return;
        }
        if (arrayList != null) {
            this.chatsToAddToCommunity = arrayList;
            if (arrayList.isEmpty()) {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.info, LocaleController.getString(R.string.CommunityNoChatsToAdd)).show();
            } else {
                this.chatsPage.listView.adapter.update(false);
                this.viewPager.scrollToPosition(2);
            }
        }
    }

    class ChatsToAddListPage extends Page {
        public ChatsToAddListPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CommunitySheet.access$3800(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$3700(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
                    CommunitySheet.access$5100(communitySheet, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    CommunitySheet.access$5000(communitySheet, (UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
            ActionBar actionBar2 = this.actionBar;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            actionBar2.setTitleColor(CommunitySheet.this.getThemedColor(i));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequestsTitle));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i2) {
                    if (i2 == -1) {
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
            buttonWithCounterView.setColor(ColorUtils.blendARGB(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhite), CommunitySheet.this.getThemedColor(i), 0.125f));
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
            float pVar = top();
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, pVar));
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
            this.top = (Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f)) - (AndroidUtilities.dp(10.0f) * CommunitySheet.this.animatorSearchFieldVisible.getFloatValue());
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
        final boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j3) {
                    this.f$0.lambda$linkToCommunity$8(alertDialog, j, z, j3);
                }
            });
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$linkToCommunity$9(zIsChannelAndNotMegaGroup, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$linkToCommunity$8(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        linkToCommunity(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    public void lambda$linkToCommunity$9(boolean z, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                onLinkSuccess(2, z);
                return;
            } else {
                BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider).showForError(tL_error);
                return;
            }
        }
        onLinkSuccess(1, z);
    }

    private void onLinkSuccess(int i, boolean z) {
        CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), i, z);
        this.viewPager.scrollToPosition(0);
    }

    public void onTextChanged(String str) {
        onTextChanged(str, false);
    }

    public void onTextChanged(String str, boolean z) {
        boolean z2 = TextUtils.isEmpty(this.lastSearchString) ? true : z;
        this.lastSearchString = str;
        this.filteredSearchView.search(0L, this.communityId, 0L, 0L, null, false, str, z2);
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.systemAndImeInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        this.systemInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        this.filteredSearchView.setPagesPaddings(this.systemAndImeInsets.top + AndroidUtilities.dp(56.0f), this.systemAndImeInsets.bottom);
        this.communityPageFadeView.invalidate();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            float fNot = FBool.not(f);
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fNot);
            this.communityPage.actionBar.setAlpha(fNot);
            this.communityPage.actionBar.setScaleX(fLerp);
            this.communityPage.actionBar.setScaleY(fLerp);
            this.communityPage.actionBar.setVisibility(fNot > 0.0f ? 0 : 8);
            float fLerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f);
            this.searchView.setAlpha(f);
            this.searchView.setScaleX(fLerp2);
            this.searchView.setScaleY(fLerp2);
            this.searchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            return;
        }
        if (i == 2) {
            float fNot2 = FBool.not(f);
            this.communityPage.listView.setAlpha(fNot2);
            this.communityPage.listView.setVisibility(fNot2 > 0.0f ? 0 : 8);
            this.addChatToCommunityButton.setAlpha(fNot2);
            this.addChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
            this.addChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
            this.addChatToCommunityButton.setVisibility(fNot2 > 0.0f ? 0 : 8);
            this.filteredSearchView.setAlpha(f);
            this.filteredSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.communityPageFadeView.invalidate();
        }
    }

    private class FadeView extends View {
        public FadeView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float floatValue = CommunitySheet.this.animatorSearchResultVisible.getFloatValue();
            CommunitySheet.this.gradientProtectionDrawableTop.setInsets(0, CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(42.0f), 0, 0);
            CommunitySheet.this.gradientProtectionDrawableTop.setBounds(0, 0, getWidth(), CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(56.0f));
            GradientProtectionDrawable gradientProtectionDrawable = CommunitySheet.this.gradientProtectionDrawableTop;
            CommunitySheet communitySheet = CommunitySheet.this;
            int i = Theme.key_windowBackgroundGray;
            gradientProtectionDrawable.setColor(Theme.multAlpha(communitySheet.getThemedColor(i), AndroidUtilities.lerp(1.0f, 0.8f, floatValue)));
            CommunitySheet.this.gradientProtectionDrawableTop.draw(canvas);
            int iLerp = AndroidUtilities.lerp(CommunitySheet.this.systemInsets.bottom + AndroidUtilities.dp(48.0f), 0, floatValue);
            int iLerp2 = CommunitySheet.this.systemInsets.bottom + AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, floatValue);
            float fLerp = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(CommunitySheet.this.systemInsets.bottom), floatValue);
            CommunitySheet.this.gradientProtectionDrawableBottom.setInsets(0, 0, 0, iLerp);
            CommunitySheet.this.gradientProtectionDrawableBottom.setBounds(0, getHeight() - iLerp2, getWidth(), getHeight());
            CommunitySheet.this.gradientProtectionDrawableBottom.setColor(Theme.multAlpha(CommunitySheet.this.getThemedColor(i), fLerp));
            CommunitySheet.this.gradientProtectionDrawableBottom.draw(canvas);
        }
    }
}
