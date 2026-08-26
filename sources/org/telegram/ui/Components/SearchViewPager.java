package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.PhotoViewer;

public abstract class SearchViewPager extends ViewPagerFixed implements FilteredSearchView.UiCallback, NotificationCenter.NotificationCenterDelegate, IBlur3Capture {
    public static final int $r8$clinit = 0;
    public ActionBar.AnonymousClass1 actionMode;
    public ImageView actionModeCloseView;
    public int animateFromCount;
    public boolean attached;
    public BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    public final AnonymousClass11 botsEmptyView;
    public final AnonymousClass12 botsSearchAdapter;
    public final FrameLayout botsSearchContainer;
    public final LinearLayoutManager botsSearchLayoutManager;
    public final RecyclerListView botsSearchListView;
    public final AnonymousClass7 channelsEmptyView;
    public final AnonymousClass8 channelsSearchAdapter;
    public final FrameLayout channelsSearchContainer;
    public final LinearLayoutManager channelsSearchLayoutManager;
    public final RecyclerListView channelsSearchListView;
    public final PhotoViewer.AnonymousClass49 chatPreviewDelegate;
    public final long communityId;
    public final int currentAccount;
    public final ArrayList currentSearchFilters;
    public ActionBarMenuItem deleteItem;
    public final AnonymousClass1 dialogsSearchAdapter;
    public SearchDownloadsContainer downloadsContainer;
    public final AnonymousClass5 emptyView;
    public boolean expandedPublicPosts;
    public FilteredSearchView.Delegate filteredSearchViewDelegate;
    public final int folderId;
    public ActionBarMenuItem forwardItem;
    public final SizeNotifierFrameLayout fragmentView;
    public ActionBarMenuItem gotoItem;
    public final AnonymousClass15 hashtagEmptyView;
    public final AnonymousClass16 hashtagSearchAdapter;
    public final FrameLayout hashtagSearchContainer;
    public final LinearLayoutManager hashtagSearchLayoutManager;
    public final RecyclerListView hashtagSearchListView;
    public boolean isActionModeShowed;
    public final DefaultItemAnimator itemAnimator;
    public final RecyclerItemsEnterAnimator itemsEnterAnimator;
    public int keyboardSize;
    public boolean lastSearchScrolledToTop;
    public String lastSearchString;
    public final FilteredSearchView noMediaFiltersSearchView;
    public int pagesPaddingBottom;
    public int pagesPaddingTop;
    public final DialogsActivity parent;
    public final PostsSearchContainer postsSearchContainer;
    public final FrameLayout searchContainer;
    public final LinearLayoutManager searchLayoutManager;
    public final ChatActivity.AnonymousClass34 searchListView;
    public final HashMap selectedFiles;
    public NumberTextView selectedMessagesCountTextView;
    public boolean showOnlyDialogsAdapter;
    public ActionBarMenuItem speedItem;
    public final ViewPagerAdapter viewPagerAdapter;

    public final class AnonymousClass1 extends DialogsSearchAdapter {
        public final DialogsActivity.AnonymousClass47 this$0;
        public final Activity val$context;
        public final DialogsActivity val$fragment;

        public AnonymousClass1(DialogsActivity.AnonymousClass47 anonymousClass47, Activity activity, DialogsActivity dialogsActivity, int i, int i2, DefaultItemAnimator defaultItemAnimator, boolean z, DialogsActivity dialogsActivity2, Activity activity2) {
            super(activity, dialogsActivity, i, i2, defaultItemAnimator, z);
            this.this$0 = anonymousClass47;
            this.val$fragment = dialogsActivity2;
            this.val$context = activity2;
        }

        @Override
        public final void notifyDataSetChanged() {
            ChatActivity.AnonymousClass34 anonymousClass34;
            int i = this.currentItemCount;
            this.mObservable.notifyChanged();
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            if (!anonymousClass47.lastSearchScrolledToTop && (anonymousClass34 = anonymousClass47.searchListView) != null) {
                anonymousClass34.scrollToPosition(0);
                anonymousClass47.lastSearchScrolledToTop = true;
            }
            if (getItemCount() != 0 || i == 0 || this.waitingResponseCount > 0) {
                return;
            }
            anonymousClass47.emptyView.showProgress(false, false);
        }
    }

    public final class AnonymousClass12 extends DialogsBotsAdapter {
        public final DialogsActivity.AnonymousClass47 this$0;

        public AnonymousClass12(DialogsActivity.AnonymousClass47 anonymousClass47, RecyclerListView recyclerListView, Activity activity, int i, int i2) {
            super(recyclerListView, activity, i, i2, false, null);
            this.this$0 = anonymousClass47;
        }

        @Override
        public final void update(boolean z) {
            ArrayList arrayList;
            super.update(z);
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            boolean z2 = this.loadingMessages || this.loadingBots || (arrayList = this.searchMessages) == null || !arrayList.isEmpty();
            AnonymousClass11 anonymousClass11 = anonymousClass47.botsEmptyView;
            anonymousClass11.showProgress(z2, z);
            anonymousClass11.title.setText(LocaleController.getString(R.string.NoResult));
            anonymousClass11.subtitle.setVisibility(8);
        }
    }

    public final class AnonymousClass16 extends HashtagsSearchAdapter {
        public final DialogsActivity.AnonymousClass47 this$0;

        public AnonymousClass16(DialogsActivity.AnonymousClass47 anonymousClass47, RecyclerListView recyclerListView, Activity activity, int i) {
            super(recyclerListView, activity, i);
            this.this$0 = anonymousClass47;
        }

        @Override
        public final void update(boolean z) {
            super.update(z);
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            anonymousClass47.hashtagEmptyView.showProgress(false, z);
            anonymousClass47.hashtagEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            anonymousClass47.hashtagEmptyView.subtitle.setVisibility(8);
        }
    }

    public final class AnonymousClass5 extends StickerEmptyView {
        public final DialogsActivity.AnonymousClass47 this$0;

        public AnonymousClass5(DialogsActivity.AnonymousClass47 anonymousClass47, Activity activity, FlickerLoadingView flickerLoadingView) {
            super(1, null, activity, flickerLoadingView);
            this.this$0 = anonymousClass47;
        }

        @Override
        public final void setVisibility(int i) {
            if (this.this$0.noMediaFiltersSearchView.getTag() != null) {
                super.setVisibility(8);
            } else {
                super.setVisibility(i);
            }
        }
    }

    public final class AnonymousClass8 extends DialogsChannelsAdapter {
        public final DialogsActivity.AnonymousClass47 this$0;
        public final DialogsActivity val$fragment;

        public AnonymousClass8(DialogsActivity.AnonymousClass47 anonymousClass47, RecyclerListView recyclerListView, Activity activity, int i, int i2, DialogsActivity dialogsActivity) {
            super(recyclerListView, activity, i, i2);
            this.this$0 = anonymousClass47;
            this.val$fragment = dialogsActivity;
        }

