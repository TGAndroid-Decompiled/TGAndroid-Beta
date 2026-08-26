package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.IntroActivity;

public final class PagerSlidingTabStrip extends HorizontalScrollView {
    public int currentPosition;
    public float currentPositionOffset;
    public final LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    public int dividerPadding;
    public int indicatorColor;
    public int indicatorHeight;
    public int lastScrollX;
    public final AnimatedFloat lineLeftAnimated;
    public final AnimatedFloat lineRightAnimated;
    public final IntroActivity.AnonymousClass3 pageListener;
    public ViewPager pager;
    public final Paint rectPaint;
    public final Theme.ResourcesProvider resourcesProvider;
    public int scrollOffset;
    public boolean shouldExpand;
    public int tabCount;
    public int tabPadding;
    public final LinearLayout tabsContainer;
    public int underlineColor;
    public int underlineHeight;

    public interface IconTabProvider {
    }

    public final class TextTab extends TextView {
        public TextTab(Context context) {
            super(context);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            if (pagerSlidingTabStrip.pager.getAdapter() instanceof IconTabProvider) {
                ((IconTabProvider) pagerSlidingTabStrip.pager.getAdapter()).getClass();
            }
        }

        @Override
        public final void setSelected(boolean z) {
            super.setSelected(z);
            Drawable background = getBackground();
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            if (background != null) {
                Theme.setSelectorDrawableColor(background, pagerSlidingTabStrip.getGlassIconColor(z ? 0.1f : 0.05f), true);
            }
            setTextColor(pagerSlidingTabStrip.getGlassIconColor(z ? 0.8f : 0.6f));
        }
    }

    public PagerSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.pageListener = new IntroActivity.AnonymousClass3(this, 2);
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorColor = -10066330;
        this.underlineColor = 436207616;
        this.shouldExpand = false;
        this.scrollOffset = AndroidUtilities.dp(52.0f);
        this.indicatorHeight = AndroidUtilities.dp(8.0f);
        this.underlineHeight = AndroidUtilities.dp(2.0f);
        this.dividerPadding = AndroidUtilities.dp(12.0f);
        this.tabPadding = AndroidUtilities.dp(24.0f);
        this.lastScrollX = 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.lineLeftAnimated = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.lineRightAnimated = new AnimatedFloat(350L, this, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    }

    public static void access$300(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        View childAt;
        if (pagerSlidingTabStrip.tabCount == 0 || (childAt = pagerSlidingTabStrip.tabsContainer.getChildAt(i)) == null) {
            return;
        }
        int left = childAt.getLeft() + i2;
        if (i > 0 || i2 > 0) {
            left -= pagerSlidingTabStrip.scrollOffset;
        }
        if (left != pagerSlidingTabStrip.lastScrollX) {
            pagerSlidingTabStrip.lastScrollX = left;
            pagerSlidingTabStrip.scrollTo(left, 0);
        }
    }

