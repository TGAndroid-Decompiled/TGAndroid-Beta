package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout$MediaCell$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.web.HistoryFragment$1$$ExternalSyntheticLambda0;

public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements Theme.Colorable {
    private int activeTextColorKey;
    private int allTextWidth;
    private int animateFromIndicatorWidth;
    private int animateFromIndicaxtorX;
    private int animateIndicatorStartWidth;
    private int animateIndicatorStartX;
    private int animateIndicatorToWidth;
    private int animateIndicatorToX;
    private boolean animatingIndicator;
    public long animationDuration;
    private float animationIdicatorProgress;
    private final Runnable animationRunnable;
    private boolean animationRunning;
    private float animationTime;
    BlurredBackgroundDrawable backgroundDrawable;
    public final Path clipPath;
    private int currentPosition;
    private ScrollSlidingTabStripDelegate delegate;
    private View dragging;
    private boolean fitsItems;
    private SparseIntArray idToPosition;
    private int indicatorWidth;
    private float indicatorWidthAnimationDx;
    private int indicatorX;
    private float indicatorXAnimationDx;
    private CubicBezierInterpolator interpolator;
    private boolean isOpen;
    private long lastAnimationTime;
    private final AnimatedFloat left;
    private final AnimatedFloat open;
    private SparseIntArray positionToId;
    private SparseIntArray positionToWidth;
    private int prevLayoutWidth;
    private SparseIntArray prevPositionToWidth;
    private final RectF prevRect;
    private int previousPosition;
    private final RectF rect;
    private final AnimatedFloat rectT;
    private boolean reordering;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollingToChild;
    private int selectedTabId;
    private int selectorColorKey;
    private GradientDrawable selectorDrawable;
    private boolean setInitialTab;
    private int tabCount;
    private int tabLineColorKey;
    private final LinearLayout tabsContainer;
    private int unactiveTextColorKey;
    private boolean useMinimalWidth;
    private boolean useSameWidth;

    public class AnonymousClass2 extends LinearLayout {
        private float sx;
        private float sy;

        public AnonymousClass2(Context context) {
            super(context);
        }

        private View find(float f, float f2) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (f >= childAt.getX() && f <= childAt.getX() + childAt.getWidth() && f2 >= childAt.getY() && f2 <= childAt.getY() + childAt.getHeight()) {
                    return childAt;
                }
            }
            return null;
        }

        private int findPosition(float f, int i) {
            if (f < 0.0f) {
                return 0;
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                float width = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                if (f >= width - (Math.min(i, childAt.getWidth()) / 2.0f) && f <= (Math.min(i, childAt.getWidth()) / 2.0f) + width) {
                    return i2;
                }
            }
            return getChildCount() - 1;
        }

        public void lambda$dispatchTouchEvent$0(ValueAnimator valueAnimator) {
            invalidate();
            ScrollSlidingTextTabStrip.this.invalidate();
        }

        public void lambda$dispatchTouchEvent$1(ValueAnimator valueAnimator) {
            invalidate();
            ScrollSlidingTextTabStrip.this.invalidate();
        }

        public void lambda$dispatchTouchEvent$2(ValueAnimator valueAnimator) {
            invalidate();
            ScrollSlidingTextTabStrip.this.invalidate();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (ScrollSlidingTextTabStrip.this.delegate == null || !ScrollSlidingTextTabStrip.this.reordering) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() != 0) {
                if (motionEvent.getAction() != 2) {
                    z = false;
                    if (motionEvent.getAction() == 1) {
                        if (ScrollSlidingTextTabStrip.this.dragging != null) {
                            final int i = 1;
                            ScrollSlidingTextTabStrip.this.dragging.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ScrollSlidingTextTabStrip.AnonymousClass2 f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i) {
                                        case 0:
                                            this.f$0.lambda$dispatchTouchEvent$0(valueAnimator);
                                            break;
                                        case 1:
                                            this.f$0.lambda$dispatchTouchEvent$1(valueAnimator);
                                            break;
                                        default:
                                            this.f$0.lambda$dispatchTouchEvent$2(valueAnimator);
                                            break;
                                    }
                                }
                            }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        }
                        ScrollSlidingTextTabStrip.this.dragging = null;
                    } else if (motionEvent.getAction() == 3) {
                        if (ScrollSlidingTextTabStrip.this.dragging != null) {
                            final int i2 = 2;
                            ScrollSlidingTextTabStrip.this.dragging.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final ScrollSlidingTextTabStrip.AnonymousClass2 f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i2) {
                                        case 0:
                                            this.f$0.lambda$dispatchTouchEvent$0(valueAnimator);
                                            break;
                                        case 1:
                                            this.f$0.lambda$dispatchTouchEvent$1(valueAnimator);
                                            break;
                                        default:
                                            this.f$0.lambda$dispatchTouchEvent$2(valueAnimator);
                                            break;
                                    }
                                }
                            }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        }
                        ScrollSlidingTextTabStrip.this.dragging = null;
                    }
                } else if (ScrollSlidingTextTabStrip.this.dragging != null) {
                    ScrollSlidingTextTabStrip.this.dragging.setTranslationX(motionEvent.getX() - this.sx);
                    int iIndexOfChild = indexOfChild(ScrollSlidingTextTabStrip.this.dragging);
                    if (ScrollSlidingTextTabStrip.this.currentPosition == iIndexOfChild) {
                        ScrollSlidingTextTabStrip.this.invalidate();
                    }
                    if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                        ScrollSlidingTextTabStrip.this.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                    } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                        ScrollSlidingTextTabStrip.this.scrollBy(AndroidUtilities.dp(1.0f), 0);
                    }
                    int iFindPosition = findPosition((ScrollSlidingTextTabStrip.this.dragging.getWidth() / 2.0f) + ScrollSlidingTextTabStrip.this.dragging.getX(), ScrollSlidingTextTabStrip.this.dragging.getWidth());
                    if (iFindPosition != iIndexOfChild && ScrollSlidingTextTabStrip.this.delegate.canReorder(ScrollSlidingTextTabStrip.this.positionToId.get(iFindPosition))) {
                        View childAt = getChildAt(iFindPosition);
                        if (childAt.getLeft() > ScrollSlidingTextTabStrip.this.dragging.getLeft()) {
                            this.sx += ((childAt.getWidth() + childAt.getLeft()) - ScrollSlidingTextTabStrip.this.dragging.getWidth()) - ScrollSlidingTextTabStrip.this.dragging.getLeft();
                        } else {
                            this.sx += childAt.getLeft() - ScrollSlidingTextTabStrip.this.dragging.getLeft();
                        }
                        ScrollSlidingTextTabStrip.this.dragging.setTranslationX(motionEvent.getX() - this.sx);
                        ViewGroup.LayoutParams layoutParams = ScrollSlidingTextTabStrip.this.dragging.getLayoutParams();
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        int left = ScrollSlidingTextTabStrip.this.dragging.getLeft();
                        int left2 = childAt.getLeft();
                        if (ScrollSlidingTextTabStrip.this.currentPosition == iIndexOfChild) {
                            ScrollSlidingTextTabStrip.this.currentPosition = iFindPosition;
                        } else if (ScrollSlidingTextTabStrip.this.currentPosition == iFindPosition) {
                            ScrollSlidingTextTabStrip.this.currentPosition = iIndexOfChild;
                        }
                        if (ScrollSlidingTextTabStrip.this.previousPosition == iIndexOfChild) {
                            ScrollSlidingTextTabStrip.this.previousPosition = iFindPosition;
                        } else if (ScrollSlidingTextTabStrip.this.previousPosition == iFindPosition) {
                            ScrollSlidingTextTabStrip.this.previousPosition = iIndexOfChild;
                        }
                        ScrollSlidingTextTabStrip.this.prevLayoutWidth = -1;
                        int i3 = ScrollSlidingTextTabStrip.this.positionToId.get(iIndexOfChild);
                        int i4 = ScrollSlidingTextTabStrip.this.positionToId.get(iFindPosition);
                        ScrollSlidingTextTabStrip.this.positionToId.put(iIndexOfChild, i4);
                        ScrollSlidingTextTabStrip.this.idToPosition.put(i4, iIndexOfChild);
                        ScrollSlidingTextTabStrip.this.positionToId.put(iFindPosition, i3);
                        ScrollSlidingTextTabStrip.this.idToPosition.put(i3, iFindPosition);
                        ScrollSlidingTextTabStrip.this.tabsContainer.removeViewAt(Math.max(iIndexOfChild, iFindPosition));
                        ScrollSlidingTextTabStrip.this.tabsContainer.removeViewAt(Math.min(iIndexOfChild, iFindPosition));
                        z = false;
                        ScrollSlidingTextTabStrip.this.tabsContainer.addView(iIndexOfChild < iFindPosition ? childAt : ScrollSlidingTextTabStrip.this.dragging, Math.min(iIndexOfChild, iFindPosition), iIndexOfChild < iFindPosition ? layoutParams2 : layoutParams);
                        LinearLayout linearLayout = ScrollSlidingTextTabStrip.this.tabsContainer;
                        View view = iIndexOfChild < iFindPosition ? ScrollSlidingTextTabStrip.this.dragging : childAt;
                        int iMax = Math.max(iIndexOfChild, iFindPosition);
                        if (iIndexOfChild >= iFindPosition) {
                            layoutParams = layoutParams2;
                        }
                        linearLayout.addView(view, iMax, layoutParams);
                        childAt.setTranslationX(left2 - left);
                        final int i5 = 0;
                        childAt.animate().translationX(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final ScrollSlidingTextTabStrip.AnonymousClass2 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i5) {
                                    case 0:
                                        this.f$0.lambda$dispatchTouchEvent$0(valueAnimator);
                                        break;
                                    case 1:
                                        this.f$0.lambda$dispatchTouchEvent$1(valueAnimator);
                                        break;
                                    default:
                                        this.f$0.lambda$dispatchTouchEvent$2(valueAnimator);
                                        break;
                                }
                            }
                        }).start();
                    }
                }
                if (ScrollSlidingTextTabStrip.this.dragging == null || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return z;
            }
            ScrollSlidingTextTabStrip.this.dragging = find(motionEvent.getX(), motionEvent.getY());
            if (ScrollSlidingTextTabStrip.this.dragging != null && getParent() != null) {
                if (!ScrollSlidingTextTabStrip.this.delegate.canReorder(ScrollSlidingTextTabStrip.this.positionToId.get(indexOfChild(ScrollSlidingTextTabStrip.this.dragging)))) {
                    ScrollSlidingTextTabStrip.this.dragging = null;
                    return super.dispatchTouchEvent(motionEvent);
                }
                this.sx = motionEvent.getX();
                this.sy = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            z = false;
            if (ScrollSlidingTextTabStrip.this.dragging == null) {
            }
            return true;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (!ScrollSlidingTextTabStrip.this.setInitialTab || ScrollSlidingTextTabStrip.this.idToPosition.indexOfKey(ScrollSlidingTextTabStrip.this.selectedTabId) < 0 || ScrollSlidingTextTabStrip.this.tabsContainer.getChildAt(ScrollSlidingTextTabStrip.this.idToPosition.get(ScrollSlidingTextTabStrip.this.selectedTabId)) == null) {
                return;
            }
            ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
            scrollSlidingTextTabStrip.scrollToChild(scrollSlidingTextTabStrip.idToPosition.get(ScrollSlidingTextTabStrip.this.selectedTabId), false);
            ScrollSlidingTextTabStrip.this.setInitialTab = false;
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            ScrollSlidingTextTabStrip.this.invalidate();
        }
    }

    public ScrollSlidingTextTabStrip(Context context) {
        this(context, null);
    }

    public static float access$216(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, float f) {
        float f2 = scrollSlidingTextTabStrip.animationTime + f;
        scrollSlidingTextTabStrip.animationTime = f2;
        return f2;
    }

    private void checkBoundsAndClipping() {
        float f = this.rectT.set(1.0f);
        this.rect.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        this.rect.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        if (f >= 1.0f) {
            this.prevRect.set(this.rect);
        } else {
            RectF rectF = this.prevRect;
            RectF rectF2 = this.rect;
            AndroidUtilities.lerp(rectF, rectF2, f, rectF2);
        }
        float fHeight = this.rect.height() / 2.0f;
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.rect, fHeight, fHeight, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha(255);
            this.backgroundDrawable.setBounds(((int) this.rect.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) this.rect.right), getMeasuredHeight());
            this.backgroundDrawable.setRadius(fHeight);
        }
    }

    private int getChildWidth(TextView textView) {
        textView.getLayout();
        return textView.getMeasuredWidth();
    }

    public void lambda$addTextTab$0(int i, View view) {
        scrollTo(i, this.tabsContainer.indexOfChild(view), view);
    }

    public boolean lambda$addTextTab$1(int i, View view) {
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate;
        return (this.reordering || (scrollSlidingTabStripDelegate = this.delegate) == null || !scrollSlidingTabStripDelegate.showOptions(i, view)) ? false : true;
    }

    public void lambda$onLayout$2(int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.indicatorXAnimationDx = i * fFloatValue;
        this.indicatorWidthAnimationDx = i2 * fFloatValue;
        this.tabsContainer.invalidate();
        invalidate();
    }

    public void scrollToChild(int i, boolean z) {
        if (this.tabCount == 0 || this.scrollingToChild == i) {
            return;
        }
        this.scrollingToChild = i;
        TextView textView = (TextView) this.tabsContainer.getChildAt(i);
        if (textView == null) {
            return;
        }
        int scrollX = getScrollX();
        int left = textView.getLeft();
        int measuredWidth = textView.getMeasuredWidth();
        if (left - AndroidUtilities.dp(50.0f) < scrollX) {
            if (z) {
                smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            } else {
                scrollTo(left - AndroidUtilities.dp(50.0f), 0);
                return;
            }
        }
        int i2 = left + measuredWidth;
        if (AndroidUtilities.dp(21.0f) + i2 > getWidth() + scrollX) {
            if (z) {
                smoothScrollTo(i2, 0);
            } else {
                scrollTo(i2, 0);
            }
        }
    }

    private void setAnimationProgressInernal(TextView textView, TextView textView2, float f) {
        if (textView == null || textView2 == null) {
            return;
        }
        int iProcessColor = processColor(Theme.getColor(this.activeTextColorKey, this.resourcesProvider));
        int iProcessColor2 = processColor(Theme.getColor(this.unactiveTextColorKey, this.resourcesProvider));
        int iRed = Color.red(iProcessColor);
        int iGreen = Color.green(iProcessColor);
        int iBlue = Color.blue(iProcessColor);
        int iAlpha = Color.alpha(iProcessColor);
        int iRed2 = Color.red(iProcessColor2);
        int iGreen2 = Color.green(iProcessColor2);
        int iBlue2 = Color.blue(iProcessColor2);
        int iAlpha2 = Color.alpha(iProcessColor2);
        textView2.setTextColor(Color.argb((int) (((iAlpha2 - iAlpha) * f) + iAlpha), (int) (((iRed2 - iRed) * f) + iRed), (int) (((iGreen2 - iGreen) * f) + iGreen), (int) (((iBlue2 - iBlue) * f) + iBlue)));
        textView.setTextColor(Color.argb((int) (((iAlpha - iAlpha2) * f) + iAlpha2), (int) (((iRed - iRed2) * f) + iRed2), (int) (((iGreen - iGreen2) * f) + iGreen2), (int) (((iBlue - iBlue2) * f) + iBlue2)));
        int i = this.animateIndicatorStartX;
        this.indicatorX = (int) (((this.animateIndicatorToX - i) * f) + i);
        int i2 = this.animateIndicatorStartWidth;
        this.indicatorWidth = (int) (((this.animateIndicatorToWidth - i2) * f) + i2);
        invalidate();
    }

    public void addTextTab(int i, CharSequence charSequence) {
        addTextTab(i, charSequence, null);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.backgroundDrawable != null) {
            if (this.rectT.set(1.0f) < 1.0f) {
                checkBoundsAndClipping();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.backgroundDrawable.shadowAlpha = this.open.set(this.isOpen);
            this.backgroundDrawable.draw(canvas);
            canvas.clipPath(this.clipPath);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.left.set(0.0f), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.tabsContainer) {
            return super.drawChild(canvas, view, j);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int measuredHeight = getMeasuredHeight();
        float translationX = this.indicatorX + this.indicatorXAnimationDx;
        float translationX2 = this.indicatorWidth + translationX + this.indicatorWidthAnimationDx;
        View childAt = this.tabsContainer.getChildAt(this.currentPosition);
        if (this.reordering && childAt != null) {
            translationX += childAt.getTranslationX();
            translationX2 += childAt.getTranslationX();
        }
        int alpha = this.selectorDrawable.getAlpha();
        this.selectorDrawable.setAlpha((int) (this.tabsContainer.getAlpha() * alpha));
        this.selectorDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) translationX), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) translationX2)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        this.selectorDrawable.draw(canvas);
        this.selectorDrawable.setAlpha(alpha);
        return zDrawChild;
    }

    public void finishAddingTabs() {
        int childCount = this.tabsContainer.getChildCount();
        int i = 0;
        while (i < childCount) {
            TextView textView = (TextView) this.tabsContainer.getChildAt(i);
            textView.setTag(Integer.valueOf(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey));
            textView.setTextColor(processColor(Theme.getColor(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey, this.resourcesProvider)));
            if (this.useMinimalWidth) {
                if (this.prevPositionToWidth.size() != this.positionToWidth.size() || this.prevPositionToWidth.get(i) != this.positionToWidth.get(i)) {
                    textView.requestLayout();
                }
            } else if (i == 0) {
                int i2 = textView.getLayoutParams().width;
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
                if (i2 != textView.getLayoutParams().width) {
                    textView.requestLayout();
                }
            }
            i++;
        }
        this.prevPositionToWidth.clear();
        for (int i3 = 0; i3 < this.positionToWidth.size(); i3++) {
            this.prevPositionToWidth.put(this.positionToWidth.keyAt(i3), this.positionToWidth.valueAt(i3));
        }
    }

    public float getAnimationIdicatorProgress() {
        return this.animationIdicatorProgress;
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getCurrentTabId() {
        return this.selectedTabId;
    }

    public int getFirstTabId() {
        return this.positionToId.get(0, 0);
    }

    public int getNextPageId(boolean z) {
        return this.positionToId.get(this.currentPosition + (z ? 1 : -1), -1);
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public ArrayList<Integer> getTabIds() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
            arrayList.add(Integer.valueOf(this.positionToId.get(i)));
        }
        return arrayList;
    }

    public ViewGroup getTabsContainer() {
        return this.tabsContainer;
    }

    public int getTabsCount() {
        return this.tabCount;
    }

    public boolean hasTab(int i) {
        return this.idToPosition.get(i, -1) != -1;
    }

    public boolean isAnimatingIndicator() {
        return this.animatingIndicator;
    }

    public boolean isReordering() {
        return this.reordering;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 1;
        super.onLayout(z, i, i2, i3, i4);
        int i7 = i3 - i;
        if (this.prevLayoutWidth != i7) {
            this.prevLayoutWidth = i7;
            this.scrollingToChild = -1;
            if (this.animatingIndicator) {
                AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                this.animatingIndicator = false;
                setEnabled(true);
                ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate = this.delegate;
                if (scrollSlidingTabStripDelegate != null) {
                    scrollSlidingTabStripDelegate.onPageScrolled(1.0f);
                }
            }
            TextView textView = (TextView) this.tabsContainer.getChildAt(this.currentPosition);
            if (textView != null) {
                this.indicatorWidth = getChildWidth(textView);
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i8 = this.indicatorWidth;
                int iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredWidth, i8, 2, left);
                this.indicatorX = iM;
                int i9 = this.animateFromIndicaxtorX;
                if (i9 > 0 && (i5 = this.animateFromIndicatorWidth) > 0) {
                    if (i9 != iM || i5 != i8) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new StickersAlert$4$$ExternalSyntheticLambda0(this, i9 - iM, i5 - i8, i6));
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        valueAnimatorOfFloat.start();
                    }
                    this.animateFromIndicaxtorX = 0;
                    this.animateFromIndicatorWidth = 0;
                }
            }
        }
        checkBoundsAndClipping();
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(22.0f);
        int childCount = this.tabsContainer.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.tabsContainer.getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f = layoutParams.weight;
            int i4 = layoutParams.width;
            if (this.useMinimalWidth) {
                layoutParams.weight = 0.0f;
                layoutParams.width = this.positionToWidth.get(i3);
            } else {
                int i5 = this.allTextWidth;
                if (i5 > size) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else if (this.useSameWidth) {
                    layoutParams.weight = 1.0f / childCount;
                    layoutParams.width = 0;
                } else if (i3 == 0 && childCount == 1) {
                    layoutParams.weight = 0.0f;
                    layoutParams.width = -2;
                } else {
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i5) * this.positionToWidth.get(i3), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f - layoutParams.weight) > 0.001f || i4 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = this.tabsContainer.getWeightSum();
        if (childCount == 1 || this.allTextWidth > size) {
            this.tabsContainer.setWeightSum(0.0f);
        } else {
            this.tabsContainer.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - this.tabsContainer.getWeightSum()) > 0.1f) {
            this.tabsContainer.requestLayout();
        }
        super.onMeasure(i, i2);
        this.fitsItems = getMeasuredWidth() < View.MeasureSpec.getSize(i);
        checkBoundsAndClipping();
    }

    public void onPageScrolled(int i, int i2) {
        if (this.currentPosition == i) {
            return;
        }
        this.currentPosition = i;
        if (i >= this.tabsContainer.getChildCount()) {
            return;
        }
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.tabsContainer.getChildCount()) {
                break;
            }
            View childAt = this.tabsContainer.getChildAt(i3);
            if (i3 != i) {
                z = false;
            }
            childAt.setSelected(z);
            i3++;
        }
        if (i2 != i || i <= 1) {
            scrollToChild(i, true);
        } else {
            scrollToChild(i - 1, true);
        }
        invalidate();
    }

    public int processColor(int i) {
        return i;
    }

    public void recordIndicatorParams() {
        this.animateFromIndicaxtorX = this.indicatorX;
        this.animateFromIndicatorWidth = this.indicatorWidth;
    }

    public SparseArray<View> removeTabs() {
        SparseArray<View> sparseArray = new SparseArray<>();
        for (int i = 0; i < this.tabsContainer.getChildCount(); i++) {
            sparseArray.put(this.positionToId.get(i), this.tabsContainer.getChildAt(i));
        }
        this.positionToId.clear();
        this.idToPosition.clear();
        this.prevPositionToWidth.clear();
        this.positionToWidth.clear();
        this.tabsContainer.removeAllViews();
        this.allTextWidth = 0;
        this.tabCount = 0;
        return sparseArray;
    }

    public void resetTab() {
        this.selectedTabId = -1;
    }

    public void scrollTo(int i, int i2, View view) {
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate;
        if (i2 >= 0) {
            if (view == null && this.animatingIndicator) {
                return;
            }
            int i3 = this.currentPosition;
            if (i2 == i3 && (scrollSlidingTabStripDelegate = this.delegate) != null) {
                scrollSlidingTabStripDelegate.onSamePageSelected();
                return;
            }
            boolean z = i3 < i2;
            this.scrollingToChild = -1;
            this.previousPosition = i3;
            this.currentPosition = i2;
            this.selectedTabId = i;
            if (this.animatingIndicator) {
                AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
                this.animatingIndicator = false;
            }
            this.animationTime = 0.0f;
            this.animatingIndicator = true;
            this.animateIndicatorStartX = this.indicatorX;
            this.animateIndicatorStartWidth = this.indicatorWidth;
            if (view != null) {
                TextView textView = (TextView) view;
                this.animateIndicatorToWidth = getChildWidth(textView);
                this.animateIndicatorToX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView.getMeasuredWidth(), this.animateIndicatorToWidth, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(this.animationRunnable, 16L);
            ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate2 = this.delegate;
            if (scrollSlidingTabStripDelegate2 != null) {
                scrollSlidingTabStripDelegate2.onPageSelected(i, z);
            }
            scrollToChild(i2, true);
        }
    }

    public void selectTabWithId(int i, float f) {
        int i2;
        int i3 = this.idToPosition.get(i, -1);
        if (i3 >= 0 && (i2 = this.currentPosition) != i3) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            TextView textView = (TextView) this.tabsContainer.getChildAt(i2);
            TextView textView2 = (TextView) this.tabsContainer.getChildAt(i3);
            if (textView != null && textView2 != null) {
                this.animateIndicatorStartWidth = getChildWidth(textView);
                this.animateIndicatorStartX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView.getMeasuredWidth(), this.animateIndicatorStartWidth, 2, textView.getLeft());
                this.animateIndicatorToWidth = getChildWidth(textView2);
                this.animateIndicatorToX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView2.getMeasuredWidth(), this.animateIndicatorToWidth, 2, textView2.getLeft());
                setAnimationProgressInernal(textView2, textView, f);
                if (f >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.unactiveTextColorKey));
                    textView2.setTag(Integer.valueOf(this.activeTextColorKey));
                }
                scrollToChild(this.tabsContainer.indexOfChild(textView2), true);
            }
            if (f >= 1.0f) {
                this.currentPosition = i3;
                this.selectedTabId = i;
            }
        }
    }

    public void setAnimationIdicatorProgress(float f) {
        this.animationIdicatorProgress = f;
        TextView textView = (TextView) this.tabsContainer.getChildAt(this.currentPosition);
        TextView textView2 = (TextView) this.tabsContainer.getChildAt(this.previousPosition);
        if (textView2 == null || textView == null) {
            return;
        }
        setAnimationProgressInernal(textView, textView2, f);
        if (f >= 1.0f) {
            textView2.setTag(Integer.valueOf(this.unactiveTextColorKey));
            textView.setTag(Integer.valueOf(this.activeTextColorKey));
        }
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate = this.delegate;
        if (scrollSlidingTabStripDelegate != null) {
            scrollSlidingTabStripDelegate.onPageScrolled(f);
        }
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setCallback(this);
    }

    public void setColors(int i, int i2, int i3, int i4) {
        this.tabLineColorKey = i;
        this.activeTextColorKey = i2;
        this.unactiveTextColorKey = i3;
        this.selectorColorKey = i4;
        updateColors();
    }

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = this.tabsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.tabsContainer.getChildAt(i).setEnabled(z);
        }
    }

    public void setInitialTabId(int i) {
        this.setInitialTab = true;
        this.selectedTabId = i;
        int i2 = this.idToPosition.get(i);
        if (((TextView) this.tabsContainer.getChildAt(i2)) != null) {
            this.currentPosition = i2;
            this.prevLayoutWidth = 0;
            finishAddingTabs();
            requestLayout();
        }
    }

    public void setOpen(boolean z) {
        if (z == this.isOpen) {
            return;
        }
        this.isOpen = z;
        setPadding(AndroidUtilities.dp(z ? 0.0f : 6.0f), getPaddingTop(), AndroidUtilities.dp(this.isOpen ? 0.0f : 6.0f), getPaddingBottom());
        invalidate();
        if (!this.fitsItems) {
            this.prevRect.set(this.rect);
            this.rectT.force(0.0f);
            this.left.force(AndroidUtilities.dp(this.isOpen ? 6.0f : -6.0f));
        }
        checkBoundsAndClipping();
    }

    public void setReordering(boolean z) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        AndroidUtilities.forEachViews(this.tabsContainer, new HistoryFragment$1$$ExternalSyntheticLambda0(4));
    }

    public void setUseMinimalWidth(boolean z) {
        this.useMinimalWidth = z;
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(this.useMinimalWidth ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z) {
        this.useSameWidth = z;
    }

    @Override
    public void updateColors() {
        int childCount = this.tabsContainer.getChildCount();
        int i = 0;
        while (i < childCount) {
            TextView textView = (TextView) this.tabsContainer.getChildAt(i);
            textView.setTextColor(processColor(Theme.getColor(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey, this.resourcesProvider)));
            textView.setBackground(new InsetDrawable((Drawable) Theme.createSelectorDrawable(Theme.multAlpha(0.15f, processColor(Theme.getColor(this.activeTextColorKey, this.resourcesProvider))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
            i++;
        }
        this.selectorDrawable.setColor(Theme.multAlpha(0.15f, processColor(Theme.getColor(this.activeTextColorKey, this.resourcesProvider))));
        invalidate();
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.backgroundDrawable || super.verifyDrawable(drawable);
    }

    public ScrollSlidingTextTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectedTabId = -1;
        this.scrollingToChild = -1;
        this.tabLineColorKey = Theme.key_actionBarTabLine;
        this.activeTextColorKey = Theme.key_actionBarTabActiveText;
        this.unactiveTextColorKey = Theme.key_actionBarTabUnactiveText;
        this.selectorColorKey = Theme.key_actionBarTabSelector;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.interpolator = cubicBezierInterpolator;
        this.positionToId = new SparseIntArray(5);
        this.idToPosition = new SparseIntArray(5);
        this.prevPositionToWidth = new SparseIntArray(5);
        this.positionToWidth = new SparseIntArray(5);
        this.animationDuration = 200L;
        this.animationRunnable = new Runnable() {
            @Override
            public void run() {
                if (ScrollSlidingTextTabStrip.this.animatingIndicator) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - ScrollSlidingTextTabStrip.this.lastAnimationTime;
                    if (jElapsedRealtime > 17) {
                        jElapsedRealtime = 17;
                    }
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
                    ScrollSlidingTextTabStrip.access$216(scrollSlidingTextTabStrip, jElapsedRealtime / scrollSlidingTextTabStrip.animationDuration);
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = ScrollSlidingTextTabStrip.this;
                    scrollSlidingTextTabStrip2.setAnimationIdicatorProgress(scrollSlidingTextTabStrip2.interpolator.getInterpolation(ScrollSlidingTextTabStrip.this.animationTime));
                    if (ScrollSlidingTextTabStrip.this.animationTime > 1.0f) {
                        ScrollSlidingTextTabStrip.this.animationTime = 1.0f;
                    }
                    if (ScrollSlidingTextTabStrip.this.animationTime < 1.0f) {
                        AndroidUtilities.runOnUIThread(ScrollSlidingTextTabStrip.this.animationRunnable);
                        return;
                    }
                    ScrollSlidingTextTabStrip.this.animatingIndicator = false;
                    ScrollSlidingTextTabStrip.this.setEnabled(true);
                    if (ScrollSlidingTextTabStrip.this.delegate != null) {
                        ScrollSlidingTextTabStrip.this.delegate.onPageScrolled(1.0f);
                    }
                }
            }
        };
        this.clipPath = new Path();
        this.prevRect = new RectF();
        this.rect = new RectF();
        this.rectT = new AnimatedFloat(this, 420L, cubicBezierInterpolator);
        this.left = new AnimatedFloat(this, 420L, cubicBezierInterpolator);
        this.open = new AnimatedFloat(this, 420L, cubicBezierInterpolator);
        this.isOpen = true;
        this.resourcesProvider = resourcesProvider;
        this.selectorDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        float fDpf2 = AndroidUtilities.dpf2(14.0f);
        this.selectorDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.tabsContainer = anonymousClass2;
        anonymousClass2.setOrientation(0);
        anonymousClass2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        anonymousClass2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(anonymousClass2);
        updateColors();
    }

    public void addTextTab(final int i, CharSequence charSequence, SparseArray<View> sparseArray) {
        TextView textView;
        int i2 = this.tabCount;
        this.tabCount = i2 + 1;
        if (i2 == 0 && this.selectedTabId == -1) {
            this.selectedTabId = i;
        }
        this.positionToId.put(i2, i);
        this.idToPosition.put(i, i2);
        int i3 = this.selectedTabId;
        if (i3 != -1 && i3 == i) {
            this.currentPosition = i2;
            this.prevLayoutWidth = 0;
        }
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i);
            sparseArray.delete(i);
        } else {
            textView = null;
        }
        if (textView == null) {
            textView = new AnimatedEmojiSpan.TextViewEmojis(getContext()) {
                private AnimatedFloat reorderingAlpha = new AnimatedFloat(this, 360, CubicBezierInterpolator.EASE_OUT_QUINT);
                private Shaker shaker;

                private boolean isReordering() {
                    return ScrollSlidingTextTabStrip.this.delegate != null && ScrollSlidingTextTabStrip.this.reordering && ScrollSlidingTextTabStrip.this.delegate.canReorder(i);
                }

                @Override
                public void onDraw(Canvas canvas) {
                    Canvas canvas2;
                    float f = this.reorderingAlpha.set(ScrollSlidingTextTabStrip.this.reordering);
                    if (ScrollSlidingTextTabStrip.this.delegate == null || !ScrollSlidingTextTabStrip.this.delegate.canReorder(i)) {
                        if (f > 0.0f) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, f) * 255.0f));
                        } else {
                            canvas2 = canvas;
                        }
                        super.onDraw(canvas2);
                        if (f > 0.0f) {
                            canvas2.restore();
                            return;
                        }
                        return;
                    }
                    if (f > 0.0f) {
                        if (this.shaker == null) {
                            this.shaker = new Shaker(this);
                        }
                        canvas.save();
                        this.shaker.concat(canvas, f, getWidth() / 2.0f, getHeight() / 2.0f);
                    }
                    super.onDraw(canvas);
                    if (f > 0.0f) {
                        canvas.restore();
                    }
                }

                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setSelected(ScrollSlidingTextTabStrip.this.selectedTabId == i);
                }
            };
            textView.setGravity(17);
            textView.setTextAlignment(4);
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine();
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new ReportAlert$$ExternalSyntheticLambda1(this, i, 6));
            textView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return this.f$0.lambda$addTextTab$1(i, view);
                }
            });
            NotificationCenter.listenEmojiLoading(textView);
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false);
        textView.setText(charSequenceReplaceEmoji);
        int iDp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(HintView2.measureCorrectly(charSequenceReplaceEmoji, textView.getPaint())));
        this.tabsContainer.addView(textView, LayoutHelper.createLinear(0, -1));
        this.allTextWidth += iDp;
        this.positionToWidth.put(i2, iDp);
        updateColors();
    }

    public void scrollTo(int i) {
        scrollTo(i, this.idToPosition.get(i), null);
    }

    public interface ScrollSlidingTabStripDelegate {
        boolean canReorder(int i);

        void onPageScrolled(float f);

        void onPageSelected(int i, boolean z);

        void onSamePageSelected();

        boolean showOptions(int i, View view);

        public abstract class CC {
            public static boolean $default$canReorder(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate, int i) {
                return false;
            }

            public static boolean $default$showOptions(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate, int i, View view) {
                return false;
            }

            public static void $default$onSamePageSelected(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
            }
        }
    }
}