        @Override
        public final void update(boolean z) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            super.update(z);
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            boolean z2 = this.loadingMessages || this.loadingChannels || (arrayList = this.messages) == null || !arrayList.isEmpty() || (arrayList2 = this.searchMyChannels) == null || !arrayList2.isEmpty() || (arrayList3 = this.searchChannels) == null || !arrayList3.isEmpty() || (arrayList4 = this.searchRecommendedChannels) == null || !arrayList4.isEmpty();
            AnonymousClass7 anonymousClass7 = anonymousClass47.channelsEmptyView;
            anonymousClass7.showProgress(z2, z);
            if (!TextUtils.isEmpty(this.query)) {
                anonymousClass7.title.setText(LocaleController.getString(R.string.NoResult));
                anonymousClass7.subtitle.setVisibility(8);
            } else {
                anonymousClass7.title.setText(LocaleController.getString(R.string.NoChannelsTitle));
                anonymousClass7.subtitle.setVisibility(0);
                anonymousClass7.subtitle.setText(LocaleController.getString(R.string.NoChannelsMessage));
            }
        }
    }

    public interface ChatPreviewDelegate {
        void finish();

        void move(float f);

        void startChatPreview(DialogCell dialogCell);
    }

    public final class ViewPagerAdapter extends ViewPagerFixed.Adapter {
        public final ArrayList items = new ArrayList();
        public final DialogsActivity.AnonymousClass47 this$0;

        public final class Item {
            public int filterIndex;
            public final int type;

            public Item(int i) {
                this.type = i;
            }
        }

        public ViewPagerAdapter(DialogsActivity.AnonymousClass47 anonymousClass47) {
            this.this$0 = anonymousClass47;
            updateItems();
        }

        @Override
        public final void bindView(View view, int i, int i2) {
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            anonymousClass47.search(view, i, anonymousClass47.lastSearchString, true);
        }

        @Override
        public final View createView(int i) {
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            if (i == 1) {
                return anonymousClass47.searchContainer;
            }
            if (i == 3) {
                return anonymousClass47.channelsSearchContainer;
            }
            if (i == 4) {
                return anonymousClass47.botsSearchContainer;
            }
            if (i == 5) {
                return anonymousClass47.hashtagSearchContainer;
            }
            DialogsActivity dialogsActivity = anonymousClass47.parent;
            if (i != 2) {
                if (i == 6) {
                    return anonymousClass47.postsSearchContainer;
                }
                FilteredSearchView filteredSearchView = new FilteredSearchView(dialogsActivity);
                filteredSearchView.setChatPreviewDelegate(anonymousClass47.chatPreviewDelegate);
                filteredSearchView.setUiCallback(anonymousClass47);
                filteredSearchView.setPagesPaddings(anonymousClass47.pagesPaddingTop, anonymousClass47.pagesPaddingBottom, false);
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = anonymousClass47.blurredBackgroundDrawableFactory;
                if (blurredBackgroundDrawableViewFactory != null) {
                    filteredSearchView.setBlurredBackgroundDrawableFactory(blurredBackgroundDrawableViewFactory);
                }
                ChatActivity.AnonymousClass34 anonymousClass34 = filteredSearchView.recyclerListView;
                anonymousClass34.setClipToPadding(false);
                final int i2 = 1;
                anonymousClass34.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                    public final ViewPagerAdapter this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                        switch (i2) {
                            case 0:
                                this.this$1.this$0.onPageScrolled(i3, i4);
                                break;
                            default:
                                this.this$1.this$0.onPageScrolled(i3, i4);
                                break;
                        }
                    }
                });
                anonymousClass34.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass47, 10));
                return filteredSearchView;
            }
            SearchDownloadsContainer searchDownloadsContainer = new SearchDownloadsContainer(anonymousClass47.currentAccount, dialogsActivity);
            anonymousClass47.downloadsContainer = searchDownloadsContainer;
            int i3 = anonymousClass47.pagesPaddingTop;
            int i4 = anonymousClass47.pagesPaddingBottom;
            searchDownloadsContainer.setClipToPadding(false);
            searchDownloadsContainer.ignoreRequestLayout = false;
            searchDownloadsContainer.setPadding(0, i3, 0, i4);
            ChatActivity.AnonymousClass34 anonymousClass35 = searchDownloadsContainer.recyclerListView;
            anonymousClass35.setPadding(0, i3, 0, i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass35.getLayoutParams();
            marginLayoutParams.topMargin = -i3;
            marginLayoutParams.bottomMargin = -i4;
            searchDownloadsContainer.ignoreRequestLayout = false;
            anonymousClass47.downloadsContainer.recyclerListView.setClipToPadding(false);
            final int i5 = 0;
            anonymousClass47.downloadsContainer.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                public final ViewPagerAdapter this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                    switch (i5) {
                        case 0:
                            this.this$1.this$0.onPageScrolled(i6, i7);
                            break;
                        default:
                            this.this$1.this$0.onPageScrolled(i6, i7);
                            break;
                    }
                }
            });
            anonymousClass47.downloadsContainer.recyclerListView.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass47, 10));
            anonymousClass47.downloadsContainer.setUiCallback(anonymousClass47);
            return anonymousClass47.downloadsContainer;
        }

        @Override
        public final int getItemCount() {
            return this.items.size();
        }

        @Override
        public final CharSequence getItemTitle(int i) {
            ArrayList arrayList = this.items;
            if (((Item) arrayList.get(i)).type == 0) {
                return LocaleController.getString(R.string.SearchAllChatsShort);
            }
            if (((Item) arrayList.get(i)).type == 1) {
                return LocaleController.getString(R.string.ChannelsTab);
            }
            if (((Item) arrayList.get(i)).type == 4) {
                return LocaleController.getString(R.string.AppsTab);
            }
            if (((Item) arrayList.get(i)).type == 6) {
                return LocaleController.getString(R.string.SearchPosts);
            }
            if (((Item) arrayList.get(i)).type == 2) {
                return LocaleController.getString(R.string.DownloadsTabs);
            }
            if (((Item) arrayList.get(i)).type == 5) {
                return LocaleController.getString(R.string.PublicPostsTabs);
            }
            FiltersView.MediaFilterData mediaFilterData = FiltersView.filters[((Item) arrayList.get(i)).filterIndex];
            String str = mediaFilterData.title;
            return str != null ? str : LocaleController.getString(mediaFilterData.titleResId);
        }

        @Override
        public final int getItemViewType(int i) {
            ArrayList arrayList = this.items;
            if (((Item) arrayList.get(i)).type == 0) {
                return 1;
            }
            if (((Item) arrayList.get(i)).type == 1) {
                return 3;
            }
            if (((Item) arrayList.get(i)).type == 4) {
                return 4;
            }
            if (((Item) arrayList.get(i)).type == 2) {
                return 2;
            }
            if (((Item) arrayList.get(i)).type == 5) {
                return 5;
            }
            if (((Item) arrayList.get(i)).type == 6) {
                return 6;
            }
            return ((Item) arrayList.get(i)).type + i;
        }

        public final void updateItems() {
            ArrayList arrayList = this.items;
            arrayList.clear();
            arrayList.add(new Item(0));
            DialogsActivity.AnonymousClass47 anonymousClass47 = this.this$0;
            if (anonymousClass47.communityId != 0) {
                return;
            }
            if (anonymousClass47.expandedPublicPosts) {
                arrayList.add(new Item(5));
            }
            arrayList.add(new Item(1));
            arrayList.add(new Item(4));
            arrayList.add(new Item(6));
            if (anonymousClass47.showOnlyDialogsAdapter) {
                return;
            }
            Item item = new Item(3);
            item.filterIndex = 0;
            arrayList.add(item);
            DialogsActivity.AnonymousClass27 anonymousClass27 = DialogsActivity.this.rightSlidingDialogContainer;
            if (anonymousClass27 == null || !anonymousClass27.hasFragment()) {
                arrayList.add(new Item(2));
            }
            Item item2 = new Item(3);
            item2.filterIndex = 1;
            arrayList.add(item2);
            Item item3 = new Item(3);
            item3.filterIndex = 2;
            arrayList.add(item3);
            Item item4 = new Item(3);
            item4.filterIndex = 3;
            arrayList.add(item4);
            Item item5 = new Item(3);
            item5.filterIndex = 4;
            arrayList.add(item5);
        }
    }

    public SearchViewPager(Activity activity, final DialogsActivity dialogsActivity, int i, int i2, int i3, long j, PhotoViewer.AnonymousClass49 anonymousClass49) {
        super(activity, null);
        this.expandedPublicPosts = false;
        this.selectedFiles = new HashMap();
        this.currentSearchFilters = new ArrayList();
        int i4 = UserConfig.selectedAccount;
        this.currentAccount = i4;
        this.animateFromCount = 0;
        this.folderId = i3;
        this.communityId = j;
        this.parent = dialogsActivity;
        this.chatPreviewDelegate = anonymousClass49;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.mAddDuration = 150L;
        defaultItemAnimator.mMoveDuration = 350L;
        defaultItemAnimator.mChangeAddDuration = 0L;
        defaultItemAnimator.mChangeRemoveDuration = 0L;
        defaultItemAnimator.mRemoveDuration = 0L;
        defaultItemAnimator.mMoveInterpolator = new OvershootInterpolator(1.1f);
        defaultItemAnimator.translationInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        final DialogsActivity.AnonymousClass47 anonymousClass47 = (DialogsActivity.AnonymousClass47) this;
        this.dialogsSearchAdapter = new AnonymousClass1(anonymousClass47, activity, dialogsActivity, i, i2, defaultItemAnimator, dialogsActivity.allowGlobalSearch, dialogsActivity, activity);
        if (i2 == 15) {
            ArrayList dialogsArray = dialogsActivity.getDialogsArray(i4, i2, i3, true);
            ArrayList arrayList = new ArrayList();
            for (int iM = 0; iM < dialogsArray.size(); iM = MessagesController$$ExternalSyntheticOutline2.m(((TLRPC.Dialog) dialogsArray.get(iM)).id, arrayList, iM, 1)) {
            }
            this.dialogsSearchAdapter.filterDialogIds = arrayList;
        }
        this.fragmentView = (SizeNotifierFrameLayout) dialogsActivity.getFragmentView();
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(anonymousClass47, activity, 17);
        this.searchListView = anonymousClass34;
        anonymousClass34.setItemAnimator(this.itemAnimator);
        anonymousClass34.setPivotY(0.0f);
        anonymousClass34.setClipToPadding(false);
        anonymousClass34.setAdapter(this.dialogsSearchAdapter);
        anonymousClass34.setVerticalScrollBarEnabled(true);
        anonymousClass34.setInstantClick(true);
        anonymousClass34.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.searchLayoutManager = linearLayoutManager;
        anonymousClass34.setLayoutManager(linearLayoutManager);
        anonymousClass34.animateEmptyView = true;
        anonymousClass34.emptyViewAnimationType = 0;
        final int i5 = 0;
        anonymousClass34.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                switch (i5) {
                    case 0:
                        if (i6 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 1:
                        if (i6 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 2:
                        if (i6 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    default:
                        if (i6 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                DialogsActivity.AnonymousClass48 anonymousClass48;
                int i8;
                RecyclerListView recyclerListView;
                switch (i5) {
                    case 0:
                        DialogsActivity.AnonymousClass47 anonymousClass410 = anonymousClass47;
                        int iFindFirstVisibleItemPosition = anonymousClass410.searchLayoutManager.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = anonymousClass410.searchLayoutManager.findLastVisibleItemPosition();
                        int iAbs = Math.abs(anonymousClass410.searchLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                        int itemCount = recyclerView.getAdapter().getItemCount();
                        if (iAbs > 0) {
                            AnonymousClass1 anonymousClass1 = anonymousClass410.dialogsSearchAdapter;
                            if (((anonymousClass1.delegate.getSearchForumDialogId() != 0 && !anonymousClass1.localMessagesSearchEndReached) || !anonymousClass1.messagesSearchEndReached) && (iFindLastVisibleItemPosition == itemCount - 1 || ((anonymousClass48 = anonymousClass410.dialogsSearchAdapter.delegate) != null && anonymousClass48.getSearchForumDialogId() != 0 && (i8 = anonymousClass410.dialogsSearchAdapter.localMessagesLoadingRow) >= 0 && iFindFirstVisibleItemPosition <= i8 && iFindLastVisibleItemPosition >= i8))) {
                                anonymousClass410.dialogsSearchAdapter.loadMoreSearchMessages();
                            }
                        }
                        anonymousClass410.onPageScrolled(i6, i7);
                        break;
                    case 1:
                        DialogsActivity.AnonymousClass47 anonymousClass411 = anonymousClass47;
                        anonymousClass411.botsSearchAdapter.checkBottom();
                        anonymousClass411.onPageScrolled(i6, i7);
                        break;
                    case 2:
                        DialogsActivity.AnonymousClass47 anonymousClass412 = anonymousClass47;
                        anonymousClass412.hashtagSearchAdapter.checkBottom();
                        anonymousClass412.onPageScrolled(i6, i7);
                        break;
                    default:
                        DialogsActivity.AnonymousClass47 anonymousClass413 = anonymousClass47;
                        AnonymousClass8 anonymousClass8 = anonymousClass413.channelsSearchAdapter;
                        if (anonymousClass8.hasMore && !anonymousClass8.loadingMessages && !TextUtils.isEmpty(anonymousClass8.query) && (recyclerListView = anonymousClass8.listView) != null) {
                            for (int i9 = 0; i9 < recyclerListView.getChildCount(); i9++) {
                                if (recyclerListView.getChildAt(i9) instanceof FlickerLoadingView) {
                                    if (anonymousClass8.hasMore && !anonymousClass8.loadingMessages && !TextUtils.isEmpty(anonymousClass8.query)) {
                                        anonymousClass8.searchMessages$1(true);
                                    }
                                }
                            }
                        }
                        anonymousClass413.onPageScrolled(i6, i7);
                        break;
                }
            }
        });
        DialogsActivity.AnonymousClass47 anonymousClass48 = (DialogsActivity.AnonymousClass47) this;
        anonymousClass34.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        FilteredSearchView filteredSearchView = new FilteredSearchView(this.parent);
        this.noMediaFiltersSearchView = filteredSearchView;
        ChatActivity.AnonymousClass34 anonymousClass35 = filteredSearchView.recyclerListView;
        anonymousClass35.setClipToPadding(false);
        final int i6 = 0;
        anonymousClass35.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                switch (i6) {
                    case 0:
                        anonymousClass47.onPageScrolled(i7, i8);
                        break;
                    default:
                        anonymousClass47.onPageScrolled(i7, i8);
                        break;
                }
            }
        });
        anonymousClass35.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        filteredSearchView.setUiCallback(this);
        filteredSearchView.setVisibility(8);
        filteredSearchView.setChatPreviewDelegate(anonymousClass49);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(activity, null);
        flickerLoadingView.setViewType(1);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(anonymousClass47, activity, flickerLoadingView);
        this.emptyView = anonymousClass5;
        SpoilersTextView spoilersTextView = anonymousClass5.title;
        int i7 = R.string.NoResult;
        spoilersTextView.setText(LocaleController.getString(i7));
        anonymousClass5.subtitle.setVisibility(8);
        anonymousClass5.setVisibility(8);
        anonymousClass5.addView(flickerLoadingView, 0);
        anonymousClass5.showProgress(true, false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.searchContainer = frameLayout;
        frameLayout.addView(anonymousClass5);
        frameLayout.addView(anonymousClass34);
        frameLayout.addView(filteredSearchView);
        anonymousClass34.setEmptyView(anonymousClass5);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.channelsSearchContainer = frameLayout2;
        DefaultItemAnimator defaultItemAnimator2 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                anonymousClass47.invalidate();
            }
        };
        defaultItemAnimator2.mSupportsChangeAnimations = false;
        defaultItemAnimator2.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator2.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator2.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator2.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator2.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator2.setDurations(350L);
        RecyclerListView recyclerListView = new RecyclerListView(activity, null);
        this.channelsSearchListView = recyclerListView;
        recyclerListView.setItemAnimator(defaultItemAnimator2);
        recyclerListView.setPivotY(0.0f);
        recyclerListView.setVerticalScrollBarEnabled(true);
        recyclerListView.setInstantClick(true);
        recyclerListView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1, false);
        this.channelsSearchLayoutManager = linearLayoutManager2;
        recyclerListView.setLayoutManager(linearLayoutManager2);
        recyclerListView.animateEmptyView = true;
        recyclerListView.emptyViewAnimationType = 0;
        recyclerListView.setClipToPadding(false);
        FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(activity, null);
        flickerLoadingView2.setViewType(1);
        ?? r12 = new StickerEmptyView(activity, flickerLoadingView2) {
            @Override
            public final void setVisibility(int i8) {
                if (anonymousClass47.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i8);
                }
            }
        };
        this.channelsEmptyView = r12;
        r12.title.setText(LocaleController.getString(i7));
        r12.subtitle.setVisibility(8);
        r12.setVisibility(8);
        r12.addView(flickerLoadingView2, 0);
        r12.showProgress(true, false);
        frameLayout2.addView(r12);
        frameLayout2.addView(recyclerListView);
        recyclerListView.setEmptyView(r12);
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(anonymousClass47, recyclerListView, activity, this.currentAccount, i3, dialogsActivity);
        this.channelsSearchAdapter = anonymousClass8;
        recyclerListView.setAdapter(anonymousClass8);
        final int i8 = 3;
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i9) {
                switch (i8) {
                    case 0:
                        if (i9 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 1:
                        if (i9 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 2:
                        if (i9 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    default:
                        if (i9 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                DialogsActivity.AnonymousClass48 anonymousClass410;
                int i11;
                RecyclerListView recyclerListView2;
                switch (i8) {
                    case 0:
                        DialogsActivity.AnonymousClass47 anonymousClass411 = anonymousClass47;
                        int iFindFirstVisibleItemPosition = anonymousClass411.searchLayoutManager.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = anonymousClass411.searchLayoutManager.findLastVisibleItemPosition();
                        int iAbs = Math.abs(anonymousClass411.searchLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                        int itemCount = recyclerView.getAdapter().getItemCount();
                        if (iAbs > 0) {
                            AnonymousClass1 anonymousClass1 = anonymousClass411.dialogsSearchAdapter;
                            if (((anonymousClass1.delegate.getSearchForumDialogId() != 0 && !anonymousClass1.localMessagesSearchEndReached) || !anonymousClass1.messagesSearchEndReached) && (iFindLastVisibleItemPosition == itemCount - 1 || ((anonymousClass410 = anonymousClass411.dialogsSearchAdapter.delegate) != null && anonymousClass410.getSearchForumDialogId() != 0 && (i11 = anonymousClass411.dialogsSearchAdapter.localMessagesLoadingRow) >= 0 && iFindFirstVisibleItemPosition <= i11 && iFindLastVisibleItemPosition >= i11))) {
                                anonymousClass411.dialogsSearchAdapter.loadMoreSearchMessages();
                            }
                        }
                        anonymousClass411.onPageScrolled(i9, i10);
                        break;
                    case 1:
                        DialogsActivity.AnonymousClass47 anonymousClass412 = anonymousClass47;
                        anonymousClass412.botsSearchAdapter.checkBottom();
                        anonymousClass412.onPageScrolled(i9, i10);
                        break;
                    case 2:
                        DialogsActivity.AnonymousClass47 anonymousClass413 = anonymousClass47;
                        anonymousClass413.hashtagSearchAdapter.checkBottom();
                        anonymousClass413.onPageScrolled(i9, i10);
                        break;
                    default:
                        DialogsActivity.AnonymousClass47 anonymousClass414 = anonymousClass47;
                        AnonymousClass8 anonymousClass9 = anonymousClass414.channelsSearchAdapter;
                        if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query) && (recyclerListView2 = anonymousClass9.listView) != null) {
                            for (int i12 = 0; i12 < recyclerListView2.getChildCount(); i12++) {
                                if (recyclerListView2.getChildAt(i12) instanceof FlickerLoadingView) {
                                    if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query)) {
                                        anonymousClass9.searchMessages$1(true);
                                    }
                                }
                            }
                        }
                        anonymousClass414.onPageScrolled(i9, i10);
                        break;
                }
            }
        });
        recyclerListView.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.botsSearchContainer = frameLayout3;
        DefaultItemAnimator defaultItemAnimator3 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                anonymousClass47.invalidate();
            }
        };
        defaultItemAnimator3.mSupportsChangeAnimations = false;
        defaultItemAnimator3.delayAnimations = false;
        defaultItemAnimator3.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator3.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator3.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator3.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator3.setDurations(350L);
        RecyclerListView recyclerListView2 = new RecyclerListView(activity, null);
        this.botsSearchListView = recyclerListView2;
        recyclerListView2.setItemAnimator(defaultItemAnimator3);
        recyclerListView2.setPivotY(0.0f);
        recyclerListView2.setClipToPadding(false);
        recyclerListView2.setVerticalScrollBarEnabled(true);
        recyclerListView2.setInstantClick(true);
        recyclerListView2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(1, false);
        this.botsSearchLayoutManager = linearLayoutManager3;
        recyclerListView2.setLayoutManager(linearLayoutManager3);
        recyclerListView2.animateEmptyView = true;
        recyclerListView2.emptyViewAnimationType = 0;
        FlickerLoadingView flickerLoadingView3 = new FlickerLoadingView(activity, null);
        flickerLoadingView3.setViewType(1);
        ?? r6 = new StickerEmptyView(activity, flickerLoadingView3) {
            @Override
            public final void setVisibility(int i9) {
                if (anonymousClass47.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i9);
                }
            }
        };
        this.botsEmptyView = r6;
        r6.title.setText(LocaleController.getString(i7));
        r6.subtitle.setVisibility(8);
        r6.setVisibility(8);
        r6.addView(flickerLoadingView3, 0);
        r6.showProgress(true, false);
        frameLayout3.addView(r6);
        frameLayout3.addView(recyclerListView2);
        recyclerListView2.setEmptyView(r6);
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(anonymousClass47, recyclerListView2, activity, this.currentAccount, i3);
        this.botsSearchAdapter = anonymousClass12;
        recyclerListView2.setAdapter(anonymousClass12);
        final int i9 = 1;
        recyclerListView2.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i10) {
                switch (i9) {
                    case 0:
                        if (i10 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 1:
                        if (i10 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 2:
                        if (i10 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    default:
                        if (i10 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                DialogsActivity.AnonymousClass48 anonymousClass410;
                int i12;
                RecyclerListView recyclerListView3;
                switch (i9) {
                    case 0:
                        DialogsActivity.AnonymousClass47 anonymousClass411 = anonymousClass47;
                        int iFindFirstVisibleItemPosition = anonymousClass411.searchLayoutManager.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = anonymousClass411.searchLayoutManager.findLastVisibleItemPosition();
                        int iAbs = Math.abs(anonymousClass411.searchLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                        int itemCount = recyclerView.getAdapter().getItemCount();
                        if (iAbs > 0) {
                            AnonymousClass1 anonymousClass1 = anonymousClass411.dialogsSearchAdapter;
                            if (((anonymousClass1.delegate.getSearchForumDialogId() != 0 && !anonymousClass1.localMessagesSearchEndReached) || !anonymousClass1.messagesSearchEndReached) && (iFindLastVisibleItemPosition == itemCount - 1 || ((anonymousClass410 = anonymousClass411.dialogsSearchAdapter.delegate) != null && anonymousClass410.getSearchForumDialogId() != 0 && (i12 = anonymousClass411.dialogsSearchAdapter.localMessagesLoadingRow) >= 0 && iFindFirstVisibleItemPosition <= i12 && iFindLastVisibleItemPosition >= i12))) {
                                anonymousClass411.dialogsSearchAdapter.loadMoreSearchMessages();
                            }
                        }
                        anonymousClass411.onPageScrolled(i10, i11);
                        break;
                    case 1:
                        DialogsActivity.AnonymousClass47 anonymousClass412 = anonymousClass47;
                        anonymousClass412.botsSearchAdapter.checkBottom();
                        anonymousClass412.onPageScrolled(i10, i11);
                        break;
                    case 2:
                        DialogsActivity.AnonymousClass47 anonymousClass413 = anonymousClass47;
                        anonymousClass413.hashtagSearchAdapter.checkBottom();
                        anonymousClass413.onPageScrolled(i10, i11);
                        break;
                    default:
                        DialogsActivity.AnonymousClass47 anonymousClass414 = anonymousClass47;
                        AnonymousClass8 anonymousClass9 = anonymousClass414.channelsSearchAdapter;
                        if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query) && (recyclerListView3 = anonymousClass9.listView) != null) {
                            for (int i13 = 0; i13 < recyclerListView3.getChildCount(); i13++) {
                                if (recyclerListView3.getChildAt(i13) instanceof FlickerLoadingView) {
                                    if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query)) {
                                        anonymousClass9.searchMessages$1(true);
                                    }
                                }
                            }
                        }
                        anonymousClass414.onPageScrolled(i10, i11);
                        break;
                }
            }
        });
        recyclerListView2.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.hashtagSearchContainer = frameLayout4;
        DefaultItemAnimator defaultItemAnimator4 = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                anonymousClass47.invalidate();
            }
        };
        defaultItemAnimator4.mSupportsChangeAnimations = false;
        defaultItemAnimator4.delayAnimations = false;
        defaultItemAnimator4.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator4.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator4.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator4.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator4.setDurations(350L);
        RecyclerListView recyclerListView3 = new RecyclerListView(activity, null);
        this.hashtagSearchListView = recyclerListView3;
        recyclerListView3.setItemAnimator(defaultItemAnimator4);
        recyclerListView3.setPivotY(0.0f);
        recyclerListView3.setVerticalScrollBarEnabled(true);
        recyclerListView3.setInstantClick(true);
        recyclerListView3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(1, false);
        this.hashtagSearchLayoutManager = linearLayoutManager4;
        recyclerListView3.setLayoutManager(linearLayoutManager4);
        recyclerListView3.animateEmptyView = true;
        recyclerListView3.emptyViewAnimationType = 0;
        recyclerListView3.setClipToPadding(false);
        FlickerLoadingView flickerLoadingView4 = new FlickerLoadingView(activity, null);
        flickerLoadingView4.setViewType(1);
        ?? r7 = new StickerEmptyView(activity, flickerLoadingView4) {
            @Override
            public final void setVisibility(int i10) {
                if (anonymousClass47.noMediaFiltersSearchView.getTag() != null) {
                    super.setVisibility(8);
                } else {
                    super.setVisibility(i10);
                }
            }
        };
        this.hashtagEmptyView = r7;
        r7.title.setText(LocaleController.getString(i7));
        r7.subtitle.setVisibility(8);
        r7.setVisibility(8);
        r7.addView(flickerLoadingView4, 0);
        r7.showProgress(true, false);
        frameLayout4.addView(r7);
        frameLayout4.addView(recyclerListView3);
        recyclerListView3.setEmptyView(r7);
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(anonymousClass47, recyclerListView3, activity, this.currentAccount);
        this.hashtagSearchAdapter = anonymousClass16;
        recyclerListView3.setAdapter(anonymousClass16);
        final int i10 = 2;
        recyclerListView3.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                switch (i10) {
                    case 0:
                        if (i11 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 1:
                        if (i11 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    case 2:
                        if (i11 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                    default:
                        if (i11 == 1) {
                            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
                        }
                        break;
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                DialogsActivity.AnonymousClass48 anonymousClass410;
                int i13;
                RecyclerListView recyclerListView4;
                switch (i10) {
                    case 0:
                        DialogsActivity.AnonymousClass47 anonymousClass411 = anonymousClass47;
                        int iFindFirstVisibleItemPosition = anonymousClass411.searchLayoutManager.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = anonymousClass411.searchLayoutManager.findLastVisibleItemPosition();
                        int iAbs = Math.abs(anonymousClass411.searchLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
                        int itemCount = recyclerView.getAdapter().getItemCount();
                        if (iAbs > 0) {
                            AnonymousClass1 anonymousClass1 = anonymousClass411.dialogsSearchAdapter;
                            if (((anonymousClass1.delegate.getSearchForumDialogId() != 0 && !anonymousClass1.localMessagesSearchEndReached) || !anonymousClass1.messagesSearchEndReached) && (iFindLastVisibleItemPosition == itemCount - 1 || ((anonymousClass410 = anonymousClass411.dialogsSearchAdapter.delegate) != null && anonymousClass410.getSearchForumDialogId() != 0 && (i13 = anonymousClass411.dialogsSearchAdapter.localMessagesLoadingRow) >= 0 && iFindFirstVisibleItemPosition <= i13 && iFindLastVisibleItemPosition >= i13))) {
                                anonymousClass411.dialogsSearchAdapter.loadMoreSearchMessages();
                            }
                        }
                        anonymousClass411.onPageScrolled(i11, i12);
                        break;
                    case 1:
                        DialogsActivity.AnonymousClass47 anonymousClass412 = anonymousClass47;
                        anonymousClass412.botsSearchAdapter.checkBottom();
                        anonymousClass412.onPageScrolled(i11, i12);
                        break;
                    case 2:
                        DialogsActivity.AnonymousClass47 anonymousClass413 = anonymousClass47;
                        anonymousClass413.hashtagSearchAdapter.checkBottom();
                        anonymousClass413.onPageScrolled(i11, i12);
                        break;
                    default:
                        DialogsActivity.AnonymousClass47 anonymousClass414 = anonymousClass47;
                        AnonymousClass8 anonymousClass9 = anonymousClass414.channelsSearchAdapter;
                        if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query) && (recyclerListView4 = anonymousClass9.listView) != null) {
                            for (int i14 = 0; i14 < recyclerListView4.getChildCount(); i14++) {
                                if (recyclerListView4.getChildAt(i14) instanceof FlickerLoadingView) {
                                    if (anonymousClass9.hasMore && !anonymousClass9.loadingMessages && !TextUtils.isEmpty(anonymousClass9.query)) {
                                        anonymousClass9.searchMessages$1(true);
                                    }
                                }
                            }
                        }
                        anonymousClass414.onPageScrolled(i11, i12);
                        break;
                }
            }
        });
        recyclerListView3.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        this.itemsEnterAnimator = new RecyclerItemsEnterAnimator(anonymousClass34, true);
        PostsSearchContainer postsSearchContainer = new PostsSearchContainer(activity, dialogsActivity);
        this.postsSearchContainer = postsSearchContainer;
        UniversalRecyclerView universalRecyclerView = postsSearchContainer.listView;
        universalRecyclerView.setClipToPadding(false);
        final int i11 = 1;
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i12, int i13) {
                switch (i11) {
                    case 0:
                        anonymousClass47.onPageScrolled(i12, i13);
                        break;
                    default:
                        anonymousClass47.onPageScrolled(i12, i13);
                        break;
                }
            }
        });
        universalRecyclerView.addEdgeEffectListener(new SeekBarView$$ExternalSyntheticLambda1(anonymousClass48, 9));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(anonymousClass47);
        this.viewPagerAdapter = viewPagerAdapter;
        setAdapter(viewPagerAdapter);
    }

    public static ChatActivity createFragmentFromMessage(MessageObject messageObject, int i) {
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

    public static void setPagesPaddings(FrameLayout frameLayout, RecyclerListView recyclerListView, int i, int i2, boolean z) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i, 0, i2);
        if (z) {
            recyclerListView.setPaddingWithoutRequestLayout(0, i, 0, i2);
        } else {
            recyclerListView.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerListView.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
    }

    @Override
    public final boolean actionModeShowing() {
        return this.isActionModeShowed;
    }

    @Override
    public final void capture(Canvas canvas, RectF rectF) {
        IBlur3Capture iBlur3Capture;
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.searchContainer;
            if (view == null) {
                iBlur3Capture = null;
            } else if (view == frameLayout) {
                iBlur3Capture = this.searchListView;
            } else if (view == this.channelsSearchContainer) {
                iBlur3Capture = this.channelsSearchListView;
            } else if (view == this.botsSearchContainer) {
                iBlur3Capture = this.botsSearchListView;
            } else if (view == this.hashtagSearchContainer) {
                iBlur3Capture = this.hashtagSearchListView;
            } else {
                SearchDownloadsContainer searchDownloadsContainer = this.downloadsContainer;
                if (view == searchDownloadsContainer) {
                    iBlur3Capture = searchDownloadsContainer.recyclerListView;
                } else {
                    PostsSearchContainer postsSearchContainer = this.postsSearchContainer;
                    if (view == postsSearchContainer) {
                        iBlur3Capture = postsSearchContainer.listView;
                    } else if (view instanceof FilteredSearchView) {
                        iBlur3Capture = ((FilteredSearchView) view).recyclerListView;
                    } else {
                        iBlur3Capture = null;
                    }
                }
            }
            if (iBlur3Capture != null) {
                Blur3Utils.captureRelativeParent(iBlur3Capture, canvas, rectF, iBlur3Capture, this, 255);
            }
            if (view == frameLayout) {
                FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
                if (filteredSearchView.getVisibility() == 0) {
                    ChatActivity.AnonymousClass34 anonymousClass34 = filteredSearchView.recyclerListView;
                    Blur3Utils.captureRelativeParent(anonymousClass34, canvas, rectF, anonymousClass34, this, 255);
                }
            }
        }
    }

    @Override
    public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
        blur3HashImpl.unsupported = true;
    }

    public final void collapsePublicPosts() {
        if (this.expandedPublicPosts) {
            int i = 0;
            this.expandedPublicPosts = false;
            updateTabs();
            ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
            if (anonymousClass3 != null && anonymousClass3.getCurrentTabId() != 0) {
                this.tabsView.scrollToTab(0, 0);
            }
            AnonymousClass1 anonymousClass1 = this.dialogsSearchAdapter;
            if (anonymousClass1 != null) {
                String str = this.lastSearchString;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.currentSearchFilters;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (((FiltersView.MediaFilterData) arrayList.get(i2)).filterType == 7) {
                        i = 1;
                        break;
                    }
                    i2++;
                }
                anonymousClass1.searchDialogs(i, str);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.channelRecommendationsLoaded;
        AnonymousClass8 anonymousClass8 = this.channelsSearchAdapter;
        if (i == i3) {
            showProgress(MessagesController.getInstance(this.currentAccount).getChannelRecommendations(0L) != null, true);
            anonymousClass8.updateMyChannels();
            anonymousClass8.update(true);
            return;
        }
        if (i == NotificationCenter.dialogDeleted || i == NotificationCenter.dialogsNeedReload) {
            anonymousClass8.updateMyChannels();
            anonymousClass8.update(true);
        } else {
            if (i == NotificationCenter.reloadWebappsHints) {
                this.botsSearchAdapter.update(true);
                return;
            }
            if (i == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                AnonymousClass16 anonymousClass16 = this.hashtagSearchAdapter;
                if (obj == anonymousClass16.list) {
                    anonymousClass16.update(true);
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

    public SearchDownloadsContainer getDownloadsContainer() {
        return this.downloadsContainer;
    }

    public int getFolderId() {
        return this.folderId;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public final int getPositionForType(int i) {
        int i2 = 0;
        while (true) {
            ViewPagerAdapter viewPagerAdapter = this.viewPagerAdapter;
            if (i2 >= viewPagerAdapter.items.size()) {
                return -1;
            }
            ArrayList arrayList = viewPagerAdapter.items;
            if (((ViewPagerAdapter.Item) arrayList.get(i2)).type == 3 && ((ViewPagerAdapter.Item) arrayList.get(i2)).filterIndex == i) {
                return i2;
            }
            i2++;
        }
    }

    public ActionBarMenuItem getSpeedItem() {
        return this.speedItem;
    }

    public ViewPagerFixed.TabsView getTabsView() {
        return this.tabsView;
    }

    public final void getThemeDescriptions(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.searchListView;
            if (i >= anonymousClass34.getChildCount()) {
                break;
            }
            View childAt = anonymousClass34.getChildAt(i);
            if ((childAt instanceof ProfileSearchCell) || (childAt instanceof DialogCell) || (childAt instanceof HashtagSearchCell)) {
                arrayList.add(new ThemeDescription(childAt, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            }
            i++;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof FilteredSearchView) {
                arrayList.addAll(((FilteredSearchView) getChildAt(i2)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.viewsByType;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) sparseArray.valueAt(i3);
            if (view instanceof FilteredSearchView) {
                arrayList.addAll(((FilteredSearchView) view).getThemeDescriptions());
            }
        }
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (filteredSearchView != null) {
            arrayList.addAll(filteredSearchView.getThemeDescriptions());
        }
        AnonymousClass5 anonymousClass5 = this.emptyView;
        arrayList.add(new ThemeDescription(anonymousClass5.title, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(anonymousClass5.subtitle, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.addAll(SimpleThemeDescription.createThemeDescriptions(new ChatActivity$$ExternalSyntheticLambda94(this, 19), Theme.key_actionBarActionModeDefaultIcon));
    }

    @Override
    public final void goToMessage(MessageObject messageObject) {
        this.parent.presentFragment(createFragmentFromMessage(messageObject, this.currentAccount));
        showActionMode(false);
    }

    @Override
    public final void invalidateBlur() {
        this.fragmentView.invalidateBlur();
    }

    @Override
    public final boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
        return this.selectedFiles.containsKey(messageHashId);
    }

    public final boolean isSpeedItemVisible() {
        int i = this.currentAccount;
        if (!UserConfig.getInstance(i).isPremium() && !MessagesController.getInstance(i).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.selectedFiles.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesListUpdated);
        this.attached = true;
        AnonymousClass8 anonymousClass8 = this.channelsSearchAdapter;
        if (anonymousClass8 != null) {
            anonymousClass8.update(false);
        }
        AnonymousClass12 anonymousClass12 = this.botsSearchAdapter;
        if (anonymousClass12 != null) {
            anonymousClass12.update(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void onItemSelected(View view, View view2, int i, int i2) {
        AnonymousClass1 anonymousClass1 = this.dialogsSearchAdapter;
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (i == 0) {
            if (filteredSearchView.getVisibility() == 0) {
                filteredSearchView.delegate = this.filteredSearchViewDelegate;
                anonymousClass1.filtersDelegate = null;
            } else {
                filteredSearchView.delegate = null;
                FilteredSearchView.Delegate delegate = this.filteredSearchViewDelegate;
                anonymousClass1.filtersDelegate = delegate;
                if (delegate != null) {
                    ((DialogsActivity$$ExternalSyntheticLambda10) delegate).updateFiltersView(false, null, anonymousClass1.localTipDates, anonymousClass1.localTipArchive);
                }
            }
        } else if (view instanceof FilteredSearchView) {
            boolean z = i2 == 0 && filteredSearchView.getVisibility() != 0;
            FilteredSearchView filteredSearchView2 = (FilteredSearchView) view;
            FilteredSearchView.Delegate delegate2 = this.filteredSearchViewDelegate;
            filteredSearchView2.delegate = delegate2;
            if (z && delegate2 != null) {
                ArrayList arrayList = filteredSearchView2.localTipChats;
                if (!arrayList.isEmpty()) {
                    ((DialogsActivity$$ExternalSyntheticLambda10) delegate2).updateFiltersView(false, arrayList, filteredSearchView2.localTipDates, filteredSearchView2.localTipArchive);
                }
            }
        }
        if (view2 instanceof FilteredSearchView) {
            ((FilteredSearchView) view2).delegate = null;
        } else {
            anonymousClass1.filtersDelegate = null;
            filteredSearchView.delegate = null;
        }
    }

    public final void search(View view, int i, String str, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        AnonymousClass5 anonymousClass5 = this.emptyView;
        if (zIsEmpty) {
            anonymousClass5.subtitle.setVisibility(8);
        } else {
            anonymousClass5.subtitle.setVisibility(0);
            anonymousClass5.subtitle.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        AnonymousClass1 anonymousClass1 = this.dialogsSearchAdapter;
        DialogsActivity.AnonymousClass48 anonymousClass48 = anonymousClass1.delegate;
        long searchForumDialogId = anonymousClass48 != null ? anonymousClass48.getSearchForumDialogId() : 0L;
        long j2 = i == 0 ? 0L : searchForumDialogId;
        int i3 = 0;
        boolean z8 = false;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            ArrayList arrayList = this.currentSearchFilters;
            if (i3 >= arrayList.size()) {
                break;
            }
            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList.get(i3);
            int i4 = mediaFilterData.filterType;
            if (i4 == 4) {
                TLObject tLObject = mediaFilterData.chat;
                if (tLObject instanceof TLRPC.User) {
                    j = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j = -((TLRPC.Chat) mediaFilterData.chat).id;
                }
                j2 = j;
            } else if (i4 == 6) {
                FiltersView.DateData dateData = mediaFilterData.dateData;
                long j5 = dateData.minDate;
                j4 = dateData.maxDate;
                j3 = j5;
            } else if (i4 == 7) {
                z8 = true;
            }
            i3++;
        }
        AnonymousClass16 anonymousClass16 = this.hashtagSearchAdapter;
        anonymousClass16.getClass();
        if (HashtagsSearchAdapter.getHashtag(str, null) == null) {
            collapsePublicPosts();
        }
        if (view == this.channelsSearchContainer) {
            MessagesController.getInstance(this.currentAccount).getChannelRecommendations(0L);
            AnonymousClass8 anonymousClass8 = this.channelsSearchAdapter;
            anonymousClass8.updateMyChannels();
            if (TextUtils.equals(str, anonymousClass8.query)) {
                z7 = false;
            } else {
                anonymousClass8.query = str;
                Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = anonymousClass8.searchMessagesRunnable;
                AndroidUtilities.cancelRunOnUIThread(bulletin$2$$ExternalSyntheticLambda1);
                boolean zIsEmpty2 = TextUtils.isEmpty(anonymousClass8.query);
                ArrayList arrayList2 = anonymousClass8.searchMyChannels;
                ArrayList arrayList3 = anonymousClass8.searchRecommendedChannels;
                ArrayList arrayList4 = anonymousClass8.searchChannels;
                ArrayList arrayList5 = anonymousClass8.messages;
                RecyclerListView recyclerListView = anonymousClass8.listView;
                if (zIsEmpty2) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    anonymousClass8.update(true);
                    anonymousClass8.searchChannelsId++;
                    z7 = false;
                    anonymousClass8.loadingMessages = false;
                    anonymousClass8.loadingChannels = false;
                    anonymousClass8.hasMore = false;
                    anonymousClass8.nextRate = 0;
                    if (recyclerListView != null) {
                        recyclerListView.scrollToPosition(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(bulletin$2$$ExternalSyntheticLambda1, 1000L);
                    anonymousClass8.loadingMessages = true;
                    anonymousClass8.loadingChannels = true;
                    anonymousClass8.update(true);
                    if (recyclerListView != null) {
                        z7 = false;
                        recyclerListView.scrollToPosition(0);
                    } else {
                        z7 = false;
                    }
                }
            }
            setKeyboardHeight(this.keyboardSize, z7);
            return;
        }
        if (view == this.botsSearchContainer) {
            AnonymousClass12 anonymousClass12 = this.botsSearchAdapter;
            if (TextUtils.equals(str, anonymousClass12.query)) {
                z6 = false;
            } else {
                anonymousClass12.query = str;
                DialogsBotsAdapter$$ExternalSyntheticLambda2 dialogsBotsAdapter$$ExternalSyntheticLambda2 = anonymousClass12.searchMessagesRunnable;
                AndroidUtilities.cancelRunOnUIThread(dialogsBotsAdapter$$ExternalSyntheticLambda2);
                boolean zIsEmpty3 = TextUtils.isEmpty(anonymousClass12.query);
                ArrayList arrayList6 = anonymousClass12.searchMessages;
                RecyclerListView recyclerListView2 = anonymousClass12.listView;
                if (zIsEmpty3) {
                    arrayList6.clear();
                    anonymousClass12.update(true);
                    anonymousClass12.searchBotsId++;
                    z6 = false;
                    anonymousClass12.loadingMessages = false;
                    anonymousClass12.loadingBots = false;
                    anonymousClass12.hasMore = false;
                    anonymousClass12.nextRate = 0;
                    if (recyclerListView2 != null) {
                        recyclerListView2.scrollToPosition(0);
                    }
                } else {
                    z6 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(dialogsBotsAdapter$$ExternalSyntheticLambda2, 1000L);
                    anonymousClass12.loadingMessages = true;
                    anonymousClass12.loadingBots = true;
                    anonymousClass12.update(true);
                    if (recyclerListView2 != null) {
                        recyclerListView2.scrollToPosition(0);
                    }
                }
            }
            setKeyboardHeight(this.keyboardSize, z6);
            if (TextUtils.isEmpty(str)) {
                anonymousClass12.checkBottom();
                return;
            }
            return;
        }
        PostsSearchContainer postsSearchContainer = this.postsSearchContainer;
        if (view == postsSearchContainer) {
            if (TextUtils.equals(postsSearchContainer.lastQuery, str)) {
                return;
            }
            if (postsSearchContainer.reqId >= 0) {
                ConnectionsManager.getInstance(postsSearchContainer.currentAccount).cancelRequest(postsSearchContainer.reqId, true);
                postsSearchContainer.reqId = -1;
            }
            postsSearchContainer.loading = false;
            postsSearchContainer.emptyButton.setLoading(false);
            postsSearchContainer.lastQuery = str;
            boolean zIsEmpty4 = TextUtils.isEmpty(str);
            ArrayList arrayList7 = postsSearchContainer.messages;
            if (zIsEmpty4) {
                postsSearchContainer.lastRate = 0;
                z5 = true;
                postsSearchContainer.queryid++;
                postsSearchContainer.endReached = false;
                arrayList7.clear();
                postsSearchContainer.load(false);
            } else {
                z5 = true;
                postsSearchContainer.loadFlood(str);
                postsSearchContainer.lastRate = 0;
                postsSearchContainer.queryid++;
                postsSearchContainer.endReached = false;
                arrayList7.clear();
            }
            postsSearchContainer.updateEmptyView();
            UniversalRecyclerView universalRecyclerView = postsSearchContainer.listView;
            universalRecyclerView.scrollToPosition(0);
            universalRecyclerView.adapter.update(z5);
            return;
        }
        if (view == this.hashtagSearchContainer) {
            if (HashtagsSearchAdapter.getHashtag(str, null) == null) {
                return;
            }
            if (z) {
                LinearLayoutManager linearLayoutManager = this.hashtagSearchLayoutManager;
                z4 = false;
                linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
            } else {
                z4 = false;
            }
            anonymousClass16.search(str);
            setKeyboardHeight(this.keyboardSize, z4);
            return;
        }
        if (view != this.searchContainer) {
            long j6 = searchForumDialogId;
            long j7 = j3;
            long j8 = j4;
            if (view instanceof FilteredSearchView) {
                FilteredSearchView filteredSearchView = (FilteredSearchView) view;
                filteredSearchView.setUseFromUserAsAvatar(j6 != 0);
                filteredSearchView.emptyView.setKeyboardHeight(this.keyboardSize, false);
                filteredSearchView.search(j2, this.communityId, j7, j8, FiltersView.filters[((ViewPagerAdapter.Item) this.viewPagerAdapter.items.get(i)).filterIndex], z8, str, z);
                return;
            }
            if (view instanceof SearchDownloadsContainer) {
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) view;
                searchDownloadsContainer.emptyView.setKeyboardHeight(this.keyboardSize, false);
                searchDownloadsContainer.searchQuery = str;
                searchDownloadsContainer.update(false);
                return;
            }
            return;
        }
        FilteredSearchView filteredSearchView2 = this.noMediaFiltersSearchView;
        if (!(j2 == 0 && this.communityId == 0 && j3 == 0 && j4 == 0) && searchForumDialogId == 0) {
            boolean z9 = true;
            filteredSearchView2.setTag(1);
            filteredSearchView2.delegate = this.filteredSearchViewDelegate;
            filteredSearchView2.animate().setListener(null).cancel();
            if (z) {
                filteredSearchView2.setVisibility(0);
                filteredSearchView2.setAlpha(1.0f);
                z2 = z;
            } else {
                if (filteredSearchView2.getVisibility() != 0) {
                    filteredSearchView2.setVisibility(0);
                    filteredSearchView2.setAlpha(0.0f);
                } else {
                    z9 = z;
                }
                filteredSearchView2.animate().alpha(1.0f).setDuration(150L).start();
                z2 = z9;
            }
            z3 = false;
            this.noMediaFiltersSearchView.search(j2, this.communityId, j3, j4, null, z8, str, z2);
            anonymousClass5.setVisibility(8);
        } else {
            this.lastSearchScrolledToTop = false;
            anonymousClass1.searchDialogs(z8 ? 1 : 0, str);
            anonymousClass1.filtersDelegate = this.filteredSearchViewDelegate;
            filteredSearchView2.animate().setListener(null).cancel();
            filteredSearchView2.delegate = null;
            if (z) {
                anonymousClass5.showProgress(!(anonymousClass1.waitingResponseCount > 0), false);
                anonymousClass5.showProgress(anonymousClass1.waitingResponseCount > 0, false);
            } else {
                int i5 = anonymousClass1.dialogsType;
                if (i5 == 2 || i5 == 4 || i5 == 5 || i5 == 6 || i5 == 1 || i5 == 11 || i5 == 15 || anonymousClass1.getRecentItemsCount() <= 0) {
                    i2 = 1;
                    anonymousClass5.showProgress(anonymousClass1.waitingResponseCount > 0, true);
                }
                if (z) {
                    filteredSearchView2.setVisibility(8);
                } else if (filteredSearchView2.getVisibility() != 8) {
                    filteredSearchView2.animate().alpha(0.0f).setListener(new Tooltip.AnonymousClass1((DialogsActivity.AnonymousClass47) this, i2)).setDuration(150L).start();
                }
                filteredSearchView2.setTag(null);
                z3 = false;
            }
            i2 = 1;
            if (z) {
                filteredSearchView2.setVisibility(8);
            } else if (filteredSearchView2.getVisibility() != 8) {
                filteredSearchView2.animate().alpha(0.0f).setListener(new Tooltip.AnonymousClass1((DialogsActivity.AnonymousClass47) this, i2)).setDuration(150L).start();
            }
            filteredSearchView2.setTag(null);
            z3 = false;
        }
        anonymousClass5.setKeyboardHeight(this.keyboardSize, z3);
        filteredSearchView2.emptyView.setKeyboardHeight(this.keyboardSize, z3);
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
                ((FilteredSearchView) getChildAt(i2)).emptyView.setKeyboardHeight(i, z);
            } else if (getChildAt(i2) == this.searchContainer) {
                this.emptyView.setKeyboardHeight(i, z);
                this.noMediaFiltersSearchView.emptyView.setKeyboardHeight(i, z);
            } else if (getChildAt(i2) instanceof SearchDownloadsContainer) {
                ((SearchDownloadsContainer) getChildAt(i2)).emptyView.setKeyboardHeight(i, z);
            } else if (getChildAt(i2) == this.channelsSearchContainer) {
                setKeyboardHeight(i, z);
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
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 != null) {
            anonymousClass3.selectTabWithId(1.0f, i);
        }
        invalidate();
    }

    public final void showActionMode(boolean z) {
        RecyclerListView.SelectionAdapter selectionAdapter;
        RecyclerListView.SelectionAdapter selectionAdapter2;
        RecyclerListView.SelectionAdapter selectionAdapter3;
        DialogsActivity.AnonymousClass48 anonymousClass48;
        if (this.isActionModeShowed == z) {
            return;
        }
        DialogsActivity dialogsActivity = this.parent;
        if (z && dialogsActivity.getActionBar().isActionModeShowed()) {
            return;
        }
        if (z && !dialogsActivity.getActionBar().actionModeIsExist("search_view_pager")) {
            this.actionMode = dialogsActivity.getActionBar().createActionMode("search_view_pager");
            if (dialogsActivity.hasMainTabs) {
                ImageView imageView = new ImageView(getContext());
                this.actionModeCloseView = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
                this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarActionModeDefaultIcon, false), PorterDuff.Mode.MULTIPLY));
                this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), 1, -1));
                this.actionModeCloseView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 27));
                this.actionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.actionMode.getContext());
            this.selectedMessagesCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.selectedMessagesCountTextView;
            int i = Theme.key_actionBarActionModeDefaultIcon;
            numberTextView2.setTextColor(Theme.getColor(null, i, false));
            this.actionMode.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, dialogsActivity.hasMainTabs ? 18 : 72, 0, 0));
            this.selectedMessagesCountTextView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(20));
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = this.actionMode.addItemWithWidth(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.speedItem = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.getIconView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
            this.gotoItem = this.actionMode.addItemWithWidth(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.forwardItem = this.actionMode.addItemWithWidth(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.deleteItem = this.actionMode.addItemWithWidth(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.selectedMessagesCountTextView != null) {
            AnonymousClass1 anonymousClass1 = this.dialogsSearchAdapter;
            ((ViewGroup.MarginLayoutParams) this.selectedMessagesCountTextView.getLayoutParams()).leftMargin = AndroidUtilities.dp((dialogsActivity.hasMainTabs ? 18 : 72) + (anonymousClass1 != null && (anonymousClass48 = anonymousClass1.delegate) != null && (anonymousClass48.getSearchForumDialogId() > 0L ? 1 : (anonymousClass48.getSearchForumDialogId() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.selectedMessagesCountTextView;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (dialogsActivity.getActionBar().getBackButton() != null && (dialogsActivity.getActionBar().getBackButton().getDrawable() instanceof MenuDrawable)) {
            BackDrawable backDrawable = new BackDrawable(false);
            dialogsActivity.getActionBar().setBackButtonDrawable(backDrawable);
            backDrawable.paint.setColorFilter(null);
        }
        this.isActionModeShowed = z;
        HashMap map = this.selectedFiles;
        if (z) {
            AndroidUtilities.hideKeyboard(dialogsActivity.getParentActivity().getCurrentFocus());
            dialogsActivity.getActionBar().showActionMode(null, null);
            this.selectedMessagesCountTextView.setNumber(map.size(), false);
            this.speedItem.setVisibility(isSpeedItemVisible() ? 0 : 8);
            this.gotoItem.setVisibility(0);
            this.forwardItem.setVisibility(0);
            this.deleteItem.setVisibility(0);
            return;
        }
        dialogsActivity.getActionBar().hideActionMode$1();
        map.clear();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof FilteredSearchView) && (selectionAdapter3 = ((FilteredSearchView) getChildAt(i2)).adapter) != null) {
                selectionAdapter3.notifyDataSetChanged();
            }
            if (getChildAt(i2) instanceof SearchDownloadsContainer) {
                ((SearchDownloadsContainer) getChildAt(i2)).update(true);
            }
        }
        FilteredSearchView filteredSearchView = this.noMediaFiltersSearchView;
        if (filteredSearchView != null && (selectionAdapter2 = filteredSearchView.adapter) != null) {
            selectionAdapter2.notifyDataSetChanged();
        }
        SparseArray sparseArray = this.viewsByType;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) sparseArray.valueAt(i3);
            if ((view instanceof FilteredSearchView) && (selectionAdapter = ((FilteredSearchView) view).adapter) != null) {
                selectionAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public final void toggleItemSelection(MessageObject messageObject, View view, int i) {
        boolean z;
        FilteredSearchView.MessageHashId messageHashId = new FilteredSearchView.MessageHashId(messageObject.getId(), messageObject.getDialogId());
        HashMap map = this.selectedFiles;
        if (map.containsKey(messageHashId)) {
            map.remove(messageHashId);
        } else if (map.size() >= 100) {
            return;
        } else {
            map.put(messageHashId, messageObject);
        }
        if (map.size() == 0) {
            showActionMode(false);
        } else {
            this.selectedMessagesCountTextView.setNumber(map.size(), true);
            ActionBarMenuItem actionBarMenuItem = this.gotoItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(map.size() == 1 ? 0 : 8);
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
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!((MessageObject) map.get((FilteredSearchView.MessageHashId) it.next())).isDownloadingFile) {
                        z = false;
                        break;
                    }
                }
                this.deleteItem.setVisibility(z ? 0 : 8);
            }
        }
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(map.containsKey(messageHashId), true);
            return;
        }
        if (view instanceof SharedPhotoVideoCell) {
            ((SharedPhotoVideoCell) view).photoVideoViews[i].setChecked(map.containsKey(messageHashId));
            return;
        }
        if (view instanceof SharedLinkCell) {
            ((SharedLinkCell) view).setChecked(map.containsKey(messageHashId), true);
            return;
        }
        if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).setChecked(map.containsKey(messageHashId), true);
        } else if (view instanceof ContextLinkCell) {
            ((ContextLinkCell) view).setChecked(map.containsKey(messageHashId), true);
        } else if (view instanceof DialogCell) {
            ((DialogCell) view).setChecked(map.containsKey(messageHashId), true);
        }
    }

    public final void updateTabs() {
        this.viewPagerAdapter.updateItems();
        fillTabs$1(false);
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.tabsView;
        if (anonymousClass3 != null) {
            anonymousClass3.adapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final void showActionMode() {
        showActionMode(true);
    }
}
