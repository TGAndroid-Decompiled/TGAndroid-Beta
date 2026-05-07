package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.HashSet;
import java.util.Set;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedLinearLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.glass.GlassTabView;

public class MainTabsLayout extends AnimatedLinearLayout {
    private float animatedLongSelectedViewCenterX;
    private float animatedLongSelectedViewOffsetX;
    private final BoolAnimator animatorIsScaled;
    private int biggestTabTextWidth;
    private final ClickHelper clickHelper;
    private boolean drawCustomSelector;
    private boolean isInLongPress;
    private View lastLongSelectedView;
    private float lastLongSelectedViewCenterX;
    private float lastLongSelectedViewWidth;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Runnable restoreDrawSelector;
    final SpringAnimation scaleX;
    final SpringAnimation scaleY;
    final SpringAnimation selectedTabPositionOffsetX;
    final SpringAnimation selectedTabPositionX;
    final Paint selectorPaint;
    private int[] tabsLeftPos;
    private float[] tabsTextWidth;
    private float[] tabsTextWidthWithMargin;
    private int[] tabsWeight;
    private int[] tabsWidth;
    private final Set tabsWithIgnoreClick;
    private int visibleChildCount;

    public interface Tab {
        float measureTextWidth();
    }

    public MainTabsLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.restoreDrawSelector = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        };
        this.selectorPaint = new Paint(1);
        SpringAnimation springAnimation = new SpringAnimation(this, DynamicAnimation.SCALE_X, 1.0f);
        this.scaleX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, DynamicAnimation.SCALE_Y, 1.0f);
        this.scaleY = springAnimation2;
        SpringAnimation springAnimation3 = new SpringAnimation(this, new FloatPropertyCompat("selectedTabPositionOffsetX") {
            @Override
            public float getValue(MainTabsLayout mainTabsLayout) {
                return mainTabsLayout.animatedLongSelectedViewOffsetX;
            }

            @Override
            public void setValue(MainTabsLayout mainTabsLayout, float f) {
                mainTabsLayout.animatedLongSelectedViewOffsetX = f;
                mainTabsLayout.invalidate();
            }
        });
        this.selectedTabPositionOffsetX = springAnimation3;
        SpringAnimation springAnimation4 = new SpringAnimation(this, new FloatPropertyCompat("selectedTabPositionX") {
            @Override
            public float getValue(MainTabsLayout mainTabsLayout) {
                return mainTabsLayout.animatedLongSelectedViewCenterX;
            }

            @Override
            public void setValue(MainTabsLayout mainTabsLayout, float f) {
                mainTabsLayout.animatedLongSelectedViewCenterX = f;
                mainTabsLayout.invalidate();
            }
        });
        this.selectedTabPositionX = springAnimation4;
        springAnimation3.setSpring(new SpringForce(1.0f).setStiffness(1500.0f).setDampingRatio(0.75f));
        springAnimation.setSpring(new SpringForce(1.0f).setStiffness(250.0f).setDampingRatio(0.25f));
        springAnimation2.setSpring(new SpringForce(1.0f).setStiffness(250.0f).setDampingRatio(0.25f));
        springAnimation4.setSpring(new SpringForce(1.0f).setStiffness(1500.0f).setDampingRatio(0.75f));
        this.tabsWithIgnoreClick = new HashSet();
        this.animatorIsScaled = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.lambda$new$1(i, f, f2, factorAnimator);
            }
        }, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.clickHelper = new ClickHelper(new ClickHelper.Delegate() {
            @Override
            public boolean forceEnableVibration() {
                return ClickHelper.Delegate.CC.$default$forceEnableVibration(this);
            }

            @Override
            public boolean ignoreHapticFeedbackSettings(float f, float f2) {
                return ClickHelper.Delegate.CC.$default$ignoreHapticFeedbackSettings(this, f, f2);
            }

            @Override
            public boolean needCancelTouchBySlopMove() {
                return false;
            }

            @Override
            public boolean needLongPress(float f, float f2) {
                return true;
            }

            @Override
            public void onClickAt(View view, float f, float f2) {
            }

            @Override
            public void onClickTouchDown(View view, float f, float f2) {
                ClickHelper.Delegate.CC.$default$onClickTouchDown(this, view, f, f2);
            }

            @Override
            public void onClickTouchMove(View view, float f, float f2) {
                ClickHelper.Delegate.CC.$default$onClickTouchMove(this, view, f, f2);
            }

            @Override
            public void onClickTouchUp(View view, float f, float f2) {
                ClickHelper.Delegate.CC.$default$onClickTouchUp(this, view, f, f2);
            }

            @Override
            public boolean needClickAt(View view, float f, float f2) {
                MainTabsLayout.this.lastLongSelectedView = null;
                View viewFindChildUnder = MainTabsLayout.findChildUnder(MainTabsLayout.this, f, f2);
                return (viewFindChildUnder == null || MainTabsLayout.this.tabsWithIgnoreClick.contains(viewFindChildUnder)) ? false : true;
            }

            @Override
            public boolean onLongPressRequestedAt(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.isInLongPress = true;
                AndroidUtilities.cancelRunOnUIThread(MainTabsLayout.this.restoreDrawSelector);
                MainTabsLayout.this.setSkipDrawSelector(true);
                MainTabsLayout.this.checkLongMove(f, f2, true, false);
                MainTabsLayout.this.invalidate();
                longTouchStart();
                return true;
            }

            @Override
            public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, false);
                MainTabsLayout.this.invalidate();
            }

            @Override
            public long getLongPressDuration() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MainTabsLayout.AnonymousClass3.getLongPressDuration():long");
            }

            @Override
            public void onLongPressFinish(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, true);
                MainTabsLayout.this.isInLongPress = false;
                AndroidUtilities.runOnUIThread(MainTabsLayout.this.restoreDrawSelector, 450L);
                if (MainTabsLayout.this.lastLongSelectedView != null) {
                    MainTabsLayout.this.lastLongSelectedView.performClick();
                }
                MainTabsLayout.this.lastLongSelectedView = null;
                MainTabsLayout.this.invalidate();
                longTouchEnd();
            }

            @Override
            public void onLongPressCancelled(View view, float f, float f2) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, true);
                MainTabsLayout.this.isInLongPress = false;
                AndroidUtilities.runOnUIThread(MainTabsLayout.this.restoreDrawSelector, 450L);
                MainTabsLayout.this.lastLongSelectedView = null;
                MainTabsLayout.this.invalidate();
                longTouchEnd();
            }

            private void longTouchStart() {
                MainTabsLayout.this.animatorIsScaled.setValue(true, true);
            }

            private void longTouchEnd() {
                MainTabsLayout.this.animatorIsScaled.setValue(false, true);
            }
        });
        this.resourcesProvider = resourcesProvider;
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
        float f3 = paddingLeft;
        if (f > f3) {
            float f4 = f3 / f;
            int childCount3 = getChildCount();
            for (int i9 = 0; i9 < childCount3; i9++) {
                float[] fArr2 = this.tabsTextWidthWithMargin;
                fArr2[i9] = fArr2[i9] * f4;
            }
        } else {
            float f5 = iMin;
            if (f < f5) {
                float f6 = (f5 - f) / i6;
                int childCount4 = getChildCount();
                for (int i10 = 0; i10 < childCount4; i10++) {
                    float[] fArr3 = this.tabsTextWidthWithMargin;
                    fArr3[i10] = fArr3[i10] + (this.tabsWeight[i10] * f6);
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

    public void setTabSelected(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof GlassTabView) {
                ((GlassTabView) childAt).setSelected(childAt == view, z);
            }
        }
    }

    private View findSelectedTab() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof GlassTabView) && ((GlassTabView) childAt).isTabSelected()) {
                return childAt;
            }
        }
        return null;
    }

    public void lambda$new$0() {
        setSkipDrawSelector(false);
    }

    public void setSkipDrawSelector(boolean z) {
        this.drawCustomSelector = z;
        if (z) {
            this.selectorPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_glass_tabSelected, this.resourcesProvider), 0.09f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof GlassTabView)) {
                ((GlassTabView) childAt).setSkipDrawSelector(z);
            }
        }
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.drawCustomSelector) {
            float f = this.animatedLongSelectedViewCenterX + this.animatedLongSelectedViewOffsetX;
            float interpolatedWidthByX = getInterpolatedWidthByX(f, this);
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f2 = interpolatedWidthByX / 2.0f;
            float f3 = height / 2.0f;
            canvas.drawRoundRect(f - f2, (getHeight() - height) / 2.0f, f + f2, (getHeight() + height) / 2.0f, f3, f3, this.selectorPaint);
        }
        super.dispatchDraw(canvas);
    }

    public static View findChildUnder(ViewGroup viewGroup, float f, float f2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void checkLongMove(float f, float f2, boolean z, boolean z2) {
        float fClampXToChildrenCenters = clampXToChildrenCenters(f, this);
        View viewFindNearestVisibleChildByX = findNearestVisibleChildByX(fClampXToChildrenCenters, this);
        if (z) {
            View viewFindSelectedTab = findSelectedTab();
            if (viewFindSelectedTab != null) {
                float x = viewFindSelectedTab.getX() + (viewFindSelectedTab.getWidth() / 2.0f);
                this.animatedLongSelectedViewCenterX = x;
                this.animatedLongSelectedViewOffsetX = x - fClampXToChildrenCenters;
                this.selectedTabPositionOffsetX.animateToFinalPosition(0.0f);
                if (viewFindSelectedTab != viewFindNearestVisibleChildByX && viewFindNearestVisibleChildByX != null) {
                    viewFindNearestVisibleChildByX.performClick();
                }
            }
            this.selectedTabPositionX.cancel();
        }
        if (!z2) {
            this.animatedLongSelectedViewCenterX = fClampXToChildrenCenters;
            invalidate();
        }
        if (viewFindNearestVisibleChildByX != null) {
            this.lastLongSelectedView = viewFindNearestVisibleChildByX;
            setTabSelected(viewFindNearestVisibleChildByX, true);
            if (z2) {
                float width = viewFindNearestVisibleChildByX.getWidth();
                float x2 = viewFindNearestVisibleChildByX.getX() + (width / 2.0f);
                if (this.lastLongSelectedViewWidth == width && this.lastLongSelectedViewCenterX == x2) {
                    return;
                }
                this.selectedTabPositionX.animateToFinalPosition(x2);
            }
        }
    }

    public void addTabToIgnoreClick(View view) {
        this.tabsWithIgnoreClick.add(view);
    }

    public void lambda$new$1(int i, float f, float f2, FactorAnimator factorAnimator) {
        setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f));
        setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f));
    }

    @Override
    public void setScaleY(float f) {
        super.setScaleY(f);
        checkLayerType();
    }

    @Override
    public void setScaleX(float f) {
        super.setScaleX(f);
        checkLayerType();
    }

    private void checkLayerType() {
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public void checkPivot(View view, float f, float f2) {
        float f3;
        float f4;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f5 = width * 0.5f;
        float f6 = height * 0.5f;
        float f7 = f - f5;
        float f8 = f2 - f6;
        float f9 = f7 / f5;
        float f10 = f8 / f6;
        float fSqrt = (float) Math.sqrt((f9 * f9) + (f10 * f10));
        if (fSqrt > 1.0E-4f) {
            float f11 = ((1.5f * fSqrt) / (0.5f + fSqrt)) / fSqrt;
            f3 = (f7 * f11) + f5;
            f4 = (f8 * f11) + f6;
        } else {
            f3 = f5;
            f4 = f6;
        }
        float fLerp = AndroidUtilities.lerp(f5, f3, 1.0f);
        float fLerp2 = AndroidUtilities.lerp(f6, f4, 3.0f);
        view.setPivotX(fLerp);
        view.setPivotY(fLerp2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.clickHelper.onTouchEvent(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private static float clampXToChildrenCenters(float f, ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            boolean z = false;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float x = childAt.getX() + (childAt.getWidth() * 0.5f);
                    if (x < f2) {
                        f2 = x;
                    }
                    if (x > f3) {
                        f3 = x;
                    }
                    z = true;
                }
            }
            if (!z) {
                return f;
            }
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
        }
        return f;
    }

    private static View findNearestVisibleChildByX(float f, ViewGroup viewGroup) {
        View view = null;
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            float f2 = Float.MAX_VALUE;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float fAbs = Math.abs((childAt.getX() + (childAt.getWidth() * 0.5f)) - f);
                    if (fAbs < f2) {
                        view = childAt;
                        f2 = fAbs;
                    }
                }
            }
        }
        return view;
    }

    private static float getInterpolatedWidthByX(float f, ViewGroup viewGroup) {
        int width;
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return 0.0f;
        }
        View view = null;
        View view2 = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0) {
                float x = childAt.getX() + (childAt.getWidth() * 0.5f);
                if (x <= f && (view == null || x > getCenterX(view))) {
                    view = childAt;
                }
                if (x >= f && (view2 == null || x < getCenterX(view2))) {
                    view2 = childAt;
                }
            }
        }
        if (view == null && view2 == null) {
            return 0.0f;
        }
        if (view == null) {
            width = view2.getWidth();
        } else if (view2 == null) {
            width = view.getWidth();
        } else {
            float centerX = getCenterX(view);
            float centerX2 = getCenterX(view2);
            if (view == view2 || centerX == centerX2) {
                width = view.getWidth();
            } else {
                width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f - centerX) / (centerX2 - centerX));
            }
        }
        return width;
    }

    private static float getCenterX(View view) {
        return view.getX() + (view.getWidth() * 0.5f);
    }
}
