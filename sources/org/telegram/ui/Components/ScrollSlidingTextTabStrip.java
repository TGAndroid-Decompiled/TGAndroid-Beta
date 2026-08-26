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
import org.telegram.ui.Cells.GroupCallUserCell$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.HintView2;

public class ScrollSlidingTextTabStrip extends HorizontalScrollView implements Theme.Colorable {
    public int activeTextColorKey;
    public int allTextWidth;
    public int animateFromIndicatorWidth;
    public int animateFromIndicaxtorX;
    public int animateIndicatorStartWidth;
    public int animateIndicatorStartX;
    public int animateIndicatorToWidth;
    public int animateIndicatorToX;
    public boolean animatingIndicator;
    public long animationDuration;
    public float animationIdicatorProgress;
    public final LaunchActivity.AnonymousClass18 animationRunnable;
    public float animationTime;
    public BlurredBackgroundDrawable backgroundDrawable;
    public final Path clipPath;
    public int currentPosition;
    public ScrollSlidingTabStripDelegate delegate;
    public View dragging;
    public boolean fitsItems;
    public final SparseIntArray idToPosition;
    public int indicatorWidth;
    public float indicatorWidthAnimationDx;
    public int indicatorX;
    public float indicatorXAnimationDx;
    public final CubicBezierInterpolator interpolator;
    public boolean isOpen;
    public final AnimatedFloat left;
    public final AnimatedFloat open;
    public final SparseIntArray positionToId;
    public final SparseIntArray positionToWidth;
    public int prevLayoutWidth;
    public final SparseIntArray prevPositionToWidth;
    public final RectF prevRect;
    public int previousPosition;
    public final RectF rect;
    public final AnimatedFloat rectT;
    public boolean reordering;
    public final Theme.ResourcesProvider resourcesProvider;
    public int scrollingToChild;
    public int selectedTabId;
    public final GradientDrawable selectorDrawable;
    public boolean setInitialTab;
    public int tabCount;
    public final AnonymousClass2 tabsContainer;
    public int unactiveTextColorKey;
    public boolean useMinimalWidth;
    public boolean useSameWidth;

