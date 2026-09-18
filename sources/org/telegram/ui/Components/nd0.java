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
public final class nd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f26445a;
    public final int f26446b;
    public final Runnable f26447c;
    public final sd0 d;

    public nd0(sd0 sd0Var, int i10, int i11, Runnable runnable) {
        this.d = sd0Var;
        this.f26445a = i10;
        this.f26446b = i11;
        this.f26447c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f7;
        int dp;
        float f10;
        int[] iArr;
        ai.x5 x5Var;
        int i10;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        long j3;
        sd0 sd0Var = this.d;
        int[] iArr2 = sd0Var.W;
        sd0Var.setAlpha(1.0f);
        sd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        bj0 bj0Var = sd0Var.I;
        bj0Var.getAnimatedDrawable().N(0, false, false);
        bj0Var.getAnimatedDrawable().P(37);
        bj0Var.d();
        char c10 = 1;
        sd0Var.m(true);
        AndroidUtilities.runOnUIThread(new bc0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        int i12 = point.y + AndroidUtilities.statusBarHeight;
        int i13 = this.f26445a;
        int i14 = i11 - i13;
        int i15 = i14 * i14;
        int i16 = this.f26446b;
        int i17 = i12 - i16;
        int i18 = i17 * i17;
        double sqrt = Math.sqrt(i18 + i15);
        int i19 = i13 * i13;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i20 = i16 * i16;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i20)), Math.sqrt(i20 + i15));
        ArrayList arrayList2 = sd0Var.O;
        arrayList2.clear();
        ai.x5 x5Var2 = sd0Var.e;
        int childCount = x5Var2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = x5Var2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ?? obj = new Object();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            obj.f27011b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, View.SCALE_Y, 1.0f));
                x5Var = x5Var2;
                i10 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                x5Var = x5Var2;
                i10 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            obj.f27010a = animatorSet3;
            Property property = View.SCALE_X;
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
            ai.x5 x5Var3 = x5Var;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, f11, f12);
            Property property2 = View.SCALE_Y;
            if (i21 != -1) {
                f13 = 0.6f;
            }
            if (i21 == -1) {
                f14 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(childAt, property2, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
            obj.f27010a.addListener(new jd0(animatorSet, 1));
            AnimatorSet animatorSet4 = obj.f27010a;
            if (i21 == -1) {
                j3 = 232;
            } else {
                j3 = 200;
            }
            animatorSet4.setDuration(j3);
            obj.f27010a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(obj);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            x5Var2 = x5Var3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(sd0Var.v, View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                sd0 sd0Var2 = nd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = sd0Var2.O;
                    if (i23 < arrayList4.size()) {
                        pd0 pd0Var = (pd0) arrayList4.get(i23);
                        if (pd0Var.f27011b <= animatedFraction) {
                            pd0Var.f27010a.start();
                            arrayList4.remove(i23);
                            i23--;
                        }
                        i23++;
                    } else {
                        return;
                    }
                }
            }
        });
        qr qrVar = qr.h;
        animatorSet2.setInterpolator(qrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(sd0Var.P, 1.0f);
        ofFloat3.addUpdateListener(new h70(this, 2));
        ofFloat3.addListener(new md0(this, 0));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(qrVar);
        arrayList.add(ofFloat3);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new md0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(332L);
        if (!AndroidUtilities.isTablet() && sd0Var.getContext().getResources().getConfiguration().orientation == 2) {
            if (SharedConfig.passcodeType == 0) {
                f10 = i11 / 2.0f;
            } else {
                f10 = i11;
            }
            f7 = f10 / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        } else {
            f7 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        }
        animatorSet5.playTogether(ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(bj0Var, View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), sd0Var.H), ObjectAnimator.ofFloat(bj0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(bj0Var, View.SCALE_Y, 0.5f, 1.0f));
        animatorSet5.setInterpolator(qr.f27384g);
        animatorSet5.start();
    }
}
