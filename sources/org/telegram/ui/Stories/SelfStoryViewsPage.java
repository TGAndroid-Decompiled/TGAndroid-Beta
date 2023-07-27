package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_stories_getStoryViewsList;
import org.telegram.tgnet.TLRPC$TL_stories_storyViewsList;
import org.telegram.tgnet.TLRPC$TL_storyView;
import org.telegram.tgnet.TLRPC$TL_storyViews;
import org.telegram.tgnet.TLRPC$TL_userStories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
public class SelfStoryViewsPage extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    int currentAccount;
    public LinearLayoutManager layoutManager;
    ListAdapter listAdapter;
    private int measuerdHeight;
    ViewsModel model;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    RecyclerListView recyclerListView;
    Theme.ResourcesProvider resourcesProvider;
    SelfStoryViewsView.StoryItemInternal storyItem;
    private final TextView titleView;

    public SelfStoryViewsPage(final StoryViewer storyViewer, Context context) {
        super(context);
        this.resourcesProvider = storyViewer.resourcesProvider;
        this.currentAccount = storyViewer.currentAccount;
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        addView(textView);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void onMeasure(int i, int i2) {
                SelfStoryViewsPage.this.measuerdHeight = View.MeasureSpec.getSize(i2);
                super.onMeasure(i, i2);
            }
        };
        this.recyclerListView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
        RecyclerListView recyclerListView2 = this.recyclerListView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        this.recyclerListView.setNestedScrollingEnabled(true);
        RecyclerListView recyclerListView3 = this.recyclerListView;
        ListAdapter listAdapter = new ListAdapter();
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        addView(this.recyclerListView);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                SelfStoryViewsPage.this.checkLoadMore();
            }
        });
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                SelfStoryViewsPage.this.lambda$new$0(storyViewer, view, i);
            }
        });
        this.listAdapter.updateRows();
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = Theme.key_dialogBackground;
        view.setBackground(new GradientDrawable(orientation, new int[]{Theme.getColor(i, this.resourcesProvider), 0}));
        addView(view, LayoutHelper.createFrame(-1, 8.0f, 0, 0.0f, 38.0f, 0.0f, 0.0f));
        View view2 = new View(getContext());
        view2.setBackgroundColor(Theme.getColor(i, this.resourcesProvider));
        addView(view2, LayoutHelper.createFrame(-1, 8.0f, 0, 0.0f, 30.0f, 0.0f, 0.0f));
    }

    public void lambda$new$0(StoryViewer storyViewer, View view, int i) {
        TLRPC$TL_storyView tLRPC$TL_storyView = this.listAdapter.items.get(i).user;
        if (tLRPC$TL_storyView != null) {
            storyViewer.presentFragment(ProfileActivity.of(tLRPC$TL_storyView.user_id));
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.recyclerListView) {
            canvas.clipRect(0, AndroidUtilities.dp(46.0f), getMeasuredWidth(), getMeasuredHeight());
            super.drawChild(canvas, view, j);
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public void checkLoadMore() {
        if (this.model == null || this.layoutManager.findLastVisibleItemPosition() <= this.listAdapter.getItemCount() - 10) {
            return;
        }
        this.model.loadNext();
    }

    public void setStoryItem(SelfStoryViewsView.StoryItemInternal storyItemInternal) {
        int i;
        this.storyItem = storyItemInternal;
        TLRPC$StoryItem tLRPC$StoryItem = storyItemInternal.storyItem;
        if (tLRPC$StoryItem != null) {
            ViewsModel viewsModel = MessagesController.getInstance(this.currentAccount).storiesController.selfViewsModel.get(tLRPC$StoryItem.id);
            this.model = viewsModel;
            TLRPC$TL_storyViews tLRPC$TL_storyViews = tLRPC$StoryItem.views;
            int i2 = tLRPC$TL_storyViews == null ? 0 : tLRPC$TL_storyViews.views_count;
            if (viewsModel == null || viewsModel.totalCount != i2) {
                if (viewsModel != null) {
                    viewsModel.release();
                }
                ViewsModel viewsModel2 = new ViewsModel(this.currentAccount, tLRPC$StoryItem);
                this.model = viewsModel2;
                viewsModel2.loadNext();
                MessagesController.getInstance(this.currentAccount).storiesController.selfViewsModel.put(tLRPC$StoryItem.id, this.model);
            }
            TLRPC$TL_storyViews tLRPC$TL_storyViews2 = tLRPC$StoryItem.views;
            if (tLRPC$TL_storyViews2 == null || (i = tLRPC$TL_storyViews2.views_count) == 0) {
                this.titleView.setText(LocaleController.getString("NobodyViewsTitle", R.string.NobodyViewsTitle));
                return;
            } else {
                this.titleView.setText(LocaleController.formatPluralStringComma("Views", i));
                return;
            }
        }
        this.titleView.setText(LocaleController.getString("UploadingStory", R.string.UploadingStory));
    }

    public static void preload(int i, TLRPC$StoryItem tLRPC$StoryItem) {
        if (tLRPC$StoryItem == null) {
            return;
        }
        ViewsModel viewsModel = MessagesController.getInstance(i).storiesController.selfViewsModel.get(tLRPC$StoryItem.id);
        TLRPC$TL_storyViews tLRPC$TL_storyViews = tLRPC$StoryItem.views;
        int i2 = tLRPC$TL_storyViews == null ? 0 : tLRPC$TL_storyViews.views_count;
        if (viewsModel == null || viewsModel.totalCount != i2) {
            if (viewsModel != null) {
                viewsModel.release();
            }
            ViewsModel viewsModel2 = new ViewsModel(i, tLRPC$StoryItem);
            viewsModel2.loadNext();
            MessagesController.getInstance(i).storiesController.selfViewsModel.put(tLRPC$StoryItem.id, viewsModel2);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewsModel viewsModel = this.model;
        if (viewsModel != null) {
            viewsModel.addListener(this);
            this.model.animateDateForUsers.clear();
        }
        this.listAdapter.updateRows();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewsModel viewsModel = this.model;
        if (viewsModel != null) {
            viewsModel.removeListener(this);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void onDataRecieved() {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                SelfStoryViewsPage.this.lambda$onDataRecieved$1();
            }
        });
    }

    public void lambda$onDataRecieved$1() {
        int itemCount = this.listAdapter.getItemCount();
        this.listAdapter.updateRows();
        this.recyclerItemsEnterAnimator.showItemsAnimated(itemCount);
        checkLoadMore();
    }

    public void setListBottomPadding(float f) {
        if (f != this.recyclerListView.getPaddingBottom()) {
            this.recyclerListView.setPadding(0, 0, 0, (int) f);
            this.recyclerListView.requestLayout();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC$TL_userStories stories;
        if (i != NotificationCenter.storiesUpdated || this.storyItem.uploadingStory == null || (stories = MessagesController.getInstance(this.currentAccount).storiesController.getStories(UserConfig.getInstance(this.currentAccount).clientUserId)) == null) {
            return;
        }
        for (int i3 = 0; i3 < stories.stories.size(); i3++) {
            TLRPC$StoryItem tLRPC$StoryItem = stories.stories.get(i3);
            String str = tLRPC$StoryItem.attachPath;
            if (str != null && str.equals(this.storyItem.uploadingStory.path)) {
                SelfStoryViewsView.StoryItemInternal storyItemInternal = this.storyItem;
                storyItemInternal.uploadingStory = null;
                storyItemInternal.storyItem = tLRPC$StoryItem;
                setStoryItem(storyItemInternal);
                return;
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        ArrayList<Item> items;

        private ListAdapter() {
            this.items = new ArrayList<>();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerEmptyView stickerEmptyView;
            if (i == 0) {
                stickerEmptyView = new View(this, SelfStoryViewsPage.this.getContext()) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(46.0f), 1073741824));
                    }
                };
            } else if (i == 1) {
                int i2 = ReactedUserHolderView.STYLE_STORY;
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                stickerEmptyView = new ReactedUserHolderView(i2, selfStoryViewsPage.currentAccount, selfStoryViewsPage.getContext(), SelfStoryViewsPage.this.resourcesProvider) {
                    @Override
                    public void openStory(long j, Runnable runnable) {
                        LaunchActivity.getLastFragment().getOrCreateOverlayStoryViewer().doOnAnimationReady(runnable);
                        LaunchActivity.getLastFragment().getOrCreateOverlayStoryViewer().open(getContext(), j, StoriesListPlaceProvider.of(SelfStoryViewsPage.this.recyclerListView));
                    }
                };
            } else if (i == 3) {
                stickerEmptyView = new FixedHeightEmptyCell(SelfStoryViewsPage.this.getContext(), 70);
            } else if (i == 4) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(SelfStoryViewsPage.this.getContext(), SelfStoryViewsPage.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setViewType(28);
                flickerLoadingView.showDate(false);
                stickerEmptyView = flickerLoadingView;
            } else if (i != 5) {
                stickerEmptyView = new View(this, SelfStoryViewsPage.this.getContext()) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, i4);
                    }
                };
            } else {
                Context context = SelfStoryViewsPage.this.getContext();
                SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                StickerEmptyView stickerEmptyView2 = new StickerEmptyView(context, null, selfStoryViewsPage2.model.isExpiredViews ? 12 : 0, selfStoryViewsPage2.resourcesProvider) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(SelfStoryViewsPage.this.measuerdHeight - SelfStoryViewsPage.this.recyclerListView.getPaddingBottom(), 1073741824));
                    }
                };
                stickerEmptyView2.title.setVisibility(8);
                if (SelfStoryViewsPage.this.model.isExpiredViews) {
                    stickerEmptyView2.subtitle.setText(AndroidUtilities.replaceTags(LocaleController.getString("ExpiredViewsStub", R.string.ExpiredViewsStub)));
                } else {
                    stickerEmptyView2.subtitle.setText(LocaleController.getString("NoViewsStub", R.string.NoViewsStub));
                }
                stickerEmptyView2.showProgress(false, false);
                stickerEmptyView = stickerEmptyView2;
            }
            return new RecyclerListView.Holder(stickerEmptyView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 1) {
                ((ReactedUserHolderView) viewHolder.itemView).setUserReaction(MessagesController.getInstance(SelfStoryViewsPage.this.currentAccount).getUser(Long.valueOf(this.items.get(i).user.user_id)), null, null, this.items.get(i).user.date, true, SelfStoryViewsPage.this.model.animateDateForUsers.remove(Long.valueOf(this.items.get(i).user.user_id)));
            }
        }

        @Override
        public int getItemCount() {
            return this.items.size();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 1;
        }

        public void updateRows() {
            this.items.clear();
            ViewsModel viewsModel = SelfStoryViewsPage.this.model;
            if (viewsModel != null && viewsModel.views.isEmpty()) {
                SelfStoryViewsPage selfStoryViewsPage = SelfStoryViewsPage.this;
                ViewsModel viewsModel2 = selfStoryViewsPage.model;
                if (viewsModel2.isExpiredViews || (!viewsModel2.loading && !viewsModel2.hasNext)) {
                    this.items.add(new Item(5));
                    notifyDataSetChanged();
                }
            }
            this.items.add(new Item(0));
            if (SelfStoryViewsPage.this.model != null) {
                for (int i = 0; i < SelfStoryViewsPage.this.model.views.size(); i++) {
                    ArrayList<Item> arrayList = this.items;
                    SelfStoryViewsPage selfStoryViewsPage2 = SelfStoryViewsPage.this;
                    arrayList.add(new Item(1, selfStoryViewsPage2.model.views.get(i)));
                }
            }
            SelfStoryViewsPage selfStoryViewsPage3 = SelfStoryViewsPage.this;
            ViewsModel viewsModel3 = selfStoryViewsPage3.model;
            if (viewsModel3 != null && (viewsModel3.loading || viewsModel3.hasNext)) {
                this.items.add(new Item(4));
            }
            notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int i) {
            return this.items.get(i).viewType;
        }
    }

    public class Item {
        TLRPC$TL_storyView user;
        final int viewType;

        private Item(SelfStoryViewsPage selfStoryViewsPage, int i) {
            this.viewType = i;
        }

        private Item(SelfStoryViewsPage selfStoryViewsPage, int i, TLRPC$TL_storyView tLRPC$TL_storyView) {
            this.viewType = i;
            this.user = tLRPC$TL_storyView;
        }
    }

    public static class ViewsModel {
        int currentAccount;
        boolean initial;
        boolean isExpiredViews;
        boolean loading;
        int offsetDate;
        long offsetId;
        TLRPC$StoryItem storyItem;
        public int totalCount;
        ArrayList<TLRPC$TL_storyView> views = new ArrayList<>();
        boolean hasNext = true;
        int reqId = -1;
        HashSet<Long> animateDateForUsers = new HashSet<>();
        ArrayList<SelfStoryViewsPage> listeners = new ArrayList<>();

        public ViewsModel(int i, TLRPC$StoryItem tLRPC$StoryItem) {
            this.currentAccount = i;
            this.storyItem = tLRPC$StoryItem;
            TLRPC$TL_storyViews tLRPC$TL_storyViews = tLRPC$StoryItem.views;
            this.totalCount = tLRPC$TL_storyViews == null ? 0 : tLRPC$TL_storyViews.views_count;
            boolean hasExpiredViews = StoriesUtilities.hasExpiredViews(tLRPC$StoryItem);
            this.isExpiredViews = hasExpiredViews;
            if (hasExpiredViews) {
                return;
            }
            this.initial = true;
            if (tLRPC$StoryItem.views != null) {
                for (int i2 = 0; i2 < tLRPC$StoryItem.views.recent_viewers.size(); i2++) {
                    TLRPC$TL_storyView tLRPC$TL_storyView = new TLRPC$TL_storyView();
                    tLRPC$TL_storyView.user_id = tLRPC$StoryItem.views.recent_viewers.get(i2).longValue();
                    tLRPC$TL_storyView.date = 0;
                    this.views.add(tLRPC$TL_storyView);
                }
            }
        }

        public void loadNext() {
            if (this.loading || !this.hasNext || this.isExpiredViews) {
                return;
            }
            final TLRPC$TL_stories_getStoryViewsList tLRPC$TL_stories_getStoryViewsList = new TLRPC$TL_stories_getStoryViewsList();
            tLRPC$TL_stories_getStoryViewsList.id = this.storyItem.id;
            tLRPC$TL_stories_getStoryViewsList.limit = this.initial ? 20 : 100;
            tLRPC$TL_stories_getStoryViewsList.offset_id = this.offsetId;
            tLRPC$TL_stories_getStoryViewsList.offset_date = this.offsetDate;
            this.loading = true;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stories_getStoryViewsList, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SelfStoryViewsPage.ViewsModel.this.lambda$loadNext$1(tLRPC$TL_stories_getStoryViewsList, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$loadNext$1(final TLRPC$TL_stories_getStoryViewsList tLRPC$TL_stories_getStoryViewsList, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SelfStoryViewsPage.ViewsModel.this.lambda$loadNext$0(tLObject, tLRPC$TL_stories_getStoryViewsList);
                }
            });
        }

        public void lambda$loadNext$0(TLObject tLObject, TLRPC$TL_stories_getStoryViewsList tLRPC$TL_stories_getStoryViewsList) {
            this.loading = false;
            this.reqId = -1;
            if (tLObject != null) {
                TLRPC$TL_stories_storyViewsList tLRPC$TL_stories_storyViewsList = (TLRPC$TL_stories_storyViewsList) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_stories_storyViewsList.users, false);
                if (this.initial) {
                    this.initial = false;
                    for (int i = 0; i < this.views.size(); i++) {
                        this.animateDateForUsers.add(Long.valueOf(this.views.get(i).user_id));
                    }
                    this.views.clear();
                }
                this.views.addAll(tLRPC$TL_stories_storyViewsList.views);
                if (!tLRPC$TL_stories_storyViewsList.views.isEmpty()) {
                    ArrayList<TLRPC$TL_storyView> arrayList = tLRPC$TL_stories_storyViewsList.views;
                    TLRPC$TL_storyView tLRPC$TL_storyView = arrayList.get(arrayList.size() - 1);
                    this.offsetDate = tLRPC$TL_storyView.date;
                    this.offsetId = tLRPC$TL_storyView.user_id;
                    this.hasNext = tLRPC$TL_stories_storyViewsList.views.size() == tLRPC$TL_stories_getStoryViewsList.limit;
                } else {
                    this.hasNext = false;
                }
                TLRPC$StoryItem tLRPC$StoryItem = this.storyItem;
                if (tLRPC$StoryItem.views == null) {
                    tLRPC$StoryItem.views = new TLRPC$TL_storyViews();
                }
                int i2 = tLRPC$TL_stories_storyViewsList.count;
                TLRPC$TL_storyViews tLRPC$TL_storyViews = this.storyItem.views;
                if (i2 > tLRPC$TL_storyViews.views_count) {
                    tLRPC$TL_storyViews.recent_viewers.clear();
                    for (int i3 = 0; i3 < Math.min(3, tLRPC$TL_stories_storyViewsList.users.size()); i3++) {
                        this.storyItem.views.recent_viewers.add(Long.valueOf(tLRPC$TL_stories_storyViewsList.users.get(i3).id));
                    }
                    this.storyItem.views.views_count = tLRPC$TL_stories_storyViewsList.count;
                }
            } else {
                this.hasNext = false;
            }
            for (int i4 = 0; i4 < this.listeners.size(); i4++) {
                this.listeners.get(i4).onDataRecieved();
            }
        }

        public void addListener(SelfStoryViewsPage selfStoryViewsPage) {
            if (this.listeners.contains(selfStoryViewsPage)) {
                return;
            }
            this.listeners.add(selfStoryViewsPage);
        }

        public void removeListener(SelfStoryViewsPage selfStoryViewsPage) {
            this.listeners.remove(selfStoryViewsPage);
        }

        public void release() {
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, false);
            }
            this.reqId = -1;
        }
    }
}