    public final class AnonymousClass2 extends LinearLayout {
        public AnonymousClass2(Context context) {
            super(context);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            int childCount;
            View childAt;
            ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
            if (scrollSlidingTextTabStrip.delegate == null || !scrollSlidingTextTabStrip.reordering) {
                return super.dispatchTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.positionToId;
            if (action == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i = 0;
                while (true) {
                    if (i >= getChildCount()) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i);
                    if (x >= childAt.getX() && x <= childAt.getX() + childAt.getWidth() && y >= childAt.getY() && y <= childAt.getY() + childAt.getHeight()) {
                        break;
                    }
                    i++;
                }
                scrollSlidingTextTabStrip.dragging = childAt;
                if (childAt != null && getParent() != null) {
                    sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.dragging));
                    scrollSlidingTextTabStrip.delegate.getClass();
                    scrollSlidingTextTabStrip.dragging = null;
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else if (motionEvent.getAction() == 2) {
                View view = scrollSlidingTextTabStrip.dragging;
                if (view != null) {
                    view.setTranslationX(motionEvent.getX() - 0.0f);
                    int iIndexOfChild = indexOfChild(scrollSlidingTextTabStrip.dragging);
                    if (scrollSlidingTextTabStrip.currentPosition == iIndexOfChild) {
                        scrollSlidingTextTabStrip.invalidate();
                    }
                    if (motionEvent.getX() < AndroidUtilities.dp(16.0f)) {
                        scrollSlidingTextTabStrip.scrollBy(-AndroidUtilities.dp(1.0f), 0);
                    } else if (motionEvent.getX() >= getWidth() - AndroidUtilities.dp(16.0f)) {
                        scrollSlidingTextTabStrip.scrollBy(AndroidUtilities.dp(1.0f), 0);
                    }
                    float width = (scrollSlidingTextTabStrip.dragging.getWidth() / 2.0f) + scrollSlidingTextTabStrip.dragging.getX();
                    int width2 = scrollSlidingTextTabStrip.dragging.getWidth();
                    if (width >= 0.0f) {
                        childCount = 0;
                        while (true) {
                            if (childCount >= getChildCount()) {
                                childCount = getChildCount() - 1;
                                break;
                            }
                            View childAt2 = getChildAt(childCount);
                            float width3 = (childAt2.getWidth() / 2.0f) + childAt2.getLeft();
                            if (width >= width3 - (Math.min(width2, childAt2.getWidth()) / 2.0f) && width <= (Math.min(width2, childAt2.getWidth()) / 2.0f) + width3) {
                                break;
                            }
                            childCount++;
                        }
                    } else {
                        childCount = 0;
                    }
                    if (childCount != iIndexOfChild) {
                        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate = scrollSlidingTextTabStrip.delegate;
                        sparseIntArray.get(childCount);
                        scrollSlidingTabStripDelegate.getClass();
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                View view2 = scrollSlidingTextTabStrip.dragging;
                if (view2 != null) {
                    final int i2 = 0;
                    view2.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ScrollSlidingTextTabStrip.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i2) {
                                case 0:
                                    ScrollSlidingTextTabStrip.AnonymousClass2 anonymousClass2 = this.f$0;
                                    anonymousClass2.invalidate();
                                    ScrollSlidingTextTabStrip.this.invalidate();
                                    break;
                                default:
                                    ScrollSlidingTextTabStrip.AnonymousClass2 anonymousClass3 = this.f$0;
                                    anonymousClass3.invalidate();
                                    ScrollSlidingTextTabStrip.this.invalidate();
                                    break;
                            }
                        }
                    }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                scrollSlidingTextTabStrip.dragging = null;
            } else if (motionEvent.getAction() == 3) {
                View view3 = scrollSlidingTextTabStrip.dragging;
                if (view3 != null) {
                    final int i3 = 1;
                    view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ScrollSlidingTextTabStrip.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    ScrollSlidingTextTabStrip.AnonymousClass2 anonymousClass2 = this.f$0;
                                    anonymousClass2.invalidate();
                                    ScrollSlidingTextTabStrip.this.invalidate();
                                    break;
                                default:
                                    ScrollSlidingTextTabStrip.AnonymousClass2 anonymousClass3 = this.f$0;
                                    anonymousClass3.invalidate();
                                    ScrollSlidingTextTabStrip.this.invalidate();
                                    break;
                            }
                        }
                    }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                scrollSlidingTextTabStrip.dragging = null;
            }
            return scrollSlidingTextTabStrip.dragging != null || super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
            if (scrollSlidingTextTabStrip.setInitialTab) {
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.idToPosition;
                if (sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.selectedTabId) >= 0) {
                    if (scrollSlidingTextTabStrip.tabsContainer.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.selectedTabId)) != null) {
                        scrollSlidingTextTabStrip.scrollToChild(sparseIntArray.get(scrollSlidingTextTabStrip.selectedTabId), false);
                        scrollSlidingTextTabStrip.setInitialTab = false;
                    }
                }
            }
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ScrollSlidingTextTabStrip.this.invalidate();
        }
    }

    public interface ScrollSlidingTabStripDelegate {
        void onPageScrolled(float f);

        void onPageSelected(int i, boolean z);

        void onSamePageSelected();

        boolean showOptions(int i, View view);
    }

    public ScrollSlidingTextTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectedTabId = -1;
        this.scrollingToChild = -1;
        this.activeTextColorKey = Theme.key_actionBarTabActiveText;
        this.unactiveTextColorKey = Theme.key_actionBarTabUnactiveText;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.interpolator = cubicBezierInterpolator;
        this.positionToId = new SparseIntArray(5);
        this.idToPosition = new SparseIntArray(5);
        this.prevPositionToWidth = new SparseIntArray(5);
        this.positionToWidth = new SparseIntArray(5);
        this.animationDuration = 200L;
        this.animationRunnable = new LaunchActivity.AnonymousClass18(this, 3);
        this.clipPath = new Path();
        this.prevRect = new RectF();
        this.rect = new RectF();
        this.rectT = new AnimatedFloat(420L, this, cubicBezierInterpolator);
        this.left = new AnimatedFloat(420L, this, cubicBezierInterpolator);
        this.open = new AnimatedFloat(420L, this, cubicBezierInterpolator);
        this.isOpen = true;
        this.resourcesProvider = resourcesProvider;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        this.selectorDrawable = gradientDrawable;
        float fDpf2 = AndroidUtilities.dpf2(14.0f);
        gradientDrawable.setCornerRadii(new float[]{fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2, fDpf2});
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context);
        this.tabsContainer = anonymousClass2;
        anonymousClass2.setOrientation(0);
        anonymousClass2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        anonymousClass2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(anonymousClass2);
        updateColors$1();
    }

    public final void addTextTab(final int i, CharSequence charSequence, SparseArray sparseArray) {
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
                public final AnimatedFloat reorderingAlpha = new AnimatedFloat(360, this, CubicBezierInterpolator.EASE_OUT_QUINT);

                @Override
                public final void onDraw(Canvas canvas) {
                    Canvas canvas2;
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
                    float f = this.reorderingAlpha.set(scrollSlidingTextTabStrip.reordering);
                    ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate = scrollSlidingTextTabStrip.delegate;
                    if (f > 0.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, f) * 255.0f));
                    } else {
                        canvas2 = canvas;
                    }
                    super.onDraw(canvas2);
                    if (f > 0.0f) {
                        canvas2.restore();
                    }
                }

                @Override
                public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
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
            textView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 8));
            textView.setOnLongClickListener(new ScrollSlidingTextTabStrip$$ExternalSyntheticLambda2(this, i, 0));
            NotificationCenter.listenEmojiLoading(textView);
        }
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, textView.getPaint().getFontMetricsInt(), false);
        textView.setText(charSequenceReplaceEmoji);
        int iDp = AndroidUtilities.dp(32.0f) + ((int) Math.ceil(HintView2.measureCorrectly(charSequenceReplaceEmoji, textView.getPaint())));
        this.tabsContainer.addView(textView, LayoutHelper.createLinear(0, -1));
        this.allTextWidth += iDp;
        this.positionToWidth.put(i2, iDp);
        updateColors$1();
    }

    public final void checkBoundsAndClipping() {
        float f = this.rectT.set(1.0f, false);
        RectF rectF = this.rect;
        rectF.set(getPaddingLeft(), 0.0f, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        RectF rectF2 = this.prevRect;
        if (f >= 1.0f) {
            rectF2.set(rectF);
        } else {
            AndroidUtilities.lerp(rectF2, rectF, f, rectF);
        }
        float fHeight = rectF.height() / 2.0f;
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, fHeight, fHeight, Path.Direction.CW);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setAlpha(255);
            this.backgroundDrawable.setBounds(((int) rectF.left) - AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f) + ((int) rectF.right), getMeasuredHeight());
            this.backgroundDrawable.setRadius(fHeight);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.backgroundDrawable != null) {
            if (this.rectT.set(1.0f, false) < 1.0f) {
                checkBoundsAndClipping();
            }
            canvas.translate(getScrollX(), 0.0f);
            this.backgroundDrawable.shadowAlpha = this.open.set(this.isOpen);
            this.backgroundDrawable.draw(canvas);
            canvas.clipPath(this.clipPath);
            canvas.translate(-getScrollX(), 0.0f);
            canvas.translate(this.left.set(0.0f, false), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        if (view != anonymousClass2) {
            return super.drawChild(canvas, view, j);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int measuredHeight = getMeasuredHeight();
        float translationX = this.indicatorX + this.indicatorXAnimationDx;
        float translationX2 = this.indicatorWidth + translationX + this.indicatorWidthAnimationDx;
        View childAt = anonymousClass2.getChildAt(this.currentPosition);
        if (this.reordering && childAt != null) {
            translationX += childAt.getTranslationX();
            translationX2 += childAt.getTranslationX();
        }
        GradientDrawable gradientDrawable = this.selectorDrawable;
        int alpha = gradientDrawable.getAlpha();
        gradientDrawable.setAlpha((int) (anonymousClass2.getAlpha() * alpha));
        gradientDrawable.setBounds(AndroidUtilities.dp(4.0f) + getPaddingLeft() + ((int) translationX), AndroidUtilities.dp(4.0f) + getPaddingTop(), (getPaddingLeft() + ((int) translationX2)) - AndroidUtilities.dp(4.0f), (measuredHeight - getPaddingBottom()) - AndroidUtilities.dp(4.0f));
        gradientDrawable.draw(canvas);
        gradientDrawable.setAlpha(alpha);
        return zDrawChild;
    }

    public final void finishAddingTabs() {
        SparseIntArray sparseIntArray;
        SparseIntArray sparseIntArray2;
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        int childCount = anonymousClass2.getChildCount();
        int i = 0;
        while (true) {
            sparseIntArray = this.prevPositionToWidth;
            sparseIntArray2 = this.positionToWidth;
            if (i >= childCount) {
                break;
            }
            TextView textView = (TextView) anonymousClass2.getChildAt(i);
            textView.setTag(Integer.valueOf(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey));
            textView.setTextColor(processColor(Theme.getColor(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey, this.resourcesProvider)));
            if (this.useMinimalWidth) {
                if (sparseIntArray.size() != sparseIntArray2.size() || sparseIntArray.get(i) != sparseIntArray2.get(i)) {
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
        sparseIntArray.clear();
        for (int i3 = 0; i3 < sparseIntArray2.size(); i3++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i3), sparseIntArray2.valueAt(i3));
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

    public final boolean hasTab(int i) {
        return this.idToPosition.get(i, -1) != -1;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = i3 - i;
        if (this.prevLayoutWidth != i6) {
            this.prevLayoutWidth = i6;
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
                textView.getLayout();
                this.indicatorWidth = textView.getMeasuredWidth();
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i7 = this.indicatorWidth;
                int iM = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(measuredWidth, i7, 2, left);
                this.indicatorX = iM;
                int i8 = this.animateFromIndicaxtorX;
                if (i8 > 0 && (i5 = this.animateFromIndicatorWidth) > 0) {
                    if (i8 != iM || i5 != i7) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new GroupCallUserCell$$ExternalSyntheticLambda0(this, i8 - iM, i5 - i7, 3));
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
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(22.0f);
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        int childCount = anonymousClass2.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = anonymousClass2.getChildAt(i3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            float f = layoutParams.weight;
            int i4 = layoutParams.width;
            boolean z = this.useMinimalWidth;
            SparseIntArray sparseIntArray = this.positionToWidth;
            if (z) {
                layoutParams.weight = 0.0f;
                layoutParams.width = sparseIntArray.get(i3);
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
                    layoutParams.weight = AndroidUtilities.lerp(1.0f / childCount, (1.0f / i5) * sparseIntArray.get(i3), 0.5f);
                    layoutParams.width = -2;
                }
            }
            if (Math.abs(f - layoutParams.weight) > 0.001f || i4 != layoutParams.width) {
                childAt.setLayoutParams(layoutParams);
                childAt.requestLayout();
            }
        }
        float weightSum = anonymousClass2.getWeightSum();
        if (childCount == 1 || this.allTextWidth > size) {
            anonymousClass2.setWeightSum(0.0f);
        } else {
            anonymousClass2.setWeightSum(1.0f);
        }
        if (Math.abs(weightSum - anonymousClass2.getWeightSum()) > 0.1f) {
            anonymousClass2.requestLayout();
        }
        super.onMeasure(i, i2);
        this.fitsItems = getMeasuredWidth() < View.MeasureSpec.getSize(i);
        checkBoundsAndClipping();
    }

    public int processColor(int i) {
        return i;
    }

    public final SparseArray removeTabs() {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            AnonymousClass2 anonymousClass2 = this.tabsContainer;
            int childCount = anonymousClass2.getChildCount();
            SparseIntArray sparseIntArray = this.positionToId;
            if (i >= childCount) {
                sparseIntArray.clear();
                this.idToPosition.clear();
                this.prevPositionToWidth.clear();
                this.positionToWidth.clear();
                anonymousClass2.removeAllViews();
                this.allTextWidth = 0;
                this.tabCount = 0;
                return sparseArray;
            }
            sparseArray.put(sparseIntArray.get(i), anonymousClass2.getChildAt(i));
            i++;
        }
    }

    public final void scrollTo(View view, int i, int i2) {
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
            boolean z2 = this.animatingIndicator;
            LaunchActivity.AnonymousClass18 anonymousClass18 = this.animationRunnable;
            if (z2) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                this.animatingIndicator = false;
            }
            this.animationTime = 0.0f;
            this.animatingIndicator = true;
            this.animateIndicatorStartX = this.indicatorX;
            this.animateIndicatorStartWidth = this.indicatorWidth;
            if (view != null) {
                TextView textView = (TextView) view;
                textView.getLayout();
                this.animateIndicatorToWidth = textView.getMeasuredWidth();
                this.animateIndicatorToX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView.getMeasuredWidth(), this.animateIndicatorToWidth, 2, textView.getLeft());
            }
            setEnabled(false);
            AndroidUtilities.runOnUIThread(anonymousClass18, 16L);
            ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate2 = this.delegate;
            if (scrollSlidingTabStripDelegate2 != null) {
                scrollSlidingTabStripDelegate2.onPageSelected(i, z);
            }
            scrollToChild(i2, true);
        }
    }

    public final void scrollToChild(int i, boolean z) {
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

    public final void selectTabWithId$1(float f, int i) {
        int i2;
        int i3 = this.idToPosition.get(i, -1);
        if (i3 >= 0 && (i2 = this.currentPosition) != i3) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            AnonymousClass2 anonymousClass2 = this.tabsContainer;
            TextView textView = (TextView) anonymousClass2.getChildAt(i2);
            TextView textView2 = (TextView) anonymousClass2.getChildAt(i3);
            if (textView != null && textView2 != null) {
                textView.getLayout();
                this.animateIndicatorStartWidth = textView.getMeasuredWidth();
                this.animateIndicatorStartX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView.getMeasuredWidth(), this.animateIndicatorStartWidth, 2, textView.getLeft());
                textView2.getLayout();
                this.animateIndicatorToWidth = textView2.getMeasuredWidth();
                this.animateIndicatorToX = RichMessageLayout$MediaCell$$ExternalSyntheticOutline0.m(textView2.getMeasuredWidth(), this.animateIndicatorToWidth, 2, textView2.getLeft());
                setAnimationProgressInernal(textView2, textView, f);
                if (f >= 1.0f) {
                    textView.setTag(Integer.valueOf(this.unactiveTextColorKey));
                    textView2.setTag(Integer.valueOf(this.activeTextColorKey));
                }
                scrollToChild(anonymousClass2.indexOfChild(textView2), true);
            }
            if (f >= 1.0f) {
                this.currentPosition = i3;
                this.selectedTabId = i;
            }
        }
    }

    public void setAnimationIdicatorProgress(float f) {
        this.animationIdicatorProgress = f;
        int i = this.currentPosition;
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        TextView textView = (TextView) anonymousClass2.getChildAt(i);
        TextView textView2 = (TextView) anonymousClass2.getChildAt(this.previousPosition);
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

    public final void setAnimationProgressInernal(TextView textView, TextView textView2, float f) {
        int i = this.activeTextColorKey;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int iProcessColor = processColor(Theme.getColor(i, resourcesProvider));
        int iProcessColor2 = processColor(Theme.getColor(this.unactiveTextColorKey, resourcesProvider));
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
        int i2 = this.animateIndicatorStartX;
        this.indicatorX = (int) (((this.animateIndicatorToX - i2) * f) + i2);
        int i3 = this.animateIndicatorStartWidth;
        this.indicatorWidth = (int) (((this.animateIndicatorToWidth - i3) * f) + i3);
        invalidate();
    }

    public void setBlurredBackground(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setCallback(this);
    }

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        int childCount = anonymousClass2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            anonymousClass2.getChildAt(i).setEnabled(z);
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
            this.rectT.set(0.0f, true);
            this.left.set(AndroidUtilities.dp(this.isOpen ? 6.0f : -6.0f), true);
        }
        checkBoundsAndClipping();
    }

    public void setReordering(boolean z) {
        if (this.reordering == z) {
            return;
        }
        this.reordering = z;
        AndroidUtilities.forEachViews(this.tabsContainer, new ChatActivity$$ExternalSyntheticLambda151(6));
    }

    public void setUseMinimalWidth(boolean z) {
        this.useMinimalWidth = z;
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(this.useMinimalWidth ? -2 : -1, -1));
    }

    public void setUseSameWidth(boolean z) {
        this.useSameWidth = z;
    }

    @Override
    public final void updateColors$1() {
        AnonymousClass2 anonymousClass2 = this.tabsContainer;
        int childCount = anonymousClass2.getChildCount();
        int i = 0;
        while (true) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (i >= childCount) {
                this.selectorDrawable.setColor(Theme.multAlpha(0.15f, processColor(Theme.getColor(this.activeTextColorKey, resourcesProvider))));
                invalidate();
                return;
            } else {
                TextView textView = (TextView) anonymousClass2.getChildAt(i);
                textView.setTextColor(processColor(Theme.getColor(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey, resourcesProvider)));
                textView.setBackground(new InsetDrawable((Drawable) Theme.createSelectorDrawable(Theme.multAlpha(0.15f, processColor(Theme.getColor(this.activeTextColorKey, resourcesProvider))), 7, AndroidUtilities.dp(14.0f)), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                i++;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.backgroundDrawable || super.verifyDrawable(drawable);
    }
}
