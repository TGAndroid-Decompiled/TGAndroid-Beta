package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
    private int maxWidthPx;
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
    private final Set<View> tabsWithIgnoreClick;
    private int visibleChildCount;
    private static final float[] PASS_TEXT_SIZES_DP = {12.0f, 12.0f, 10.0f};
    private static final int[] PASS_PADDINGS_DP = {16, 8, 4};

    public MainTabsLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.restoreDrawSelector = new MainTabsLayout$$ExternalSyntheticLambda0(this, 0);
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
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(1500.0f);
        springForce.setDampingRatio(0.75f);
        springAnimation3.mSpring = springForce;
        SpringForce springForce2 = new SpringForce(1.0f);
        springForce2.setStiffness(250.0f);
        springForce2.setDampingRatio(0.25f);
        springAnimation.mSpring = springForce2;
        SpringForce springForce3 = new SpringForce(1.0f);
        springForce3.setStiffness(250.0f);
        springForce3.setDampingRatio(0.25f);
        springAnimation2.mSpring = springForce3;
        SpringForce springForce4 = new SpringForce(1.0f);
        springForce4.setStiffness(1500.0f);
        springForce4.setDampingRatio(0.75f);
        springAnimation4.mSpring = springForce4;
        this.tabsWithIgnoreClick = new HashSet();
        this.animatorIsScaled = new BoolAnimator(0, new PhotoViewer$$ExternalSyntheticLambda96(this, 7), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.clickHelper = new ClickHelper(new ClickHelper.Delegate() {
            private void longTouchEnd() {
                MainTabsLayout.this.animatorIsScaled.setValue(false, true);
            }

            private void longTouchStart() {
                MainTabsLayout.this.animatorIsScaled.setValue(true, true);
            }

            @Override
            public boolean forceEnableVibration() {
                return false;
            }

            @Override
            public long getLongPressDuration() {
                return (((long) ViewConfiguration.getLongPressTimeout()) * 750) / 1000;
            }

            @Override
            public boolean ignoreHapticFeedbackSettings(float f, float f2) {
                return false;
            }

            @Override
            public boolean needCancelTouchBySlopMove() {
                return false;
            }

            @Override
            public boolean needClickAt(View view, float f, float f2) {
                MainTabsLayout.this.lastLongSelectedView = null;
                View viewFindChildUnder = MainTabsLayout.findChildUnder(MainTabsLayout.this, f, f2);
                return (viewFindChildUnder == null || MainTabsLayout.this.tabsWithIgnoreClick.contains(viewFindChildUnder)) ? false : true;
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
            }

            @Override
            public void onClickTouchMove(View view, float f, float f2) {
            }

            @Override
            public void onClickTouchUp(View view, float f, float f2) {
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
            public void onLongPressMove(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
                MainTabsLayout.this.checkPivot(view, f, f2);
                MainTabsLayout.this.checkLongMove(f, f2, false, false);
                MainTabsLayout.this.invalidate();
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
        });
        this.resourcesProvider = resourcesProvider;
    }

    private void applyPassTextSize(int i) {
        float f = PASS_TEXT_SIZES_DP[i];
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            KeyEvent.Callback childAt = getChildAt(i2);
            if (childAt instanceof Tab) {
                ((Tab) childAt).setTextSizeDp(f);
            }
        }
    }

    private void checkLayerType() {
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public void checkLongMove(float f, float f2, boolean z, boolean z2) {
        float fClampXToChildrenCenters = clampXToChildrenCenters(f, this);
        View viewFindNearestVisibleChildByX = findNearestVisibleChildByX(fClampXToChildrenCenters, this);
        if (z) {
            View viewFindSelectedTab = findSelectedTab();
            if (viewFindSelectedTab != null) {
                float width = (viewFindSelectedTab.getWidth() / 2.0f) + viewFindSelectedTab.getX();
                this.animatedLongSelectedViewCenterX = width;
                this.animatedLongSelectedViewOffsetX = width - fClampXToChildrenCenters;
                SpringAnimation springAnimation = this.selectedTabPositionOffsetX;
                if (springAnimation.mRunning) {
                    springAnimation.mPendingPosition = 0.0f;
                } else {
                    if (springAnimation.mSpring == null) {
                        springAnimation.mSpring = new SpringForce(0.0f);
                    }
                    springAnimation.mSpring.mFinalPosition = 0.0f;
                    springAnimation.start();
                }
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
                float width2 = viewFindNearestVisibleChildByX.getWidth();
                float x = (width2 / 2.0f) + viewFindNearestVisibleChildByX.getX();
                if (this.lastLongSelectedViewWidth == width2 && this.lastLongSelectedViewCenterX == x) {
                    return;
                }
                SpringAnimation springAnimation2 = this.selectedTabPositionX;
                if (springAnimation2.mRunning) {
                    springAnimation2.mPendingPosition = x;
                    return;
                }
                if (springAnimation2.mSpring == null) {
                    springAnimation2.mSpring = new SpringForce(x);
                }
                springAnimation2.mSpring.mFinalPosition = x;
                springAnimation2.start();
            }
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
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
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

    private void checkVisualWidth() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            ListAnimator.Entry entry = getEntry(i);
            ((GlassTabView) ((AnimatedLinearLayout.Holder) entry.item).view).setVisualWidth(entry.getRectF().width());
        }
    }

    private static float clampXToChildrenCenters(float f, ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            boolean z = false;
            float f2 = Float.MAX_VALUE;
            float f3 = -3.4028235E38f;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f2) {
                        f2 = width;
                    }
                    if (width > f3) {
                        f3 = width;
                    }
                    z = true;
                }
            }
            if (z) {
                if (f < f2) {
                    return f2;
                }
                if (f > f3) {
                    return f3;
                }
            }
        }
        return f;
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

    private static View findNearestVisibleChildByX(float f, ViewGroup viewGroup) {
        View view = null;
        if (viewGroup != null && viewGroup.getChildCount() != 0) {
            float f2 = Float.MAX_VALUE;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float fAbs = Math.abs(((childAt.getWidth() * 0.5f) + childAt.getX()) - f);
                    if (fAbs < f2) {
                        view = childAt;
                        f2 = fAbs;
                    }
                }
            }
        }
        return view;
    }

    private View findSelectedTab() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (childAt instanceof GlassTabView) && ((GlassTabView) childAt).isSelectedAnimator.value) {
                return childAt;
            }
        }
        return null;
    }

    private static float getCenterX(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
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
                float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                if (width2 <= f && (view == null || width2 > getCenterX(view))) {
                    view = childAt;
                }
                if (width2 >= f && (view2 == null || width2 < getCenterX(view2))) {
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
            width = (view == view2 || centerX == centerX2) ? view.getWidth() : AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f - centerX) / (centerX2 - centerX));
        }
        return width;
    }

    public void lambda$new$0() {
        setSkipDrawSelector(false);
    }

    public void lambda$new$1(int i, float f, float f2, FactorAnimator factorAnimator) {
        setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f));
        setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f));
    }

    private void measureTabTexts(float f) {
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
            if (isViewVisible(childAt)) {
                float fMeasureTextWidth = childAt instanceof Tab ? ((Tab) childAt).measureTextWidth(f) : 0.0f;
                this.tabsTextWidth[i2] = fMeasureTextWidth;
                fMax = Math.max(fMax, fMeasureTextWidth);
                i++;
            } else {
                this.tabsTextWidth[i2] = -1.0f;
            }
        }
        this.biggestTabTextWidth = (int) Math.ceil(fMax);
        this.visibleChildCount = i;
    }

    public void setSkipDrawSelector(boolean z) {
        this.drawCustomSelector = z;
        if (z) {
            this.selectorPaint.setColor(Theme.multAlpha(0.09f, Theme.getColor(Theme.key_glass_tabSelected, this.resourcesProvider)));
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

    public void addTabToIgnoreClick(View view) {
        this.tabsWithIgnoreClick.add(view);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.drawCustomSelector) {
            float f = this.animatedLongSelectedViewCenterX + this.animatedLongSelectedViewOffsetX;
            float interpolatedWidthByX = getInterpolatedWidthByX(f, this);
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f2 = interpolatedWidthByX / 2.0f;
            float f3 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f - f2, (getHeight() - height) / 2.0f, f + f2, (getHeight() + height) / 2.0f, f3, f3, this.selectorPaint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.clickHelper.onTouchEvent(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void onItemsChanged() {
        super.onItemsChanged();
        checkVisualWidth();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkVisualWidth();
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i4 = this.maxWidthPx;
        if (i4 > 0 && size > i4) {
            size = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int length = PASS_TEXT_SIZES_DP.length - 1;
        float f = -1.0f;
        int i5 = 0;
        while (true) {
            float[] fArr = PASS_TEXT_SIZES_DP;
            if (i5 >= fArr.length) {
                i3 = 0;
                break;
            }
            float f2 = fArr[i5];
            if (f2 != f) {
                measureTabTexts(f2);
                f = fArr[i5];
            }
            int iDp = AndroidUtilities.dp(PASS_PADDINGS_DP[i5]);
            int childCount = getChildCount();
            float f3 = 0.0f;
            for (int i6 = 0; i6 < childCount; i6++) {
                if (isViewVisible(getChildAt(i6))) {
                    f3 += this.tabsTextWidth[i6] + (iDp * 2);
                }
            }
            i3 = 0;
            if (f3 <= paddingLeft || i5 == PASS_TEXT_SIZES_DP.length - 1) {
                length = i5;
                break;
            }
            i5++;
        }
        applyPassTextSize(length);
        int iDp2 = AndroidUtilities.dp(PASS_PADDINGS_DP[length]) * 2;
        int iMax = (paddingLeft / Math.max(1, this.visibleChildCount)) - iDp2;
        int childCount2 = getChildCount();
        int i7 = 0;
        float f4 = 0.0f;
        for (int i8 = 0; i8 < childCount2; i8++) {
            if (isViewVisible(getChildAt(i8))) {
                float[] fArr2 = this.tabsTextWidthWithMargin;
                float f5 = this.tabsTextWidth[i8] + iDp2;
                fArr2[i8] = f5;
                int[] iArr = this.tabsWeight;
                int i9 = f5 > ((float) (iMax + iDp2)) ? 0 : 1;
                iArr[i8] = i9;
                f4 += f5;
                i7 += i9;
            } else {
                float[] fArr3 = this.tabsTextWidth;
                this.tabsTextWidthWithMargin[i8] = 0.0f;
                fArr3[i8] = 0.0f;
                this.tabsWeight[i8] = i3;
            }
        }
        if (i7 == 0) {
            int childCount3 = getChildCount();
            for (int i10 = 0; i10 < childCount3; i10++) {
                this.tabsWeight[i10] = isViewVisible(getChildAt(i10)) ? 1 : 0;
            }
            i7 = this.visibleChildCount;
        }
        float f6 = paddingLeft;
        if (f4 > f6) {
            float f7 = f6 / f4;
            int childCount4 = getChildCount();
            for (int i11 = 0; i11 < childCount4; i11++) {
                float[] fArr4 = this.tabsTextWidthWithMargin;
                fArr4[i11] = fArr4[i11] * f7;
            }
        } else {
            float f8 = iMin;
            if (f4 < f8) {
                float f9 = (f8 - f4) / i7;
                int childCount5 = getChildCount();
                for (int i12 = 0; i12 < childCount5; i12++) {
                    float[] fArr5 = this.tabsTextWidthWithMargin;
                    fArr5[i12] = (this.tabsWeight[i12] * f9) + fArr5[i12];
                }
            }
        }
        int childCount6 = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount6; i14++) {
            if (isViewVisible(getChildAt(i14))) {
                this.tabsWidth[i14] = Math.round(this.tabsTextWidthWithMargin[i14]);
                this.tabsLeftPos[i14] = i13;
                i13 += this.tabsWidth[i14];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i13, size2);
        int childCount7 = getChildCount();
        for (int i15 = 0; i15 < childCount7; i15++) {
            getChildAt(i15).measure(View.MeasureSpec.makeMeasureSpec(this.tabsWidth[i15], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        calculateTotalSizesAfterMeasure();
    }

    @Override
    public void setChildVisibilityFactor(View view, float f) {
        float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public void setMaxWidth(int i) {
        if (this.maxWidthPx != i) {
            this.maxWidthPx = i;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f) {
        super.setScaleX(f);
        checkLayerType();
    }

    @Override
    public void setScaleY(float f) {
        super.setScaleY(f);
        checkLayerType();
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

    public interface Tab {
        float measureTextWidth();

        float measureTextWidth(float f);

        void setTextSizeDp(float f);

        public abstract class CC {
            public static void $default$setTextSizeDp(Tab tab, float f) {
            }
        }
    }
}
