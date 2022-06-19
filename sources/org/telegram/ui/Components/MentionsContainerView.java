package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_inlineBotSwitchPM;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.ContentPreviewViewer;

public class MentionsContainerView extends BlurredFrameLayout {
    private MentionsAdapter adapter;
    private Integer color;
    private float containerBottom;
    private float containerPadding;
    private float containerTop;
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
    private float listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);

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
        mentionsListView.setTranslationY(AndroidUtilities.dp(6.0f));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }

            @Override
            public void setReverseLayout(boolean z) {
                super.setReverseLayout(z);
                MentionsContainerView.this.listView.setTranslationY((z ? -1 : 1) * AndroidUtilities.dp(6.0f));
            }
        };
        this.linearLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 100, false, false) {
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
                        size2.width = closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.w : 100.0f;
                        if (closestPhotoSizeWithSize2 != null) {
                            f = closestPhotoSizeWithSize2.h;
                        }
                        size2.height = f;
                        while (i4 < tLRPC$BotInlineResult.document.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$BotInlineResult.document.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size3 = this.size;
                                size3.width = tLRPC$DocumentAttribute.w;
                                size3.height = tLRPC$DocumentAttribute.h;
                                break;
                            }
                            i4++;
                        }
                    } else if (tLRPC$BotInlineResult.content != null) {
                        while (i4 < tLRPC$BotInlineResult.content.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute2 = tLRPC$BotInlineResult.content.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute2 instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size4 = this.size;
                                size4.width = tLRPC$DocumentAttribute2.w;
                                size4.height = tLRPC$DocumentAttribute2.h;
                                break;
                            }
                            i4++;
                        }
                    } else if (tLRPC$BotInlineResult.thumb != null) {
                        while (i4 < tLRPC$BotInlineResult.thumb.attributes.size()) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute3 = tLRPC$BotInlineResult.thumb.attributes.get(i4);
                            if ((tLRPC$DocumentAttribute3 instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute3 instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size5 = this.size;
                                size5.width = tLRPC$DocumentAttribute3.w;
                                size5.height = tLRPC$DocumentAttribute3.h;
                                break;
                            }
                            i4++;
                        }
                    } else {
                        TLRPC$Photo tLRPC$Photo = tLRPC$BotInlineResult.photo;
                        if (tLRPC$Photo != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.photoSize.intValue())) != null) {
                            Size size6 = this.size;
                            size6.width = closestPhotoSizeWithSize.w;
                            size6.height = closestPhotoSizeWithSize.h;
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
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(150L);
        defaultItemAnimator.setChangeDuration(150L);
        defaultItemAnimator.setRemoveDuration(150L);
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.DEFAULT);
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

    public float clipBottom() {
        if (getVisibility() == 0 && !isReversed()) {
            return getMeasuredHeight() - this.containerTop;
        }
        return 0.0f;
    }

    public float clipTop() {
        if (getVisibility() == 0 && isReversed()) {
            return this.containerBottom;
        }
        return 0.0f;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        PaddedListAdapter paddedListAdapter;
        PaddedListAdapter paddedListAdapter2;
        boolean isReversed = isReversed();
        this.containerPadding = AndroidUtilities.dp(((this.adapter.isStickers() || this.adapter.isBotContext()) && this.adapter.isMediaLayout() && this.adapter.getBotContextSwitch() == null ? 2 : 0) + 2);
        float dp = AndroidUtilities.dp(4.0f);
        if (isReversed) {
            float min = Math.min(Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? paddedListAdapter2.paddingView.getTop() : getHeight()) + this.listView.getTranslationY()) + this.containerPadding, (1.0f - this.hideT) * getHeight());
            Rect rect = this.rect;
            this.containerTop = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.containerBottom = min;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min);
            f = Math.min(dp, Math.abs(getMeasuredHeight() - this.containerBottom));
            if (f > 0.0f) {
                this.rect.top -= (int) f;
            }
        } else {
            if (this.listView.getLayoutManager() == this.gridLayoutManager) {
                this.containerPadding += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            float max = Math.max(0.0f, (this.paddedAdapter.paddingViewAttached ? paddedListAdapter.paddingView.getBottom() : 0) + this.listView.getTranslationY()) - this.containerPadding;
            this.containerTop = max;
            float max2 = Math.max(max, this.hideT * getHeight());
            Rect rect2 = this.rect;
            this.containerTop = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.containerBottom = measuredHeight;
            rect2.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            f = Math.min(dp, Math.abs(this.containerTop));
            if (f > 0.0f) {
                this.rect.bottom += (int) f;
            }
        }
        float f2 = f;
        if (this.paint == null) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.paint;
        Integer num = this.color;
        paint2.setColor(num != null ? num.intValue() : getThemedColor("chat_messagePanelBackground"));
        if (!SharedConfig.chatBlurEnabled() || this.sizeNotifierFrameLayout == null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.rect);
            canvas.drawRoundRect(rectF, f2, f2, this.paint);
        } else {
            if (f2 > 0.0f) {
                canvas.save();
                Path path = this.path;
                if (path == null) {
                    this.path = new Path();
                } else {
                    path.reset();
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(this.rect);
                this.path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
                canvas.clipPath(this.path);
            }
            this.sizeNotifierFrameLayout.drawBlurRect(canvas, getY(), this.rect, this.paint, isReversed);
            if (f2 > 0.0f) {
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
                    mentionsListView.setTranslationY(isReversed ? -(this.listViewPadding + AndroidUtilities.dp(12.0f)) : mentionsListView.computeVerticalScrollOffset() + this.listViewPadding);
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
        AndroidUtilities.runOnUIThread(this.updateVisibilityRunnable);
        if (z) {
            onOpen();
        } else {
            onClose();
        }
    }

    public boolean isOpen() {
        return this.shown;
    }

    private void updateListViewTranslation(final boolean z, boolean z2) {
        float f;
        SpringAnimation springAnimation;
        if (this.listView != null && this.paddedAdapter != null) {
            if (!this.listViewHiding || (springAnimation = this.listViewTranslationAnimator) == null || !springAnimation.isRunning() || !z) {
                boolean isReversed = isReversed();
                if (z) {
                    f = (-this.containerPadding) - AndroidUtilities.dp(6.0f);
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
                    SpringAnimation spring = new SpringAnimation(new FloatValueHolder(translationY)).setSpring(new SpringForce(f4).setDampingRatio(1.0f).setStiffness(550.0f));
                    this.listViewTranslationAnimator = spring;
                    spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
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
        this.listView.setTranslationY(f5);
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
                    int childAdapterPosition;
                    int i = 0;
                    rect.left = 0;
                    rect.right = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    if (recyclerView.getLayoutManager() == MentionsContainerView.this.gridLayoutManager && (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) != 0) {
                        int i2 = childAdapterPosition - 1;
                        if (!MentionsContainerView.this.adapter.isStickers()) {
                            if (MentionsContainerView.this.adapter.getBotContextSwitch() == null) {
                                rect.top = AndroidUtilities.dp(2.0f);
                            } else if (i2 != 0) {
                                i2--;
                                if (!MentionsContainerView.this.gridLayoutManager.isFirstRow(i2)) {
                                    rect.top = AndroidUtilities.dp(2.0f);
                                }
                            } else {
                                return;
                            }
                            if (!MentionsContainerView.this.gridLayoutManager.isLastInRow(i2)) {
                                i = AndroidUtilities.dp(2.0f);
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
            MentionsContainerView.this.listViewPadding = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
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
