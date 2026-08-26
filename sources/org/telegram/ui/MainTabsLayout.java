package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.util.ClickHelper;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedLinearLayout;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.glass.GlassTabView;

public final class MainTabsLayout extends AnimatedLinearLayout {
    public float animatedLongSelectedViewCenterX;
    public float animatedLongSelectedViewOffsetX;
    public final BoolAnimator animatorIsScaled;
    public final ClickHelper clickHelper;
    public boolean drawCustomSelector;
    public View lastLongSelectedView;
    public int maxWidthPx;
    public final Theme.ResourcesProvider resourcesProvider;
    public final IntroActivity$$ExternalSyntheticLambda6 restoreDrawSelector;
    public final SpringAnimation selectedTabPositionOffsetX;
    public final SpringAnimation selectedTabPositionX;
    public final Paint selectorPaint;
    public int[] tabsLeftPos;
    public float[] tabsTextWidth;
    public float[] tabsTextWidthWithMargin;
    public int[] tabsWeight;
    public int[] tabsWidth;
    public final HashSet tabsWithIgnoreClick;
    public int visibleChildCount;
    public static final float[] PASS_TEXT_SIZES_DP = {12.0f, 12.0f, 10.0f};
    public static final int[] PASS_PADDINGS_DP = {16, 8, 4};

    public final class AnonymousClass1 extends FloatPropertyCompat {
        public final int $r8$classId;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final float getValue(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return ((MainTabsLayout) obj).animatedLongSelectedViewOffsetX;
                case 1:
                    return ((Bulletin.Layout) obj).inOutOffset;
                default:
                    return ((MainTabsLayout) obj).animatedLongSelectedViewCenterX;
            }
        }

