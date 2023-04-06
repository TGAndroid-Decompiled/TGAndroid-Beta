package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
public class ScrollSlidingTextTabStrip extends HorizontalScrollView {
    private String activeTextColorKey;
    private int allTextWidth;
    private int animateFromIndicatorWidth;
    private int animateFromIndicaxtorX;
    private int animateIndicatorStartWidth;
    private int animateIndicatorStartX;
    private int animateIndicatorToWidth;
    private int animateIndicatorToX;
    private boolean animatingIndicator;
    private float animationIdicatorProgress;
    private Runnable animationRunnable;
    private float animationTime;
    private int currentPosition;
    private ScrollSlidingTabStripDelegate delegate;
    private SparseIntArray idToPosition;
    private int indicatorWidth;
    private float indicatorWidthAnimationDx;
    private int indicatorX;
    private float indicatorXAnimationDx;
    private CubicBezierInterpolator interpolator;
    private long lastAnimationTime;
    private SparseIntArray positionToId;
    private SparseIntArray positionToWidth;
    private int prevLayoutWidth;
    private int previousPosition;
    private Theme.ResourcesProvider resourcesProvider;
    private int scrollingToChild;
    private int selectedTabId;
    private String selectorColorKey;
    private GradientDrawable selectorDrawable;
    private int tabCount;
    private String tabLineColorKey;
    private LinearLayout tabsContainer;
    private String unactiveTextColorKey;
    private boolean useSameWidth;

    public interface ScrollSlidingTabStripDelegate {

        public final class CC {
            public static void $default$onSamePageSelected(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
            }
        }

        void onPageScrolled(float f);

        void onPageSelected(int i, boolean z);

        void onSamePageSelected();
    }

    static float access$216(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, float f) {
        float f2 = scrollSlidingTextTabStrip.animationTime + f;
        scrollSlidingTextTabStrip.animationTime = f2;
        return f2;
    }

    public ScrollSlidingTextTabStrip(Context context) {
        this(context, null);
    }

