package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    public ViewPager.OnPageChangeListener delegatePageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private Theme.ResourcesProvider resourcesProvider;
    private int tabCount;
    private LinearLayout tabsContainer;
    private final PageListener pageListener = new PageListener();
    private int currentPosition = 0;
    private float currentPositionOffset = 0.0f;
    private int indicatorColor = -10066330;
    private int underlineColor = 436207616;
    private boolean shouldExpand = false;
    private int scrollOffset = AndroidUtilities.dp(52.0f);
    private int indicatorHeight = AndroidUtilities.dp(8.0f);
    private int underlineHeight = AndroidUtilities.dp(2.0f);
    private int dividerPadding = AndroidUtilities.dp(12.0f);
    private int tabPadding = AndroidUtilities.dp(24.0f);
    private int lastScrollX = 0;
    private LinearLayout.LayoutParams defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);

    public interface IconTabProvider {
        boolean canScrollToTab(int i);

        void customOnDraw(Canvas canvas, int i);

        Drawable getPageIconDrawable(int i);
    }

    public PagerSlidingTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.resourcesProvider = resourcesProvider;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
    }

    public void setViewPager(ViewPager viewPager) {
        this.pager = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.pageListener);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.delegatePageListener = onPageChangeListener;
    }

    public void notifyDataSetChanged() {
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof IconTabProvider) {
                addIconTab(i, ((IconTabProvider) this.pager.getAdapter()).getPageIconDrawable(i), this.pager.getAdapter().getPageTitle(i));
            }
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.currentPosition = pagerSlidingTabStrip.pager.getCurrentItem();
                PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip2.scrollToChild(pagerSlidingTabStrip2.currentPosition, 0);
            }
        });
    }

    public View getTab(int i) {
        if (i < 0 || i >= this.tabsContainer.getChildCount()) {
            return null;
        }
        return this.tabsContainer.getChildAt(i);
    }

    private void addIconTab(final int i, Drawable drawable, CharSequence charSequence) {
        ImageView imageView = new ImageView(getContext()) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                if (PagerSlidingTabStrip.this.pager.getAdapter() instanceof IconTabProvider) {
                    ((IconTabProvider) PagerSlidingTabStrip.this.pager.getAdapter()).customOnDraw(canvas, i);
                }
            }

            @Override
            public void setSelected(boolean z) {
                super.setSelected(z);
                Drawable background = getBackground();
                if (Build.VERSION.SDK_INT >= 21 && background != null) {
                    int themedColor = PagerSlidingTabStrip.this.getThemedColor(z ? "chat_emojiPanelIconSelected" : "chat_emojiBottomPanelIcon");
                    Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(themedColor), Color.green(themedColor), Color.blue(themedColor)), true);
                }
            }
        };
        boolean z = true;
        imageView.setFocusable(true);
        if (Build.VERSION.SDK_INT >= 21) {
            RippleDrawable rippleDrawable = (RippleDrawable) Theme.createSelectorDrawable(getThemedColor("chat_emojiBottomPanelIcon"));
            Theme.setRippleDrawableForceSoftware(rippleDrawable);
            imageView.setBackground(rippleDrawable);
        }
        imageView.setImageDrawable(drawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PagerSlidingTabStrip.this.lambda$addIconTab$0(i, view);
            }
        });
        this.tabsContainer.addView(imageView);
        if (i != this.currentPosition) {
            z = false;
        }
        imageView.setSelected(z);
        imageView.setContentDescription(charSequence);
    }

    public void lambda$addIconTab$0(int i, View view) {
        if (!(this.pager.getAdapter() instanceof IconTabProvider) || ((IconTabProvider) this.pager.getAdapter()).canScrollToTab(i)) {
            this.pager.setCurrentItem(i, false);
        }
    }

    private void updateTabStyles() {
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setLayoutParams(this.defaultTabLayoutParams);
            if (this.shouldExpand) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else {
                int i2 = this.tabPadding;
                childAt.setPadding(i2, 0, i2, 0);
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.shouldExpand && View.MeasureSpec.getMode(i) != 0) {
            this.tabsContainer.measure(getMeasuredWidth() | 1073741824, i2);
        }
    }

    public void scrollToChild(int i, int i2) {
        if (this.tabCount != 0) {
            int left = this.tabsContainer.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.scrollOffset;
            }
            if (left != this.lastScrollX) {
                this.lastScrollX = left;
                scrollTo(left, 0);
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (!isInEditMode() && this.tabCount != 0) {
            int height = getHeight();
            if (this.underlineHeight != 0) {
                this.rectPaint.setColor(this.underlineColor);
                canvas.drawRect(0.0f, height - this.underlineHeight, this.tabsContainer.getWidth(), height, this.rectPaint);
            }
            View childAt = this.tabsContainer.getChildAt(this.currentPosition);
            float left = childAt.getLeft();
            float right = childAt.getRight();
            if (this.currentPositionOffset > 0.0f && (i = this.currentPosition) < this.tabCount - 1) {
                View childAt2 = this.tabsContainer.getChildAt(i + 1);
                float f = this.currentPositionOffset;
                left = (childAt2.getLeft() * f) + ((1.0f - f) * left);
                right = (childAt2.getRight() * f) + ((1.0f - f) * right);
            }
            float f2 = right;
            float f3 = left;
            if (this.indicatorHeight != 0) {
                this.rectPaint.setColor(this.indicatorColor);
                canvas.drawRect(f3, height - this.indicatorHeight, f2, height, this.rectPaint);
            }
        }
    }

    private class PageListener implements ViewPager.OnPageChangeListener {
        private PageListener() {
        }

        @Override
        public void onPageScrolled(int i, float f, int i2) {
            PagerSlidingTabStrip.this.currentPosition = i;
            PagerSlidingTabStrip.this.currentPositionOffset = f;
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip.scrollToChild(i, (int) (pagerSlidingTabStrip.tabsContainer.getChildAt(i).getWidth() * f));
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i, f, i2);
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.scrollToChild(pagerSlidingTabStrip.pager.getCurrentItem(), 0);
            }
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrollStateChanged(i);
            }
        }

        @Override
        public void onPageSelected(int i) {
            ViewPager.OnPageChangeListener onPageChangeListener = PagerSlidingTabStrip.this.delegatePageListener;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i);
            }
            int i2 = 0;
            while (i2 < PagerSlidingTabStrip.this.tabsContainer.getChildCount()) {
                PagerSlidingTabStrip.this.tabsContainer.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!this.shouldExpand) {
            post(new Runnable() {
                @Override
                public final void run() {
                    PagerSlidingTabStrip.this.notifyDataSetChanged();
                }
            });
        }
    }

    public void setIndicatorColor(int i) {
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public int getIndicatorColor() {
        return this.indicatorColor;
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public int getIndicatorHeight() {
        return this.indicatorHeight;
    }

    public void setUnderlineColor(int i) {
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    public void setUnderlineHeight(int i) {
        this.underlineHeight = i;
        invalidate();
    }

    public int getUnderlineHeight() {
        return this.underlineHeight;
    }

    public void setDividerPadding(int i) {
        this.dividerPadding = i;
        invalidate();
    }

    public int getDividerPadding() {
        return this.dividerPadding;
    }

    public void setScrollOffset(int i) {
        this.scrollOffset = i;
        invalidate();
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        updateTabStyles();
        requestLayout();
    }

    public boolean getShouldExpand() {
        return this.shouldExpand;
    }

    public void setTabPaddingLeftRight(int i) {
        this.tabPadding = i;
        updateTabStyles();
    }

    public int getTabPaddingLeftRight() {
        return this.tabPadding;
    }
}
