package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.SearchAdsInfoBottomSheet;
import org.telegram.ui.TopicsFragment;

public class SearchViewPager extends ViewPagerFixed implements FilteredSearchView.UiCallback, NotificationCenter.NotificationCenterDelegate, IBlur3Capture {
    private static final String actionModeTag = "search_view_pager";
    public static final int deleteItemId = 202;
    public static final int forwardItemId = 201;
    public static final int gotoItemId = 200;
    public static final int speedItemId = 203;
    private ActionBarMenu actionMode;
    private ImageView actionModeCloseView;
    int animateFromCount;
    private boolean attached;
    BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    public StickerEmptyView botsEmptyView;
    private DefaultItemAnimator botsItemAnimator;
    public DialogsBotsAdapter botsSearchAdapter;
    public FrameLayout botsSearchContainer;
    private LinearLayoutManager botsSearchLayoutManager;
    public final RecyclerListView botsSearchListView;
    public StickerEmptyView channelsEmptyView;
    private DefaultItemAnimator channelsItemAnimator;
    public DialogsChannelsAdapter channelsSearchAdapter;
    public FrameLayout channelsSearchContainer;
    private LinearLayoutManager channelsSearchLayoutManager;
    public final RecyclerListView channelsSearchListView;
    ChatPreviewDelegate chatPreviewDelegate;
    private final long communityId;
    int currentAccount;
    private ArrayList<FiltersView.MediaFilterData> currentSearchFilters;
    private ActionBarMenuItem deleteItem;
    public DialogsSearchAdapter dialogsSearchAdapter;
    private SearchDownloadsContainer downloadsContainer;
    public StickerEmptyView emptyView;
    public boolean expandedPublicPosts;
    private FilteredSearchView.Delegate filteredSearchViewDelegate;
    private final int folderId;
    private ActionBarMenuItem forwardItem;
    SizeNotifierFrameLayout fragmentView;
    private ActionBarMenuItem gotoItem;
    public StickerEmptyView hashtagEmptyView;
    private DefaultItemAnimator hashtagItemAnimator;
    public HashtagsSearchAdapter hashtagSearchAdapter;
    public FrameLayout hashtagSearchContainer;
    private LinearLayoutManager hashtagSearchLayoutManager;
    public final RecyclerListView hashtagSearchListView;
    private boolean isActionModeShowed;
    private DefaultItemAnimator itemAnimator;
    private RecyclerItemsEnterAnimator itemsEnterAnimator;
    private int keyboardSize;
    private boolean lastSearchScrolledToTop;
    String lastSearchString;
    private FilteredSearchView noMediaFiltersSearchView;
    private int pagesPaddingBottom;
    private int pagesPaddingTop;
    DialogsActivity parent;
    public boolean postsAreNew;
    public final PostsSearchContainer postsSearchContainer;
    public FrameLayout searchContainer;
    private LinearLayoutManager searchLayoutManager;
    public final RecyclerListView searchListView;
    private HashMap<FilteredSearchView.MessageHashId, MessageObject> selectedFiles;
    private NumberTextView selectedMessagesCountTextView;
    private boolean showOnlyDialogsAdapter;
    private ActionBarMenuItem speedItem;
    protected final ViewPagerAdapter viewPagerAdapter;

    public class AnonymousClass1 extends DialogsSearchAdapter {
        final Context val$context;
        final DialogsActivity val$fragment;

        public AnonymousClass1(Context context, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z, Theme.ResourcesProvider resourcesProvider, DialogsActivity dialogsActivity2, Context context2) {
            super(context, dialogsActivity, i, i2, defaultItemAnimator, z, resourcesProvider);
            this.val$fragment = dialogsActivity2;
            this.val$context = context2;
        }