    public ScrollSlidingTextTabStrip(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectedTabId = -1;
        this.scrollingToChild = -1;
        this.tabLineColorKey = "actionBarTabLine";
        this.activeTextColorKey = "actionBarTabActiveText";
        this.unactiveTextColorKey = "actionBarTabUnactiveText";
        this.selectorColorKey = "actionBarTabSelector";
        this.interpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.positionToId = new SparseIntArray(5);
        this.idToPosition = new SparseIntArray(5);
        this.positionToWidth = new SparseIntArray(5);
        this.animationRunnable = new Runnable() {
            @Override
            public void run() {
                if (ScrollSlidingTextTabStrip.this.animatingIndicator) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - ScrollSlidingTextTabStrip.this.lastAnimationTime;
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    ScrollSlidingTextTabStrip.access$216(ScrollSlidingTextTabStrip.this, ((float) elapsedRealtime) / 200.0f);
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = ScrollSlidingTextTabStrip.this;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.interpolator.getInterpolation(ScrollSlidingTextTabStrip.this.animationTime));
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
        this.resourcesProvider = resourcesProvider;
        this.selectorDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        float dpf2 = AndroidUtilities.dpf2(3.0f);
        this.selectorDrawable.setCornerRadii(new float[]{dpf2, dpf2, dpf2, dpf2, 0.0f, 0.0f, 0.0f, 0.0f});
        this.selectorDrawable.setColor(Theme.getColor(this.tabLineColorKey, resourcesProvider));
        setFillViewport(true);
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ScrollSlidingTextTabStrip.this.invalidate();
            }
        };
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
    }

    public void setDelegate(ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate) {
        this.delegate = scrollSlidingTabStripDelegate;
    }

    public boolean isAnimatingIndicator() {
        return this.animatingIndicator;
    }

    private void setAnimationProgressInernal(TextView textView, TextView textView2, float f) {
        if (textView == null || textView2 == null) {
            return;
        }
        int color = Theme.getColor(this.activeTextColorKey, this.resourcesProvider);
        int color2 = Theme.getColor(this.unactiveTextColorKey, this.resourcesProvider);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        int alpha = Color.alpha(color);
        int red2 = Color.red(color2);
        int green2 = Color.green(color2);
        int blue2 = Color.blue(color2);
        int alpha2 = Color.alpha(color2);
        textView2.setTextColor(Color.argb((int) (alpha + ((alpha2 - alpha) * f)), (int) (red + ((red2 - red) * f)), (int) (green + ((green2 - green) * f)), (int) (blue + ((blue2 - blue) * f))));
        textView.setTextColor(Color.argb((int) (alpha2 + ((alpha - alpha2) * f)), (int) (red2 + ((red - red2) * f)), (int) (green2 + ((green - green2) * f)), (int) (blue2 + ((blue - blue2) * f))));
        int i = this.animateIndicatorStartX;
        this.indicatorX = (int) (i + ((this.animateIndicatorToX - i) * f));
        int i2 = this.animateIndicatorStartWidth;
        this.indicatorWidth = (int) (i2 + ((this.animateIndicatorToWidth - i2) * f));
        invalidate();
    }

    @Keep
    public void setAnimationIdicatorProgress(float f) {
        this.animationIdicatorProgress = f;
        TextView textView = (TextView) this.tabsContainer.getChildAt(this.currentPosition);
        TextView textView2 = (TextView) this.tabsContainer.getChildAt(this.previousPosition);
        if (textView2 == null || textView == null) {
            return;
        }
        setAnimationProgressInernal(textView, textView2, f);
        if (f >= 1.0f) {
            textView2.setTag(this.unactiveTextColorKey);
            textView.setTag(this.activeTextColorKey);
        }
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate = this.delegate;
        if (scrollSlidingTabStripDelegate != null) {
            scrollSlidingTabStripDelegate.onPageScrolled(f);
        }
    }

    public void setUseSameWidth(boolean z) {
        this.useSameWidth = z;
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public ViewGroup getTabsContainer() {
        return this.tabsContainer;
    }

    @Keep
    public float getAnimationIdicatorProgress() {
        return this.animationIdicatorProgress;
    }

    public int getNextPageId(boolean z) {
        return this.positionToId.get(this.currentPosition + (z ? 1 : -1), -1);
    }

    public SparseArray<View> removeTabs() {
        SparseArray<View> sparseArray = new SparseArray<>();
        for (int i = 0; i < getChildCount(); i++) {
            sparseArray.get(this.positionToId.get(i), getChildAt(i));
        }
        this.positionToId.clear();
        this.idToPosition.clear();
        this.positionToWidth.clear();
        this.tabsContainer.removeAllViews();
        this.allTextWidth = 0;
        this.tabCount = 0;
        return sparseArray;
    }

    public int getTabsCount() {
        return this.tabCount;
    }

    public boolean hasTab(int i) {
        return this.idToPosition.get(i, -1) != -1;
    }

    public void addTextTab(int i, CharSequence charSequence) {
        addTextTab(i, charSequence, null);
    }

    public void addTextTab(final int i, CharSequence charSequence, SparseArray<View> sparseArray) {
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
        TextView textView = null;
        if (sparseArray != null) {
            textView = (TextView) sparseArray.get(i);
            sparseArray.delete(i);
        }
        if (textView == null) {
            textView = new TextView(getContext()) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setSelected(ScrollSlidingTextTabStrip.this.selectedTabId == i);
                }
            };
            textView.setWillNotDraw(false);
            textView.setGravity(17);
            textView.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(this.selectorColorKey, this.resourcesProvider), 3));
            textView.setTextSize(1, 15.0f);
            textView.setSingleLine(true);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ScrollSlidingTextTabStrip.this.lambda$addTextTab$0(i, view);
                }
            });
        }
        textView.setText(charSequence);
        int ceil = ((int) Math.ceil(textView.getPaint().measureText(charSequence, 0, charSequence.length()))) + textView.getPaddingLeft() + textView.getPaddingRight();
        this.tabsContainer.addView(textView, LayoutHelper.createLinear(0, -1));
        this.allTextWidth += ceil;
        this.positionToWidth.put(i2, ceil);
    }

    public void lambda$addTextTab$0(int i, View view) {
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate;
        int indexOfChild = this.tabsContainer.indexOfChild(view);
        if (indexOfChild < 0) {
            return;
        }
        int i2 = this.currentPosition;
        if (indexOfChild == i2 && (scrollSlidingTabStripDelegate = this.delegate) != null) {
            scrollSlidingTabStripDelegate.onSamePageSelected();
            return;
        }
        boolean z = i2 < indexOfChild;
        this.scrollingToChild = -1;
        this.previousPosition = i2;
        this.currentPosition = indexOfChild;
        this.selectedTabId = i;
        if (this.animatingIndicator) {
            AndroidUtilities.cancelRunOnUIThread(this.animationRunnable);
            this.animatingIndicator = false;
        }
        this.animationTime = 0.0f;
        this.animatingIndicator = true;
        this.animateIndicatorStartX = this.indicatorX;
        this.animateIndicatorStartWidth = this.indicatorWidth;
        TextView textView = (TextView) view;
        this.animateIndicatorToWidth = getChildWidth(textView);
        this.animateIndicatorToX = textView.getLeft() + ((textView.getMeasuredWidth() - this.animateIndicatorToWidth) / 2);
        setEnabled(false);
        AndroidUtilities.runOnUIThread(this.animationRunnable, 16L);
        ScrollSlidingTabStripDelegate scrollSlidingTabStripDelegate2 = this.delegate;
        if (scrollSlidingTabStripDelegate2 != null) {
            scrollSlidingTabStripDelegate2.onPageSelected(i, z);
        }
        scrollToChild(indexOfChild);
    }

    public void finishAddingTabs() {
        int childCount = this.tabsContainer.getChildCount();
        int i = 0;
        while (i < childCount) {
            TextView textView = (TextView) this.tabsContainer.getChildAt(i);
            textView.setTag(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey);
            textView.setTextColor(Theme.getColor(this.currentPosition == i ? this.activeTextColorKey : this.unactiveTextColorKey, this.resourcesProvider));
            if (i == 0) {
                textView.getLayoutParams().width = childCount == 1 ? -2 : 0;
            }
            i++;
        }
    }

    public void setColors(String str, String str2, String str3, String str4) {
        this.tabLineColorKey = str;
        this.activeTextColorKey = str2;
        this.unactiveTextColorKey = str3;
        this.selectorColorKey = str4;
        this.selectorDrawable.setColor(Theme.getColor(str, this.resourcesProvider));
    }

    public int getCurrentTabId() {
        return this.selectedTabId;
    }

    public void setInitialTabId(int i) {
        this.selectedTabId = i;
        int i2 = this.idToPosition.get(i);
        if (((TextView) this.tabsContainer.getChildAt(i2)) != null) {
            this.currentPosition = i2;
            this.prevLayoutWidth = 0;
            finishAddingTabs();
            requestLayout();
        }
    }

    public void resetTab() {
        this.selectedTabId = -1;
    }

    public int getFirstTabId() {
        return this.positionToId.get(0, 0);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.tabsContainer) {
            int measuredHeight = getMeasuredHeight();
            this.selectorDrawable.setAlpha((int) (this.tabsContainer.getAlpha() * 255.0f));
            float f = this.indicatorX + this.indicatorXAnimationDx;
            this.selectorDrawable.setBounds((int) f, measuredHeight - AndroidUtilities.dpr(4.0f), (int) (this.indicatorWidth + f + this.indicatorWidthAnimationDx), measuredHeight);
            this.selectorDrawable.draw(canvas);
        }
        return drawChild;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(22.0f);
        int childCount = this.tabsContainer.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.tabsContainer.getChildAt(i3).getLayoutParams();
            int i4 = this.allTextWidth;
            if (i4 > size) {
                layoutParams.weight = 0.0f;
                layoutParams.width = -2;
            } else if (this.useSameWidth) {
                layoutParams.weight = 1.0f / childCount;
                layoutParams.width = 0;
            } else if (i3 == 0 && childCount == 1) {
                layoutParams.weight = 0.0f;
                layoutParams.width = -2;
            } else {
                layoutParams.weight = (1.0f / i4) * this.positionToWidth.get(i3);
                layoutParams.width = 0;
            }
        }
        if (childCount == 1 || this.allTextWidth > size) {
            this.tabsContainer.setWeightSum(0.0f);
        } else {
            this.tabsContainer.setWeightSum(1.0f);
        }
        super.onMeasure(i, i2);
    }

    private void scrollToChild(int i) {
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
            smoothScrollTo(left - AndroidUtilities.dp(50.0f), 0);
            return;
        }
        int i2 = left + measuredWidth;
        if (AndroidUtilities.dp(21.0f) + i2 > scrollX + getWidth()) {
            smoothScrollTo(i2, 0);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                this.indicatorWidth = getChildWidth(textView);
                int left = textView.getLeft();
                int measuredWidth = textView.getMeasuredWidth();
                int i7 = this.indicatorWidth;
                int i8 = left + ((measuredWidth - i7) / 2);
                this.indicatorX = i8;
                int i9 = this.animateFromIndicaxtorX;
                if (i9 <= 0 || (i5 = this.animateFromIndicatorWidth) <= 0) {
                    return;
                }
                if (i9 != i8 || i5 != i7) {
                    final int i10 = i9 - i8;
                    final int i11 = i5 - i7;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ScrollSlidingTextTabStrip.this.lambda$onLayout$1(i10, i11, valueAnimator);
                        }
                    });
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ofFloat.start();
                }
                this.animateFromIndicaxtorX = 0;
                this.animateFromIndicatorWidth = 0;
            }
        }
    }

    public void lambda$onLayout$1(int i, int i2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.indicatorXAnimationDx = i * floatValue;
        this.indicatorWidthAnimationDx = i2 * floatValue;
        this.tabsContainer.invalidate();
        invalidate();
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = this.tabsContainer.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.tabsContainer.getChildAt(i).setEnabled(z);
        }
    }

    public void selectTabWithId(int i, float f) {
        int i2 = this.idToPosition.get(i, -1);
        if (i2 < 0) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        TextView textView = (TextView) this.tabsContainer.getChildAt(this.currentPosition);
        TextView textView2 = (TextView) this.tabsContainer.getChildAt(i2);
        if (textView != null && textView2 != null) {
            this.animateIndicatorStartWidth = getChildWidth(textView);
            this.animateIndicatorStartX = textView.getLeft() + ((textView.getMeasuredWidth() - this.animateIndicatorStartWidth) / 2);
            this.animateIndicatorToWidth = getChildWidth(textView2);
            this.animateIndicatorToX = textView2.getLeft() + ((textView2.getMeasuredWidth() - this.animateIndicatorToWidth) / 2);
            setAnimationProgressInernal(textView2, textView, f);
            if (f >= 1.0f) {
                textView.setTag(this.unactiveTextColorKey);
                textView2.setTag(this.activeTextColorKey);
            }
            scrollToChild(this.tabsContainer.indexOfChild(textView2));
        }
        if (f >= 1.0f) {
            this.currentPosition = i2;
            this.selectedTabId = i;
        }
    }

    private int getChildWidth(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout != null) {
            return ((int) Math.ceil(layout.getLineWidth(0))) + AndroidUtilities.dp(2.0f);
        }
        return textView.getMeasuredWidth();
    }

    public void recordIndicatorParams() {
        this.animateFromIndicaxtorX = this.indicatorX;
        this.animateFromIndicatorWidth = this.indicatorWidth;
    }
}
