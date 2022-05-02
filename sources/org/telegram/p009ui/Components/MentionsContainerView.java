package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Adapters.MentionsAdapter;
import org.telegram.p009ui.Adapters.PaddedListAdapter;
import org.telegram.p009ui.ContentPreviewViewer;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_inlineBotSwitchPM;

public class MentionsContainerView extends BlurredFrameLayout {
    private MentionsAdapter adapter;
    private Integer color;
    private float containerPadding;
    private ExtendedGridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private MentionsListView listView;
    private SpringAnimation listViewTranslationAnimator;
    private PaddedListAdapter paddedAdapter;
    private Paint paint;
    private Path path;
    private final Theme.ResourcesProvider resourcesProvider;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private boolean shouldLiftMentions = false;
    private Rect rect = new Rect();
    private boolean ignoreLayout = false;
    private boolean scrollToFirst = false;
    private boolean shown = false;
    private Runnable updateVisibilityRunnable = new Runnable() {
        @Override
        public final void run() {
            MentionsContainerView.this.lambda$new$0();
        }
    };
    private boolean listViewHiding = false;
    private float hideT = 0.0f;
    private boolean switchLayoutManagerOnEnd = false;
    private float listViewPadding = (int) Math.min(AndroidUtilities.m34dp(162.0f), AndroidUtilities.displaySize.y * 0.22f);

    protected boolean canOpen() {
        return true;
    }

    protected void onClose() {
    }

    protected void onContextClick(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
    }

    protected void onContextSearch(boolean z) {
    }

    protected void onOpen() {
    }

    public void onPanTransitionEnd() {
    }

