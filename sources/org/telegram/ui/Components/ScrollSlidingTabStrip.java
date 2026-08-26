package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity;

public abstract class ScrollSlidingTabStrip extends HorizontalScrollView {
    public static final int $r8$clinit = 0;
    public boolean animateToExpanded;
    public int currentDragPosition;
    public final SparseArray currentPlayingImages;
    public final SparseArray currentPlayingImagesTmp;
    public int currentPosition;
    public final AnimatedFloat currentPositionAnimated;
    public final LinearLayout.LayoutParams defaultExpandLayoutParams;
    public final LinearLayout.LayoutParams defaultTabLayoutParams;
    public ScrollSlidingTabStripDelegate delegate;
    public boolean dragEnabled;
    public float draggindViewDxOnScreen;
    public float draggindViewXOnScreen;
    public View draggingView;
    public float draggingViewOutProgress;
    public float expandOffset;
    public float expandProgress;
    public ValueAnimator expandStickerAnimator;
    public boolean expanded;
    public final SparseArray futureTabsPositions;
    public int imageReceiversPlayingNum;
    public final GradientDrawable indicatorDrawable;
    public int indicatorHeight;
    public final boolean isGlassDesign;
    public int lastScrollX;
    public final AnonymousClass1 longClickRunnable;
    public boolean longClickRunning;
    public float pressedX;
    public float pressedY;
    public HashMap prevTypes;
    public final Paint rectPaint;
    public final Theme.ResourcesProvider resourcesProvider;
    public int scrollByOnNextMeasure;
    public final int scrollOffset;
    public boolean scrollRight;
    public final AnonymousClass1 scrollRunnable;
    public long scrollStartTime;
    public final Paint selectorPaint;
    public boolean shouldExpand;
    public boolean showSelected;
    public final AnimatedFloat showSelectedAlpha;
    public int startDragFromPosition;
    public float startDragFromX;
    public final float stickerTabExpandedWidth;
    public final float stickerTabWidth;
    public final RectF tabBounds;
    public int tabCount;
    public HashMap tabTypes;
    public final PhotoViewer.AnonymousClass35 tabsContainer;
    public final float touchSlop;
    public Type type;
    public int underlineColor;
    public int underlineHeight;

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;
        public final boolean val$expanded;
        public final float val$x;

