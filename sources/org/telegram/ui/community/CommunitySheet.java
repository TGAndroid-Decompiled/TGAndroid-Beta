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
import org.telegram.messenger.UserObject;
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
import org.telegram.ui.Components.EditTextBoldCursor;
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
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.community.cells.CommunityPendingRequestCell;
import org.telegram.ui.community.cells.CommunityRequestsCell;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;

public class CommunitySheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target, DialogCell.DialogCellDelegate {
    private ButtonWithCounterView addChatToCommunityButton;
    private final BoolAnimator animatorSearchChatsVisible;
    private final BoolAnimator animatorSearchMessagesVisible;
    private final Paint backgroundPaint;
    private final ChatsToAddListPage chatsPage;
    private final FadeView chatsPageFadeView;
    private final FragmentSearchField chatsSearchView;
    private final Utilities.Callback chatsToAddCallback;
    private ArrayList chatsToAddToCommunity;
    private ButtonWithCounterView closeChatToCommunityButton;
    private boolean collapsedInDialogs;
    private final long communityId;
    private TLRPC.ChatFull communityInfo;
    private final CommunityPage communityPage;
    private final FadeView communityPageFadeView;
    private TLRPC.Chat currentCommunity;
    private final View fakeAnchorView;
    private final FilteredSearchView filteredSearchView;
    private final UniversalRecyclerView foundChatsView;
    private final GradientProtectionDrawable gradientProtectionDrawableBottom;
    private final GradientProtectionDrawable gradientProtectionDrawableTop;
    private String lastSearchChatsString;
    private String lastSearchString;
    private final FragmentSearchField messagesSearchView;
    private final boolean onlyChatsMode;
    private final BaseFragment parentFragment;
    private CommunityUtils.PendingRequests pendingRequestsList;
    private final PendingRequestsPage requestsPage;
    private Insets systemAndImeInsets;
    private Insets systemInsets;
    private ViewPagerFixed viewPager;

    @Override
    public boolean canClickButtonInside() {
        return true;
    }

    @Override
    protected boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    @Override
    public void openHiddenStories() {
    }

    @Override
    public void showChatPreview(DialogCell dialogCell) {
    }

    public CommunitySheet(BaseFragment baseFragment, long j) {
        this(baseFragment, j, null, null);
    }