    public MentionsContainerView(Context context, long j, int i, SizeNotifierFrameLayout sizeNotifierFrameLayout, Theme.ResourcesProvider resourcesProvider) {
        super(context, sizeNotifierFrameLayout);
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.resourcesProvider = resourcesProvider;
        this.drawBlur = false;
        this.isTopView = false;
        setVisibility(8);
        setWillNotDraw(false);
        MentionsListView mentionsListView = new MentionsListView(context, resourcesProvider);
        this.listView = mentionsListView;
        mentionsListView.setTranslationY(AndroidUtilities.m34dp(6.0f));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public void setReverseLayout(boolean z) {
                super.setReverseLayout(z);
                MentionsContainerView.this.listView.setTranslationY((z ? -1 : 1) * AndroidUtilities.m34dp(6.0f));
            }
        };
        this.linearLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 100, false, true) {
            private Size size = new Size();

            @Override
            protected Size getSizeForItem(int i2) {
                TLRPC$PhotoSize closestPhotoSizeWithSize;
                if (i2 == 0) {
                    this.size.width = getWidth();
                    this.size.height = MentionsContainerView.this.paddedAdapter.getPadding();
                    return this.size;
                }
                int i3 = i2 - 1;
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null) {
                    i3++;
                }
                Size size = this.size;
                size.width = 0.0f;
                size.height = 0.0f;
                Object item = MentionsContainerView.this.adapter.getItem(i3);
                if (item instanceof TLRPC$BotInlineResult) {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) item;
                    TLRPC$Document tLRPC$Document = tLRPC$BotInlineResult.document;
                    int i4 = 0;
                    if (tLRPC$Document != null) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document.thumbs, 90);
                        Size size2 = this.size;
                        float f = 100.0f;
                        size2.width = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.f884w : 100.0f;
                        if (closestPhotoSizeWithSize2 != null) {
                            f = closestPhotoSizeWithSize2.f883h;
                        }
                        size2.height = f;
                        while (i4 < tLRPC$BotInlineResult.document.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$BotInlineResult.document.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size3 = this.size;
                                size3.width = tLRPC$DocumentAttribute.f864w;
                                size3.height = tLRPC$DocumentAttribute.f863h;
                                break;
                            }
                            i4++;
                        }
                    } else if (tLRPC$BotInlineResult.content != null) {
                        while (i4 < tLRPC$BotInlineResult.content.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = tLRPC$BotInlineResult.content.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size4 = this.size;
                                size4.width = tLRPC$DocumentAttribute2.f864w;
                                size4.height = tLRPC$DocumentAttribute2.f863h;
                                break;
                            }
                            i4++;
                        }
                    } else if (tLRPC$BotInlineResult.thumb != null) {
                        while (i4 < tLRPC$BotInlineResult.thumb.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute3 = tLRPC$BotInlineResult.thumb.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute3 instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute3 instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size5 = this.size;
                                size5.width = tLRPC$DocumentAttribute3.f864w;
                                size5.height = tLRPC$DocumentAttribute3.f863h;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        TLRPC$Photo tLRPC$Photo = tLRPC$BotInlineResult.photo;
                        if (tLRPC$Photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.photoSize.intValue())) != null) {
                            Size size6 = this.size;
                            size6.width = closestPhotoSizeWithSize.f884w;
                            size6.height = closestPhotoSizeWithSize.f883h;
                        }
                    }
                }
                return this.size;
            }

            @Override
            public int getFlowItemCount() {
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null) {
                    return getItemCount() - 2;
                }
                return super.getFlowItemCount() - 1;
            }
        };
        this.gridLayoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                if (i2 == 0) {
                    return 100;
                }
                int i3 = i2 - 1;
                Object item = MentionsContainerView.this.adapter.getItem(i3);
                if (item instanceof TLRPC$TL_inlineBotSwitchPM) {
                    return 100;
                }
                if (item instanceof TLRPC$Document) {
                    return 20;
                }
                if (MentionsContainerView.this.adapter.getBotContextSwitch() != null) {
                    i3--;
                }
                return MentionsContainerView.this.gridLayoutManager.getSpanSizeForItem(i3);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(75L);
        defaultItemAnimator.setMoveDuration(0L);
        defaultItemAnimator.setChangeDuration(75L);
        defaultItemAnimator.setRemoveDuration(75L);
        defaultItemAnimator.setDelayAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setClipToPadding(false);
        this.listView.setLayoutManager(this.linearLayoutManager);
        MentionsAdapter mentionsAdapter = new MentionsAdapter(context, false, j, i, new MentionsAdapter.MentionsAdapterDelegate() {
            @Override
            public void onItemCountUpdate(int i2, int i3) {
                if (MentionsContainerView.this.listView.getLayoutManager() != MentionsContainerView.this.gridLayoutManager && MentionsContainerView.this.shown) {
                    AndroidUtilities.cancelRunOnUIThread(MentionsContainerView.this.updateVisibilityRunnable);
                    AndroidUtilities.runOnUIThread(MentionsContainerView.this.updateVisibilityRunnable);
                }
            }

            @Override
            public void needChangePanelVisibility(boolean z) {
                boolean z2 = false;
                if (MentionsContainerView.this.getNeededLayoutManager() == MentionsContainerView.this.getCurrentLayoutManager() || !MentionsContainerView.this.canOpen() || MentionsContainerView.this.adapter.getItemCountInternal() <= 0) {
                    if (z && !MentionsContainerView.this.canOpen()) {
                        z = false;
                    }
                    if (!z || MentionsContainerView.this.adapter.getItemCountInternal() > 0) {
                        z2 = z;
                    }
                    MentionsContainerView.this.updateVisibility(z2);
                    return;
                }
                MentionsContainerView.this.switchLayoutManagerOnEnd = true;
                MentionsContainerView.this.updateVisibility(false);
            }

            @Override
            public void onContextSearch(boolean z) {
                MentionsContainerView.this.onContextSearch(z);
            }

            @Override
            public void onContextClick(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
                MentionsContainerView.this.onContextClick(tLRPC$BotInlineResult);
            }
        }, resourcesProvider);
        this.adapter = mentionsAdapter;
        PaddedListAdapter paddedListAdapter = new PaddedListAdapter(mentionsAdapter);
        this.paddedAdapter = paddedListAdapter;
        this.listView.setAdapter(paddedListAdapter);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        setReversed(false);
    }

    public void onPanTransitionStart() {
        this.shouldLiftMentions = isReversed();
    }

    public void onPanTransitionUpdate(float f) {
        if (this.shouldLiftMentions) {
            setTranslationY(f);
        }
    }

    public MentionsListView getListView() {
        return this.listView;
    }

    public MentionsAdapter getAdapter() {
        return this.adapter;
    }

    public void setReversed(boolean z) {
        this.scrollToFirst = true;
        this.linearLayoutManager.setReverseLayout(z);
        this.adapter.setIsReversed(z);
    }

    public boolean isReversed() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager && linearLayoutManager.getReverseLayout();
    }

    public LinearLayoutManager getCurrentLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
        return layoutManager == linearLayoutManager ? linearLayoutManager : this.gridLayoutManager;
    }

    public LinearLayoutManager getNeededLayoutManager() {
        return ((this.adapter.isStickers() || this.adapter.isBotContext()) && this.adapter.isMediaLayout()) ? this.gridLayoutManager : this.linearLayoutManager;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        PaddedListAdapter paddedListAdapter;
        PaddedListAdapter paddedListAdapter2;
        boolean isReversed = isReversed();
        this.containerPadding = AndroidUtilities.m34dp(((this.adapter.isStickers() || this.adapter.isBotContext()) && this.adapter.isMediaLayout() && this.adapter.getBotContextSwitch() == null ? 2 : 0) + 2);
        float dp = AndroidUtilities.m34dp(4.0f);
        if (isReversed) {
            this.rect.set(0, 0, getMeasuredWidth(), (int) Math.min(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? paddedListAdapter2.paddingView.getTop() : getHeight()) + this.listView.getTranslationY()) + this.containerPadding, (1.0f - this.hideT) * getHeight()));
            if (dp > 0.0f) {
                this.rect.top -= (int) dp;
            }
        } else {
            if (this.listView.getLayoutManager() == this.gridLayoutManager) {
                this.containerPadding += AndroidUtilities.m34dp(2.0f);
                dp += AndroidUtilities.m34dp(2.0f);
            }
            this.rect.set(0, (int) Math.max(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getBottom() : 0) + this.listView.getTranslationY()) - this.containerPadding, this.hideT * getHeight()), getMeasuredWidth(), getMeasuredHeight());
            if (dp > 0.0f) {
                this.rect.bottom += (int) dp;
            }
        }
        float f = dp;
        if (this.paint == null) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setShadowLayer(AndroidUtilities.m34dp(2.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.paint;
        Integer num = this.color;
        paint2.setColor(num != null ? num.intValue() : getThemedColor("chat_messagePanelBackground"));
        if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierFrameLayout == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.rect);
            canvas.drawRoundRect(rectF, f, f, this.paint);
        } else {
            if (f > 0.0f) {
                canvas.save();
                Path path = this.path;
                if (path == null) {
                    this.path = new Path();
                } else {
                    path.reset();
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(this.rect);
                this.path.addRoundRect(rectF2, f, f, Path.Direction.CW);
                canvas.clipPath(this.path);
            }
            this.sizeNotifierFrameLayout.drawBlurRect(canvas, getY(), this.rect, this.paint, isReversed);
            if (f > 0.0f) {
                canvas.restore();
            }
        }
        canvas.save();
        canvas.clipRect(this.rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void setOverrideColor(int i) {
        this.color = Integer.valueOf(i);
        invalidate();
    }

    public void setIgnoreLayout(boolean z) {
        this.ignoreLayout = z;
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
    }

    public void lambda$new$0() {
        updateListViewTranslation(!this.shown, true);
    }

    public void updateVisibility(boolean z) {
        if (z) {
            boolean isReversed = isReversed();
            if (!this.shown) {
                this.scrollToFirst = true;
                RecyclerView.LayoutManager layoutManager = this.listView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = this.linearLayoutManager;
                if (layoutManager == linearLayoutManager) {
                    linearLayoutManager.scrollToPositionWithOffset(0, isReversed ? -100000 : 100000);
                }
                if (getVisibility() == 8) {
                    this.hideT = 1.0f;
                    MentionsListView mentionsListView = this.listView;
                    mentionsListView.setTranslationY(isReversed ? -(this.listViewPadding + AndroidUtilities.m34dp(12.0f)) : mentionsListView.computeVerticalScrollOffset() + this.listViewPadding);
                }
            }
            setVisibility(0);
        } else {
            this.scrollToFirst = false;
        }
        this.shown = z;
        AndroidUtilities.cancelRunOnUIThread(this.updateVisibilityRunnable);
        SpringAnimation springAnimation = this.listViewTranslationAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        if (z) {
            AndroidUtilities.runOnUIThread(this.updateVisibilityRunnable);
            onOpen();
            return;
        }
        AndroidUtilities.runOnUIThread(this.updateVisibilityRunnable);
        onClose();
    }

    private void updateListViewTranslation(final boolean z, boolean z2) {
        float f;
        SpringAnimation springAnimation;
        if (this.listView != null && this.paddedAdapter != null) {
            if (!this.listViewHiding || (springAnimation = this.listViewTranslationAnimator) == null || !springAnimation.isRunning() || !z) {
                boolean isReversed = isReversed();
                if (z) {
                    f = (-this.containerPadding) - AndroidUtilities.m34dp(6.0f);
                } else {
                    f = (this.listView.computeVerticalScrollRange() - this.paddedAdapter.getPadding()) + this.containerPadding;
                }
                float f2 = 0.0f;
                float f3 = this.listViewPadding;
                float max = isReversed ? -Math.max(0.0f, f3 - f) : Math.max(0.0f, f3 - f) + (-f3);
                if (z && !isReversed) {
                    max += this.listView.computeVerticalScrollOffset();
                }
                final float f4 = max;
                setVisibility(0);
                SpringAnimation springAnimation2 = this.listViewTranslationAnimator;
                if (springAnimation2 != null) {
                    springAnimation2.cancel();
                }
                int i = 8;
                if (z2) {
                    this.listViewHiding = z;
                    final float translationY = this.listView.getTranslationY();
                    final float f5 = this.hideT;
                    final float f6 = z ? 1.0f : 0.0f;
                    if (translationY == f4) {
                        this.listViewTranslationAnimator = null;
                        if (!z) {
                            i = 0;
                        }
                        setVisibility(i);
                        if (this.switchLayoutManagerOnEnd && z) {
                            this.switchLayoutManagerOnEnd = false;
                            this.listView.setLayoutManager(getNeededLayoutManager());
                            this.shown = true;
                            updateVisibility(true);
                            return;
                        }
                        return;
                    }
                    SpringAnimation springAnimation3 = new SpringAnimation(this.listView, DynamicAnimation.TRANSLATION_Y, f4);
                    this.listViewTranslationAnimator = springAnimation3;
                    springAnimation3.getSpring().setStiffness(800.0f);
                    this.listViewTranslationAnimator.getSpring().setDampingRatio(AndroidUtilities.computeDampingRatio(800.0f, 500.0f, AndroidUtilities.density * 25.0f));
                    this.listViewTranslationAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f7, float f8) {
                            MentionsContainerView.this.lambda$updateListViewTranslation$1(f5, f6, translationY, f4, dynamicAnimation, f7, f8);
                        }
                    });
                    if (z) {
                        this.listViewTranslationAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                            @Override
                            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f7, float f8) {
                                MentionsContainerView.this.lambda$updateListViewTranslation$2(z, dynamicAnimation, z3, f7, f8);
                            }
                        });
                    }
                    this.listViewTranslationAnimator.start();
                    return;
                }
                if (z) {
                    f2 = 1.0f;
                }
                this.hideT = f2;
                this.listView.setTranslationY(f4);
                if (z) {
                    setVisibility(8);
                }
            }
        }
    }

    public void lambda$updateListViewTranslation$1(float f, float f2, float f3, float f4, DynamicAnimation dynamicAnimation, float f5, float f6) {
        this.hideT = AndroidUtilities.lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    public void lambda$updateListViewTranslation$2(boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (!z2) {
            this.listViewTranslationAnimator = null;
            setVisibility(z ? 8 : 0);
            if (this.switchLayoutManagerOnEnd && z) {
                this.switchLayoutManagerOnEnd = false;
                this.listView.setLayoutManager(getNeededLayoutManager());
                this.shown = true;
                updateVisibility(true);
            }
        }
    }

    public class MentionsListView extends RecyclerListView {
        private boolean isDragging;
        private boolean isScrolling;
        private int lastHeight;
        private int lastWidth;

        public MentionsListView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            setOnScrollListener(new RecyclerView.OnScrollListener(MentionsContainerView.this) {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    boolean z = false;
                    MentionsListView.this.isScrolling = i != 0;
                    MentionsListView mentionsListView = MentionsListView.this;
                    if (i == 1) {
                        z = true;
                    }
                    mentionsListView.isDragging = z;
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int findLastVisibleItemPosition = MentionsListView.this.getLayoutManager() == MentionsContainerView.this.gridLayoutManager ? MentionsContainerView.this.gridLayoutManager.findLastVisibleItemPosition() : MentionsContainerView.this.linearLayoutManager.findLastVisibleItemPosition();
                    if ((findLastVisibleItemPosition == -1 ? 0 : findLastVisibleItemPosition) > 0 && findLastVisibleItemPosition > MentionsContainerView.this.adapter.getLastItemCount() - 5) {
                        MentionsContainerView.this.adapter.searchForContextBotForNextOffset();
                    }
                }
            });
            addItemDecoration(new RecyclerView.ItemDecoration(MentionsContainerView.this) {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int i = 0;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    if (recyclerView.getLayoutManager() == MentionsContainerView.this.gridLayoutManager) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        if (!MentionsContainerView.this.adapter.isStickers()) {
                            if (MentionsContainerView.this.adapter.getBotContextSwitch() == null) {
                                rect.top = AndroidUtilities.m34dp(2.0f);
                            } else if (childAdapterPosition != 0) {
                                childAdapterPosition--;
                                if (!MentionsContainerView.this.gridLayoutManager.isFirstRow(childAdapterPosition)) {
                                    rect.top = AndroidUtilities.m34dp(2.0f);
                                }
                            } else {
                                return;
                            }
                            if (!MentionsContainerView.this.gridLayoutManager.isLastInRow(childAdapterPosition)) {
                                i = AndroidUtilities.m34dp(2.0f);
                            }
                            rect.right = i;
                        }
                    }
                }
            });
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (MentionsContainerView.this.linearLayoutManager.getReverseLayout()) {
                if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() > MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() < MentionsContainerView.this.paddedAdapter.paddingView.getBottom()) {
                return false;
            }
            boolean z = !this.isScrolling && ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, MentionsContainerView.this.listView, 0, null, this.resourcesProvider);
            if ((MentionsContainerView.this.adapter.isStickers() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) {
                MentionsContainerView.this.adapter.doSomeStickersAction();
            }
            return super.onInterceptTouchEvent(motionEvent) || z;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (MentionsContainerView.this.linearLayoutManager.getReverseLayout()) {
                if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() > MentionsContainerView.this.paddedAdapter.paddingView.getTop()) {
                    return false;
                }
            } else if (!this.isDragging && MentionsContainerView.this.paddedAdapter != null && MentionsContainerView.this.paddedAdapter.paddingView != null && MentionsContainerView.this.paddedAdapter.paddingViewAttached && motionEvent.getY() < MentionsContainerView.this.paddedAdapter.paddingView.getBottom()) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void requestLayout() {
            if (!MentionsContainerView.this.ignoreLayout) {
                super.requestLayout();
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6 = i3 - i;
            int i7 = i4 - i2;
            boolean isReversed = MentionsContainerView.this.isReversed();
            LinearLayoutManager currentLayoutManager = MentionsContainerView.this.getCurrentLayoutManager();
            int findFirstVisibleItemPosition = isReversed ? currentLayoutManager.findFirstVisibleItemPosition() : currentLayoutManager.findLastVisibleItemPosition();
            View findViewByPosition = currentLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition != null) {
                i5 = findViewByPosition.getTop() - (isReversed ? 0 : this.lastHeight - i7);
            } else {
                i5 = 0;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (MentionsContainerView.this.scrollToFirst) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(0, 100000);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
                MentionsContainerView.this.scrollToFirst = false;
            } else if (!(findFirstVisibleItemPosition == -1 || i6 != this.lastWidth || i7 - this.lastHeight == 0)) {
                MentionsContainerView.this.ignoreLayout = true;
                currentLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, i5, false);
                super.onLayout(false, i, i2, i3, i4);
                MentionsContainerView.this.ignoreLayout = false;
            }
            this.lastHeight = i7;
            this.lastWidth = i6;
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            MentionsContainerView.this.invalidate();
        }

        @Override
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i2);
            if (MentionsContainerView.this.paddedAdapter != null) {
                MentionsContainerView.this.paddedAdapter.setPadding(size);
            }
            MentionsContainerView.this.listViewPadding = (int) Math.min(AndroidUtilities.m34dp(162.0f), AndroidUtilities.displaySize.y * 0.22f);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size + ((int) MentionsContainerView.this.listViewPadding), 1073741824));
        }

        @Override
        public void onScrolled(int i, int i2) {
            super.onScrolled(i, i2);
            MentionsContainerView.this.invalidate();
        }
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