    public final void addTab(int i, CharSequence charSequence) {
        TextTab textTab = new TextTab(getContext());
        textTab.setTextSize(1, 14.0f);
        textTab.setTypeface(AndroidUtilities.bold());
        textTab.setTextColor(getGlassIconColor(0.6f));
        textTab.setFocusable(true);
        textTab.setGravity(17);
        textTab.setText(charSequence);
        ScaleStateListAnimator.apply(textTab, 0.025f, 1.2f);
        textTab.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 6));
        textTab.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.tabsContainer.addView(textTab, LayoutHelper.createLinear(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        textTab.setSelected(i == this.currentPosition);
    }

    public int getDividerPadding() {
        return this.dividerPadding;
    }

    public final int getGlassIconColor(float f) {
        return ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), (int) (f * 255.0f));
    }

    public int getIndicatorColor() {
        return this.indicatorColor;
    }

    public int getIndicatorHeight() {
        return this.indicatorHeight;
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public boolean getShouldExpand() {
        return this.shouldExpand;
    }

    public int getTabPaddingLeftRight() {
        return this.tabPadding;
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    public int getUnderlineHeight() {
        return this.underlineHeight;
    }

    public final void notifyDataSetChanged() {
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof IconTabProvider) {
                ((IconTabProvider) this.pager.getAdapter()).getClass();
                addTab(i, this.pager.getAdapter().getPageTitle(i));
            } else {
                addTab(i, this.pager.getAdapter().getPageTitle(i));
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ExternalActionActivity.AnonymousClass3(this, 5));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        if (isInEditMode() || this.tabCount == 0) {
            super.onDraw(canvas);
            return;
        }
        int height = getHeight();
        int i2 = this.underlineHeight;
        LinearLayout linearLayout = this.tabsContainer;
        Paint paint = this.rectPaint;
        if (i2 != 0) {
            paint.setColor(this.underlineColor);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, height - this.underlineHeight, linearLayout.getWidth(), height);
            float f3 = this.underlineHeight / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        View childAt = linearLayout.getChildAt(this.currentPosition);
        if (childAt != null) {
            float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
            float right = childAt.getRight() - childAt.getPaddingRight();
            float f4 = this.currentPositionOffset;
            AnimatedFloat animatedFloat = this.lineRightAnimated;
            AnimatedFloat animatedFloat2 = this.lineLeftAnimated;
            if (f4 <= 0.0f || (i = this.currentPosition) >= this.tabCount - 1) {
                f = animatedFloat2.set(paddingLeft, false);
                f2 = animatedFloat.set(right, false);
            } else {
                View childAt2 = linearLayout.getChildAt(i + 1);
                float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                float right2 = childAt2.getRight() - childAt2.getPaddingRight();
                float f5 = this.currentPositionOffset;
                float f6 = 1.0f - f5;
                f = (paddingLeft * f6) + (paddingLeft2 * f5);
                f2 = (f6 * right) + (f5 * right2);
                animatedFloat2.set(f, true);
                animatedFloat.set(f2, true);
                if (childAt instanceof TextTab) {
                    TextTab textTab = (TextTab) childAt;
                    textTab.setTextColor(PagerSlidingTabStrip.this.getGlassIconColor(AndroidUtilities.lerp(0.6f, 0.8f, 1.0f - this.currentPositionOffset)));
                }
                if (childAt2 instanceof TextTab) {
                    TextTab textTab2 = (TextTab) childAt2;
                    textTab2.setTextColor(PagerSlidingTabStrip.this.getGlassIconColor(AndroidUtilities.lerp(0.6f, 0.8f, this.currentPositionOffset)));
                }
            }
            if (this.indicatorHeight != 0) {
                paint.setColor(this.indicatorColor);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f - AndroidUtilities.dp(11.0f), getPaddingTop(), f2 + AndroidUtilities.dp(11.0f), height - getPaddingBottom());
                rectF2.offset(getPaddingLeft(), 0.0f);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.shouldExpand || View.MeasureSpec.getMode(i) == 0) {
            return;
        }
        this.tabsContainer.measure(getMeasuredWidth() | 1073741824, i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.shouldExpand) {
            return;
        }
        post(new HintView$1$$ExternalSyntheticLambda0(this, 25));
    }

    public void setDividerPadding(int i) {
        this.dividerPadding = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.delegatePageListener = onPageChangeListener;
    }

    public void setScrollOffset(int i) {
        this.scrollOffset = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        updateTabStyles();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.tabPadding = i;
        updateTabStyles();
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
        this.underlineHeight = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.pager = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.pageListener);
        notifyDataSetChanged();
    }

    public final void updateTabStyles() {
        int i = 0;
        while (i < this.tabCount) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setLayoutParams(this.defaultTabLayoutParams);
            if (this.shouldExpand) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.pager.getAdapter() instanceof IconTabProvider) {
                ((EmojiView.EmojiPagesAdapter) ((IconTabProvider) this.pager.getAdapter())).getClass();
                int iDp = AndroidUtilities.dp(i == 1 ? 12.0f : 18.0f);
                childAt.setPadding(iDp, 0, iDp, 0);
            } else {
                int i2 = this.tabPadding;
                childAt.setPadding(i2, 0, i2, 0);
            }
            i++;
        }
    }
}