    public CommunitySheet(final BaseFragment baseFragment, long j, ArrayList arrayList, Utilities.Callback callback) {
        super(baseFragment.getContext(), true, true, baseFragment.getResourceProvider());
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchMessagesVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 350L);
        this.animatorSearchChatsVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.gradientProtectionDrawableTop = new GradientProtectionDrawable(2);
        this.gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);
        this.backgroundPaint = new Paint(1);
        Insets insets = Insets.NONE;
        this.systemAndImeInsets = insets;
        this.systemInsets = insets;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.parentFragment = baseFragment;
        this.onlyChatsMode = arrayList != null;
        this.chatsToAddToCommunity = arrayList;
        this.chatsToAddCallback = callback;
        Context context = baseFragment.getContext();
        init(context);
        this.communityPageFadeView = new FadeView(context);
        this.chatsPageFadeView = new FadeView(context);
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.messagesSearchView = fragmentSearchField;
        fragmentSearchField.setCloseButtonVisible(true);
        fragmentSearchField.setWhiteBackground();
        EditTextBoldCursor editTextBoldCursor = fragmentSearchField.editText;
        int i = R.string.Search;
        editTextBoldCursor.setHint(LocaleController.getString(i));
        fragmentSearchField.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i2, i3, i4);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i2, i3, i4);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CommunitySheet.this.onMessagesSearchTextChanged(editable.toString());
            }
        });
        fragmentSearchField.setVisibility(8);
        FragmentSearchField fragmentSearchField2 = new FragmentSearchField(context, this.resourcesProvider);
        this.chatsSearchView = fragmentSearchField2;
        fragmentSearchField2.setCloseButtonVisible(true);
        fragmentSearchField2.setWhiteBackground();
        fragmentSearchField2.editText.setHint(LocaleController.getString(i));
        fragmentSearchField2.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i2, i3, i4);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i2, i3, i4);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CommunitySheet.this.onChatsSearchTextChanged(editable.toString());
            }
        });
        fragmentSearchField2.setVisibility(8);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItemsChatsToAddSearch((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClickChatToAdd((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, this.resourcesProvider);
        this.foundChatsView = universalRecyclerView;
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                super.onScrolled(recyclerView, i2, i3);
                if (CommunitySheet.this.foundChatsView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(CommunitySheet.this.chatsSearchView.editText);
                }
            }
        });
        universalRecyclerView.setClipToPadding(false);
        universalRecyclerView.setVisibility(8);
        universalRecyclerView.setSections();
        universalRecyclerView.adapter.setApplyBackground(false);
        universalRecyclerView.setPadding(0, AndroidUtilities.statusBarHeight + AndroidUtilities.dp(52.0f), 0, AndroidUtilities.navigationBarHeight);
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
            public void toggleItemSelection(MessageObject messageObject, View view, int i2) {
            }

            @Override
            public void goToMessage(MessageObject messageObject) {
                CommunitySheet.this.parentFragment.presentFragment(SearchViewPager.createFragmentFromMessage(((BottomSheet) CommunitySheet.this).currentAccount, messageObject));
                CommunitySheet.this.dismiss();
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
                CommunitySheet.this.dismiss();
            }
        });
        this.communityId = j;
        this.currentCommunity = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
        this.communityInfo = MessagesController.getInstance(this.currentAccount).getChatFull(j);
        TLRPC.Chat chat = this.currentCommunity;
        this.collapsedInDialogs = chat != null && chat.collapsed_in_dialogs;
        FiltersView.MediaFilterData mediaFilterData = new FiltersView.MediaFilterData(R.drawable.search_users_filled, DialogObject.getShortName(chat), (TLRPC.MessagesFilter) null, 4);
        mediaFilterData.setUser(this.currentCommunity);
        mediaFilterData.removable = false;
        fragmentSearchField.addSearchFilter(mediaFilterData);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider));
        this.requestsPage = new PendingRequestsPage(context);
        this.communityPage = new CommunityPage(context);
        this.chatsPage = new ChatsToAddListPage(context);
        this.viewPager.setAdapter(new ViewPagerFixed.Adapter() {
            @Override
            public int getItemCount() {
                return CommunitySheet.this.onlyChatsMode ? 1 : 3;
            }

            @Override
            public View createView(int i2) {
                if (i2 == 2) {
                    return CommunitySheet.this.chatsPage;
                }
                return i2 == 0 ? CommunitySheet.this.communityPage : CommunitySheet.this.requestsPage;
            }

            @Override
            public int getItemViewType(int i2) {
                if (CommunitySheet.this.onlyChatsMode || i2 == 2) {
                    return 2;
                }
                return i2 == 0 ? 0 : 1;
            }

            @Override
            public void bindView(View view, int i2, int i3) {
                ((Page) view).bind(i3);
            }
        });
        fragmentSearchField.setCloseButtonOnClickListener(new Runnable() {
            @Override
            public final void run() {
                CommunitySheet.m4881$r8$lambda$WvdyAYi8jqcUyJM1b3tX6K0ka0(this.f$0);
            }
        });
        fragmentSearchField2.setCloseButtonOnClickListener(new Runnable() {
            @Override
            public final void run() {
                CommunitySheet.$r8$lambda$msKhrbZDqnNH6fTeH4olCsfkvMc(this.f$0);
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
            public boolean clipWithGradient(int i2) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i2);
            }

            @Override
            public int getTopOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i2);
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
            public int getBottomOffset(int i2) {
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

    public static void m4881$r8$lambda$WvdyAYi8jqcUyJM1b3tX6K0ka0(CommunitySheet communitySheet) {
        communitySheet.communityPage.listView.layoutManager.scrollToPositionWithOffset(1, communitySheet.systemInsets.top);
        communitySheet.animatorSearchMessagesVisible.setValue(false, true);
        communitySheet.setAllowNestedScroll(true);
        AndroidUtilities.hideKeyboard(communitySheet.messagesSearchView.editText);
        communitySheet.messagesSearchView.editText.clearFocus();
    }

    public static void $r8$lambda$msKhrbZDqnNH6fTeH4olCsfkvMc(CommunitySheet communitySheet) {
        communitySheet.chatsPage.listView.layoutManager.scrollToPositionWithOffset(1, communitySheet.systemInsets.top);
        communitySheet.animatorSearchChatsVisible.setValue(false, true);
        communitySheet.setAllowNestedScroll(true);
        AndroidUtilities.hideKeyboard(communitySheet.chatsSearchView.editText);
        communitySheet.chatsSearchView.editText.clearFocus();
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
        CommunityUtils.fillLinkedPeers(this.currentAccount, arrayList, this, this.communityId, true);
    }

    public void fillItemsRequests(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
        arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(48.0f)));
        if (ChatObject.canBlockUsers(this.currentCommunity)) {
            arrayList.add(UItem.asShadow(1, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CommunityPendingRequestsInfo), new Runnable() {
                @Override
                public final void run() {
                    CommunitySheet.m4882$r8$lambda$ieBlMxOAwQFrTGMoOzqVdPqRoA(this.f$0);
                }
            }), true)));
        } else {
            arrayList.add(UItem.asShadow(1, LocaleController.getString(R.string.CommunityPendingRequestsInfoNoChange)));
        }
        arrayList.add(UItem.asCustom(2, this.fakeAnchorView));
        arrayList.add(UItem.asHeader(3, LocaleController.formatPluralString("CommunityPendingRequestsSuggestedHeader", this.pendingRequestsList.getTotalCount(), new Object[0])));
        this.pendingRequestsList.fillItems(arrayList);
    }

    public static void m4882$r8$lambda$ieBlMxOAwQFrTGMoOzqVdPqRoA(CommunitySheet communitySheet) {
        communitySheet.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("community_id", communitySheet.communityId);
        communitySheet.parentFragment.presentFragment(new CommunityEditActivity(bundle));
        communitySheet.dismiss();
    }

    public void fillItemsChatsToAdd(ArrayList arrayList, UniversalAdapter universalAdapter) {
        fillItemsChatsToAddImpl(arrayList, universalAdapter, false);
    }

    public void fillItemsChatsToAddSearch(ArrayList arrayList, UniversalAdapter universalAdapter) {
        fillItemsChatsToAddImpl(arrayList, universalAdapter, true);
    }

    private void fillItemsChatsToAddImpl(ArrayList arrayList, UniversalAdapter universalAdapter, boolean z) {
        String str;
        int i = 0;
        if (!z) {
            arrayList.add(UItem.asSpace(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(UItem.asSpace(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.chatsToAddToCommunity != null) {
            String lowerCase = (!z || (str = this.lastSearchChatsString) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.chatsToAddToCommunity;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z && !TextUtils.isEmpty(lowerCase)) {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(UItem.asProfileCell(chat));
                    }
                } else {
                    arrayList.add(UItem.asProfileCell(chat));
                }
            }
        }
    }

    public void onClickChatToAdd(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            final TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.onlyChatsMode) {
                this.chatsToAddCallback.run(chat);
                dismiss();
            } else {
                new CommunityAddOptionsSheet(getContext(), this.currentCommunity, -chat.id, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        CommunitySheet communitySheet = this.f$0;
                        communitySheet.linkToCommunity(chat, communitySheet.communityId, ((Boolean) obj2).booleanValue());
                    }
                }).show();
            }
        }
    }

    public void onClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        long j;
        TLRPC.Chat chat;
        int i2;
        if (checkPendingRequestClick(uItem)) {
            return;
        }
        int i3 = uItem.id;
        boolean zIsChannelAndNotMegaGroup = false;
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
            chat = (TLRPC.Chat) obj;
            zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            j = -chat.id;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return;
            }
            j = ((TLRPC.User) obj).id;
            chat = null;
        }
        TLRPC.Chat chat2 = chat;
        CommunityChatType communityChatType = CommunityUtils.getCommunityChatType(this.currentAccount, j);
        if (communityChatType == CommunityChatType.YouAreIn || communityChatType == CommunityChatType.YouCanView) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                TLRPC.Chat currentChat = ((ChatActivity) baseFragment).getCurrentChat();
                TLRPC.User currentUser = ((ChatActivity) this.parentFragment).getCurrentUser();
                if ((currentChat != null && currentChat.id == (-j)) || (currentUser != null && currentUser.id == j)) {
                    dismiss();
                    return;
                }
            }
            Bundle bundle = new Bundle();
            if (j > 0) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            if (ChatObject.isForum(chat2)) {
                if (ChatObject.areTabsEnabled(chat2)) {
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(j, MessagesController.getInstance(this.currentAccount).getForumLastTopicId(chat2.id)));
                    this.parentFragment.presentFragment(chatActivity);
                } else {
                    this.parentFragment.presentFragment(new TopicsFragment(bundle));
                }
            } else {
                this.parentFragment.presentFragment(new ChatActivity(bundle));
            }
            dismiss();
            return;
        }
        if (communityChatType == CommunityChatType.YouCanSendJoinRequest) {
            new JoinGroupAlert(getContext(), chat2, null, this.parentFragment, this.resourcesProvider).setBulletinFactory(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider)).show();
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

    public boolean onLongClickCommunity(UItem uItem, View view, int i, float f, float f2) {
        long j;
        boolean zCanRemoveBotFromCommunity;
        final boolean z;
        final boolean z2;
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j = -chat.id;
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            zCanRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, this.currentCommunity);
            z2 = zIsChannelAndNotMegaGroup;
            z = false;
        } else {
            if (!(obj instanceof TLRPC.User)) {
                return false;
            }
            TLRPC.User user = (TLRPC.User) obj;
            j = user.id;
            boolean zIsBot = UserObject.isBot(user);
            zCanRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, this.currentCommunity);
            z = zIsBot;
            z2 = false;
        }
        final long j2 = j;
        if (!zCanRemoveBotFromCommunity) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, view);
        itemOptionsMakeOptions.add(R.drawable.msg_cancel, (CharSequence) LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new Runnable() {
            @Override
            public final void run() {
                CommunitySheet.m4880$r8$lambda$NwvIrXTwjQ5JQIHS8WyfgDE18c(this.f$0, z, z2, j2);
            }
        });
        itemOptionsMakeOptions.setScrimViewBackground(this.communityPage.listView.getClipBackground(view, true));
        itemOptionsMakeOptions.show();
        return true;
    }

    public static void m4880$r8$lambda$NwvIrXTwjQ5JQIHS8WyfgDE18c(final CommunitySheet communitySheet, boolean z, boolean z2, final long j) {
        int i;
        Context context = communitySheet.getContext();
        Theme.ResourcesProvider resourcesProvider = communitySheet.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z) {
            i = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z2) {
            i = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        AlertsCreator.showSimpleConfirmAlert(context, resourcesProvider, string, LocaleController.getString(i), LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                CommunitySheet communitySheet2 = this.f$0;
                MessagesController.getInstance(communitySheet2.currentAccount).unlinkCommunity(j, communitySheet2.communityId, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        CommunitySheet.m4879$r8$lambda$H2QIdSSp9VlgAhqn6a9ncCVFqc(communitySheet2, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                    }
                });
            }
        });
    }

    public static void m4879$r8$lambda$H2QIdSSp9VlgAhqn6a9ncCVFqc(CommunitySheet communitySheet, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider).showForError(tL_error);
        } else {
            communitySheet.getClass();
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
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-data.dialogToAdd));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(data.dialogToAdd));
        if (user != null) {
            this.parentFragment.presentFragment(ChatActivity.of(user.id));
            return true;
        }
        if (ChatObject.isPublic(chat) || ChatObject.isInChat(chat)) {
            this.parentFragment.presentFragment(ChatActivity.of(-chat.id));
            return true;
        }
        new CommunityInviteOnlySheet(getContext(), chat, data.requestFromUser, new Runnable() {
            @Override
            public final void run() {
                this.f$0.parentFragment.presentFragment(ChatActivity.of(data.requestFromUser.id));
            }
        }).show();
        return true;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.communityId) {
                this.communityInfo = chatFull;
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
            this.currentCommunity = chat;
            this.communityPage.actionBar.setTitle(DialogObject.getName(chat));
            this.communityPage.avatarImage.setForUserOrChat(this.currentCommunity, this.communityPage.avatarDrawable);
        }
    }

    @Override
    public void onBackPressed() {
        if (this.viewPager.getCurrentPosition() > 0) {
            if (this.viewPager.getCurrentPosition() == 2 && this.animatorSearchChatsVisible.getValue()) {
                this.chatsPage.listView.layoutManager.scrollToPositionWithOffset(1, this.systemInsets.top);
                this.animatorSearchChatsVisible.setValue(false, true);
                setAllowNestedScroll(true);
                AndroidUtilities.hideKeyboard(this.chatsSearchView.editText);
                this.chatsSearchView.editText.clearFocus();
                return;
            }
            this.viewPager.scrollToPosition(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        if (this.animatorSearchMessagesVisible.getValue() || this.animatorSearchChatsVisible.getValue()) {
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
                    communitySheet.fillItemsCommunity((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    communitySheet.onClickCommunity((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, new Utilities.Callback5Return() {
                @Override
                public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    return Boolean.valueOf(communitySheet.onLongClickCommunity((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
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
            this.actionBar.setTitle(DialogObject.getName(CommunitySheet.this.currentCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == 2) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("community_id", CommunitySheet.this.communityId);
                        CommunitySheet.this.parentFragment.presentFragment(new CommunityEditActivity(bundle));
                        CommunitySheet.this.dismiss();
                        return;
                    }
                    if (i == 3) {
                        CommunitySheet.this.animatorSearchMessagesVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet.this.onMessagesSearchTextChanged(null, true);
                        CommunitySheet.this.messagesSearchView.editText.getText().clear();
                        CommunitySheet.this.messagesSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.messagesSearchView.editText);
                    }
                }
            });
            this.avatarDrawable = new AvatarDrawable(CommunitySheet.this.currentCommunity);
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(9.0f));
            this.avatarImage.setForUserOrChat(CommunitySheet.this.currentCommunity, this.avatarDrawable);
            this.actionBar.addView(this.avatarImage, LayoutHelper.createFrame(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.messagesSearchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.setGlassMode(true);
            actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            actionBarMenuCreateMenu.addItem(3, R.drawable.outline_header_search);
            if (ChatObject.hasAdminRights(CommunitySheet.this.currentCommunity)) {
                actionBarMenuCreateMenu.addItem(2, R.drawable.msg_download_settings);
            }
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView.setRound();
            if (ChatObject.canAddChatToCommunity(CommunitySheet.this.currentCommunity)) {
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
                    CommunitySheet.this.onAddChatToCommunityButtonClick();
                }
            });
            this.contentView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        @Override
        public float top() {
            return super.top() * FBool.not(CommunitySheet.this.animatorSearchMessagesVisible.getFloatValue());
        }

        @Override
        public void updateTops() {
            super.updateTops();
            CommunitySheet.this.messagesSearchView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f), top() + AndroidUtilities.dp(4.0f)));
        }
    }

    public void onAddChatToCommunityButtonClick() {
        if (!ChatObject.canAddChatToCommunity(this.currentCommunity)) {
            dismiss();
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
                CommunitySheet.$r8$lambda$CMpEgDxxBkRIWOMWnQxcxeiowkE(this.f$0, (ArrayList) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$CMpEgDxxBkRIWOMWnQxcxeiowkE(CommunitySheet communitySheet, ArrayList arrayList, TLRPC.TL_error tL_error) {
        communitySheet.addChatToCommunityButton.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider).showForError(tL_error);
            return;
        }
        if (arrayList != null) {
            communitySheet.chatsToAddToCommunity = arrayList;
            if (arrayList.isEmpty()) {
                BulletinFactory.of((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider).createSimpleBulletin(R.raw.info, LocaleController.getString(R.string.CommunityNoChatsToAdd)).show();
            } else {
                communitySheet.chatsPage.listView.adapter.update(false);
                communitySheet.viewPager.scrollToPosition(2);
            }
        }
    }

    class ChatsToAddListPage extends Page {
        public ChatsToAddListPage(Context context) {
            super(context);
            AndroidUtilities.removeFromParent(this.fadeView);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    communitySheet.fillItemsChatsToAdd((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    communitySheet.onClickChatToAdd((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                }
            }, null, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.listView = universalRecyclerView;
            universalRecyclerView.setSections();
            this.listView.adapter.setApplyBackground(false);
            this.listView.setClipToPadding(false);
            this.listView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(60.0f));
            this.contentView.addView(CommunitySheet.this.foundChatsView, LayoutHelper.createFrameMatchParent());
            this.contentView.addView(this.listView, 0, LayoutHelper.createFrame(-1, -1.0f));
            this.contentView.addView(CommunitySheet.this.chatsPageFadeView, LayoutHelper.createFrameMatchParent());
            ActionBar actionBar = new ActionBar(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            this.actionBar = actionBar;
            actionBar.setOccupyStatusBar(false);
            this.actionBar.setTitleColor(CommunitySheet.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            this.actionBar.setItemsBackgroundColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
            this.actionBar.setBackButtonImage(CommunitySheet.this.onlyChatsMode ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
            this.actionBar.setItemsColor(CommunitySheet.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), false);
            this.actionBar.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            this.actionBar.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
            this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i) {
                    if (i == -1) {
                        if (!CommunitySheet.this.onlyChatsMode) {
                            CommunitySheet.this.communityPage.listView.adapter.update(false);
                            CommunitySheet.this.viewPager.scrollToPosition(0);
                            return;
                        } else {
                            CommunitySheet.this.dismiss();
                            return;
                        }
                    }
                    if (i == 3) {
                        CommunitySheet.this.animatorSearchChatsVisible.setValue(true, true);
                        CommunitySheet.this.setAllowNestedScroll(false);
                        CommunitySheet.this.onChatsSearchTextChanged(null);
                        CommunitySheet.this.chatsSearchView.editText.getText().clear();
                        CommunitySheet.this.chatsSearchView.editText.requestFocus();
                        AndroidUtilities.showKeyboard(CommunitySheet.this.chatsSearchView.editText);
                    }
                }
            });
            this.contentView.addView(this.actionBar, LayoutHelper.createFrame(-1, 56, 48));
            this.contentView.addView(CommunitySheet.this.chatsSearchView, LayoutHelper.createFrame(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            actionBarMenuCreateMenu.setGlassMode(true);
            actionBarMenuCreateMenu.setTranslationX(-AndroidUtilities.dp(7.0f));
            actionBarMenuCreateMenu.addItem(3, R.drawable.outline_header_search);
            CommunitySheet.this.closeChatToCommunityButton = new ButtonWithCounterView(getContext(), ((BottomSheet) CommunitySheet.this).resourcesProvider);
            CommunitySheet.this.closeChatToCommunityButton.setRound();
            CommunitySheet.this.closeChatToCommunityButton.setText(LocaleController.getString(R.string.OK));
            CommunitySheet.this.closeChatToCommunityButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CommunitySheet.this.viewPager.scrollToPosition(0);
                }
            });
            if (CommunitySheet.this.onlyChatsMode) {
                CommunitySheet.this.closeChatToCommunityButton.setVisibility(8);
            }
            this.contentView.addView(CommunitySheet.this.closeChatToCommunityButton, LayoutHelper.createFrameMarginPx(-1, 48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(12.0f)));
            afterInit();
        }

        @Override
        public void updateTops() {
            super.updateTops();
            CommunitySheet.this.chatsSearchView.setTranslationY(Math.max(AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f), top() + AndroidUtilities.dp(4.0f)));
        }

        @Override
        public float top() {
            return super.top() * FBool.not(CommunitySheet.this.animatorSearchChatsVisible.getFloatValue());
        }
    }

    class PendingRequestsPage extends Page {
        public PendingRequestsPage(Context context) {
            super(context);
            UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, ((BottomSheet) CommunitySheet.this).currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    communitySheet.fillItemsRequests((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    communitySheet.onClickRequest((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
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
                    CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(false);
                }
            });
            linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, ((BottomSheet) CommunitySheet.this).resourcesProvider);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
            buttonWithCounterView2.setRound();
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CommunitySheet.this.pendingRequestsList.onResolveAllJoinRequests(true);
                }
            });
            linearLayout.addView(buttonWithCounterView2, LayoutHelper.createLinear(0, 48, 1.0f, 0, 4, 0, 4, 0));
            this.contentView.addView(linearLayout, LayoutHelper.createFrameMarginPx(-1, -2.0f, 80, 0, 0, 0, AndroidUtilities.navigationBarHeight));
            afterInit();
        }
    }

    abstract class Page extends FrameLayout {
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
            this.top = (Math.max(AndroidUtilities.statusBarHeight, this.top) - (AndroidUtilities.statusBarHeight * f)) - (AndroidUtilities.dp(10.0f) * Math.max(CommunitySheet.this.animatorSearchMessagesVisible.getFloatValue(), CommunitySheet.this.animatorSearchChatsVisible.getFloatValue()));
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
                CommunitySheet.this.dismiss();
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    public void linkToCommunity(TLRPC.Chat chat, final long j, final boolean z) {
        long j2 = -chat.id;
        final boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j2, null, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j3) {
                    CommunitySheet.$r8$lambda$HhvkFjTDhK1OAVuc73gvSXxNcqw(this.f$0, alertDialog, j, z, j3);
                }
            });
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j2, j, z, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                CommunitySheet.$r8$lambda$703Ly0vA1DvUkxDrsGuHhygRv9s(this.f$0, zIsChannelAndNotMegaGroup, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$HhvkFjTDhK1OAVuc73gvSXxNcqw(CommunitySheet communitySheet, AlertDialog alertDialog, long j, boolean z, long j2) {
        communitySheet.getClass();
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        communitySheet.linkToCommunity(MessagesController.getInstance(communitySheet.currentAccount).getChat(Long.valueOf(j2)), j, z);
    }

    public static void $r8$lambda$703Ly0vA1DvUkxDrsGuHhygRv9s(CommunitySheet communitySheet, boolean z, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            communitySheet.getClass();
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                communitySheet.onLinkSuccess(2, z);
                return;
            } else {
                BulletinFactory.of((FrameLayout) communitySheet.containerView, communitySheet.resourcesProvider).showForError(tL_error);
                return;
            }
        }
        communitySheet.onLinkSuccess(1, z);
    }

    private void onLinkSuccess(int i, boolean z) {
        CommunityUtils.showCommunityLinkSuccessToast(BulletinFactory.of((FrameLayout) this.containerView, this.resourcesProvider), i, z);
        this.viewPager.scrollToPosition(0);
    }

    public void onChatsSearchTextChanged(String str) {
        this.lastSearchChatsString = str;
        this.foundChatsView.adapter.update(true);
    }

    public void onMessagesSearchTextChanged(String str) {
        onMessagesSearchTextChanged(str, false);
    }

    public void onMessagesSearchTextChanged(String str, boolean z) {
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
            this.messagesSearchView.setAlpha(f);
            this.messagesSearchView.setScaleX(fLerp2);
            this.messagesSearchView.setScaleY(fLerp2);
            this.messagesSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.communityPage.listView.setAlpha(fNot);
            this.communityPage.listView.setVisibility(fNot > 0.0f ? 0 : 8);
            this.addChatToCommunityButton.setAlpha(fNot);
            this.addChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fNot));
            this.addChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fNot));
            this.addChatToCommunityButton.setVisibility(fNot > 0.0f ? 0 : 8);
            this.filteredSearchView.setAlpha(f);
            this.filteredSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.communityPageFadeView.invalidate();
        }
        if (i == 2) {
            float fNot2 = FBool.not(f);
            float fLerp3 = AndroidUtilities.lerp(0.9f, 1.0f, fNot2);
            this.chatsPage.actionBar.setAlpha(fNot2);
            this.chatsPage.actionBar.setScaleX(fLerp3);
            this.chatsPage.actionBar.setScaleY(fLerp3);
            this.chatsPage.actionBar.setVisibility(fNot2 > 0.0f ? 0 : 8);
            float fLerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f);
            this.chatsSearchView.setAlpha(f);
            this.chatsSearchView.setScaleX(fLerp4);
            this.chatsSearchView.setScaleY(fLerp4);
            this.chatsSearchView.setVisibility(f > 0.0f ? 0 : 8);
            this.chatsPage.listView.setAlpha(fNot2);
            this.chatsPage.listView.setVisibility(fNot2 > 0.0f ? 0 : 8);
            if (!this.onlyChatsMode) {
                this.closeChatToCommunityButton.setAlpha(fNot2);
                this.closeChatToCommunityButton.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
                this.closeChatToCommunityButton.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, fNot2));
                this.closeChatToCommunityButton.setVisibility(fNot2 > 0.0f ? 0 : 8);
            }
            this.foundChatsView.setAlpha(f);
            this.foundChatsView.setVisibility(f > 0.0f ? 0 : 8);
            this.containerView.invalidate();
            this.chatsPageFadeView.invalidate();
        }
    }

    private class FadeView extends View {
        public FadeView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float fMax = Math.max(CommunitySheet.this.animatorSearchMessagesVisible.getFloatValue(), CommunitySheet.this.animatorSearchChatsVisible.getFloatValue());
            CommunitySheet.this.gradientProtectionDrawableTop.setInsets(0, CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(42.0f), 0, 0);
            CommunitySheet.this.gradientProtectionDrawableTop.setBounds(0, 0, getWidth(), CommunitySheet.this.systemInsets.top + AndroidUtilities.dp(56.0f));
            GradientProtectionDrawable gradientProtectionDrawable = CommunitySheet.this.gradientProtectionDrawableTop;
            CommunitySheet communitySheet = CommunitySheet.this;
            int i = Theme.key_windowBackgroundGray;
            gradientProtectionDrawable.setColor(Theme.multAlpha(communitySheet.getThemedColor(i), AndroidUtilities.lerp(1.0f, 0.8f, fMax)));
            CommunitySheet.this.gradientProtectionDrawableTop.draw(canvas);
            if (CommunitySheet.this.onlyChatsMode) {
                fMax = 1.0f;
            }
            int iLerp = AndroidUtilities.lerp(CommunitySheet.this.systemInsets.bottom + AndroidUtilities.dp(48.0f), 0, fMax);
            int iLerp2 = CommunitySheet.this.systemInsets.bottom + AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), 0, fMax);
            float fLerp = AndroidUtilities.lerp(0.8f, AndroidUtilities.getNavigationBarThirdButtonsFactor(CommunitySheet.this.systemInsets.bottom), fMax);
            CommunitySheet.this.gradientProtectionDrawableBottom.setInsets(0, 0, 0, iLerp);
            CommunitySheet.this.gradientProtectionDrawableBottom.setBounds(0, getHeight() - iLerp2, getWidth(), getHeight());
            CommunitySheet.this.gradientProtectionDrawableBottom.setColor(Theme.multAlpha(CommunitySheet.this.getThemedColor(i), fLerp));
            CommunitySheet.this.gradientProtectionDrawableBottom.draw(canvas);
        }
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (dialogCell.getMessage() == null || (tL_forumTopicFindTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-dialogCell.getDialogId(), MessageObject.getTopicId(this.currentAccount, dialogCell.getMessage().messageOwner, true))) == null) {
            return;
        }
        ForumUtilities.openTopic(this.parentFragment, -dialogCell.getDialogId(), tL_forumTopicFindTopic, 0);
    }

    @Override
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStories(dialogCell.getDialogId())) {
            this.parentFragment.getOrCreateStoryViewer().doOnAnimationReady(runnable);
            this.parentFragment.getOrCreateStoryViewer().open(this.parentFragment.getContext(), dialogCell.getDialogId(), StoriesListPlaceProvider.of((RecyclerListView) dialogCell.getParent()));
        }
    }
}
