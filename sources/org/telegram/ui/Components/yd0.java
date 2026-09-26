package org.telegram.ui.Components;

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
public final class yd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f30628a;
    public final int f30629b;
    public final Runnable f30630c;
    public final de0 d;

    public yd0(de0 de0Var, int i10, int i11, Runnable runnable) {
        this.d = de0Var;
        this.f30628a = i10;
        this.f30629b = i11;
        this.f30630c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        int i10;
        float f7;
        int dp;
        float f10;
        int[] iArr;
        ai.w5 w5Var;
        int i11;
        int i12;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        long j3;
        de0 de0Var = this.d;
        int[] iArr2 = de0Var.W;
        de0Var.setAlpha(1.0f);
        de0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        mj0 mj0Var = de0Var.I;
        mj0Var.getAnimatedDrawable().N(0, false, false);
        mj0Var.getAnimatedDrawable().P(37);
        mj0Var.d();
        de0Var.m(true);
        AndroidUtilities.runOnUIThread(new jc0(this, 5), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i13 = point.x;
        int i14 = point.y + AndroidUtilities.statusBarHeight;
        int i15 = this.f30628a;
        int i16 = i13 - i15;
        int i17 = i16 * i16;
        int i18 = this.f30629b;
        int i19 = i14 - i18;
        int i20 = i19 * i19;
        double sqrt = Math.sqrt(i20 + i17);
        double sqrt2 = Math.sqrt(i20 + i10);
        int i21 = i18 * i18;
        int i22 = i21 + (i15 * i15);
        char c10 = 1;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i22)), Math.sqrt(i21 + i17));
        ArrayList arrayList2 = de0Var.O;
        arrayList2.clear();
        ai.w5 w5Var2 = de0Var.e;
        int childCount = w5Var2.getChildCount();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = w5Var2.getChildAt(i23);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ?? obj = new Object();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i15 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i18 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i24 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i25 = i18;
            obj.f22624b = ((float) Math.sqrt(i24)) - AndroidUtilities.dp(40.0f);
            if (i23 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                w5Var = w5Var2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, View.SCALE_Y, 1.0f));
                i11 = childCount;
                i12 = i13;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                w5Var = w5Var2;
                i11 = childCount;
                i12 = i13;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            obj.f22623a = animatorSet3;
            Property property = View.SCALE_X;
            float f13 = 0.9f;
            if (i23 == -1) {
                f11 = 0.9f;
            } else {
                f11 = 0.6f;
            }
            float f14 = 1.04f;
            if (i23 == -1) {
                f12 = 1.0f;
            } else {
                f12 = 1.04f;
            }
            int i26 = i12;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, f11, f12);
            Property property2 = View.SCALE_Y;
            if (i23 != -1) {
                f13 = 0.6f;
            }
            if (i23 == -1) {
                f14 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(childAt, property2, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
            obj.f22623a.addListener(new gd0(animatorSet, 2));
            AnimatorSet animatorSet4 = obj.f22623a;
            if (i23 == -1) {
                j3 = 232;
            } else {
                j3 = 200;
            }
            animatorSet4.setDuration(j3);
            obj.f22623a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(obj);
            i23++;
            childCount = i11;
            i18 = i25;
            iArr2 = iArr;
            w5Var2 = w5Var;
            i13 = i26;
            c10 = 1;
        }
        int i27 = i13;
        int i28 = i18;
        arrayList.add(ObjectAnimator.ofFloat(de0Var.v, View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                de0 de0Var2 = yd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i29 = 0;
                while (true) {
                    ArrayList arrayList3 = de0Var2.O;
                    if (i29 < arrayList3.size()) {
                        ae0 ae0Var = (ae0) arrayList3.get(i29);
                        if (ae0Var.f22624b <= animatedFraction) {
                            ae0Var.f22623a.start();
                            arrayList3.remove(i29);
                            i29--;
                        }
                        i29++;
                    } else {
                        return;
                    }
                }
            }
        });
        sr srVar = sr.h;
        animatorSet2.setInterpolator(srVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(de0Var.P, 1.0f);
        ofFloat3.addUpdateListener(new t70(this, 2));
        ofFloat3.addListener(new xd0(this, 0));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(srVar);
        arrayList.add(ofFloat3);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new xd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(332L);
        if (!AndroidUtilities.isTablet() && de0Var.getContext().getResources().getConfiguration().orientation == 2) {
            if (SharedConfig.passcodeType == 0) {
                f10 = i27 / 2.0f;
            } else {
                f10 = i27;
            }
            f7 = f10 / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        } else {
            f7 = i27 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        }
        animatorSet5.playTogether(ObjectAnimator.ofFloat(mj0Var, View.TRANSLATION_X, i15 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(mj0Var, View.TRANSLATION_Y, i28 - AndroidUtilities.dp(29.0f), de0Var.H), ObjectAnimator.ofFloat(mj0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(mj0Var, View.SCALE_Y, 0.5f, 1.0f));
        animatorSet5.setInterpolator(sr.f28340g);
        animatorSet5.start();
    }
}