        public void lambda$openSponsoredOptions$2(DialogsActivity dialogsActivity) {
            removeAllAds();
            BulletinFactory.of(dialogsActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
        }

        public void lambda$openSponsoredOptions$3(DialogsActivity dialogsActivity, Context context, ItemOptions itemOptions) {
            dialogsActivity.showDialog(new SearchAdsInfoBottomSheet(context, dialogsActivity.getResourceProvider(), new EmojiView$2$$ExternalSyntheticLambda0(18, this, dialogsActivity)));
            itemOptions.dismiss();
        }

        public void lambda$openSponsoredOptions$4(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
            removeAd(tL_sponsoredPeer);
        }

        public void lambda$openSponsoredOptions$5(DialogsActivity dialogsActivity, TLRPC.TL_sponsoredPeer tL_sponsoredPeer, ItemOptions itemOptions) {
            ReportBottomSheet.openSponsoredPeer(dialogsActivity, tL_sponsoredPeer.random_id, dialogsActivity.getResourceProvider(), new EmojiView$2$$ExternalSyntheticLambda0(17, this, tL_sponsoredPeer));
            itemOptions.dismiss();
        }

        public void lambda$openSponsoredOptions$6(DialogsActivity dialogsActivity, ItemOptions itemOptions) {
            if (UserConfig.getInstance(SearchViewPager.this.currentAccount).isPremium()) {
                dialogsActivity.getMessagesController().disableAds(true);
                removeAllAds();
                BulletinFactory.of(dialogsActivity).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            } else {
                new PremiumFeatureBottomSheet((BaseFragment) dialogsActivity, 3, true).show();
            }
            itemOptions.dismiss();
        }

        @Override
        public void notifyDataSetChanged() {
            RecyclerListView recyclerListView;
            int currentItemCount = getCurrentItemCount();
            super.notifyDataSetChanged();
            if (!SearchViewPager.this.lastSearchScrolledToTop && (recyclerListView = SearchViewPager.this.searchListView) != null) {
                recyclerListView.scrollToPosition(0);
                SearchViewPager.this.lastSearchScrolledToTop = true;
            }
            if (getItemCount() != 0 || currentItemCount == 0 || isSearching()) {
                return;
            }
            SearchViewPager.this.emptyView.showProgress(false, false);
        }

        @Override
        public void openBotApp(TLRPC.User user) {
            if (user == null) {
                return;
            }
            DialogsActivity dialogsActivity = SearchViewPager.this.parent;
            if (dialogsActivity != null) {
                dialogsActivity.closeSearching();
            }
            MessagesController.getInstance(SearchViewPager.this.currentAccount).openApp(user, 0);
            putRecentSearch(user.id, user);
        }

        @Override
        public void openPublicPosts() {
            SearchViewPager searchViewPager = SearchViewPager.this;
            HashtagsSearchAdapter hashtagsSearchAdapter = searchViewPager.hashtagSearchAdapter;
            DialogsSearchAdapter dialogsSearchAdapter = searchViewPager.dialogsSearchAdapter;
            hashtagsSearchAdapter.setInitialData(dialogsSearchAdapter.publicPostsHashtag, dialogsSearchAdapter.publicPosts, dialogsSearchAdapter.publicPostsLastRate, dialogsSearchAdapter.publicPostsTotalCount);
            SearchViewPager searchViewPager2 = SearchViewPager.this;
            searchViewPager2.expandedPublicPosts = true;
            searchViewPager2.hashtagSearchLayoutManager.scrollToPositionWithOffset(0, 0);
            SearchViewPager.this.updateTabs();
            ViewPagerFixed.TabsView tabsView = SearchViewPager.this.tabsView;
            if (tabsView != null && tabsView.getCurrentTabId() != 1) {
                SearchViewPager.this.tabsView.scrollToTab(1, 1);
            }
            SearchViewPager searchViewPager3 = SearchViewPager.this;
            searchViewPager3.hashtagSearchAdapter.search(searchViewPager3.lastSearchString);
        }

        @Override
        public void openSponsoredOptions(ProfileSearchCell profileSearchCell, TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
            AndroidUtilities.hideKeyboard(this.val$fragment.getParentActivity().getCurrentFocus());
            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((BaseFragment) this.val$fragment, (View) profileSearchCell, true);
            if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                ItemOptions itemOptionsAddGap = itemOptionsMakeOptions.makeSwipeback().add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Bulletin$2$$ExternalSyntheticLambda1(itemOptionsMakeOptions, 29)).addGap();
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                    itemOptionsAddGap.addText(tL_sponsoredPeer.sponsor_info, 13);
                }
                if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        itemOptionsAddGap.addGap();
                    }
                    itemOptionsAddGap.addText(tL_sponsoredPeer.additional_info, 13);
                }
                itemOptionsMakeOptions.add(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new SearchViewPager$1$$ExternalSyntheticLambda1(itemOptionsMakeOptions, itemOptionsAddGap, 0));
            }
            itemOptionsMakeOptions.add(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ShareAlert$$ExternalSyntheticLambda1(3, this, this.val$fragment, this.val$context, itemOptionsMakeOptions)).add(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new ShareAlert$$ExternalSyntheticLambda1(4, this, this.val$fragment, tL_sponsoredPeer, itemOptionsMakeOptions)).addGap().add(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new ImageUpdater$$ExternalSyntheticLambda1(this, this.val$fragment, itemOptionsMakeOptions, 9)).setGravity(LocaleController.isRTL ? 3 : 5).setOnTopOfScrim().setDrawScrim(false).show();
        }
    }

    public interface ChatPreviewDelegate {
        void finish();

        void move(float f);

        void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell);
    }

    public class ViewPagerAdapter extends ViewPagerFixed.Adapter {
        private static final int BOTS_TYPE = 4;
        private static final int CHANNELS_TYPE = 1;
        private static final int DIALOGS_TYPE = 0;
        private static final int DOWNLOADS_TYPE = 2;
        private static final int FILTER_TYPE = 3;
        private static final int POSTS_TYPE = 6;
        private static final int PUBLIC_POSTS_TYPE = 5;
        ArrayList<Item> items = new ArrayList<>();

        public class Item {
            int filterIndex;
            private final int type;

            public Item(ViewPagerAdapter viewPagerAdapter, int i, AnonymousClass1 anonymousClass1) {
                this(i);
            }

            private Item(int i) {
                this.type = i;
            }
        }

        public ViewPagerAdapter() {
            updateItems();
        }

        @Override
        public void bindView(View view, int i, int i2) {
            SearchViewPager searchViewPager = SearchViewPager.this;
            searchViewPager.search(view, i, searchViewPager.lastSearchString, true);
        }

        @Override
        public View createView(int i) {
            if (i == 1) {
                return SearchViewPager.this.searchContainer;
            }
            if (i == 3) {
                return SearchViewPager.this.channelsSearchContainer;
            }
            if (i == 4) {
                return SearchViewPager.this.botsSearchContainer;
            }
            if (i == 5) {
                return SearchViewPager.this.hashtagSearchContainer;
            }
            if (i == 2) {
                SearchViewPager searchViewPager = SearchViewPager.this;
                SearchViewPager searchViewPager2 = SearchViewPager.this;
                searchViewPager.downloadsContainer = new SearchDownloadsContainer(searchViewPager2.parent, searchViewPager2.currentAccount);
                SearchViewPager.this.downloadsContainer.setPagesPaddings(SearchViewPager.this.pagesPaddingTop, SearchViewPager.this.pagesPaddingBottom);
                SearchViewPager.this.downloadsContainer.recyclerListView.setClipToPadding(false);
                SearchViewPager.this.downloadsContainer.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                        super.onScrolled(recyclerView, i2, i3);
                        SearchViewPager.this.onPageScrolled(i2, i3);
                    }
                });
                SearchViewPager.this.downloadsContainer.recyclerListView.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(SearchViewPager.this, 10));
                SearchViewPager.this.downloadsContainer.setUiCallback(SearchViewPager.this);
                return SearchViewPager.this.downloadsContainer;
            }
            if (i == 6) {
                return SearchViewPager.this.postsSearchContainer;
            }
            FilteredSearchView filteredSearchView = new FilteredSearchView(SearchViewPager.this.parent);
            filteredSearchView.setChatPreviewDelegate(SearchViewPager.this.chatPreviewDelegate);
            filteredSearchView.setUiCallback(SearchViewPager.this);
            filteredSearchView.setPagesPaddings(SearchViewPager.this.pagesPaddingTop, SearchViewPager.this.pagesPaddingBottom);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = SearchViewPager.this.blurredBackgroundDrawableFactory;
            if (blurredBackgroundDrawableViewFactory != null) {
                filteredSearchView.setBlurredBackgroundDrawableFactory(blurredBackgroundDrawableViewFactory);
            }
            filteredSearchView.recyclerListView.setClipToPadding(false);
            filteredSearchView.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                    super.onScrolled(recyclerView, i2, i3);
                    SearchViewPager.this.onPageScrolled(i2, i3);
                }
            });
            filteredSearchView.recyclerListView.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(SearchViewPager.this, 10));
            return filteredSearchView;
        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }

        @Override
        public CharSequence getItemTitle(int i) {
            if (this.items.get(i).type == 0) {
                return LocaleController.getString(R.string.SearchAllChatsShort);
            }
            if (this.items.get(i).type == 1) {
                return LocaleController.getString(R.string.ChannelsTab);
            }
            if (this.items.get(i).type == 4) {
                return LocaleController.getString(R.string.AppsTab);
            }
            if (this.items.get(i).type == 6) {
                return SearchViewPager.this.postsAreNew ? PremiumPreviewFragment.applyNewSpan(LocaleController.getString(R.string.SearchPosts)) : LocaleController.getString(R.string.SearchPosts);
            }
            if (this.items.get(i).type == 2) {
                return LocaleController.getString(R.string.DownloadsTabs);
            }
            if (this.items.get(i).type == 5) {
                return LocaleController.getString(R.string.PublicPostsTabs);
            }
            FiltersView.MediaFilterData mediaFilterData = FiltersView.filters[this.items.get(i).filterIndex];
            String str = mediaFilterData.title;
            return str != null ? str : LocaleController.getString(mediaFilterData.titleResId);
        }

        @Override
        public int getItemViewType(int i) {
            if (this.items.get(i).type == 0) {
                return 1;
            }
            if (this.items.get(i).type == 1) {
                return 3;
            }
            if (this.items.get(i).type == 4) {
                return 4;
            }
            if (this.items.get(i).type == 2) {
                return 2;
            }
            if (this.items.get(i).type == 5) {
                return 5;
            }
            if (this.items.get(i).type == 6) {
                return 6;
            }
            return this.items.get(i).type + i;
        }

        public void updateItems() {
            this.items.clear();
            AnonymousClass1 anonymousClass1 = null;
            this.items.add(new Item(this, 0, anonymousClass1));
            if (SearchViewPager.this.communityId != 0) {
                return;
            }
            if (SearchViewPager.this.expandedPublicPosts) {
                this.items.add(new Item(this, 5, anonymousClass1));
            }
            this.items.add(new Item(this, 1, anonymousClass1));
            this.items.add(new Item(this, 4, anonymousClass1));
            this.items.add(new Item(this, 6, anonymousClass1));
            if (SearchViewPager.this.showOnlyDialogsAdapter) {
                return;
            }
            int i = 3;
            Item item = new Item(this, i, anonymousClass1);
            item.filterIndex = 0;
            this.items.add(item);
            int i2 = 2;
            if (SearchViewPager.this.includeDownloads()) {
                this.items.add(new Item(this, i2, anonymousClass1));
            }
            Item item2 = new Item(this, i, anonymousClass1);
            item2.filterIndex = 1;
            this.items.add(item2);
            Item item3 = new Item(this, i, anonymousClass1);
            item3.filterIndex = 2;
            this.items.add(item3);
            Item item4 = new Item(this, i, anonymousClass1);
            item4.filterIndex = 3;
            this.items.add(item4);
            Item item5 = new Item(this, i, anonymousClass1);
            item5.filterIndex = 4;
            this.items.add(item5);
        }
    }

    public SearchViewPager(Context context, final DialogsActivity dialogsActivity, int i, int i2, int i3, long j, ChatPreviewDelegate chatPreviewDelegate) {
        super(context);
        this.expandedPublicPosts = false;
        this.selectedFiles = new HashMap<>();
        this.currentSearchFilters = new ArrayList<>();
        this.currentAccount = UserConfig.selectedAccount;
        this.animateFromCount = 0;
        this.folderId = i3;
        this.communityId = j;
        this.parent = dialogsActivity;
        this.chatPreviewDelegate = chatPreviewDelegate;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setAddDuration(150L);
        this.itemAnimator.setMoveDuration(350L);
        this.itemAnimator.setChangeDuration(0L);
        this.itemAnimator.setRemoveDuration(0L);
        this.itemAnimator.setMoveInterpolator(new OvershootInterpolator(1.1f));
        this.itemAnimator.setTranslationInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.dialogsSearchAdapter = new AnonymousClass1(context, dialogsActivity, i, i2, this.itemAnimator, dialogsActivity.getAllowGlobalSearch(), null, dialogsActivity, context);
        int i4 = 1;
        if (i2 == 15) {
            ArrayList<TLRPC.Dialog> dialogsArray = dialogsActivity.getDialogsArray(this.currentAccount, i2, i3, true);
            ArrayList<Long> arrayList = new ArrayList<>();
            for (int iM = 0; iM < dialogsArray.size(); iM = MessagesController$$ExternalSyntheticOutline2.m(dialogsArray.get(iM).id, arrayList, iM, 1)) {
            }
            this.dialogsSearchAdapter.setFilterDialogIds(arrayList);
        }
        this.fragmentView = (SizeNotifierFrameLayout) dialogsActivity.getFragmentView();
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                SearchViewPager searchViewPager = SearchViewPager.this;
                if (searchViewPager.dialogsSearchAdapter != null && searchViewPager.itemAnimator != null && SearchViewPager.this.searchLayoutManager != null && SearchViewPager.this.dialogsSearchAdapter.showMoreAnimation) {
                    canvas.save();
                    invalidate();
                    int itemCount = SearchViewPager.this.dialogsSearchAdapter.getItemCount() - 1;
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        if (getChildAdapterPosition(childAt) == itemCount) {
                            canvas.clipRect(0.0f, 0.0f, getWidth(), childAt.getTranslationY() + childAt.getBottom());
                            break;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                SearchViewPager searchViewPager2 = SearchViewPager.this;
                if (searchViewPager2.dialogsSearchAdapter != null && searchViewPager2.itemAnimator != null && SearchViewPager.this.searchLayoutManager != null && SearchViewPager.this.dialogsSearchAdapter.showMoreAnimation) {
                    canvas.restore();
                }
                DialogsSearchAdapter dialogsSearchAdapter = SearchViewPager.this.dialogsSearchAdapter;
                if (dialogsSearchAdapter == null || dialogsSearchAdapter.showMoreHeader == null) {
                    return;
                }
                canvas.save();
                canvas.translate(SearchViewPager.this.dialogsSearchAdapter.showMoreHeader.getLeft(), SearchViewPager.this.dialogsSearchAdapter.showMoreHeader.getTranslationY() + SearchViewPager.this.dialogsSearchAdapter.showMoreHeader.getTop());
                SearchViewPager.this.dialogsSearchAdapter.showMoreHeader.draw(canvas);
                canvas.restore();
            }
        };
        this.searchListView = recyclerListView;
        recyclerListView.lambda$onCellEnter$52(this.itemAnimator);
        recyclerListView.setPivotY(0.0f);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setAdapter(this.dialogsSearchAdapter);
        recyclerListView.setVerticalScrollBarEnabled(true);
        recyclerListView.setInstantClick(true);
        recyclerListView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.searchLayoutManager = linearLayoutManager;
        recyclerListView.setLayoutManager(linearLayoutManager);
        recyclerListView.setAnimateEmptyView(true, 0);
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                if (i5 == 1) {
                    AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                DialogsSearchAdapter.DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate;
                int i7;
                int iFindFirstVisibleItemPosition = SearchViewPager.this.searchLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = SearchViewPager.this.searchLayoutManager.findLastVisibleItemPosition();
                int iAbs = Math.abs(SearchViewPager.this.searchLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                int itemCount = recyclerView.getAdapter().getItemCount();
                if (iAbs > 0 && !SearchViewPager.this.dialogsSearchAdapter.isMessagesSearchEndReached() && (iFindLastVisibleItemPosition == itemCount - 1 || ((dialogsSearchAdapterDelegate = SearchViewPager.this.dialogsSearchAdapter.delegate) != null && dialogsSearchAdapterDelegate.getSearchForumDialogId() != 0 && (i7 = SearchViewPager.this.dialogsSearchAdapter.localMessagesLoadingRow) >= 0 && iFindFirstVisibleItemPosition <= i7 && iFindLastVisibleItemPosition >= i7))) {
                    SearchViewPager.this.dialogsSearchAdapter.loadMoreSearchMessages();
                }
                SearchViewPager.this.onPageScrolled(i5, i6);
            }
        });
        recyclerListView.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        FilteredSearchView filteredSearchView = new FilteredSearchView(this.parent);
        this.noMediaFiltersSearchView = filteredSearchView;
        filteredSearchView.recyclerListView.setClipToPadding(false);
        this.noMediaFiltersSearchView.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                super.onScrolled(recyclerView, i5, i6);
                SearchViewPager.this.onPageScrolled(i5, i6);
            }
        });
        this.noMediaFiltersSearchView.recyclerListView.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        this.noMediaFiltersSearchView.setUiCallback(this);
        this.noMediaFiltersSearchView.setVisibility(8);
        this.noMediaFiltersSearchView.setChatPreviewDelegate(chatPreviewDelegate);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(1);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, i4) {
            @Override
            public void setVisibility(int i5) {
                if (SearchViewPager.this.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i5);
                }
            }
        };
        this.emptyView = stickerEmptyView;
        SpoilersTextView spoilersTextView = stickerEmptyView.title;
        int i5 = R.string.NoResult;
        spoilersTextView.setText(LocaleController.getString(i5));
        this.emptyView.subtitle.setVisibility(8);
        this.emptyView.setVisibility(8);
        this.emptyView.addView(flickerLoadingView, 0);
        this.emptyView.showProgress(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchContainer = frameLayout;
        frameLayout.addView(this.emptyView);
        this.searchContainer.addView(recyclerListView);
        this.searchContainer.addView(this.noMediaFiltersSearchView);
        recyclerListView.setEmptyView(this.emptyView);
        this.channelsSearchContainer = new FrameLayout(context);
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                SearchViewPager.this.invalidate();
            }
        };
        this.channelsItemAnimator = defaultItemAnimator2;
        defaultItemAnimator2.setSupportsChangeAnimations(false);
        this.channelsItemAnimator.setDelayAnimations(false);
        DefaultItemAnimator defaultItemAnimator3 = this.channelsItemAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator3.setInterpolator(cubicBezierInterpolator);
        this.channelsItemAnimator.setDurations(350L);
        RecyclerListView recyclerListView2 = new RecyclerListView(context);
        this.channelsSearchListView = recyclerListView2;
        recyclerListView2.lambda$onCellEnter$52(this.channelsItemAnimator);
        recyclerListView2.setPivotY(0.0f);
        recyclerListView2.setVerticalScrollBarEnabled(true);
        recyclerListView2.setInstantClick(true);
        recyclerListView2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1, false);
        this.channelsSearchLayoutManager = linearLayoutManager2;
        recyclerListView2.setLayoutManager(linearLayoutManager2);
        recyclerListView2.setAnimateEmptyView(true, 0);
        recyclerListView2.setClipToPadding(false);
        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(context);
        flickerLoadingView2.setViewType(1);
        StickerEmptyView stickerEmptyView2 = new StickerEmptyView(context, flickerLoadingView2, i4) {
            @Override
            public void setVisibility(int i6) {
                if (SearchViewPager.this.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i6);
                }
            }
        };
        this.channelsEmptyView = stickerEmptyView2;
        stickerEmptyView2.title.setText(LocaleController.getString(i5));
        this.channelsEmptyView.subtitle.setVisibility(8);
        this.channelsEmptyView.setVisibility(8);
        this.channelsEmptyView.addView(flickerLoadingView2, 0);
        this.channelsEmptyView.showProgress(true, false);
        this.channelsSearchContainer.addView(this.channelsEmptyView);
        this.channelsSearchContainer.addView(recyclerListView2);
        recyclerListView2.setEmptyView(this.channelsEmptyView);
        DialogsChannelsAdapter dialogsChannelsAdapter = new DialogsChannelsAdapter(recyclerListView2, context, this.currentAccount, i3, null) {
            @Override
            public void hideKeyboard() {
                AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
            }

            @Override
            public void update(boolean z) {
                ArrayList<MessageObject> arrayList2;
                ArrayList<TLRPC.Chat> arrayList3;
                ArrayList<TLRPC.Chat> arrayList4;
                ArrayList<TLRPC.Chat> arrayList5;
                super.update(z);
                SearchViewPager.this.channelsEmptyView.showProgress(this.loadingMessages || this.loadingChannels || (arrayList2 = this.messages) == null || !arrayList2.isEmpty() || (arrayList3 = this.searchMyChannels) == null || !arrayList3.isEmpty() || (arrayList4 = this.searchChannels) == null || !arrayList4.isEmpty() || (arrayList5 = this.searchRecommendedChannels) == null || !arrayList5.isEmpty(), z);
                if (!TextUtils.isEmpty(this.query)) {
                    SearchViewPager.this.channelsEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                    SearchViewPager.this.channelsEmptyView.subtitle.setVisibility(8);
                } else {
                    SearchViewPager.this.channelsEmptyView.title.setText(LocaleController.getString(R.string.NoChannelsTitle));
                    SearchViewPager.this.channelsEmptyView.subtitle.setVisibility(0);
                    SearchViewPager.this.channelsEmptyView.subtitle.setText(LocaleController.getString(R.string.NoChannelsMessage));
                }
            }
        };
        this.channelsSearchAdapter = dialogsChannelsAdapter;
        recyclerListView2.setAdapter(dialogsChannelsAdapter);
        recyclerListView2.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                if (i6 == 1) {
                    AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                SearchViewPager.this.channelsSearchAdapter.checkBottom();
                SearchViewPager.this.onPageScrolled(i6, i7);
            }
        });
        recyclerListView2.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        this.botsSearchContainer = new FrameLayout(context);
        DefaultItemAnimator defaultItemAnimator4 = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                SearchViewPager.this.invalidate();
            }
        };
        this.botsItemAnimator = defaultItemAnimator4;
        defaultItemAnimator4.setSupportsChangeAnimations(false);
        this.botsItemAnimator.setDelayAnimations(false);
        this.botsItemAnimator.setInterpolator(cubicBezierInterpolator);
        this.botsItemAnimator.setDurations(350L);
        RecyclerListView recyclerListView3 = new RecyclerListView(context);
        this.botsSearchListView = recyclerListView3;
        recyclerListView3.lambda$onCellEnter$52(this.botsItemAnimator);
        recyclerListView3.setPivotY(0.0f);
        recyclerListView3.setClipToPadding(false);
        recyclerListView3.setVerticalScrollBarEnabled(true);
        recyclerListView3.setInstantClick(true);
        recyclerListView3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(1, false);
        this.botsSearchLayoutManager = linearLayoutManager3;
        recyclerListView3.setLayoutManager(linearLayoutManager3);
        recyclerListView3.setAnimateEmptyView(true, 0);
        FlickerLoadingView flickerLoadingView3 = new FlickerLoadingView(context);
        flickerLoadingView3.setViewType(1);
        StickerEmptyView stickerEmptyView3 = new StickerEmptyView(context, flickerLoadingView3, i4) {
            @Override
            public void setVisibility(int i6) {
                if (SearchViewPager.this.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i6);
                }
            }
        };
        this.botsEmptyView = stickerEmptyView3;
        stickerEmptyView3.title.setText(LocaleController.getString(i5));
        this.botsEmptyView.subtitle.setVisibility(8);
        this.botsEmptyView.setVisibility(8);
        this.botsEmptyView.addView(flickerLoadingView3, 0);
        this.botsEmptyView.showProgress(true, false);
        this.botsSearchContainer.addView(this.botsEmptyView);
        this.botsSearchContainer.addView(recyclerListView3);
        recyclerListView3.setEmptyView(this.botsEmptyView);
        DialogsBotsAdapter dialogsBotsAdapter = new DialogsBotsAdapter(recyclerListView3, context, this.currentAccount, i3, false, null) {
            @Override
            public void hideKeyboard() {
                AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
            }

            @Override
            public void update(boolean z) {
                ArrayList<MessageObject> arrayList2;
                super.update(z);
                SearchViewPager.this.botsEmptyView.showProgress(this.loadingMessages || this.loadingBots || (arrayList2 = this.searchMessages) == null || !arrayList2.isEmpty(), z);
                SearchViewPager.this.botsEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                SearchViewPager.this.botsEmptyView.subtitle.setVisibility(8);
            }
        };
        this.botsSearchAdapter = dialogsBotsAdapter;
        recyclerListView3.setAdapter(dialogsBotsAdapter);
        recyclerListView3.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                if (i6 == 1) {
                    AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                SearchViewPager.this.botsSearchAdapter.checkBottom();
                SearchViewPager.this.onPageScrolled(i6, i7);
            }
        });
        recyclerListView3.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        this.hashtagSearchContainer = new FrameLayout(context);
        DefaultItemAnimator defaultItemAnimator5 = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                SearchViewPager.this.invalidate();
            }
        };
        this.hashtagItemAnimator = defaultItemAnimator5;
        defaultItemAnimator5.setSupportsChangeAnimations(false);
        this.hashtagItemAnimator.setDelayAnimations(false);
        this.hashtagItemAnimator.setInterpolator(cubicBezierInterpolator);
        this.hashtagItemAnimator.setDurations(350L);
        RecyclerListView recyclerListView4 = new RecyclerListView(context);
        this.hashtagSearchListView = recyclerListView4;
        recyclerListView4.lambda$onCellEnter$52(this.hashtagItemAnimator);
        recyclerListView4.setPivotY(0.0f);
        int i6 = 1;
        recyclerListView4.setVerticalScrollBarEnabled(true);
        recyclerListView4.setInstantClick(true);
        recyclerListView4.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(1, false);
        this.hashtagSearchLayoutManager = linearLayoutManager4;
        recyclerListView4.setLayoutManager(linearLayoutManager4);
        recyclerListView4.setAnimateEmptyView(true, 0);
        recyclerListView4.setClipToPadding(false);
        FlickerLoadingView flickerLoadingView4 = new FlickerLoadingView(context);
        flickerLoadingView4.setViewType(1);
        StickerEmptyView stickerEmptyView4 = new StickerEmptyView(context, flickerLoadingView4, i6) {
            @Override
            public void setVisibility(int i7) {
                if (SearchViewPager.this.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i7);
                }
            }
        };
        this.hashtagEmptyView = stickerEmptyView4;
        stickerEmptyView4.title.setText(LocaleController.getString(i5));
        this.hashtagEmptyView.subtitle.setVisibility(8);
        this.hashtagEmptyView.setVisibility(8);
        this.hashtagEmptyView.addView(flickerLoadingView4, 0);
        this.hashtagEmptyView.showProgress(true, false);
        this.hashtagSearchContainer.addView(this.hashtagEmptyView);
        this.hashtagSearchContainer.addView(recyclerListView4);
        recyclerListView4.setEmptyView(this.hashtagEmptyView);
        HashtagsSearchAdapter hashtagsSearchAdapter = new HashtagsSearchAdapter(recyclerListView4, context, this.currentAccount, i3, null) {
            @Override
            public void scrollToTop(boolean z) {
                if (z && SearchViewPager.this.hashtagSearchListView.canScrollVertically(-1)) {
                    return;
                }
                SearchViewPager.this.hashtagSearchLayoutManager.scrollToPositionWithOffset(0, 0);
            }

            @Override
            public void update(boolean z) {
                super.update(z);
                SearchViewPager.this.hashtagEmptyView.showProgress(false, z);
                SearchViewPager.this.hashtagEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                SearchViewPager.this.hashtagEmptyView.subtitle.setVisibility(8);
            }
        };
        this.hashtagSearchAdapter = hashtagsSearchAdapter;
        recyclerListView4.setAdapter(hashtagsSearchAdapter);
        recyclerListView4.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 == 1) {
                    AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                SearchViewPager.this.hashtagSearchAdapter.checkBottom();
                SearchViewPager.this.onPageScrolled(i7, i8);
            }
        });
        recyclerListView4.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        this.itemsEnterAnimator = new RecyclerItemsEnterAnimator(recyclerListView, true);
        this.postsAreNew = false;
        PostsSearchContainer postsSearchContainer = new PostsSearchContainer(context, dialogsActivity);
        this.postsSearchContainer = postsSearchContainer;
        postsSearchContainer.listView.setClipToPadding(false);
        postsSearchContainer.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                super.onScrolled(recyclerView, i7, i8);
                SearchViewPager.this.onPageScrolled(i7, i8);
            }
        });
        postsSearchContainer.listView.addEdgeEffectListener(new Tooltip$$ExternalSyntheticLambda0(this, 10));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter();
        this.viewPagerAdapter = viewPagerAdapter;
        setAdapter(viewPagerAdapter);
    }

    public static BaseFragment createFragmentFromMessage(int i, MessageObject messageObject) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        return new ChatActivity(bundle);
    }

    private RecyclerListView getRecyclerViewFromPage(View view) {
        if (view == null) {
            return null;
        }
        if (view == this.searchContainer) {
            return this.searchListView;
        }
        if (view == this.channelsSearchContainer) {
            return this.channelsSearchListView;
        }
        if (view == this.botsSearchContainer) {
            return this.botsSearchListView;
        }
        if (view == this.hashtagSearchContainer) {
            return this.hashtagSearchListView;
        }
        SearchDownloadsContainer searchDownloadsContainer = this.downloadsContainer;
        if (view == searchDownloadsContainer) {
            return searchDownloadsContainer.recyclerListView;
        }
        PostsSearchContainer postsSearchContainer = this.postsSearchContainer;
        if (view == postsSearchContainer) {
            return postsSearchContainer.listView;
        }
        if (view instanceof FilteredSearchView) {
            return ((FilteredSearchView) view).recyclerListView;
        }
        return null;
    }

    private boolean isSpeedItemVisible() {
        if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.selectedFiles.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public void lambda$getThemeDescriptions$5() {
        NumberTextView numberTextView = this.selectedMessagesCountTextView;
        if (numberTextView != null) {
            numberTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false));
        }
    }

    public void lambda$onActionBarItemClick$3(ArrayList arrayList, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        this.parent.getDownloadController().deleteRecentFiles(arrayList);
        hideActionMode();
    }

    public boolean lambda$onActionBarItemClick$4(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        long j;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        Iterator<FilteredSearchView.MessageHashId> it = this.selectedFiles.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(this.selectedFiles.get(it.next()));
        }
        this.selectedFiles.clear();
        showActionMode(false);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(this.currentAccount).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(i3)).dialogId;
                if (charSequence != null) {
                    j = j2;
                    AccountInstance.getInstance(this.currentAccount).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j = j2;
                }
                AccountInstance.getInstance(this.currentAccount).getSendMessagesHelper().sendMessage(arrayList2, j, false, false, true, 0, 0L);
            }
            dialogsActivity.finishFragment();
        } else {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j3)) {
                bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
            } else {
                if (DialogObject.isUserDialog(j3)) {
                    bundleM.putLong("user_id", j3);
                } else {
                    bundleM.putLong("chat_id", -j3);
                }
                if (!AccountInstance.getInstance(this.currentAccount).getMessagesController().checkCanOpenChat(bundleM, dialogsActivity)) {
                    return true;
                }
            }
            ChatActivity chatActivity = new ChatActivity(bundleM);
            dialogsActivity.presentFragment(chatActivity, true);
            chatActivity.showFieldPanelForForward(true, arrayList2);
        }
        return true;
    }

    public void lambda$showActionMode$0(View view) {
        hideActionMode();
    }

    public static boolean lambda$showActionMode$1(View view, MotionEvent motionEvent) {
        return true;
    }

    public void search(View view, int i, String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.emptyView.subtitle.setVisibility(8);
        } else {
            this.emptyView.subtitle.setVisibility(0);
            this.emptyView.subtitle.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        DialogsSearchAdapter.DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate = this.dialogsSearchAdapter.delegate;
        long searchForumDialogId = dialogsSearchAdapterDelegate != null ? dialogsSearchAdapterDelegate.getSearchForumDialogId() : 0L;
        long j = i == 0 ? 0L : searchForumDialogId;
        boolean z3 = false;
        long j2 = 0;
        long j3 = 0;
        for (int i2 = 0; i2 < this.currentSearchFilters.size(); i2++) {
            FiltersView.MediaFilterData mediaFilterData = this.currentSearchFilters.get(i2);
            int i3 = mediaFilterData.filterType;
            if (i3 == 4) {
                TLObject tLObject = mediaFilterData.chat;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j = -((TLRPC.Chat) mediaFilterData.chat).id;
                }
            } else if (i3 == 6) {
                FiltersView.DateData dateData = mediaFilterData.dateData;
                long j4 = dateData.minDate;
                j3 = dateData.maxDate;
                j2 = j4;
            } else if (i3 == 7) {
                z3 = true;
            }
        }
        if (this.hashtagSearchAdapter.getHashtag(str) == null) {
            collapsePublicPosts();
        }
        if (view == this.channelsSearchContainer) {
            MessagesController.getInstance(this.currentAccount).getChannelRecommendations(0L);
            this.channelsSearchAdapter.search(str);
            this.channelsEmptyView.setKeyboardHeight(this.keyboardSize, false);
            return;
        }
        if (view == this.botsSearchContainer) {
            this.botsSearchAdapter.search(str);
            this.botsEmptyView.setKeyboardHeight(this.keyboardSize, false);
            if (TextUtils.isEmpty(str)) {
                this.botsSearchAdapter.checkBottom();
                return;
            }
            return;
        }
        PostsSearchContainer postsSearchContainer = this.postsSearchContainer;
        if (view == postsSearchContainer) {
            postsSearchContainer.search(str);
            return;
        }
        if (view == this.hashtagSearchContainer) {
            if (this.hashtagSearchAdapter.getHashtag(str) == null) {
                return;
            }
            if (z) {
                this.hashtagSearchLayoutManager.scrollToPositionWithOffset(0, 0);
            }
            this.hashtagSearchAdapter.search(str);
            this.hashtagEmptyView.setKeyboardHeight(this.keyboardSize, false);
            return;
        }
        if (view != this.searchContainer) {
            long j5 = searchForumDialogId;
            long j6 = j2;
            if (view instanceof FilteredSearchView) {
                FilteredSearchView filteredSearchView = (FilteredSearchView) view;
                filteredSearchView.setUseFromUserAsAvatar(j5 != 0);
                filteredSearchView.setKeyboardHeight(this.keyboardSize, false);
                filteredSearchView.search(j, this.communityId, j6, j3, FiltersView.filters[this.viewPagerAdapter.items.get(i).filterIndex], z3, str, z);
                return;
            }
            if (view instanceof SearchDownloadsContainer) {
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) view;
                searchDownloadsContainer.setKeyboardHeight(this.keyboardSize, false);
                searchDownloadsContainer.search(str);
                return;
            }
            return;
        }
        if (!(j == 0 && this.communityId == 0 && j2 == 0 && j3 == 0) && searchForumDialogId == 0) {
            boolean z4 = true;
            this.noMediaFiltersSearchView.setTag(1);
            this.noMediaFiltersSearchView.setDelegate(this.filteredSearchViewDelegate, false);
            this.noMediaFiltersSearchView.animate().setListener(null).cancel();
            if (z) {
                this.noMediaFiltersSearchView.setVisibility(0);
                this.noMediaFiltersSearchView.setAlpha(1.0f);
                z2 = z;
            } else {
                if (this.noMediaFiltersSearchView.getVisibility() != 0) {
                    this.noMediaFiltersSearchView.setVisibility(0);
                    this.noMediaFiltersSearchView.setAlpha(0.0f);
                } else {
                    z4 = z;
                }
                this.noMediaFiltersSearchView.animate().alpha(1.0f).setDuration(150L).start();
                z2 = z4;
            }
            this.noMediaFiltersSearchView.search(j, this.communityId, j2, j3, null, z3, str, z2);
            this.emptyView.setVisibility(8);
        } else {
            this.lastSearchScrolledToTop = false;
            this.dialogsSearchAdapter.searchDialogs(str, z3 ? 1 : 0, true);
            this.dialogsSearchAdapter.setFiltersDelegate(this.filteredSearchViewDelegate, false);
            this.noMediaFiltersSearchView.animate().setListener(null).cancel();
            this.noMediaFiltersSearchView.setDelegate(null, false);
            if (z) {
                this.emptyView.showProgress(!this.dialogsSearchAdapter.isSearching(), false);
                this.emptyView.showProgress(this.dialogsSearchAdapter.isSearching(), false);
            } else if (!this.dialogsSearchAdapter.hasRecentSearch()) {
                this.emptyView.showProgress(this.dialogsSearchAdapter.isSearching(), true);
            }
            if (z) {
                this.noMediaFiltersSearchView.setVisibility(8);
            } else if (this.noMediaFiltersSearchView.getVisibility() != 8) {
                this.noMediaFiltersSearchView.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SearchViewPager.this.noMediaFiltersSearchView.setVisibility(8);
                    }
                }).setDuration(150L).start();
            }
            this.noMediaFiltersSearchView.setTag(null);
        }
        this.emptyView.setKeyboardHeight(this.keyboardSize, false);
        this.noMediaFiltersSearchView.setKeyboardHeight(this.keyboardSize, false);
    }

    private static void setPagesPaddings(ViewGroup viewGroup, RecyclerListView recyclerListView, int i, int i2, boolean z) {
        viewGroup.setClipToPadding(false);
        viewGroup.setPadding(0, i, 0, i2);
        recyclerListView.setPadding(0, i, 0, i2, z);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerListView.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
    }

    private void showActionMode(boolean z) {
        DialogsSearchAdapter.DialogsSearchAdapterDelegate dialogsSearchAdapterDelegate;
        if (this.isActionModeShowed == z) {
            return;
        }
        if (z && this.parent.getActionBar().isActionModeShowed()) {
            return;
        }
        if (z && !this.parent.getActionBar().actionModeIsExist("search_view_pager")) {
            this.actionMode = this.parent.getActionBar().createActionMode(true, "search_view_pager");
            if (this.parent.hasMainTabs) {
                ImageView imageView = new ImageView(getContext());
                this.actionModeCloseView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
                this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false), PorterDuff.Mode.MULTIPLY));
                this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), 1, -1));
                this.actionModeCloseView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 13));
                this.actionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.actionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.selectedMessagesCountTextView;
            int i = Theme.key_actionBarActionModeDefaultIcon;
            numberTextView2.setTextColor(Theme.getColor(null, i, false));
            this.actionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.parent.hasMainTabs ? 18 : 72, 0, 0, 0));
            this.selectedMessagesCountTextView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(27));
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = this.actionMode.addItemWithWidth(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.speedItem = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.getIconView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
            this.gotoItem = this.actionMode.addItemWithWidth(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.forwardItem = this.actionMode.addItemWithWidth(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.deleteItem = this.actionMode.addItemWithWidth(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.selectedMessagesCountTextView != null) {
            DialogsSearchAdapter dialogsSearchAdapter = this.dialogsSearchAdapter;
            ((ViewGroup.MarginLayoutParams) this.selectedMessagesCountTextView.getLayoutParams()).leftMargin = AndroidUtilities.dp((this.parent.hasMainTabs ? 18 : 72) + (dialogsSearchAdapter != null && (dialogsSearchAdapterDelegate = dialogsSearchAdapter.delegate) != null && (dialogsSearchAdapterDelegate.getSearchForumDialogId() > 0L ? 1 : (dialogsSearchAdapterDelegate.getSearchForumDialogId() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.selectedMessagesCountTextView;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (this.parent.getActionBar().getBackButton() != null && (this.parent.getActionBar().getBackButton().getDrawable() instanceof MenuDrawable)) {
            BackDrawable backDrawable = new BackDrawable(false);
            this.parent.getActionBar().setBackButtonDrawable(backDrawable);
            backDrawable.paint.setColorFilter(null);
        }
        this.isActionModeShowed = z;
        if (z) {
            AndroidUtilities.hideKeyboard(this.parent.getParentActivity().getCurrentFocus());
            this.parent.getActionBar().showActionMode();
            this.selectedMessagesCountTextView.setNumber(this.selectedFiles.size(), false);
            this.speedItem.setVisibility(isSpeedItemVisible() ? 0 : 8);
            this.gotoItem.setVisibility(0);
            this.forwardItem.setVisibility(0);
            this.deleteItem.setVisibility(0);
            return;
        }
        this.parent.getActionBar().hideActionMode();
        this.selectedFiles.clear();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof FilteredSearchView) {
                ((FilteredSearchView) getChildAt(i2)).update();
            }
            if (getChildAt(i2) instanceof SearchDownloadsContainer) {
                ((SearchDownloadsContainer) getChildAt(i2)).update(true);
            }
        }
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (filteredSearchView != null) {
            filteredSearchView.update();
        }
        int size = this.viewsByType.size();
        for (int i3 = 0; i3 < size; i3++) {
            View viewValueAt = this.viewsByType.valueAt(i3);
            if (viewValueAt instanceof FilteredSearchView) {
                ((FilteredSearchView) viewValueAt).update();
            }
        }
    }

    @Override
    public boolean actionModeShowing() {
        return this.isActionModeShowed;
    }

    public boolean addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        if (!this.currentSearchFilters.isEmpty()) {
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                FiltersView.MediaFilterData mediaFilterData2 = this.currentSearchFilters.get(i);
                if (mediaFilterData.filterType == mediaFilterData2.filterType || (mediaFilterData.isMedia() && mediaFilterData2.isMedia())) {
                    return false;
                }
            }
        }
        this.currentSearchFilters.add(mediaFilterData);
        return true;
    }

    public void cancelEnterAnimation() {
        this.itemsEnterAnimator.cancel();
        this.searchListView.invalidate();
        this.animateFromCount = 0;
    }

    @Override
    public void capture(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            RecyclerListView recyclerViewFromPage = getRecyclerViewFromPage(view);
            if (recyclerViewFromPage != null) {
                Blur3Utils.captureRelativeParent(recyclerViewFromPage, canvas, rectF, recyclerViewFromPage, this, 255);
            }
            if (view == this.searchContainer && this.noMediaFiltersSearchView.getVisibility() == 0) {
                RecyclerListView recyclerListView = this.noMediaFiltersSearchView.recyclerListView;
                Blur3Utils.captureRelativeParent(recyclerListView, canvas, rectF, recyclerListView, this, 255);
            }
        }
    }

    @Override
    public void captureCalculateHash(IBlur3Hash iBlur3Hash, RectF rectF) {
        ((Blur3HashImpl) iBlur3Hash).unsupported = true;
    }

    public void clear() {
        this.currentSearchFilters.clear();
        collapsePublicPosts();
    }

    public void collapsePublicPosts() {
        if (this.expandedPublicPosts) {
            this.expandedPublicPosts = false;
            updateTabs();
            ViewPagerFixed.TabsView tabsView = this.tabsView;
            if (tabsView != null && tabsView.getCurrentTabId() != 0) {
                this.tabsView.scrollToTab(0, 0);
            }
            DialogsSearchAdapter dialogsSearchAdapter = this.dialogsSearchAdapter;
            if (dialogsSearchAdapter != null) {
                dialogsSearchAdapter.searchDialogs(this.lastSearchString, includeFolder() ? 1 : 0, true);
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.channelRecommendationsLoaded) {
            this.channelsEmptyView.showProgress(MessagesController.getInstance(this.currentAccount).getChannelRecommendations(0L) != null, true);
            this.channelsSearchAdapter.updateMyChannels();
            this.channelsSearchAdapter.update(true);
            return;
        }
        if (i == NotificationCenter.dialogDeleted || i == NotificationCenter.dialogsNeedReload) {
            this.channelsSearchAdapter.updateMyChannels();
            this.channelsSearchAdapter.update(true);
        } else {
            if (i == NotificationCenter.reloadWebappsHints) {
                this.botsSearchAdapter.update(true);
                return;
            }
            if (i == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                HashtagsSearchAdapter hashtagsSearchAdapter = this.hashtagSearchAdapter;
                if (obj == hashtagsSearchAdapter.list) {
                    hashtagsSearchAdapter.update(true);
                }
            }
        }
    }

    public ActionBarMenu getActionMode() {
        return this.actionMode;
    }

    public ArrayList<FiltersView.MediaFilterData> getCurrentSearchFilters() {
        return this.currentSearchFilters;
    }

    public long getDialogId(String str) {
        return 0L;
    }

    public SearchDownloadsContainer getDownloadsContainer() {
        return this.downloadsContainer;
    }

    @Override
    public int getFolderId() {
        return this.folderId;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public int getPositionForType(int i) {
        for (int i2 = 0; i2 < this.viewPagerAdapter.items.size(); i2++) {
            if (this.viewPagerAdapter.items.get(i2).type == 3 && this.viewPagerAdapter.items.get(i2).filterIndex == i) {
                return i2;
            }
        }
        return -1;
    }

    public ActionBarMenuItem getSpeedItem() {
        return this.speedItem;
    }

    public ViewPagerFixed.TabsView getTabsView() {
        return this.tabsView;
    }

    public void getThemeDescriptions(ArrayList<ThemeDescription> arrayList) {
        for (int i = 0; i < this.searchListView.getChildCount(); i++) {
            View childAt = this.searchListView.getChildAt(i);
            if ((childAt instanceof ProfileSearchCell) || (childAt instanceof DialogCell) || (childAt instanceof HashtagSearchCell)) {
                arrayList.add(new ThemeDescription(childAt, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            }
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof FilteredSearchView) {
                arrayList.addAll(((FilteredSearchView) getChildAt(i2)).getThemeDescriptions());
            }
        }
        int size = this.viewsByType.size();
        for (int i3 = 0; i3 < size; i3++) {
            View viewValueAt = this.viewsByType.valueAt(i3);
            if (viewValueAt instanceof FilteredSearchView) {
                arrayList.addAll(((FilteredSearchView) viewValueAt).getThemeDescriptions());
            }
        }
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (filteredSearchView != null) {
            arrayList.addAll(filteredSearchView.getThemeDescriptions());
        }
        arrayList.add(new ThemeDescription(this.emptyView.title, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.addAll(SimpleThemeDescription.createThemeDescriptions(new ColorPicker$$ExternalSyntheticLambda7(this, 7), Theme.key_actionBarActionModeDefaultIcon));
    }

    @Override
    public void goToMessage(MessageObject messageObject) {
        this.parent.presentFragment(createFragmentFromMessage(this.currentAccount, messageObject));
        showActionMode(false);
    }

    public void hideActionMode() {
        showActionMode(false);
    }

    public boolean includeDownloads() {
        return true;
    }

    public boolean includeFolder() {
        for (int i = 0; i < this.currentSearchFilters.size(); i++) {
            if (this.currentSearchFilters.get(i).filterType == 7) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void invalidateBlur() {
        this.fragmentView.invalidateBlur();
    }

    public boolean isDownloadsTab(int i) {
        ViewPagerAdapter viewPagerAdapter = this.viewPagerAdapter;
        return viewPagerAdapter != null && viewPagerAdapter.getItemViewType(i) == 2;
    }

    @Override
    public boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
        return this.selectedFiles.containsKey(messageHashId);
    }

    public void messagesDeleted(long j, ArrayList<Integer> arrayList) {
        int i;
        int size = this.viewsByType.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewValueAt = this.viewsByType.valueAt(i2);
            if (viewValueAt instanceof FilteredSearchView) {
                ((FilteredSearchView) viewValueAt).messagesDeleted(j, arrayList);
            }
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof FilteredSearchView) {
                ((FilteredSearchView) getChildAt(i3)).messagesDeleted(j, arrayList);
            }
        }
        this.noMediaFiltersSearchView.messagesDeleted(j, arrayList);
        if (this.selectedFiles.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.selectedFiles.keySet());
        ArrayList arrayList3 = null;
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            FilteredSearchView.MessageHashId messageHashId = (FilteredSearchView.MessageHashId) arrayList2.get(i4);
            MessageObject messageObject = this.selectedFiles.get(messageHashId);
            if (messageObject != null) {
                long dialogId = messageObject.getDialogId();
                if (dialogId < 0) {
                    i = (int) (-dialogId);
                    if (!ChatObject.isChannel(i, this.currentAccount)) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
                if (i == j) {
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        if (messageObject.getId() == arrayList.get(i5).intValue()) {
                            arrayList3 = new ArrayList();
                            arrayList3.add(messageHashId);
                        }
                    }
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                this.selectedFiles.remove(arrayList3.get(i6));
            }
            this.selectedMessagesCountTextView.setNumber(this.selectedFiles.size(), true);
            ActionBarMenuItem actionBarMenuItem = this.gotoItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(this.selectedFiles.size() != 1 ? 8 : 0);
            }
        }
    }

    public void onActionBarItemClick(int i) {
        if (i != 202) {
            if (i == 203) {
                if (isSpeedItemVisible()) {
                    this.parent.showDialog(new PremiumFeatureBottomSheet((BaseFragment) this.parent, 2, true));
                    return;
                }
                return;
            } else if (i == 200) {
                if (this.selectedFiles.size() != 1) {
                    return;
                }
                goToMessage(this.selectedFiles.values().iterator().next());
                return;
            } else {
                if (i == 201) {
                    DialogsActivity dialogsActivity = new DialogsActivity(TelegramMediaSession$$ExternalSyntheticOutline0.m("onlySelect", "dialogsType", 3, true));
                    dialogsActivity.setDelegate(new EmojiView$$ExternalSyntheticLambda11(this, 5));
                    this.parent.presentFragment(dialogsActivity);
                    return;
                }
                return;
            }
        }
        DialogsActivity dialogsActivity2 = this.parent;
        if (dialogsActivity2 == null || dialogsActivity2.getParentActivity() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.selectedFiles.values());
        AlertDialog.Builder builder = new AlertDialog.Builder(this.parent.getParentActivity(), 0, null);
        builder.setTitle(LocaleController.formatPluralString("RemoveDocumentsTitle", this.selectedFiles.size(), new Object[0]));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("RemoveDocumentsMessage", this.selectedFiles.size(), new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.RemoveDocumentsAlertMessage));
        builder.setMessage(spannableStringBuilder);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new EmojiView$$ExternalSyntheticLambda30(29));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AIEditorAlert$$ExternalSyntheticLambda34(29, this, arrayList));
        TextView textView = (TextView) builder.show().getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        this.attached = true;
        DialogsChannelsAdapter dialogsChannelsAdapter = this.channelsSearchAdapter;
        if (dialogsChannelsAdapter != null) {
            dialogsChannelsAdapter.update(false);
        }
        DialogsBotsAdapter dialogsBotsAdapter = this.botsSearchAdapter;
        if (dialogsBotsAdapter != null) {
            dialogsBotsAdapter.update(false);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public void onItemSelected(View view, View view2, int i, int i2) {
        if (i == 0) {
            if (this.noMediaFiltersSearchView.getVisibility() == 0) {
                this.noMediaFiltersSearchView.setDelegate(this.filteredSearchViewDelegate, false);
                this.dialogsSearchAdapter.setFiltersDelegate(null, false);
            } else {
                this.noMediaFiltersSearchView.setDelegate(null, false);
                this.dialogsSearchAdapter.setFiltersDelegate(this.filteredSearchViewDelegate, true);
            }
        } else if (view instanceof FilteredSearchView) {
            ((FilteredSearchView) view).setDelegate(this.filteredSearchViewDelegate, i2 == 0 && this.noMediaFiltersSearchView.getVisibility() != 0);
        }
        if (view2 instanceof FilteredSearchView) {
            ((FilteredSearchView) view2).setDelegate(null, false);
        } else {
            this.dialogsSearchAdapter.setFiltersDelegate(null, false);
            this.noMediaFiltersSearchView.setDelegate(null, false);
        }
    }

    public void onPageScrolled(int i, int i2) {
    }

    public void onResume() {
        DialogsSearchAdapter dialogsSearchAdapter = this.dialogsSearchAdapter;
        if (dialogsSearchAdapter != null) {
            dialogsSearchAdapter.notifyDataSetChanged();
        }
    }

    public void onShown() {
        DialogsSearchAdapter dialogsSearchAdapter = this.dialogsSearchAdapter;
        if (dialogsSearchAdapter != null) {
            dialogsSearchAdapter.resetFilter();
        }
    }

    public void onTextChanged(String str) {
        View currentView = getCurrentView();
        boolean z = TextUtils.isEmpty(this.lastSearchString) ? true : !this.attached;
        this.lastSearchString = str;
        search(currentView, getCurrentPosition(), str, z);
    }

    public void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        this.currentSearchFilters.remove(mediaFilterData);
    }

    public void reset() {
        setPosition(0);
        if (this.dialogsSearchAdapter.getItemCount() > 0) {
            this.searchLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        LinearLayoutManager linearLayoutManager = this.channelsSearchLayoutManager;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        LinearLayoutManager linearLayoutManager2 = this.botsSearchLayoutManager;
        if (linearLayoutManager2 != null) {
            linearLayoutManager2.scrollToPositionWithOffset(0, 0);
        }
        LinearLayoutManager linearLayoutManager3 = this.hashtagSearchLayoutManager;
        if (linearLayoutManager3 != null) {
            linearLayoutManager3.scrollToPositionWithOffset(0, 0);
        }
        this.viewsByType.clear();
    }

    public void runResultsEnterAnimation() {
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.itemsEnterAnimator;
        int i = this.animateFromCount;
        recyclerItemsEnterAnimator.showItemsAnimated(i > 0 ? i + 1 : 0);
        this.animateFromCount = this.dialogsSearchAdapter.getItemCount();
    }

    public void setBlurredBackgroundDrawableFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
    }

    public void setFilteredSearchViewDelegate(FilteredSearchView.Delegate delegate) {
        this.filteredSearchViewDelegate = delegate;
    }

    public void setKeyboardHeight(int i) {
        this.keyboardSize = i;
        boolean z = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof FilteredSearchView) {
                ((FilteredSearchView) getChildAt(i2)).setKeyboardHeight(i, z);
            } else if (getChildAt(i2) == this.searchContainer) {
                this.emptyView.setKeyboardHeight(i, z);
                this.noMediaFiltersSearchView.setKeyboardHeight(i, z);
            } else if (getChildAt(i2) instanceof SearchDownloadsContainer) {
                ((SearchDownloadsContainer) getChildAt(i2)).setKeyboardHeight(i, z);
            } else if (getChildAt(i2) == this.channelsSearchContainer) {
                this.channelsEmptyView.setKeyboardHeight(i, z);
            }
        }
    }

    public void setPagesPadding(int i, int i2, boolean z) {
        this.pagesPaddingTop = i;
        this.pagesPaddingBottom = i2;
        this.searchListView.setPadding(0, i, 0, i2, z);
        this.noMediaFiltersSearchView.setPagesPaddings(this.pagesPaddingTop, this.pagesPaddingBottom, z);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.emptyView.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        int i4 = this.pagesPaddingTop;
        if (i3 != i4 || marginLayoutParams.bottomMargin != this.pagesPaddingBottom) {
            marginLayoutParams.topMargin = i4;
            marginLayoutParams.bottomMargin = this.pagesPaddingBottom;
            this.emptyView.requestLayout();
        }
        setPagesPaddings(this.channelsSearchContainer, this.channelsSearchListView, this.pagesPaddingTop, this.pagesPaddingBottom, z);
        setPagesPaddings(this.botsSearchContainer, this.botsSearchListView, this.pagesPaddingTop, this.pagesPaddingBottom, z);
        setPagesPaddings(this.hashtagSearchContainer, this.hashtagSearchListView, this.pagesPaddingTop, this.pagesPaddingBottom, z);
        this.postsSearchContainer.setPagesPaddings(this.pagesPaddingTop, this.pagesPaddingBottom, z);
        SearchDownloadsContainer searchDownloadsContainer = this.downloadsContainer;
        if (searchDownloadsContainer != null) {
            searchDownloadsContainer.setPagesPaddings(this.pagesPaddingTop, this.pagesPaddingBottom, z);
        }
        int size = this.viewsByType.size();
        for (int i5 = 0; i5 < size; i5++) {
            View viewValueAt = this.viewsByType.valueAt(i5);
            if (viewValueAt instanceof FilteredSearchView) {
                ((FilteredSearchView) viewValueAt).setPagesPaddings(this.pagesPaddingTop, this.pagesPaddingBottom, z);
            }
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) instanceof FilteredSearchView) {
                ((FilteredSearchView) getChildAt(i6)).setPagesPaddings(this.pagesPaddingTop, this.pagesPaddingBottom, z);
            }
        }
    }

    @Override
    public void setPosition(int i) {
        if (i < 0) {
            return;
        }
        super.setPosition(i);
        this.viewsByType.clear();
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            tabsView.selectTabWithId(i, 1.0f);
        }
        invalidate();
    }

    public void showDownloads() {
        setPosition((this.expandedPublicPosts ? 1 : 0) + 5);
    }

    public void showOnlyDialogsAdapter(boolean z) {
        this.showOnlyDialogsAdapter = z;
    }

    @Override
    public void toggleItemSelection(MessageObject messageObject, View view, int i) {
        boolean z;
        FilteredSearchView.MessageHashId messageHashId = new FilteredSearchView.MessageHashId(messageObject.getId(), messageObject.getDialogId());
        if (this.selectedFiles.containsKey(messageHashId)) {
            this.selectedFiles.remove(messageHashId);
        } else if (this.selectedFiles.size() >= 100) {
            return;
        } else {
            this.selectedFiles.put(messageHashId, messageObject);
        }
        if (this.selectedFiles.size() == 0) {
            showActionMode(false);
        } else {
            this.selectedMessagesCountTextView.setNumber(this.selectedFiles.size(), true);
            ActionBarMenuItem actionBarMenuItem = this.gotoItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(this.selectedFiles.size() == 1 ? 0 : 8);
            }
            if (this.speedItem != null) {
                boolean zIsSpeedItemVisible = isSpeedItemVisible();
                int i2 = zIsSpeedItemVisible ? 0 : 8;
                if (this.speedItem.getVisibility() != i2) {
                    this.speedItem.setVisibility(i2);
                    int i3 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.speedItem.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false), PorterDuff.Mode.SRC_IN));
                    if (zIsSpeedItemVisible) {
                        animatedVectorDrawable.start();
                    } else if (i3 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.deleteItem != null) {
                Iterator<FilteredSearchView.MessageHashId> it = this.selectedFiles.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else {
                        if (!this.selectedFiles.get(it.next()).isDownloadingFile) {
                            z = false;
                            break;
                        }
                    }
                }
                this.deleteItem.setVisibility(z ? 0 : 8);
            }
        }
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(this.selectedFiles.containsKey(messageHashId), true);
            return;
        }
        if (view instanceof SharedPhotoVideoCell) {
            ((SharedPhotoVideoCell) view).photoVideoViews[i].setChecked(this.selectedFiles.containsKey(messageHashId));
            return;
        }
        if (view instanceof SharedLinkCell) {
            ((SharedLinkCell) view).setChecked(this.selectedFiles.containsKey(messageHashId), true);
            return;
        }
        if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).setChecked(this.selectedFiles.containsKey(messageHashId), true);
        } else if (view instanceof ContextLinkCell) {
            ((ContextLinkCell) view).setChecked(this.selectedFiles.containsKey(messageHashId), true);
        } else if (view instanceof DialogCell) {
            ((DialogCell) view).setChecked(this.selectedFiles.containsKey(messageHashId), true);
        }
    }

    public void updateColors() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof FilteredSearchView) {
                RecyclerListView recyclerListView = ((FilteredSearchView) getChildAt(i)).recyclerListView;
                int childCount = recyclerListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerListView.getChildAt(i2);
                    if (childAt instanceof DialogCell) {
                        ((DialogCell) childAt).update(0);
                    }
                }
            }
        }
        int size = this.viewsByType.size();
        for (int i3 = 0; i3 < size; i3++) {
            View viewValueAt = this.viewsByType.valueAt(i3);
            if (viewValueAt instanceof FilteredSearchView) {
                RecyclerListView recyclerListView2 = ((FilteredSearchView) viewValueAt).recyclerListView;
                int childCount2 = recyclerListView2.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = recyclerListView2.getChildAt(i4);
                    if (childAt2 instanceof DialogCell) {
                        ((DialogCell) childAt2).update(0);
                    }
                }
            }
        }
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (filteredSearchView != null) {
            RecyclerListView recyclerListView3 = filteredSearchView.recyclerListView;
            int childCount3 = recyclerListView3.getChildCount();
            for (int i5 = 0; i5 < childCount3; i5++) {
                View childAt3 = recyclerListView3.getChildAt(i5);
                if (childAt3 instanceof DialogCell) {
                    ((DialogCell) childAt3).update(0);
                }
            }
        }
        PostsSearchContainer postsSearchContainer = this.postsSearchContainer;
        if (postsSearchContainer != null) {
            postsSearchContainer.updateColors();
        }
    }

    public void updateTabs() {
        updateTabs(false);
    }

    public void updateTabs(boolean z) {
        this.viewPagerAdapter.updateItems();
        fillTabs(z);
        ViewPagerFixed.TabsView tabsView = this.tabsView;
        if (tabsView != null) {
            tabsView.finishAddingTabs();
        }
    }

    @Override
    public void showActionMode() {
        showActionMode(true);
    }
}
