package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class oe0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f29472a;
    public final int f29473b;
    public final Runnable f29474c;
    public final te0 d;

    public oe0(te0 te0Var, int i10, int i11, Runnable runnable) {
        this.d = te0Var;
        this.f29472a = i10;
        this.f29473b = i11;
        this.f29474c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f7;
        int dp;
        float f10;
        ai.x5 x5Var;
        fk0 fk0Var;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        long j3;
        te0 te0Var = this.d;
        ai.x5 x5Var2 = te0Var.f31165e;
        ArrayList arrayList = te0Var.S;
        int[] iArr = te0Var.f31164d0;
        fk0 fk0Var2 = te0Var.I;
        te0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!te0Var.L && te0Var.isAttachedToWindow()) {
            te0Var.setAlpha(1.0f);
            fk0Var2.getAnimatedDrawable().N(0, false, false);
            fk0Var2.getAnimatedDrawable().P(37);
            fk0Var2.d();
            te0Var.n(true);
            AndroidUtilities.runOnUIThread(new bd0(this, 4), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            te0Var.M = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight;
            int i12 = this.f29472a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f29473b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            double sqrt = Math.sqrt(i17 + i14);
            int i18 = i12 * i12;
            int i19 = 1;
            double sqrt2 = Math.sqrt(i17 + i18);
            int i20 = i15 * i15;
            fk0 fk0Var3 = fk0Var2;
            final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i18 + i20)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = x5Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = x5Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[i19]);
                int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
                ArrayList arrayList3 = arrayList2;
                obj.f30151b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
                if (i21 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    x5Var = x5Var2;
                    int i23 = i19;
                    float[] fArr = new float[i23];
                    fArr[0] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr);
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[i23];
                    fArr2[0] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, property2, fArr2);
                    Animator[] animatorArr = new Animator[2];
                    animatorArr[0] = ofFloat;
                    animatorArr[i23] = ofFloat2;
                    animatorSet.playTogether(animatorArr);
                    fk0Var = fk0Var3;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    x5Var = x5Var2;
                    fk0Var = fk0Var3;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f30150a = animatorSet3;
                Property property3 = View.SCALE_X;
                float f13 = 0.9f;
                if (i21 == -1) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.6f;
                }
                float f14 = 1.04f;
                if (i21 == -1) {
                    f12 = 1.0f;
                } else {
                    f12 = 1.04f;
                }
                fk0 fk0Var4 = fk0Var;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, property3, f11, f12);
                Property property4 = View.SCALE_Y;
                if (i21 != -1) {
                    f13 = 0.6f;
                }
                if (i21 == -1) {
                    f14 = 1.0f;
                }
                animatorSet3.playTogether(ofFloat3, ObjectAnimator.ofFloat(childAt, property4, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
                obj.f30150a.addListener(new vd0(animatorSet, 2));
                AnimatorSet animatorSet4 = obj.f30150a;
                if (i21 == -1) {
                    j3 = 232;
                } else {
                    j3 = 200;
                }
                animatorSet4.setDuration(j3);
                obj.f30150a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                arrayList2 = arrayList3;
                x5Var2 = x5Var;
                fk0Var3 = fk0Var4;
                i19 = 1;
            }
            ArrayList arrayList4 = arrayList2;
            fk0 fk0Var5 = fk0Var3;
            arrayList4.add(ObjectAnimator.ofFloat(te0Var.v, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList4.add(ofFloat4);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    te0 te0Var2 = oe0.this.d;
                    double animatedFraction = max * valueAnimator.getAnimatedFraction();
                    int i24 = 0;
                    while (true) {
                        ArrayList arrayList5 = te0Var2.S;
                        if (i24 < arrayList5.size()) {
                            qe0 qe0Var = (qe0) arrayList5.get(i24);
                            if (qe0Var.f30151b <= animatedFraction) {
                                qe0Var.f30150a.start();
                                arrayList5.remove(i24);
                                i24--;
                            }
                            i24++;
                        } else {
                            return;
                        }
                    }
                }
            });
            hs hsVar = hs.h;
            animatorSet2.setInterpolator(hsVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(te0Var.T, 1.0f);
            ofFloat5.addUpdateListener(new j80(this, 3));
            ofFloat5.addListener(new ne0(this, 0));
            ofFloat5.setDuration(420L);
            ofFloat5.setInterpolator(hsVar);
            arrayList4.add(ofFloat5);
            animatorSet2.playTogether(arrayList4);
            animatorSet2.addListener(new ne0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            te0Var.N = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!AndroidUtilities.isTablet() && te0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (SharedConfig.passcodeType == 0) {
                    f10 = i10 / 2.0f;
                } else {
                    f10 = i10;
                }
                f7 = f10 / 2.0f;
                dp = AndroidUtilities.dp(30.0f);
            } else {
                f7 = i10 / 2.0f;
                dp = AndroidUtilities.dp(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(fk0Var5, View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(fk0Var5, View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), te0Var.H), ObjectAnimator.ofFloat(fk0Var5, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(fk0Var5, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(hs.f27119g);
            animatorSet5.start();
        }
    }
}