        public AnonymousClass4(KeyEvent.Callback callback, boolean z, float f, int i) {
            this.$r8$classId = i;
            this.this$0 = callback;
            this.val$expanded = z;
            this.val$x = f;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ScrollSlidingTabStrip scrollSlidingTabStrip = (ScrollSlidingTabStrip) this.this$0;
                    scrollSlidingTabStrip.expandStickerAnimator = null;
                    boolean z = this.val$expanded;
                    scrollSlidingTabStrip.expandProgress = z ? 1.0f : 0.0f;
                    int i = 0;
                    while (true) {
                        PhotoViewer.AnonymousClass35 anonymousClass35 = scrollSlidingTabStrip.tabsContainer;
                        if (i >= anonymousClass35.getChildCount()) {
                            anonymousClass35.invalidate();
                            scrollSlidingTabStrip.updatePosition();
                            if (!z) {
                                float childCount = scrollSlidingTabStrip.stickerTabWidth * anonymousClass35.getChildCount();
                                float scrollX = scrollSlidingTabStrip.getScrollX();
                                float f = this.val$x;
                                float childCount2 = (scrollX + f) / (scrollSlidingTabStrip.stickerTabExpandedWidth * anonymousClass35.getChildCount());
                                float measuredWidth = (childCount - scrollSlidingTabStrip.getMeasuredWidth()) / childCount;
                                if (childCount2 > measuredWidth) {
                                    childCount2 = measuredWidth;
                                    f = 0.0f;
                                }
                                float f2 = childCount * childCount2;
                                if (f2 - f < 0.0f) {
                                    f2 = f;
                                }
                                scrollSlidingTabStrip.expandOffset = (scrollSlidingTabStrip.getScrollX() + f) - f2;
                                int i2 = (int) (f2 - f);
                                scrollSlidingTabStrip.scrollByOnNextMeasure = i2;
                                if (i2 < 0) {
                                    scrollSlidingTabStrip.scrollByOnNextMeasure = 0;
                                }
                                for (int i3 = 0; i3 < anonymousClass35.getChildCount(); i3++) {
                                    View childAt = anonymousClass35.getChildAt(i3);
                                    if (childAt instanceof StickerTabView) {
                                        ((StickerTabView) childAt).setExpanded(false);
                                    }
                                    childAt.getLayoutParams().width = AndroidUtilities.dp(33.0f);
                                }
                                scrollSlidingTabStrip.animateToExpanded = false;
                                scrollSlidingTabStrip.getLayoutParams().height = AndroidUtilities.dp(36.0f);
                                anonymousClass35.requestLayout();
                            }
                        } else {
                            anonymousClass35.getChildAt(i).invalidate();
                            i++;
                        }
                        break;
                    }
                    break;
                default:
                    super.onAnimationEnd(animator);
                    if (!this.val$expanded) {
                        super/*android.app.Dialog*/.dismiss();
                    }
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    super.onAnimationStart(animator);
                    MemberRequestsDelegate.PreviewDialog previewDialog = (MemberRequestsDelegate.PreviewDialog) this.this$0;
                    previewDialog.contentView.setVisibility(0);
                    if (this.val$expanded) {
                        MemberRequestsDelegate.PreviewDialog.AnonymousClass3 anonymousClass3 = previewDialog.contentView;
                        float f = this.val$x;
                        anonymousClass3.setScaleX(f);
                        anonymousClass3.setScaleY(f);
                    }
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public interface ScrollSlidingTabStripDelegate {
        void onPageSelected(int i);
    }

    public final class Type {
        public static final Type[] $VALUES;
        public static final Type LINE;
        public static final Type TAB;

        static {
            Type type = new Type("LINE", 0);
            LINE = type;
            Type type2 = new Type("TAB", 1);
            TAB = type2;
            $VALUES = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ScrollSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.imageReceiversPlayingNum = 1;
        this.type = Type.LINE;
        this.tabTypes = new HashMap();
        this.prevTypes = new HashMap();
        this.futureTabsPositions = new SparseArray();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.currentPositionAnimated = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        new RectF();
        new RectF();
        this.tabBounds = new RectF();
        this.underlineColor = 436207616;
        this.indicatorDrawable = new GradientDrawable();
        this.scrollOffset = AndroidUtilities.dp(33.0f);
        this.underlineHeight = AndroidUtilities.dp(2.0f);
        AndroidUtilities.dp(12.0f);
        AndroidUtilities.dp(24.0f);
        this.lastScrollX = 0;
        this.currentPlayingImages = new SparseArray();
        this.currentPlayingImagesTmp = new SparseArray();
        final int i = 0;
        this.longClickRunnable = new Runnable(this) {
            public final ScrollSlidingTabStrip this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                int iMax;
                switch (i) {
                    case 0:
                        ScrollSlidingTabStrip scrollSlidingTabStrip = this.this$0;
                        scrollSlidingTabStrip.longClickRunning = false;
                        float scrollX = scrollSlidingTabStrip.getScrollX() + scrollSlidingTabStrip.pressedX;
                        scrollSlidingTabStrip.startDragFromX = scrollX;
                        int iCeil = ((int) Math.ceil(scrollX / scrollSlidingTabStrip.getTabSize())) - 1;
                        scrollSlidingTabStrip.currentDragPosition = iCeil;
                        scrollSlidingTabStrip.startDragFromPosition = iCeil;
                        if (scrollSlidingTabStrip.canSwap(iCeil) && iCeil >= 0) {
                            PhotoViewer.AnonymousClass35 anonymousClass35 = scrollSlidingTabStrip.tabsContainer;
                            if (iCeil < anonymousClass35.getChildCount()) {
                                try {
                                    scrollSlidingTabStrip.performHapticFeedback(0);
                                    break;
                                } catch (Exception unused) {
                                }
                                scrollSlidingTabStrip.draggindViewDxOnScreen = 0.0f;
                                scrollSlidingTabStrip.draggingViewOutProgress = 0.0f;
                                View childAt = anonymousClass35.getChildAt(iCeil);
                                scrollSlidingTabStrip.draggingView = childAt;
                                scrollSlidingTabStrip.draggindViewXOnScreen = childAt.getX() - scrollSlidingTabStrip.getScrollX();
                                scrollSlidingTabStrip.draggingView.invalidate();
                                anonymousClass35.invalidate();
                                scrollSlidingTabStrip.invalidateOverlays();
                                scrollSlidingTabStrip.invalidate();
                            }
                        }
                        break;
                    default:
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.this$0;
                        long j = jCurrentTimeMillis - scrollSlidingTabStrip2.scrollStartTime;
                        int i2 = 1;
                        if (j < 3000) {
                            iMax = Math.max(1, AndroidUtilities.dp(1.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i2 = -1;
                            }
                        } else if (j < 5000) {
                            iMax = Math.max(1, AndroidUtilities.dp(2.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i2 = -1;
                            }
                        } else {
                            iMax = Math.max(1, AndroidUtilities.dp(4.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i2 = -1;
                            }
                        }
                        scrollSlidingTabStrip2.scrollBy(iMax * i2, 0);
                        AndroidUtilities.runOnUIThread(scrollSlidingTabStrip2.scrollRunnable);
                        break;
                }
            }
        };
        this.expanded = false;
        this.stickerTabExpandedWidth = AndroidUtilities.dp(64.0f);
        this.stickerTabWidth = AndroidUtilities.dp(33.0f);
        this.scrollByOnNextMeasure = -1;
        this.selectorPaint = new Paint();
        this.showSelected = true;
        this.showSelectedAlpha = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        final int i2 = 1;
        this.scrollRunnable = new Runnable(this) {
            public final ScrollSlidingTabStrip this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void run() {
                int iMax;
                switch (i2) {
                    case 0:
                        ScrollSlidingTabStrip scrollSlidingTabStrip = this.this$0;
                        scrollSlidingTabStrip.longClickRunning = false;
                        float scrollX = scrollSlidingTabStrip.getScrollX() + scrollSlidingTabStrip.pressedX;
                        scrollSlidingTabStrip.startDragFromX = scrollX;
                        int iCeil = ((int) Math.ceil(scrollX / scrollSlidingTabStrip.getTabSize())) - 1;
                        scrollSlidingTabStrip.currentDragPosition = iCeil;
                        scrollSlidingTabStrip.startDragFromPosition = iCeil;
                        if (scrollSlidingTabStrip.canSwap(iCeil) && iCeil >= 0) {
                            PhotoViewer.AnonymousClass35 anonymousClass35 = scrollSlidingTabStrip.tabsContainer;
                            if (iCeil < anonymousClass35.getChildCount()) {
                                try {
                                    scrollSlidingTabStrip.performHapticFeedback(0);
                                    break;
                                } catch (Exception unused) {
                                }
                                scrollSlidingTabStrip.draggindViewDxOnScreen = 0.0f;
                                scrollSlidingTabStrip.draggingViewOutProgress = 0.0f;
                                View childAt = anonymousClass35.getChildAt(iCeil);
                                scrollSlidingTabStrip.draggingView = childAt;
                                scrollSlidingTabStrip.draggindViewXOnScreen = childAt.getX() - scrollSlidingTabStrip.getScrollX();
                                scrollSlidingTabStrip.draggingView.invalidate();
                                anonymousClass35.invalidate();
                                scrollSlidingTabStrip.invalidateOverlays();
                                scrollSlidingTabStrip.invalidate();
                            }
                        }
                        break;
                    default:
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.this$0;
                        long j = jCurrentTimeMillis - scrollSlidingTabStrip2.scrollStartTime;
                        int i3 = 1;
                        if (j < 3000) {
                            iMax = Math.max(1, AndroidUtilities.dp(1.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i3 = -1;
                            }
                        } else if (j < 5000) {
                            iMax = Math.max(1, AndroidUtilities.dp(2.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i3 = -1;
                            }
                        } else {
                            iMax = Math.max(1, AndroidUtilities.dp(4.0f));
                            if (!scrollSlidingTabStrip2.scrollRight) {
                                i3 = -1;
                            }
                        }
                        scrollSlidingTabStrip2.scrollBy(iMax * i3, 0);
                        AndroidUtilities.runOnUIThread(scrollSlidingTabStrip2.scrollRunnable);
                        break;
                }
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.isGlassDesign = z;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        PhotoViewer.AnonymousClass35 anonymousClass35 = new PhotoViewer.AnonymousClass35(this, context, 7);
        this.tabsContainer = anonymousClass35;
        anonymousClass35.setOrientation(0);
        anonymousClass35.setPadding(AndroidUtilities.dp(9.5f), 0, AndroidUtilities.dp(9.5f), 0);
        addView(anonymousClass35, new FrameLayout.LayoutParams(-1, -1, 16));
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(AndroidUtilities.dp(33.0f), -1);
        this.defaultExpandLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
    }

    public int getTabSize() {
        return AndroidUtilities.dp(this.animateToExpanded ? 64.0f : 33.0f);
    }

    public final FrameLayout addIconTab(int i, Drawable drawable) {
        String strM = DiffUtil.m(i, "tab");
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        FrameLayout frameLayout = (FrameLayout) this.prevTypes.get(strM);
        if (frameLayout != null) {
            HashMap map = this.prevTypes;
            if (map != null) {
                map.remove(strM);
            }
            this.futureTabsPositions.put(i2, frameLayout);
        } else {
            frameLayout = new FrameLayout(getContext());
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
            frameLayout.setFocusable(true);
            frameLayout.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 2));
            this.tabsContainer.addView(frameLayout, i2);
        }
        frameLayout.setTag(R.id.index_tag, Integer.valueOf(i2));
        frameLayout.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(strM, frameLayout);
        return frameLayout;
    }

    public final StickerTabView addStickerIconTab(int i, Drawable drawable) {
        String strM = DiffUtil.m(i, "tab");
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        StickerTabView stickerTabView = (StickerTabView) this.prevTypes.get(strM);
        if (stickerTabView != null) {
            HashMap map = this.prevTypes;
            if (map != null) {
                map.remove(strM);
            }
            this.futureTabsPositions.put(i2, stickerTabView);
        } else {
            stickerTabView = new StickerTabView(getContext(), 1);
            stickerTabView.iconView.setImageDrawable(drawable);
            stickerTabView.setFocusable(true);
            stickerTabView.setOnClickListener(new ScrollSlidingTabStrip$$ExternalSyntheticLambda0(this, 3));
            stickerTabView.setExpanded(this.expanded);
            stickerTabView.updateExpandProgress(this.expandProgress);
            this.tabsContainer.addView(stickerTabView, i2);
        }
        stickerTabView.isChatSticker = false;
        stickerTabView.setTag(R.id.index_tag, Integer.valueOf(i2));
        stickerTabView.setSelected(i2 == this.currentPosition);
        this.tabTypes.put(strM, stickerTabView);
        return stickerTabView;
    }

    public final void beginUpdate(boolean z) {
        this.prevTypes = this.tabTypes;
        this.tabTypes = new HashMap();
        this.futureTabsPositions.clear();
        this.tabCount = 0;
        if (z) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(250L);
            autoTransition.setOrdering(0);
            autoTransition.addTransition(new PhotoViewer.AnonymousClass75(this, 1));
            TransitionManager.beginDelayedTransition(this.tabsContainer, autoTransition);
        }
    }

    public final boolean canSwap(int i) {
        if (!this.dragEnabled || i < 0) {
            return false;
        }
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
        if (i >= anonymousClass35.getChildCount()) {
            return false;
        }
        View childAt = anonymousClass35.getChildAt(i);
        if (!(childAt instanceof StickerTabView)) {
            return false;
        }
        StickerTabView stickerTabView = (StickerTabView) childAt;
        return stickerTabView.type == 0 && !stickerTabView.isChatSticker;
    }

    @Override
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.longClickRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.longClickRunnable);
    }

    public final boolean checkLongPress(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        AnonymousClass1 anonymousClass1 = this.longClickRunnable;
        if (action == 0 && this.draggingView == null) {
            this.longClickRunning = true;
            AndroidUtilities.runOnUIThread(anonymousClass1, 500L);
            this.pressedX = motionEvent.getX();
            this.pressedY = motionEvent.getY();
        }
        if (this.longClickRunning && motionEvent.getAction() == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.pressedX);
            float f = this.touchSlop;
            if (fAbs > f || Math.abs(motionEvent.getY() - this.pressedY) > f) {
                this.longClickRunning = false;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            }
        }
        int action2 = motionEvent.getAction();
        AnonymousClass1 anonymousClass2 = this.scrollRunnable;
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
        if (action2 != 2 || this.draggingView == null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            this.scrollStartTime = -1L;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            if (this.draggingView != null) {
                int i = this.startDragFromPosition;
                int i2 = this.currentDragPosition;
                if (i != i2) {
                    stickerSetPositionChanged(i, i2);
                    for (int i3 = 0; i3 < anonymousClass35.getChildCount(); i3++) {
                        anonymousClass35.getChildAt(i3).setTag(R.id.index_tag, Integer.valueOf(i3));
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 11));
                valueAnimatorOfFloat.addListener(new ItemOptions.AnonymousClass3(this, 28));
                valueAnimatorOfFloat.start();
            }
            this.longClickRunning = false;
            invalidateOverlays();
            return false;
        }
        int iCeil = ((int) Math.ceil((motionEvent.getX() + getScrollX()) / getTabSize())) - 1;
        int i4 = this.currentDragPosition;
        if (iCeil != i4) {
            if (iCeil < i4) {
                while (!canSwap(iCeil) && iCeil != this.currentDragPosition) {
                    iCeil++;
                }
            } else {
                while (!canSwap(iCeil) && iCeil != this.currentDragPosition) {
                    iCeil--;
                }
            }
        }
        if (this.currentDragPosition != iCeil && canSwap(iCeil)) {
            for (int i5 = 0; i5 < anonymousClass35.getChildCount(); i5++) {
                if (i5 != this.currentDragPosition) {
                    StickerTabView stickerTabView = (StickerTabView) anonymousClass35.getChildAt(i5);
                    stickerTabView.lastLeft = stickerTabView.getLeft();
                    stickerTabView.hasSavedLeft = true;
                    stickerTabView.invalidate();
                }
            }
            this.startDragFromX += (iCeil - this.currentDragPosition) * getTabSize();
            this.currentDragPosition = iCeil;
            anonymousClass35.removeView(this.draggingView);
            anonymousClass35.addView(this.draggingView, this.currentDragPosition);
            invalidate();
        }
        this.draggindViewDxOnScreen = this.pressedX - motionEvent.getX();
        float x = motionEvent.getX();
        if (x < this.draggingView.getMeasuredWidth() / 2.0f) {
            this.scrollRight = false;
            if (this.scrollStartTime <= 0) {
                this.scrollStartTime = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(anonymousClass2, 16L);
        } else if (x > getMeasuredWidth() - (this.draggingView.getMeasuredWidth() / 2.0f)) {
            this.scrollRight = true;
            if (this.scrollStartTime <= 0) {
                this.scrollStartTime = System.currentTimeMillis();
            }
            AndroidUtilities.runOnUIThread(anonymousClass2, 16L);
        } else {
            this.scrollStartTime = -1L;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass2);
        }
        anonymousClass35.invalidate();
        invalidateOverlays();
        return true;
    }

    public final void commitUpdate() {
        HashMap map = this.prevTypes;
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                anonymousClass35.removeView((View) ((Map.Entry) it.next()).getValue());
            }
            this.prevTypes.clear();
        }
        SparseArray sparseArray = this.futureTabsPositions;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            View view = (View) sparseArray.valueAt(i);
            if (anonymousClass35.indexOfChild(view) != iKeyAt) {
                anonymousClass35.removeView(view);
                anonymousClass35.addView(view, iKeyAt);
            }
        }
        sparseArray.clear();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        PhotoViewer.AnonymousClass35 anonymousClass35;
        Canvas canvas2;
        float f;
        float textWidth;
        float translationX;
        float fClamp;
        float fClamp2;
        int i = 2;
        float f2 = this.stickerTabWidth - this.stickerTabExpandedWidth;
        float f3 = (1.0f - this.expandProgress) * this.expandOffset;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            anonymousClass35 = this.tabsContainer;
            if (i3 >= anonymousClass35.getChildCount()) {
                break;
            }
            if (anonymousClass35.getChildAt(i3) instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) anonymousClass35.getChildAt(i3);
                float left = stickerTabView.getLeft();
                float f4 = stickerTabView.lastLeft;
                if (left != f4 && stickerTabView.hasSavedLeft) {
                    stickerTabView.dragOffset = f4 - stickerTabView.getLeft();
                    ValueAnimator valueAnimator = stickerTabView.dragOffsetAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        stickerTabView.dragOffsetAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(stickerTabView.dragOffset, 0.0f);
                    stickerTabView.dragOffsetAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new StickerTabView.AnonymousClass2(stickerTabView, this, i2));
                    stickerTabView.dragOffsetAnimator.addListener(new QrActivity.AnonymousClass4(i, stickerTabView, this));
                    stickerTabView.dragOffsetAnimator.start();
                }
                stickerTabView.hasSavedLeft = false;
                if (this.animateToExpanded) {
                    stickerTabView.setTranslationX(DiffUtil.m(1.0f, this.expandProgress, i3 * f2, f3) + stickerTabView.dragOffset);
                } else {
                    stickerTabView.setTranslationX(stickerTabView.dragOffset);
                }
            }
            i3++;
        }
        float height = getHeight();
        if (this.animateToExpanded) {
            height = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.expandProgress, AndroidUtilities.dp(50.0f), getHeight());
        }
        float f5 = height;
        float f6 = this.showSelectedAlpha.set(this.showSelected ? 1.0f : 0.0f, false);
        if (isInEditMode() || this.tabCount == 0 || this.indicatorHeight < 0) {
            canvas2 = canvas;
            anonymousClass35 = anonymousClass35;
        } else {
            float f7 = this.currentPosition;
            AnimatedFloat animatedFloat = this.currentPositionAnimated;
            float f8 = animatedFloat.set(f7, false);
            double d = f8;
            int iFloor = (int) Math.floor(d);
            int iCeil = (int) Math.ceil(d);
            View childAt = null;
            View childAt2 = (iFloor < 0 || iFloor >= anonymousClass35.getChildCount()) ? null : anonymousClass35.getChildAt(iFloor);
            if (iCeil >= 0 && iCeil < anonymousClass35.getChildCount()) {
                childAt = anonymousClass35.getChildAt(iCeil);
            }
            float f9 = f5 / 2.0f;
            if (childAt2 == null || childAt == null) {
                f = 2.0f;
                if (childAt2 != null) {
                    translationX = childAt2.getTranslationX() + childAt2.getLeft() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.expandProgress) / 2.0f);
                    if (childAt2 instanceof StickerTabView) {
                        textWidth = ((StickerTabView) childAt2).getTextWidth();
                    } else {
                        textWidth = 0.0f;
                    }
                } else if (childAt != null) {
                    translationX = childAt.getTranslationX() + childAt.getLeft() + (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.expandProgress) / 2.0f);
                    if (childAt instanceof StickerTabView) {
                        textWidth = ((StickerTabView) childAt).getTextWidth();
                    } else {
                        textWidth = 0.0f;
                    }
                } else {
                    textWidth = 0.0f;
                    translationX = 0.0f;
                }
            } else {
                f = 2.0f;
                float f10 = f8 - iFloor;
                translationX = AndroidUtilities.lerp((AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.expandProgress) / 2.0f) + childAt2.getTranslationX() + childAt2.getLeft(), (AndroidUtilities.lerp(AndroidUtilities.dp(33.0f), AndroidUtilities.dp(64.0f), this.expandProgress) / 2.0f) + childAt.getTranslationX() + childAt.getLeft(), f10);
                textWidth = AndroidUtilities.lerp(childAt2 instanceof StickerTabView ? ((StickerTabView) childAt2).getTextWidth() : 0.0f, childAt instanceof StickerTabView ? ((StickerTabView) childAt).getTextWidth() : 0.0f, f10);
            }
            float fDp = AndroidUtilities.dp(30.0f);
            Interpolator interpolator = animatedFloat.transitionInterpolator;
            if (interpolator != null) {
                fClamp = interpolator.getInterpolation(!animatedFloat.transition ? 0.0f : MathUtils.clamp(((SystemClock.elapsedRealtime() - animatedFloat.transitionStart) - animatedFloat.transitionDelay) / animatedFloat.transitionDuration, 0.0f, 1.0f));
            } else {
                fClamp = !animatedFloat.transition ? 0.0f : MathUtils.clamp(((SystemClock.elapsedRealtime() - animatedFloat.transitionStart) - animatedFloat.transitionDelay) / animatedFloat.transitionDuration, 0.0f, 1.0f);
            }
            float fAbs = (1.25f - ((Math.abs(0.5f - fClamp) * 0.25f) * f)) * fDp;
            if (interpolator != null) {
                fClamp2 = interpolator.getInterpolation(!animatedFloat.transition ? 0.0f : MathUtils.clamp(((SystemClock.elapsedRealtime() - animatedFloat.transitionStart) - animatedFloat.transitionDelay) / animatedFloat.transitionDuration, 0.0f, 1.0f));
            } else {
                anonymousClass35 = anonymousClass35;
                fClamp2 = !animatedFloat.transition ? 0.0f : MathUtils.clamp(((SystemClock.elapsedRealtime() - animatedFloat.transitionStart) - animatedFloat.transitionDelay) / animatedFloat.transitionDuration, 0.0f, 1.0f);
            }
            float fAbs2 = ((Math.abs(0.5f - fClamp2) * 0.1f * f) + 0.9f) * fDp;
            float interpolation = CubicBezierInterpolator.EASE_IN.getInterpolation(this.expandProgress);
            float fLerp = AndroidUtilities.lerp(fAbs, textWidth + AndroidUtilities.dp(10.0f), interpolation);
            float fLerp2 = f9 + AndroidUtilities.lerp(0, AndroidUtilities.dp(26.0f), interpolation);
            float fLerp3 = AndroidUtilities.lerp(1.0f, 0.55f, interpolation) * fAbs2;
            RectF rectF = this.tabBounds;
            float f11 = fLerp / f;
            float f12 = fLerp3 / f;
            rectF.set(translationX - f11, fLerp2 - f12, translationX + f11, fLerp2 + f12);
            Paint paint = this.selectorPaint;
            boolean z = this.isGlassDesign;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z) {
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), (int) 12.75f));
            } else {
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_emojiPanelIcon, resourcesProvider), 46));
                paint.setAlpha((int) (paint.getAlpha() * f6));
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(rectF, rectF.height() / f, rectF.height() / f, paint);
        }
        super.dispatchDraw(canvas);
        if (isInEditMode() || this.tabCount == 0 || this.underlineHeight <= 0) {
            return;
        }
        Paint paint2 = this.rectPaint;
        paint2.setColor(this.underlineColor);
        canvas2.drawRect(0.0f, f5 - this.underlineHeight, anonymousClass35.getWidth(), f5, paint2);
    }

    public final void expandStickers(final float f, final boolean z) {
        int i = 0;
        if (this.expanded != z) {
            this.expanded = z;
            if (!z) {
                fling(0);
            }
            ValueAnimator valueAnimator = this.expandStickerAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.expandStickerAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.expandProgress, z ? 1.0f : 0.0f);
            this.expandStickerAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ScrollSlidingTabStrip scrollSlidingTabStrip = this.f$0;
                    PhotoViewer.AnonymousClass35 anonymousClass35 = scrollSlidingTabStrip.tabsContainer;
                    if (!z) {
                        float childCount = scrollSlidingTabStrip.stickerTabWidth * anonymousClass35.getChildCount();
                        float scrollX = scrollSlidingTabStrip.getScrollX();
                        float f2 = f;
                        float childCount2 = (scrollX + f2) / (scrollSlidingTabStrip.stickerTabExpandedWidth * anonymousClass35.getChildCount());
                        float measuredWidth = (childCount - scrollSlidingTabStrip.getMeasuredWidth()) / childCount;
                        if (childCount2 > measuredWidth) {
                            childCount2 = measuredWidth;
                            f2 = 0.0f;
                        }
                        float f3 = childCount * childCount2;
                        if (f3 - f2 < 0.0f) {
                            f3 = f2;
                        }
                        scrollSlidingTabStrip.expandOffset = (scrollSlidingTabStrip.getScrollX() + f2) - f3;
                    }
                    scrollSlidingTabStrip.expandProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    for (int i2 = 0; i2 < anonymousClass35.getChildCount(); i2++) {
                        anonymousClass35.getChildAt(i2).invalidate();
                    }
                    anonymousClass35.invalidate();
                    scrollSlidingTabStrip.updatePosition();
                }
            });
            this.expandStickerAnimator.addListener(new AnonymousClass4(this, z, f, i));
            this.expandStickerAnimator.start();
            PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
            if (z) {
                this.animateToExpanded = true;
                while (i < anonymousClass35.getChildCount()) {
                    View childAt = anonymousClass35.getChildAt(i);
                    if (childAt instanceof StickerTabView) {
                        ((StickerTabView) childAt).setExpanded(true);
                    }
                    childAt.getLayoutParams().width = AndroidUtilities.dp(64.0f);
                    i++;
                }
                anonymousClass35.requestLayout();
                getLayoutParams().height = AndroidUtilities.dp(86.0f);
            }
            if (z) {
                float childCount = this.stickerTabExpandedWidth * anonymousClass35.getChildCount() * ((getScrollX() + f) / (this.stickerTabWidth * anonymousClass35.getChildCount()));
                this.expandOffset = childCount - (getScrollX() + f);
                this.scrollByOnNextMeasure = (int) (childCount - f);
            }
        }
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public float getExpandedOffset() {
        if (this.animateToExpanded) {
            return AndroidUtilities.dp(50.0f) * this.expandProgress;
        }
        return 0.0f;
    }

    public Type getType() {
        return this.type;
    }

    public void invalidateOverlays() {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setImages();
        int i5 = this.scrollByOnNextMeasure;
        if (i5 >= 0) {
            scrollTo(i5, 0);
            this.scrollByOnNextMeasure = -1;
        }
    }

    public final void onPageScrolled(int i, int i2) {
        int i3 = this.currentPosition;
        if (i3 == i) {
            return;
        }
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
        View childAt = anonymousClass35.getChildAt(i3);
        if (childAt != null) {
            childAt.getLeft();
            SystemClock.elapsedRealtime();
        }
        this.currentPosition = i;
        if (i >= anonymousClass35.getChildCount()) {
            return;
        }
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= anonymousClass35.getChildCount()) {
                break;
            }
            View childAt2 = anonymousClass35.getChildAt(i4);
            if (i4 != i) {
                z = false;
            }
            childAt2.setSelected(z);
            i4++;
        }
        if (this.expandStickerAnimator == null) {
            if (i2 != i || i <= 1) {
                scrollToChild(i);
            } else {
                scrollToChild(i - 1);
            }
        }
        invalidate();
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        setImages();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return checkLongPress(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void scrollToChild(int i) {
        if (this.tabCount != 0) {
            PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
            if (anonymousClass35.getChildAt(i) == null) {
                return;
            }
            int left = anonymousClass35.getChildAt(i).getLeft();
            int i2 = this.scrollOffset;
            if (i > 0) {
                left -= i2;
            }
            int scrollX = getScrollX();
            if (left != this.lastScrollX) {
                if (left < scrollX) {
                    this.lastScrollX = left;
                    smoothScrollTo(left, 0);
                } else if (left + i2 > (getWidth() + scrollX) - (i2 * 2)) {
                    int width = (i2 * 3) + (left - getWidth());
                    this.lastScrollX = width;
                    smoothScrollTo(width, 0);
                }
            }
        }
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    public void setDragEnabled(boolean z) {
        this.dragEnabled = z;
    }

    public void setImageReceiversLayerNum(int i) {
        this.imageReceiversPlayingNum = i;
    }

    public final void setImages() {
        SparseArray sparseArray;
        int i;
        int i2;
        String str;
        ImageLocation forSticker;
        Object obj;
        Object obj2;
        String str2;
        ImageLocation imageLocation;
        float fDp = AndroidUtilities.dp(33.0f);
        float fDp2 = AndroidUtilities.dp(31.0f);
        float f = this.expandProgress;
        float f2 = (fDp2 * f) + fDp;
        float scrollX = getScrollX() - (this.animateToExpanded ? (1.0f - f) * this.expandOffset : 0.0f);
        PhotoViewer.AnonymousClass35 anonymousClass35 = this.tabsContainer;
        int paddingLeft = (int) ((scrollX - anonymousClass35.getPaddingLeft()) / f2);
        int i3 = 1;
        int iMin = Math.min(anonymousClass35.getChildCount(), ((int) Math.ceil(getMeasuredWidth() / f2)) + paddingLeft + 1);
        if (this.animateToExpanded) {
            paddingLeft -= 2;
            iMin += 2;
            if (paddingLeft < 0) {
                paddingLeft = 0;
            }
            if (iMin > anonymousClass35.getChildCount()) {
                iMin = anonymousClass35.getChildCount();
            }
        }
        SparseArray sparseArray2 = this.currentPlayingImagesTmp;
        sparseArray2.clear();
        int i4 = 0;
        while (true) {
            sparseArray = this.currentPlayingImages;
            if (i4 >= sparseArray.size()) {
                break;
            }
            sparseArray2.put(((StickerTabView) sparseArray.valueAt(i4)).index, (StickerTabView) sparseArray.valueAt(i4));
            i4++;
        }
        sparseArray.clear();
        while (paddingLeft < iMin) {
            View childAt = anonymousClass35.getChildAt(paddingLeft);
            if (childAt instanceof StickerTabView) {
                StickerTabView stickerTabView = (StickerTabView) childAt;
                int i5 = stickerTabView.type;
                BackupImageView backupImageView = stickerTabView.imageView;
                if (i5 == 2) {
                    Object tag = stickerTabView.getTag(R.id.parent_tag);
                    Object tag2 = stickerTabView.getTag(R.id.object_tag);
                    Drawable drawable = tag instanceof Drawable ? (Drawable) tag : null;
                    if (tag2 instanceof TLRPC.Document) {
                        backupImageView.setImage(ImageLocation.getForDocument((TLRPC.Document) tag2), !LiteMode.isEnabled(i3) ? "36_36_firstframe" : "36_36_nolimit", null, null);
                    } else {
                        backupImageView.setImageDrawable(drawable);
                    }
                    paddingLeft = paddingLeft;
                    i = iMin;
                } else {
                    Object tag3 = childAt.getTag();
                    Object tag4 = childAt.getTag(R.id.parent_tag);
                    TLRPC.Document document = (TLRPC.Document) childAt.getTag(R.id.object_tag);
                    if (tag3 instanceof TLRPC.Document) {
                        if (!stickerTabView.inited) {
                            stickerTabView.svgThumb = DocumentObject.getSvgThumb((TLRPC.Document) tag3, Theme.key_emptyListPlaceholder, 0.2f);
                        }
                        forSticker = ImageLocation.getForDocument(document);
                        paddingLeft = paddingLeft;
                        str = null;
                    } else if (tag3 instanceof TLRPC.PhotoSize) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tag3;
                        if (tag4 instanceof TLRPC.TL_messages_stickerSet) {
                            TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) tag4).set;
                            i2 = stickerSet.thumb_version;
                            if (!stickerTabView.inited) {
                                ArrayList<TLRPC.PhotoSize> arrayList = stickerSet.thumbs;
                                stickerTabView.svgThumb = DocumentObject.getSvgThumb(arrayList, Theme.key_emptyListPlaceholder, 0.2f, DocumentObject.containsPhotoSizeType(arrayList, "v"));
                            }
                        } else {
                            i2 = 0;
                        }
                        str = photoSize.type;
                        forSticker = ImageLocation.getForSticker(photoSize, document, i2);
                    } else {
                        paddingLeft = paddingLeft;
                        i = iMin;
                    }
                    if (!stickerTabView.inited && stickerTabView.svgThumb == null && document != null) {
                        stickerTabView.svgThumb = DocumentObject.getSvgThumb(document, Theme.key_emptyListPlaceholder, 0.2f);
                    }
                    if (forSticker == null) {
                        i = iMin;
                        i3 = 1;
                    } else {
                        stickerTabView.inited = true;
                        SvgHelper.SvgDrawable svgDrawable = stickerTabView.svgThumb;
                        boolean zIsEnabled = LiteMode.isEnabled(1);
                        String str3 = !zIsEnabled ? "40_40_firstframe" : "40_40";
                        if (str == null && MessageObject.isVideoSticker(document)) {
                            i = iMin;
                            ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                if (str == null) {
                                    if (!zIsEnabled) {
                                        backupImageView.setImage$1(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                                    } else if (svgDrawable != null) {
                                        backupImageView.setImage$1(ImageLocation.getForDocument(document), str3, svgDrawable, tag4);
                                    } else {
                                        obj2 = tag4;
                                        backupImageView.setImage(ImageLocation.getForDocument(document), str3, forSticker, null, null, null, 0, obj2);
                                        obj = obj2;
                                    }
                                    obj = tag4;
                                } else {
                                    obj = tag4;
                                    imageLocation = forSticker;
                                    if (svgDrawable != null) {
                                        backupImageView.setImage$1(imageLocation, str3, svgDrawable, obj);
                                    } else {
                                        backupImageView.setImage(imageLocation, str3, null, null, null, null, 0, obj);
                                    }
                                }
                                i3 = 1;
                            }
                            if (obj instanceof TLRPC.TL_messages_stickerSet) {
                                str2 = ((TLRPC.TL_messages_stickerSet) obj).set.title;
                            } else {
                                str2 = null;
                            }
                            stickerTabView.textView.setText(str2);
                        } else {
                            i = iMin;
                        }
                        if (str == null || !str.equalsIgnoreCase("v")) {
                            ImageLocation imageLocation2 = forSticker;
                            if (!(str == null && MessageObject.isAnimatedStickerDocument(document, true)) && (str == null || !str.equalsIgnoreCase("a"))) {
                                i3 = 1;
                                if (imageLocation2.imageType == 1) {
                                    backupImageView.setImage(imageLocation2, str3, null, null, svgDrawable, "tgs", 0, tag4);
                                } else {
                                    backupImageView.setImage(imageLocation2, str3, null, null, svgDrawable, "webp", 0, tag4);
                                }
                                obj = tag4;
                            } else {
                                if (svgDrawable != null) {
                                    backupImageView.setImage$1(imageLocation2, str3, svgDrawable, tag4);
                                    obj = tag4;
                                } else {
                                    obj2 = tag4;
                                    backupImageView.setImage(imageLocation2, str3, imageLocation2, null, null, null, 0, obj2);
                                    obj = obj2;
                                }
                                i3 = 1;
                            }
                        } else {
                            if (str == null) {
                                if (!zIsEnabled) {
                                    backupImageView.setImage$1(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "40_40", svgDrawable, tag4);
                                } else if (svgDrawable != null) {
                                    backupImageView.setImage$1(ImageLocation.getForDocument(document), str3, svgDrawable, tag4);
                                } else {
                                    obj2 = tag4;
                                    backupImageView.setImage(ImageLocation.getForDocument(document), str3, forSticker, null, null, null, 0, obj2);
                                    obj = obj2;
                                }
                                obj = tag4;
                            } else {
                                obj = tag4;
                                imageLocation = forSticker;
                                if (svgDrawable != null) {
                                    backupImageView.setImage$1(imageLocation, str3, svgDrawable, obj);
                                } else {
                                    backupImageView.setImage(imageLocation, str3, null, null, null, null, 0, obj);
                                }
                            }
                            i3 = 1;
                        }
                        if (obj instanceof TLRPC.TL_messages_stickerSet) {
                            str2 = ((TLRPC.TL_messages_stickerSet) obj).set.title;
                        } else {
                            str2 = null;
                        }
                        stickerTabView.textView.setText(str2);
                    }
                }
                int i6 = stickerTabView.index;
                sparseArray.put(i6, stickerTabView);
                sparseArray2.remove(i6);
            } else {
                paddingLeft = paddingLeft;
                i = iMin;
            }
            paddingLeft++;
            iMin = i;
        }
        for (int i7 = 0; i7 < sparseArray2.size(); i7++) {
            if (((StickerTabView) sparseArray2.valueAt(i7)) != this.draggingView) {
                ((StickerTabView) sparseArray2.valueAt(i7)).imageView.setImageDrawable(null);
            }
        }
    }

    public void setIndicatorColor(int i) {
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        requestLayout();
    }

    public void setType(Type type) {
        if (type == null || this.type == type) {
            return;
        }
        this.type = type;
        int iOrdinal = type.ordinal();
        GradientDrawable gradientDrawable = this.indicatorDrawable;
        if (iOrdinal == 0) {
            gradientDrawable.setCornerRadius(0.0f);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            float fDpf2 = AndroidUtilities.dpf2(3.0f);
            gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, 0.0f, 0.0f, 0.0f, 0.0f});
        }
    }

    public void setUnderlineColor(int i) {
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        if (this.underlineHeight != i) {
            this.underlineHeight = i;
            invalidate();
        }
    }

    public void stickerSetPositionChanged(int i, int i2) {
    }

    public void updatePosition() {
    }
}
