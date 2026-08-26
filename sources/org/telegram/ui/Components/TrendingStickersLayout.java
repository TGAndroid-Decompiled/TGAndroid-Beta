package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.FeaturedStickerSetCell2;
import org.telegram.ui.Cells.FeaturedStickerSetInfoCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.DefaultThemesPreviewCell;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda61;

public final class TrendingStickersLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final TrendingStickersAdapter adapter;
    public final int currentAccount;
    public final Delegate delegate;
    public ValueAnimator glueToTopAnimator;
    public boolean gluedToTop;
    public long hash;
    public float highlightProgress;
    public boolean ignoreLayout;
    public final LongSparseArray installingStickerSets;
    public final AnonymousClass4 layoutManager;
    public final AnonymousClass3 listView;
    public boolean loaded;
    public boolean motionEventCatchedByListView;
    public RecyclerView.OnScrollListener onScrollListener;
    public final Paint paint;
    public BaseFragment parentFragment;
    public final TLRPC.StickerSetCovered[] primaryInstallingStickerSets;
    public final LongSparseArray removingStickerSets;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scrollFromAnimator;
    public final TLRPC.StickerSetCovered scrollToSet;
    public final StickersSearchAdapter searchAdapter;
    public final FrameLayout searchLayout;
    public final AnonymousClass2 searchView;
    public final View shadowView;
    public boolean shadowVisible;
    public int topOffset;
    public boolean wasLayout;

    public final class AnonymousClass1 {
        public final Delegate val$delegate;

        public AnonymousClass1(Delegate delegate) {
            this.val$delegate = delegate;
        }

        public final int getStickersPerRow() {
            return TrendingStickersLayout.this.adapter.stickersPerRow;
        }

        public final void setAdapterVisible(boolean z) {
            RecyclerView.Adapter adapter;
            TrendingStickersAdapter trendingStickersAdapter;
            TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
            if (z) {
                RecyclerView.Adapter adapter2 = trendingStickersLayout.listView.getAdapter();
                StickersSearchAdapter stickersSearchAdapter = trendingStickersLayout.searchAdapter;
                if (adapter2 != stickersSearchAdapter) {
                    trendingStickersLayout.listView.setAdapter(stickersSearchAdapter);
                } else {
                    if (!z) {
                        return;
                    }
                    adapter = trendingStickersLayout.listView.getAdapter();
                    trendingStickersAdapter = trendingStickersLayout.adapter;
                    if (adapter != trendingStickersAdapter) {
                        return;
                    } else {
                        trendingStickersLayout.listView.setAdapter(trendingStickersAdapter);
                    }
                }
            } else {
                if (!z) {
                    return;
                }
                adapter = trendingStickersLayout.listView.getAdapter();
                trendingStickersAdapter = trendingStickersLayout.adapter;
                if (adapter != trendingStickersAdapter) {
                    return;
                } else {
                    trendingStickersLayout.listView.setAdapter(trendingStickersAdapter);
                }
            }
            if (trendingStickersLayout.listView.getAdapter().getItemCount() > 0) {
                trendingStickersLayout.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(58.0f) + (-trendingStickersLayout.listView.getPaddingTop()) + trendingStickersLayout.topOffset, false);
            }
        }
    }

    public final class AnonymousClass3 extends RecyclerListView {
        public final Delegate val$delegate;

        public AnonymousClass3(Context context, Delegate delegate) {
            super(context, null);
            this.val$delegate = delegate;
        }

        @Override
        public final boolean allowSelectChildAtPosition(float f) {
            return f >= ((float) (AndroidUtilities.dp(58.0f) + TrendingStickersLayout.this.topOffset));
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            TrendingStickersLayout.this.motionEventCatchedByListView = true;
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent) || this.val$delegate.onListViewInterceptTouchEvent(this, motionEvent);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (TrendingStickersLayout.this.glueToTopAnimator != null) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (TrendingStickersLayout.this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public abstract class Delegate {
        public String[] lastSearchKeyboardLanguage = new String[0];

        public boolean canSchedule() {
            return false;
        }

        public String[] getLastSearchKeyboardLanguage() {
            return this.lastSearchKeyboardLanguage;
        }

        public boolean isInScheduleMode() {
            return false;
        }

        public boolean onListViewInterceptTouchEvent(AnonymousClass3 anonymousClass3, MotionEvent motionEvent) {
            return false;
        }

        public boolean onListViewTouchEvent(AnonymousClass3 anonymousClass3, PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61, MotionEvent motionEvent) {
            return false;
        }

        public void onStickerSelected(TLRPC.Document document, Object obj, boolean z, int i) {
        }

        public abstract void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered, boolean z);

        public abstract void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered);

        public void setLastSearchKeyboardLanguage(String[] strArr) {
            this.lastSearchKeyboardLanguage = strArr;
        }
    }

    public TrendingStickersLayout(Context context, final Delegate delegate, TLRPC.StickerSetCovered[] stickerSetCoveredArr, LongSparseArray longSparseArray, LongSparseArray longSparseArray2, TLRPC.StickerSetCovered stickerSetCovered, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.highlightProgress = 1.0f;
        this.paint = new Paint();
        this.delegate = delegate;
        this.primaryInstallingStickerSets = stickerSetCoveredArr;
        this.installingStickerSets = longSparseArray;
        this.removingStickerSets = longSparseArray2;
        this.scrollToSet = stickerSetCovered;
        this.resourcesProvider = resourcesProvider;
        TrendingStickersAdapter trendingStickersAdapter = new TrendingStickersAdapter(context);
        this.adapter = trendingStickersAdapter;
        this.searchAdapter = new StickersSearchAdapter(context, new AnonymousClass1(delegate), stickerSetCoveredArr, longSparseArray, longSparseArray2, resourcesProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchLayout = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        ?? r3 = new SearchField(context, resourcesProvider) {
            @Override
            public final void onTextChange(String str) {
                StickersSearchAdapter stickersSearchAdapter = TrendingStickersLayout.this.searchAdapter;
                int i2 = stickersSearchAdapter.reqId;
                int i3 = stickersSearchAdapter.currentAccount;
                if (i2 != 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(stickersSearchAdapter.reqId, true);
                    stickersSearchAdapter.reqId = 0;
                }
                if (stickersSearchAdapter.reqId2 != 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(stickersSearchAdapter.reqId2, true);
                    stickersSearchAdapter.reqId2 = 0;
                }
                if (TextUtils.isEmpty(str)) {
                    stickersSearchAdapter.searchQuery = null;
                    stickersSearchAdapter.localPacks.clear();
                    stickersSearchAdapter.emojiStickers.clear();
                    stickersSearchAdapter.serverPacks.clear();
                    stickersSearchAdapter.delegate.setAdapterVisible(false);
                    stickersSearchAdapter.notifyDataSetChanged();
                } else {
                    stickersSearchAdapter.searchQuery = str.toLowerCase();
                }
                StickersSearchAdapter.AnonymousClass1 anonymousClass1 = stickersSearchAdapter.searchRunnable;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                AndroidUtilities.runOnUIThread(anonymousClass1, 300L);
            }
        };
        this.searchView = r3;
        r3.setHint(LocaleController.getString(R.string.SearchTrendingStickersHint));
        frameLayout.addView((View) r3, LayoutHelper.createFrame(-1, -1, 48));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, delegate);
        this.listView = anonymousClass3;
        final PhotoViewer$$ExternalSyntheticLambda61 photoViewer$$ExternalSyntheticLambda61 = new PhotoViewer$$ExternalSyntheticLambda61(this, 4);
        anonymousClass3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return delegate.onListViewTouchEvent(this.f$0.listView, photoViewer$$ExternalSyntheticLambda61, motionEvent);
            }
        });
        anonymousClass3.setOverScrollMode(2);
        anonymousClass3.setClipToPadding(false);
        anonymousClass3.setItemAnimator(null);
        anonymousClass3.setLayoutAnimation(null);
        ?? r6 = new FillLastGridLayoutManager(AndroidUtilities.dp(58.0f), anonymousClass3) {
            @Override
            public final boolean isLayoutRTL() {
                return LocaleController.isRTL;
            }

            @Override
            public final int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
                int i3;
                View viewFindViewByPosition;
                TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
                if (trendingStickersLayout.scrollFromAnimator) {
                    return super.scrollVerticallyBy(i2, recycler, state);
                }
                int i4 = 0;
                if (trendingStickersLayout.glueToTopAnimator != null) {
                    return 0;
                }
                if (trendingStickersLayout.gluedToTop) {
                    while (true) {
                        i3 = 1;
                        if (i4 >= getChildCount()) {
                            break;
                        }
                        View childAt = getChildAt(i4);
                        trendingStickersLayout.listView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                        if (childAdapterPosition < 1) {
                            i3 = childAdapterPosition;
                            break;
                        }
                        i4++;
                    }
                    if (i3 == 0 && (viewFindViewByPosition = trendingStickersLayout.layoutManager.findViewByPosition(i3)) != null && viewFindViewByPosition.getTop() - i2 > AndroidUtilities.dp(58.0f)) {
                        i2 = viewFindViewByPosition.getTop() - AndroidUtilities.dp(58.0f);
                    }
                }
                return super.scrollVerticallyBy(i2, recycler, state);
            }

            @Override
            public final boolean shouldCalcLastItemHeight() {
                TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
                return trendingStickersLayout.listView.getAdapter() == trendingStickersLayout.searchAdapter;
            }

            @Override
            public final boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = r6;
        anonymousClass3.setLayoutManager(r6);
        r6.mSpanSizeLookup = new BaseMenuWrapper() {
            @Override
            public final int getSpanSize(int i2) {
                TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
                RecyclerView.Adapter adapter = trendingStickersLayout.listView.getAdapter();
                TrendingStickersAdapter trendingStickersAdapter2 = trendingStickersLayout.adapter;
                if (adapter == trendingStickersAdapter2) {
                    if ((trendingStickersAdapter2.cache.get(i2) instanceof Integer) || i2 >= trendingStickersLayout.adapter.totalItems) {
                        return trendingStickersLayout.adapter.stickersPerRow;
                    }
                    return 1;
                }
                StickersSearchAdapter stickersSearchAdapter = trendingStickersLayout.searchAdapter;
                if (i2 != stickersSearchAdapter.totalItems) {
                    SparseArray sparseArray = stickersSearchAdapter.cache;
                    if (sparseArray.get(i2) == null || (sparseArray.get(i2) instanceof TLRPC.Document)) {
                        return 1;
                    }
                }
                return stickersSearchAdapter.delegate.getStickersPerRow();
            }
        };
        anonymousClass3.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                RecyclerView.OnScrollListener onScrollListener = TrendingStickersLayout.this.onScrollListener;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(recyclerView, i2);
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
                RecyclerView.OnScrollListener onScrollListener = trendingStickersLayout.onScrollListener;
                AnonymousClass3 anonymousClass4 = trendingStickersLayout.listView;
                if (onScrollListener != null) {
                    onScrollListener.onScrolled(anonymousClass4, i2, i3);
                }
                if (i3 > 0) {
                    RecyclerView.Adapter adapter = anonymousClass4.getAdapter();
                    TrendingStickersAdapter trendingStickersAdapter2 = trendingStickersLayout.adapter;
                    if (adapter != trendingStickersAdapter2 || !trendingStickersLayout.loaded || trendingStickersAdapter2.loadingMore || trendingStickersAdapter2.endReached) {
                        return;
                    }
                    if (trendingStickersLayout.layoutManager.findLastVisibleItemPosition() >= ((trendingStickersAdapter2.totalItems + 1) - ((trendingStickersAdapter2.stickersPerRow + 1) * 10)) - 1) {
                        TrendingStickersLayout trendingStickersLayout2 = TrendingStickersLayout.this;
                        if (!trendingStickersLayout2.loaded || trendingStickersAdapter2.loadingMore || trendingStickersAdapter2.endReached) {
                            return;
                        }
                        trendingStickersAdapter2.loadingMore = true;
                        TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                        tL_messages_getOldFeaturedStickers.offset = trendingStickersAdapter2.otherPacks.size();
                        tL_messages_getOldFeaturedStickers.limit = 40;
                        ConnectionsManager.getInstance(trendingStickersLayout2.currentAccount).sendRequest(tL_messages_getOldFeaturedStickers, new LinkManager$$ExternalSyntheticLambda3(trendingStickersAdapter2, 6));
                    }
                }
            }
        });
        anonymousClass3.setAdapter(trendingStickersAdapter);
        anonymousClass3.setOnItemClickListener(photoViewer$$ExternalSyntheticLambda61);
        addView(anonymousClass3, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.shadowView = view;
        view.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine, resourcesProvider));
        view.setAlpha(0.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight());
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        addView(view, layoutParams);
        addView(frameLayout, LayoutHelper.createFrame(-1, 58, 51));
        updateColors$1();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
        notificationCenter.addObserver(this, NotificationCenter.stickersDidLoad);
        notificationCenter.addObserver(this, NotificationCenter.featuredStickersDidLoad);
    }

    private void setShadowVisible(boolean z) {
        if (this.shadowVisible != z) {
            this.shadowVisible = z;
            OKLCH.m(this.shadowView.animate(), z ? 1.0f : 0.0f, 200L);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.stickersDidLoad;
        TrendingStickersAdapter trendingStickersAdapter = this.adapter;
        AnonymousClass3 anonymousClass3 = this.listView;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 0) {
                if (!this.loaded) {
                    trendingStickersAdapter.refreshStickerSets();
                    return;
                }
                RecyclerView.Adapter adapter = anonymousClass3.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemRangeChanged(0, adapter.getItemCount(), 0);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.featuredStickersDidLoad) {
            if (this.hash != MediaDataController.getInstance(this.currentAccount).getFeaturedStickersHashWithoutUnread(false)) {
                this.loaded = false;
            }
            if (!this.loaded) {
                trendingStickersAdapter.refreshStickerSets();
                return;
            }
            RecyclerView.Adapter adapter2 = anonymousClass3.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeChanged(0, adapter2.getItemCount(), 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        TLRPC.StickerSetCovered stickerSetCovered;
        int y;
        int measuredHeight;
        float f = this.highlightProgress;
        if (f == 0.0f || (stickerSetCovered = this.scrollToSet) == null) {
            canvas2 = canvas;
        } else {
            float f2 = f - 0.0053333333f;
            this.highlightProgress = f2;
            if (f2 < 0.0f) {
                this.highlightProgress = 0.0f;
            } else {
                invalidate();
            }
            Integer num = (Integer) this.adapter.setsToPosition.get(stickerSetCovered);
            if (num != null) {
                int iIntValue = num.intValue();
                AnonymousClass4 anonymousClass4 = this.layoutManager;
                View viewFindViewByPosition = anonymousClass4.findViewByPosition(iIntValue);
                if (viewFindViewByPosition != null) {
                    y = (int) viewFindViewByPosition.getY();
                    measuredHeight = viewFindViewByPosition.getMeasuredHeight() + ((int) viewFindViewByPosition.getY());
                } else {
                    y = -1;
                    measuredHeight = -1;
                }
                View viewFindViewByPosition2 = anonymousClass4.findViewByPosition(num.intValue() + 1);
                if (viewFindViewByPosition2 != null) {
                    if (viewFindViewByPosition == null) {
                        y = (int) viewFindViewByPosition2.getY();
                    }
                    measuredHeight = viewFindViewByPosition2.getMeasuredHeight() + ((int) viewFindViewByPosition2.getY());
                }
                if (viewFindViewByPosition == null && viewFindViewByPosition2 == null) {
                    canvas2 = canvas;
                } else {
                    Paint paint = this.paint;
                    paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                    float f3 = this.highlightProgress;
                    paint.setAlpha((int) ((f3 < 0.06f ? f3 / 0.06f : 1.0f) * 25.5f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, y, getMeasuredWidth(), measuredHeight, paint);
                }
            } else {
                canvas2 = canvas;
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.motionEventCatchedByListView = false;
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!this.motionEventCatchedByListView) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            this.listView.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        return zDispatchTouchEvent;
    }

    public int getContentTopOffset() {
        return this.topOffset;
    }

    public final void glueToTop(boolean z) {
        this.gluedToTop = z;
        if (!z) {
            ValueAnimator valueAnimator = this.glueToTopAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.glueToTopAnimator.cancel();
                this.glueToTopAnimator = null;
                return;
            }
            return;
        }
        if (getContentTopOffset() <= 0 || this.glueToTopAnimator != null) {
            return;
        }
        int contentTopOffset = getContentTopOffset();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.glueToTopAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new DefaultThemesPreviewCell.AnonymousClass2.AnonymousClass1(this, contentTopOffset));
        this.glueToTopAnimator.addListener(new Tooltip.AnonymousClass1(this, 15));
        this.glueToTopAnimator.setDuration(250L);
        this.glueToTopAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        this.glueToTopAnimator.start();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        adapter.notifyItemChanged(adapter.getItemCount() - 1);
        this.wasLayout = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Integer num;
        super.onLayout(z, i, i2, i3, i4);
        if (this.wasLayout) {
            return;
        }
        this.wasLayout = true;
        TrendingStickersAdapter trendingStickersAdapter = this.adapter;
        trendingStickersAdapter.refreshStickerSets();
        TLRPC.StickerSetCovered stickerSetCovered = this.scrollToSet;
        if (stickerSetCovered == null || (num = (Integer) trendingStickersAdapter.setsToPosition.get(stickerSetCovered)) == null) {
            return;
        }
        int iIntValue = num.intValue();
        int iDp = AndroidUtilities.dp(58.0f) + (-this.listView.getPaddingTop());
        AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(iIntValue, iDp, anonymousClass4.mShouldReverseLayout);
    }

    public void setContentViewPaddingTop(int i) {
        int iDp = AndroidUtilities.dp(58.0f) + i;
        AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3.getPaddingTop() != iDp) {
            this.ignoreLayout = true;
            anonymousClass3.setPadding(0, iDp, 0, 0);
            this.ignoreLayout = false;
        }
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public void setParentFragment(BaseFragment baseFragment) {
        this.parentFragment = baseFragment;
    }

    public final void showStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet) {
        if (stickerSet != null) {
            inputStickerSet = new TLRPC.TL_inputStickerSetID();
            inputStickerSet.access_hash = stickerSet.access_hash;
            inputStickerSet.id = stickerSet.id;
        }
        final TLRPC.InputStickerSet inputStickerSet2 = inputStickerSet;
        if (inputStickerSet2 != null) {
            Delegate delegate = this.delegate;
            delegate.getClass();
            StickersAlert stickersAlert = new StickersAlert(getContext(), this.parentFragment, inputStickerSet2, null, delegate instanceof EmojiView.AnonymousClass31 ? new StickersAlert.StickersAlertDelegate() {
                @Override
                public final boolean canSchedule() {
                    return TrendingStickersLayout.this.delegate.canSchedule();
                }

                @Override
                public final boolean isInScheduleMode() {
                    return TrendingStickersLayout.this.delegate.isInScheduleMode();
                }

                @Override
                public final void onStickerSelected(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, boolean z2, int i, int i2) {
                    TrendingStickersLayout.this.delegate.onStickerSelected(document, obj, z2, i);
                }
            } : null, this.resourcesProvider);
            stickersAlert.showTooltipWhenToggle = false;
            stickersAlert.installDelegate = new StickersAlert.StickersAlertInstallDelegate() {
                @Override
                public final void onStickerSetInstalled() {
                    TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
                    RecyclerView.Adapter adapter = trendingStickersLayout.listView.getAdapter();
                    TrendingStickersAdapter trendingStickersAdapter = trendingStickersLayout.adapter;
                    TLRPC.InputStickerSet inputStickerSet3 = inputStickerSet2;
                    int i = 0;
                    if (adapter == trendingStickersAdapter) {
                        while (i < trendingStickersLayout.adapter.sets.size()) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) trendingStickersLayout.adapter.sets.get(i);
                            if (stickerSetCovered.set.id == inputStickerSet3.id) {
                                trendingStickersLayout.adapter.installStickerSet(stickerSetCovered, null);
                                return;
                            }
                            i++;
                        }
                        return;
                    }
                    while (true) {
                        StickersSearchAdapter stickersSearchAdapter = trendingStickersLayout.searchAdapter;
                        if (i >= stickersSearchAdapter.serverPacks.size()) {
                            return;
                        }
                        TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) stickersSearchAdapter.serverPacks.get(i);
                        if (stickerSetCovered2.set.id == inputStickerSet3.id) {
                            stickersSearchAdapter.installStickerSet(stickerSetCovered2, null);
                            return;
                        }
                        i++;
                    }
                }
            };
            this.parentFragment.showDialog(stickersAlert);
        }
    }

    public final boolean update$1() {
        AnonymousClass3 anonymousClass3 = this.listView;
        int childCount = anonymousClass3.getChildCount();
        View view = this.shadowView;
        FrameLayout frameLayout = this.searchLayout;
        if (childCount <= 0) {
            int paddingTop = anonymousClass3.getPaddingTop();
            this.topOffset = paddingTop;
            anonymousClass3.setTopGlowOffset(paddingTop);
            frameLayout.setTranslationY(this.topOffset);
            view.setTranslationY(this.topOffset);
            setShadowVisible(false);
            return true;
        }
        View childAt = anonymousClass3.getChildAt(0);
        for (int i = 1; i < anonymousClass3.getChildCount(); i++) {
            View childAt2 = anonymousClass3.getChildAt(i);
            if (childAt2.getTop() < childAt.getTop()) {
                childAt = childAt2;
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass3.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(58.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        setShadowVisible(top < 0);
        if (this.topOffset == i2) {
            return false;
        }
        this.topOffset = i2;
        anonymousClass3.setTopGlowOffset(AndroidUtilities.dp(58.0f) + i2);
        frameLayout.setTranslationY(this.topOffset);
        view.setTranslationY(this.topOffset);
        return true;
    }

    public final void updateColors$1() {
        AnonymousClass3 anonymousClass3 = this.listView;
        RecyclerView.Adapter adapter = anonymousClass3.getAdapter();
        TrendingStickersAdapter trendingStickersAdapter = this.adapter;
        if (adapter != trendingStickersAdapter) {
            this.searchAdapter.getClass();
            int childCount = anonymousClass3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = anonymousClass3.getChildAt(i);
                if (childAt instanceof FeaturedStickerSetInfoCell) {
                    ((FeaturedStickerSetInfoCell) childAt).updateColors();
                } else if (childAt instanceof StickerSetNameCell) {
                    StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) childAt;
                    stickerSetNameCell.updateTextSearchSpan();
                    stickerSetNameCell.updateUrlSearchSpan();
                }
            }
            return;
        }
        trendingStickersAdapter.getClass();
        int childCount2 = anonymousClass3.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = anonymousClass3.getChildAt(i2);
            if (childAt2 instanceof FeaturedStickerSetInfoCell) {
                ((FeaturedStickerSetInfoCell) childAt2).updateColors();
            } else if (childAt2 instanceof FeaturedStickerSetCell2) {
                FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) childAt2;
                featuredStickerSetCell2.addButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
                int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
                Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
                featuredStickerSetCell2.addButton.setBackgroundRoundRect(14.0f, color);
            }
        }
    }

    public final class TrendingStickersAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public boolean endReached;
        public boolean loadingMore;
        public int totalItems;
        public final SparseArray cache = new SparseArray();
        public final ArrayList sets = new ArrayList();
        public final SparseArray positionsToSets = new SparseArray();
        public final HashMap setsToPosition = new HashMap();
        public final ArrayList otherPacks = new ArrayList();
        public int stickersPerRow = 5;

        public TrendingStickersAdapter(Context context) {
            this.context = context;
        }

        public final void bindStickerSetCell(View view, int i, boolean z) {
            TLRPC.StickerSetCovered stickerSetCovered;
            boolean z2;
            boolean z3;
            TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
            MediaDataController mediaDataController = MediaDataController.getInstance(trendingStickersLayout.currentAccount);
            int i2 = this.totalItems;
            ArrayList arrayList = this.sets;
            SparseArray sparseArray = this.cache;
            boolean z4 = true;
            if (i < i2) {
                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue());
                ArrayList<Long> unreadStickerSets = mediaDataController.getUnreadStickerSets();
                boolean z5 = unreadStickerSets != null && unreadStickerSets.contains(Long.valueOf(stickerSetCovered.set.id));
                if (z5) {
                    mediaDataController.markFeaturedStickersByIdAsRead(false, stickerSetCovered.set.id);
                }
                z2 = z5;
            } else {
                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue());
                z2 = false;
            }
            TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
            mediaDataController.preloadStickerSetThumb(stickerSetCovered2);
            int i3 = 0;
            while (true) {
                TLRPC.StickerSetCovered[] stickerSetCoveredArr = trendingStickersLayout.primaryInstallingStickerSets;
                if (i3 >= stickerSetCoveredArr.length) {
                    z3 = false;
                    break;
                }
                if (stickerSetCoveredArr[i3] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(trendingStickersLayout.currentAccount).getStickerSetById(stickerSetCoveredArr[i3].set.id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i3] = null;
                    } else if (stickerSetCoveredArr[i3].set.id == stickerSetCovered2.set.id) {
                        z3 = true;
                        break;
                    }
                }
                i3++;
            }
            boolean zIsStickerPackInstalled = mediaDataController.isStickerPackInstalled(stickerSetCovered2.set.id);
            LongSparseArray longSparseArray = trendingStickersLayout.installingStickerSets;
            boolean z6 = longSparseArray.indexOfKey(stickerSetCovered2.set.id) >= 0;
            LongSparseArray longSparseArray2 = trendingStickersLayout.removingStickerSets;
            boolean z7 = longSparseArray2.indexOfKey(stickerSetCovered2.set.id) >= 0;
            if (z6 && zIsStickerPackInstalled) {
                longSparseArray.remove(stickerSetCovered2.set.id);
                z6 = false;
            } else if (z7 && !zIsStickerPackInstalled) {
                longSparseArray2.remove(stickerSetCovered2.set.id);
            }
            FeaturedStickerSetInfoCell featuredStickerSetInfoCell = (FeaturedStickerSetInfoCell) view;
            featuredStickerSetInfoCell.setStickerSet(stickerSetCovered2, z2, z, 0, 0, z3);
            featuredStickerSetInfoCell.setAddDrawProgress(!z3 && z6, z);
            if (i > 0) {
                int i4 = i - 1;
                if (sparseArray.get(i4) != null && sparseArray.get(i4).equals(-1)) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            featuredStickerSetInfoCell.setNeedDivider(z4);
        }

        @Override
        public final int getItemCount() {
            return this.totalItems + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == this.totalItems) {
                return 3;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return 0;
            }
            return obj.equals(-1) ? 4 : 2;
        }

        public final void installStickerSet(TLRPC.StickerSetCovered stickerSetCovered, FrameLayout frameLayout) {
            TrendingStickersLayout trendingStickersLayout;
            TLRPC.StickerSetCovered[] stickerSetCoveredArr;
            boolean z;
            int i = 0;
            while (true) {
                trendingStickersLayout = TrendingStickersLayout.this;
                TLRPC.StickerSetCovered[] stickerSetCoveredArr2 = trendingStickersLayout.primaryInstallingStickerSets;
                int length = stickerSetCoveredArr2.length;
                stickerSetCoveredArr = trendingStickersLayout.primaryInstallingStickerSets;
                if (i >= length) {
                    break;
                }
                if (stickerSetCoveredArr2[i] != null) {
                    TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(trendingStickersLayout.currentAccount).getStickerSetById(stickerSetCoveredArr[i].set.id);
                    if (stickerSetById != null && !stickerSetById.set.archived) {
                        stickerSetCoveredArr[i] = null;
                        break;
                    } else if (stickerSetCoveredArr[i].set.id == stickerSetCovered.set.id) {
                        return;
                    }
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= stickerSetCoveredArr.length) {
                    z = false;
                    break;
                } else {
                    if (stickerSetCoveredArr[i2] == null) {
                        stickerSetCoveredArr[i2] = stickerSetCovered;
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            if (!z && frameLayout != null) {
                if (frameLayout instanceof FeaturedStickerSetCell2) {
                    ((FeaturedStickerSetCell2) frameLayout).addButton.setDrawProgress(true, true);
                } else if (frameLayout instanceof FeaturedStickerSetInfoCell) {
                    ((FeaturedStickerSetInfoCell) frameLayout).setAddDrawProgress(true, true);
                }
            }
            trendingStickersLayout.installingStickerSets.put(stickerSetCovered.set.id, stickerSetCovered);
            if (frameLayout != null) {
                trendingStickersLayout.delegate.onStickerSetAdd(stickerSetCovered, z);
                return;
            }
            SparseArray sparseArray = this.positionsToSets;
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) sparseArray.get(i3);
                if (stickerSetCovered2 != null && stickerSetCovered2.set.id == stickerSetCovered.set.id) {
                    this.mObservable.notifyItemRangeChanged(i3, 1, 0);
                    return;
                }
            }
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 5;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            if (!list.contains(0)) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            int i2 = viewHolder.mItemViewType;
            if (i2 == 2 || i2 == 5) {
                bindStickerSetCell(viewHolder.itemView, i, true);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View emptyCell;
            TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
            Context context = this.context;
            if (i != 0) {
                if (i == 1) {
                    emptyCell = new EmptyCell(context);
                } else if (i == 2) {
                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell = new FeaturedStickerSetInfoCell(17, this.context, trendingStickersLayout.resourcesProvider, true, true);
                    final int i2 = 1;
                    featuredStickerSetInfoCell.setAddOnClickListener(new View.OnClickListener(this) {
                        public final TrendingStickersLayout.TrendingStickersAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i2) {
                                case 0:
                                    TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter = this.f$0;
                                    trendingStickersAdapter.getClass();
                                    FeaturedStickerSetCell2 featuredStickerSetCell2 = (FeaturedStickerSetCell2) view2.getParent();
                                    TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell2.getStickerSet();
                                    TrendingStickersLayout trendingStickersLayout2 = TrendingStickersLayout.this;
                                    if (trendingStickersLayout2.installingStickerSets.indexOfKey(stickerSet.set.id) < 0) {
                                        long j = stickerSet.set.id;
                                        LongSparseArray longSparseArray = trendingStickersLayout2.removingStickerSets;
                                        if (longSparseArray.indexOfKey(j) < 0) {
                                            if (!featuredStickerSetCell2.isInstalled) {
                                                trendingStickersAdapter.installStickerSet(stickerSet, featuredStickerSetCell2);
                                            } else {
                                                longSparseArray.put(stickerSet.set.id, stickerSet);
                                                trendingStickersLayout2.delegate.onStickerSetRemove(stickerSet);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter2 = this.f$0;
                                    trendingStickersAdapter2.getClass();
                                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell2 = (FeaturedStickerSetInfoCell) view2.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = featuredStickerSetInfoCell2.getStickerSet();
                                    TrendingStickersLayout trendingStickersLayout3 = TrendingStickersLayout.this;
                                    if (trendingStickersLayout3.installingStickerSets.indexOfKey(stickerSet2.set.id) < 0) {
                                        long j2 = stickerSet2.set.id;
                                        LongSparseArray longSparseArray2 = trendingStickersLayout3.removingStickerSets;
                                        if (longSparseArray2.indexOfKey(j2) < 0) {
                                            if (!featuredStickerSetInfoCell2.isInstalled) {
                                                trendingStickersAdapter2.installStickerSet(stickerSet2, featuredStickerSetInfoCell2);
                                            } else {
                                                longSparseArray2.put(stickerSet2.set.id, stickerSet2);
                                                trendingStickersLayout3.delegate.onStickerSetRemove(stickerSet2);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    emptyCell = featuredStickerSetInfoCell;
                } else if (i == 3) {
                    emptyCell = new View(context);
                } else if (i == 4) {
                    emptyCell = new GraySectionCell(context, 16, trendingStickersLayout.resourcesProvider);
                } else if (i != 5) {
                    emptyCell = null;
                } else {
                    FeaturedStickerSetCell2 featuredStickerSetCell2 = new FeaturedStickerSetCell2(context, trendingStickersLayout.resourcesProvider);
                    final int i3 = 0;
                    featuredStickerSetCell2.setAddOnClickListener(new View.OnClickListener(this) {
                        public final TrendingStickersLayout.TrendingStickersAdapter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (i3) {
                                case 0:
                                    TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter = this.f$0;
                                    trendingStickersAdapter.getClass();
                                    FeaturedStickerSetCell2 featuredStickerSetCell3 = (FeaturedStickerSetCell2) view2.getParent();
                                    TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell3.getStickerSet();
                                    TrendingStickersLayout trendingStickersLayout2 = TrendingStickersLayout.this;
                                    if (trendingStickersLayout2.installingStickerSets.indexOfKey(stickerSet.set.id) < 0) {
                                        long j = stickerSet.set.id;
                                        LongSparseArray longSparseArray = trendingStickersLayout2.removingStickerSets;
                                        if (longSparseArray.indexOfKey(j) < 0) {
                                            if (!featuredStickerSetCell3.isInstalled) {
                                                trendingStickersAdapter.installStickerSet(stickerSet, featuredStickerSetCell3);
                                            } else {
                                                longSparseArray.put(stickerSet.set.id, stickerSet);
                                                trendingStickersLayout2.delegate.onStickerSetRemove(stickerSet);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter2 = this.f$0;
                                    trendingStickersAdapter2.getClass();
                                    FeaturedStickerSetInfoCell featuredStickerSetInfoCell2 = (FeaturedStickerSetInfoCell) view2.getParent();
                                    TLRPC.StickerSetCovered stickerSet2 = featuredStickerSetInfoCell2.getStickerSet();
                                    TrendingStickersLayout trendingStickersLayout3 = TrendingStickersLayout.this;
                                    if (trendingStickersLayout3.installingStickerSets.indexOfKey(stickerSet2.set.id) < 0) {
                                        long j2 = stickerSet2.set.id;
                                        LongSparseArray longSparseArray2 = trendingStickersLayout3.removingStickerSets;
                                        if (longSparseArray2.indexOfKey(j2) < 0) {
                                            if (!featuredStickerSetInfoCell2.isInstalled) {
                                                trendingStickersAdapter2.installStickerSet(stickerSet2, featuredStickerSetInfoCell2);
                                            } else {
                                                longSparseArray2.put(stickerSet2.set.id, stickerSet2);
                                                trendingStickersLayout3.delegate.onStickerSetRemove(stickerSet2);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    featuredStickerSetCell2.getImageView().setLayerNum(3);
                    view = featuredStickerSetCell2;
                }
                return new RecyclerListView.Holder(emptyCell);
            }
            StickersSearchAdapter.AnonymousClass2 anonymousClass2 = new StickersSearchAdapter.AnonymousClass2(3, context, trendingStickersLayout.resourcesProvider, false);
            anonymousClass2.getImageView().setLayerNum(3);
            view = anonymousClass2;
            emptyCell = view;
            return new RecyclerListView.Holder(emptyCell);
        }

        public final void refreshStickerSets() {
            int i;
            TrendingStickersLayout trendingStickersLayout = TrendingStickersLayout.this;
            int measuredWidth = trendingStickersLayout.getMeasuredWidth();
            if (measuredWidth != 0) {
                int iMax = Math.max(5, measuredWidth / AndroidUtilities.dp(72.0f));
                this.stickersPerRow = iMax;
                AnonymousClass4 anonymousClass4 = trendingStickersLayout.layoutManager;
                if (anonymousClass4.mSpanCount != iMax) {
                    anonymousClass4.setSpanCount(iMax);
                    trendingStickersLayout.loaded = false;
                }
            }
            if (trendingStickersLayout.loaded) {
                return;
            }
            SparseArray sparseArray = this.cache;
            sparseArray.clear();
            SparseArray sparseArray2 = this.positionsToSets;
            sparseArray2.clear();
            HashMap map = this.setsToPosition;
            map.clear();
            ArrayList arrayList = this.sets;
            arrayList.clear();
            this.totalItems = 0;
            MediaDataController mediaDataController = MediaDataController.getInstance(trendingStickersLayout.currentAccount);
            ArrayList arrayList2 = new ArrayList(mediaDataController.getFeaturedStickerSets());
            int size = arrayList2.size();
            arrayList2.addAll(this.otherPacks);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int iCeil = 1;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList2.get(i2);
                if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                    if (i2 == size) {
                        int i4 = this.totalItems;
                        this.totalItems = i4 + 1;
                        sparseArray.put(i4, -1);
                    }
                    arrayList.add(stickerSetCovered);
                    sparseArray2.put(this.totalItems, stickerSetCovered);
                    map.put(stickerSetCovered, Integer.valueOf(this.totalItems));
                    int i5 = this.totalItems;
                    this.totalItems = i5 + 1;
                    int i6 = i3 + 1;
                    sparseArray.put(i5, Integer.valueOf(i3));
                    if (stickerSetCovered.covers.isEmpty()) {
                        sparseArray.put(this.totalItems, stickerSetCovered.cover);
                    } else {
                        iCeil = (int) Math.ceil(stickerSetCovered.covers.size() / this.stickersPerRow);
                        for (int i7 = 0; i7 < stickerSetCovered.covers.size(); i7++) {
                            sparseArray.put(this.totalItems + i7, stickerSetCovered.covers.get(i7));
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        i = this.stickersPerRow * iCeil;
                        if (i8 >= i) {
                            break;
                        }
                        sparseArray2.put(this.totalItems + i8, stickerSetCovered);
                        i8++;
                    }
                    this.totalItems = i + this.totalItems;
                    i3 = i6;
                }
                i2++;
            }
            if (this.totalItems != 0) {
                trendingStickersLayout.loaded = true;
                trendingStickersLayout.hash = mediaDataController.getFeaturedStickersHashWithoutUnread(false);
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                ((StickerEmojiCell) view).setSticker((TLRPC.Document) this.cache.get(i), null, this.positionsToSets.get(i), null, false, false);
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 4) {
                            ((GraySectionCell) view).setText(LocaleController.getString(R.string.OtherStickers));
                            return;
                        } else if (i2 != 5) {
                            return;
                        }
                    }
                    bindStickerSetCell(view, i, false);
                    return;
                }
                ((EmptyCell) view).setHeight(AndroidUtilities.dp(82.0f));
            }
        }
    }
}
