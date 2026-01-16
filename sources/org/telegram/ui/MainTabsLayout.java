package org.telegram.ui;

import android.content.Context;
import android.view.View;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedLinearLayout;
import org.telegram.ui.Components.glass.GlassTabView;

public class MainTabsLayout extends AnimatedLinearLayout {
    private int biggestTabTextWidth;
    private int[] tabsLeftPos;
    private float[] tabsTextWidth;
    private float[] tabsTextWidthWithMargin;
    private int[] tabsWeight;
    private int[] tabsWidth;
    private int visibleChildCount;

    public interface Tab {
        float measureTextWidth();
    }

    public MainTabsLayout(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        measureTabTexts();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int iDp = AndroidUtilities.dp(16.0f);
        int i3 = this.visibleChildCount;
        int i4 = iMin / i3;
        int i5 = (paddingLeft / i3) - (iDp * 2);
        int childCount = getChildCount();
        int i6 = 0;
        float f = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            if (!isViewVisible(getChildAt(i7))) {
                float[] fArr = this.tabsTextWidth;
                this.tabsTextWidthWithMargin[i7] = 0.0f;
                fArr[i7] = 0.0f;
                this.tabsWeight[i7] = 0;
            } else {
                float f2 = this.tabsTextWidth[i7];
                if (f2 > i5) {
                    this.tabsTextWidthWithMargin[i7] = f2 + (AndroidUtilities.dp(13.0f) * 2);
                } else {
                    this.tabsTextWidthWithMargin[i7] = f2 + (AndroidUtilities.dp(16.0f) * 2);
                }
                this.tabsWeight[i7] = this.tabsTextWidthWithMargin[i7] > ((float) ((AndroidUtilities.dp(16.0f) * 2) + i5)) ? 0 : 1;
                f += this.tabsTextWidthWithMargin[i7];
                i6 += this.tabsWeight[i7];
            }
        }
        if (i6 == 0) {
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                this.tabsWeight[i8] = isViewVisible(getChildAt(i8)) ? 1 : 0;
            }
            i6 = this.visibleChildCount;
        }
        if (f > paddingLeft) {
            float f3 = (i6 - paddingLeft) / f;
            int childCount3 = getChildCount();
            for (int i9 = 0; i9 < childCount3; i9++) {
                float[] fArr2 = this.tabsTextWidthWithMargin;
                fArr2[i9] = fArr2[i9] * f3;
            }
        } else {
            float f4 = iMin;
            if (f < f4) {
                float f5 = (f4 - f) / i6;
                int childCount4 = getChildCount();
                for (int i10 = 0; i10 < childCount4; i10++) {
                    float[] fArr3 = this.tabsTextWidthWithMargin;
                    fArr3[i10] = fArr3[i10] + (this.tabsWeight[i10] * f5);
                }
            }
        }
        int childCount5 = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount5; i12++) {
            if (isViewVisible(getChildAt(i12))) {
                this.tabsWidth[i12] = Math.round(this.tabsTextWidthWithMargin[i12]);
                this.tabsLeftPos[i12] = i11;
                i11 += this.tabsWidth[i12];
            }
        }
        setMeasuredDimension(i11 + getPaddingLeft() + getPaddingRight(), size2);
        int childCount6 = getChildCount();
        for (int i13 = 0; i13 < childCount6; i13++) {
            getChildAt(i13).measure(View.MeasureSpec.makeMeasureSpec(this.tabsWidth[i13], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        calculateTotalSizesAfterMeasure();
    }

    private void measureTabTexts() {
        int childCount = getChildCount();
        float[] fArr = this.tabsTextWidth;
        if (fArr == null || fArr.length < childCount) {
            this.tabsTextWidth = new float[childCount];
            this.tabsTextWidthWithMargin = new float[childCount];
            this.tabsWeight = new int[childCount];
            this.tabsLeftPos = new int[childCount];
            this.tabsWidth = new int[childCount];
        }
        int i = 0;
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!isViewVisible(childAt)) {
                this.tabsTextWidth[i2] = -1.0f;
            } else {
                float fMeasureTextWidth = childAt instanceof Tab ? ((Tab) childAt).measureTextWidth() : 0.0f;
                this.tabsTextWidth[i2] = fMeasureTextWidth;
                fMax = Math.max(fMax, fMeasureTextWidth);
                i++;
            }
        }
        this.biggestTabTextWidth = (int) Math.ceil(fMax);
        this.visibleChildCount = i;
    }

    @Override
    protected void setChildVisibilityFactor(View view, float f) {
        float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkVisualWidth();
    }

    @Override
    protected void onItemsChanged() {
        super.onItemsChanged();
        checkVisualWidth();
    }

    private void checkVisualWidth() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            ListAnimator.Entry entry = getEntry(i);
            ((GlassTabView) ((AnimatedLinearLayout.Holder) entry.item).view).setVisualWidth(entry.getRectF().width());
        }
    }
}