        @Override
        public final void setValue(Object obj, float f) {
            switch (this.$r8$classId) {
                case 0:
                    MainTabsLayout mainTabsLayout = (MainTabsLayout) obj;
                    mainTabsLayout.animatedLongSelectedViewOffsetX = f;
                    mainTabsLayout.invalidate();
                    break;
                case 1:
                    ((Bulletin.Layout) obj).setInOutOffset(f);
                    break;
                default:
                    MainTabsLayout mainTabsLayout2 = (MainTabsLayout) obj;
                    mainTabsLayout2.animatedLongSelectedViewCenterX = f;
                    mainTabsLayout2.invalidate();
                    break;
            }
        }
    }

    public interface Tab {
    }

    public MainTabsLayout(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.restoreDrawSelector = new IntroActivity$$ExternalSyntheticLambda6(this, 24);
        this.selectorPaint = new Paint(1);
        DynamicAnimation.AnonymousClass1 anonymousClass1 = DynamicAnimation.SCALE_X;
        new ArrayList();
        new ArrayList();
        DynamicAnimation.AnonymousClass1 anonymousClass2 = DynamicAnimation.ROTATION;
        DynamicAnimation.AnonymousClass1 anonymousClass3 = DynamicAnimation.ROTATION_Y;
        DynamicAnimation.AnonymousClass1 anonymousClass4 = DynamicAnimation.ROTATION_X;
        new SpringForce(1.0f);
        DynamicAnimation.AnonymousClass1 anonymousClass5 = DynamicAnimation.SCALE_Y;
        new ArrayList();
        new ArrayList();
        new SpringForce(1.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, new AnonymousClass1(0));
        this.selectedTabPositionOffsetX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, new AnonymousClass1(2));
        this.selectedTabPositionX = springAnimation2;
        SpringForce springForce = new SpringForce(1.0f);
        springForce.setStiffness(1500.0f);
        springForce.setDampingRatio(0.75f);
        springAnimation.mSpring = springForce;
        SpringForce springForce2 = new SpringForce(1.0f);
        springForce2.setStiffness(250.0f);
        springForce2.setDampingRatio(0.25f);
        SpringForce springForce3 = new SpringForce(1.0f);
        springForce3.setStiffness(250.0f);
        springForce3.setDampingRatio(0.25f);
        SpringForce springForce4 = new SpringForce(1.0f);
        springForce4.setStiffness(1500.0f);
        springForce4.setDampingRatio(0.75f);
        springAnimation2.mSpring = springForce4;
        this.tabsWithIgnoreClick = new HashSet();
        this.animatorIsScaled = new BoolAnimator(0, new PhotoViewer$$ExternalSyntheticLambda115(this, 9), CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.clickHelper = new ClickHelper(new PhotoViewer.AnonymousClass24(this, 1));
        this.resourcesProvider = resourcesProvider;
    }

    public static void access$400(MainTabsLayout mainTabsLayout, View view, float f, float f2) {
        float f3;
        float f4;
        mainTabsLayout.getClass();
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

    public static void access$800(MainTabsLayout mainTabsLayout, float f, boolean z, boolean z2) {
        float f2 = Float.MAX_VALUE;
        if (mainTabsLayout.getChildCount() != 0) {
            float f3 = -3.4028235E38f;
            boolean z3 = false;
            float f4 = Float.MAX_VALUE;
            for (int i = 0; i < mainTabsLayout.getChildCount(); i++) {
                View childAt = mainTabsLayout.getChildAt(i);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f4) {
                        f4 = width;
                    }
                    if (width > f3) {
                        f3 = width;
                    }
                    z3 = true;
                }
            }
            if (z3) {
                if (f < f4) {
                    f = f4;
                } else if (f > f3) {
                    f = f3;
                }
            }
        }
        View view = null;
        View view2 = null;
        if (mainTabsLayout.getChildCount() != 0) {
            for (int i2 = 0; i2 < mainTabsLayout.getChildCount(); i2++) {
                View childAt2 = mainTabsLayout.getChildAt(i2);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float fAbs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f);
                    if (fAbs < f2) {
                        view2 = childAt2;
                        f2 = fAbs;
                    }
                }
            }
        }
        SpringAnimation springAnimation = mainTabsLayout.selectedTabPositionX;
        if (z) {
            int childCount = mainTabsLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt3 = mainTabsLayout.getChildAt(i3);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof GlassTabView) && ((GlassTabView) childAt3).isSelectedAnimator.value) {
                    view = childAt3;
                    break;
                }
            }
            if (view != null) {
                float width2 = (view.getWidth() / 2.0f) + view.getX();
                mainTabsLayout.animatedLongSelectedViewCenterX = width2;
                mainTabsLayout.animatedLongSelectedViewOffsetX = width2 - f;
                SpringAnimation springAnimation2 = mainTabsLayout.selectedTabPositionOffsetX;
                if (springAnimation2.mRunning) {
                    springAnimation2.mPendingPosition = 0.0f;
                } else {
                    if (springAnimation2.mSpring == null) {
                        springAnimation2.mSpring = new SpringForce(0.0f);
                    }
                    springAnimation2.mSpring.mFinalPosition = 0.0f;
                    springAnimation2.start();
                }
                if (view != view2 && view2 != null) {
                    view2.performClick();
                }
            }
            springAnimation.cancel();
        }
        if (!z2) {
            mainTabsLayout.animatedLongSelectedViewCenterX = f;
            mainTabsLayout.invalidate();
        }
        if (view2 != null) {
            mainTabsLayout.lastLongSelectedView = view2;
            int childCount2 = mainTabsLayout.getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt4 = mainTabsLayout.getChildAt(i4);
                if (childAt4 instanceof GlassTabView) {
                    ((GlassTabView) childAt4).setSelected(childAt4 == view2, true);
                }
            }
            if (z2) {
                float width3 = view2.getWidth();
                float x = (width3 / 2.0f) + view2.getX();
                if (0.0f == width3 && 0.0f == x) {
                    return;
                }
                if (springAnimation.mRunning) {
                    springAnimation.mPendingPosition = x;
                    return;
                }
                if (springAnimation.mSpring == null) {
                    springAnimation.mSpring = new SpringForce(x);
                }
                springAnimation.mSpring.mFinalPosition = x;
                springAnimation.start();
            }
        }
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

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        int width;
        if (this.drawCustomSelector) {
            float f2 = this.animatedLongSelectedViewCenterX + this.animatedLongSelectedViewOffsetX;
            if (getChildCount() == 0) {
                f = 0.0f;
            } else {
                View view = null;
                View view2 = null;
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f2) {
                            if (view != null) {
                                if (width2 > (view.getWidth() * 0.5f) + view.getX()) {
                                    view = childAt;
                                }
                            } else {
                                view = childAt;
                            }
                        }
                        if (width2 >= f2) {
                            if (view2 != null) {
                                if (width2 < (view2.getWidth() * 0.5f) + view2.getX()) {
                                    view2 = childAt;
                                }
                            } else {
                                view2 = childAt;
                            }
                        }
                    }
                }
                if (view == null && view2 == null) {
                    f = 0.0f;
                } else {
                    if (view == null) {
                        width = view2.getWidth();
                    } else if (view2 == null) {
                        width = view.getWidth();
                    } else {
                        float width3 = (view.getWidth() * 0.5f) + view.getX();
                        float width4 = (view2.getWidth() * 0.5f) + view2.getX();
                        width = (view == view2 || width3 == width4) ? view.getWidth() : AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f2 - width3) / (width4 - width3));
                    }
                    f = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f3 = f / 2.0f;
            float f4 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f2 - f3, (getHeight() - height) / 2.0f, f2 + f3, (getHeight() + height) / 2.0f, f4, f4, this.selectorPaint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.clickHelper.onTouchEvent(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void lambda$new$0$1() {
        setSkipDrawSelector(false);
    }

    @Override
    public final void onItemsChanged() {
        int entriesCount = getEntriesCount();
        for (int i = 0; i < entriesCount; i++) {
            ListAnimator.Entry entry = (ListAnimator.Entry) this.listAnimator.entries.get(i);
            ((GlassTabView) ((AnimatedLinearLayout.Holder) entry.item).view).setVisualWidth(entry.getRectF().width());
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int entriesCount = getEntriesCount();
        for (int i5 = 0; i5 < entriesCount; i5++) {
            ListAnimator.Entry entry = (ListAnimator.Entry) this.listAnimator.entries.get(i5);
            ((GlassTabView) ((AnimatedLinearLayout.Holder) entry.item).view).setVisualWidth(entry.getRectF().width());
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float[] fArr;
        int[] iArr;
        int i3;
        float f;
        float fMeasureText;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i4 = this.maxWidthPx;
        if (i4 > 0 && size > i4) {
            size = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i5 = 0;
        float f2 = -1.0f;
        while (true) {
            fArr = PASS_TEXT_SIZES_DP;
            iArr = PASS_PADDINGS_DP;
            if (i5 >= 3) {
                i3 = 0;
                f = 0.0f;
                i5 = 2;
                break;
            }
            float f3 = fArr[i5];
            if (f3 != f2) {
                int childCount = getChildCount();
                float[] fArr2 = this.tabsTextWidth;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.tabsTextWidth = new float[childCount];
                    this.tabsTextWidthWithMargin = new float[childCount];
                    this.tabsWeight = new int[childCount];
                    this.tabsLeftPos = new int[childCount];
                    this.tabsWidth = new int[childCount];
                }
                int i6 = 0;
                float fMax = 0.0f;
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    if (isViewVisible(childAt)) {
                        if (childAt instanceof Tab) {
                            GlassTabView glassTabView = (GlassTabView) ((Tab) childAt);
                            if (glassTabView.scaledTextPaint == null) {
                                glassTabView.scaledTextPaint = new TextPaint(glassTabView.defaultTextPaint);
                            }
                            glassTabView.scaledTextPaint.setTextSize(AndroidUtilities.dp(f3));
                            fMeasureText = glassTabView.scaledTextPaint.measureText(glassTabView.textView.getText().toString());
                        } else {
                            fMeasureText = 0.0f;
                        }
                        this.tabsTextWidth[i7] = fMeasureText;
                        fMax = Math.max(fMax, fMeasureText);
                        i6++;
                    } else {
                        this.tabsTextWidth[i7] = -1.0f;
                    }
                }
                i3 = 0;
                f = 0.0f;
                Math.ceil(fMax);
                this.visibleChildCount = i6;
                f2 = fArr[i5];
            } else {
                i3 = 0;
                f = 0.0f;
            }
            int iDp = AndroidUtilities.dp(iArr[i5]);
            int childCount2 = getChildCount();
            float f4 = 0.0f;
            for (int i8 = 0; i8 < childCount2; i8++) {
                if (isViewVisible(getChildAt(i8))) {
                    f4 += this.tabsTextWidth[i8] + (iDp * 2);
                }
            }
            if (f4 <= paddingLeft || i5 == 2) {
                break;
            } else {
                i5++;
            }
        }
        float f5 = fArr[i5];
        int childCount3 = getChildCount();
        for (int i9 = 0; i9 < childCount3; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2 instanceof Tab) {
                ((GlassTabView) ((Tab) childAt2)).setTextSizeDp(f5);
            }
        }
        int iDp2 = AndroidUtilities.dp(iArr[i5]) * 2;
        int iMax = (paddingLeft / Math.max(1, this.visibleChildCount)) - iDp2;
        int childCount4 = getChildCount();
        int i10 = 0;
        float f6 = 0.0f;
        for (int i11 = 0; i11 < childCount4; i11++) {
            if (isViewVisible(getChildAt(i11))) {
                float[] fArr3 = this.tabsTextWidthWithMargin;
                float f7 = this.tabsTextWidth[i11] + iDp2;
                fArr3[i11] = f7;
                int[] iArr2 = this.tabsWeight;
                int i12 = f7 > ((float) (iMax + iDp2)) ? 0 : 1;
                iArr2[i11] = i12;
                f6 += f7;
                i10 += i12;
            } else {
                float[] fArr4 = this.tabsTextWidth;
                this.tabsTextWidthWithMargin[i11] = f;
                fArr4[i11] = f;
                this.tabsWeight[i11] = i3;
            }
        }
        if (i10 == 0) {
            int childCount5 = getChildCount();
            for (int i13 = 0; i13 < childCount5; i13++) {
                this.tabsWeight[i13] = isViewVisible(getChildAt(i13)) ? 1 : 0;
            }
            i10 = this.visibleChildCount;
        }
        float f8 = paddingLeft;
        if (f6 > f8) {
            float f9 = f8 / f6;
            int childCount6 = getChildCount();
            for (int i14 = 0; i14 < childCount6; i14++) {
                float[] fArr5 = this.tabsTextWidthWithMargin;
                fArr5[i14] = fArr5[i14] * f9;
            }
        } else {
            float f10 = iMin;
            if (f6 < f10) {
                float f11 = (f10 - f6) / i10;
                int childCount7 = getChildCount();
                for (int i15 = 0; i15 < childCount7; i15++) {
                    float[] fArr6 = this.tabsTextWidthWithMargin;
                    fArr6[i15] = (this.tabsWeight[i15] * f11) + fArr6[i15];
                }
            }
        }
        int childCount8 = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount8; i17++) {
            if (isViewVisible(getChildAt(i17))) {
                this.tabsWidth[i17] = Math.round(this.tabsTextWidthWithMargin[i17]);
                this.tabsLeftPos[i17] = i16;
                i16 += this.tabsWidth[i17];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i16, size2);
        int childCount9 = getChildCount();
        for (int i18 = 0; i18 < childCount9; i18++) {
            getChildAt(i18).measure(View.MeasureSpec.makeMeasureSpec(this.tabsWidth[i18], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        calculateTotalSizesAfterMeasure();
    }

    @Override
    public final void setChildVisibilityFactor(View view, float f) {
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
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    @Override
    public void setScaleY(float f) {
        super.setScaleY(f);
        int i = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }
}
