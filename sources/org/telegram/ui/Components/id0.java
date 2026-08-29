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
public final class id0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f29376a;
    public final int f29377b;
    public final Runnable f29378c;
    public final nd0 d;

    public id0(nd0 nd0Var, int i10, int i11, Runnable runnable) {
        this.d = nd0Var;
        this.f29376a = i10;
        this.f29377b = i11;
        this.f29378c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f9;
        int dp;
        float f10;
        int[] iArr;
        bh.d dVar;
        int i10;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        long j10;
        nd0 nd0Var = this.d;
        int[] iArr2 = nd0Var.S;
        nd0Var.setAlpha(1.0f);
        nd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        aj0 aj0Var = nd0Var.E;
        aj0Var.getAnimatedDrawable().L(0, false, false);
        aj0Var.getAnimatedDrawable().N(37);
        aj0Var.d();
        char c3 = 1;
        nd0Var.m(true);
        AndroidUtilities.runOnUIThread(new xb0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        int i12 = point.y + AndroidUtilities.statusBarHeight;
        int i13 = this.f29376a;
        int i14 = i11 - i13;
        int i15 = i14 * i14;
        int i16 = this.f29377b;
        int i17 = i12 - i16;
        int i18 = i17 * i17;
        double sqrt = Math.sqrt(i18 + i15);
        int i19 = i13 * i13;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i20 = i16 * i16;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i20)), Math.sqrt(i20 + i15));
        ArrayList arrayList2 = nd0Var.K;
        arrayList2.clear();
        bh.d dVar2 = nd0Var.f30963e;
        int childCount = dVar2.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar2.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ?? obj = new Object();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[c3]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            obj.f30020b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, View.SCALE_Y, 1.0f));
                dVar = dVar2;
                i10 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                dVar = dVar2;
                i10 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            obj.f30019a = animatorSet3;
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
            bh.d dVar3 = dVar;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, f11, f12);
            Property property2 = View.SCALE_Y;
            if (i21 != -1) {
                f13 = 0.6f;
            }
            if (i21 == -1) {
                f14 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(childAt, property2, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
            obj.f30019a.addListener(new zz(animatorSet, 9));
            AnimatorSet animatorSet4 = obj.f30019a;
            if (i21 == -1) {
                j10 = 232;
            } else {
                j10 = 200;
            }
            animatorSet4.setDuration(j10);
            obj.f30019a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(obj);
            i21++;
            arrayList2 = arrayList3;
            childCount = i10;
            iArr2 = iArr;
            dVar2 = dVar3;
            c3 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(nd0Var.v, View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nd0 nd0Var2 = id0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i23 = 0;
                while (true) {
                    ArrayList arrayList4 = nd0Var2.K;
                    if (i23 < arrayList4.size()) {
                        kd0 kd0Var = (kd0) arrayList4.get(i23);
                        if (kd0Var.f30020b <= animatedFraction) {
                            kd0Var.f30019a.start();
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
        jr jrVar = jr.h;
        animatorSet2.setInterpolator(jrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nd0Var.L, 1.0f);
        ofFloat3.addUpdateListener(new d70(this, 2));
        ofFloat3.addListener(new hd0(this, 0));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(jrVar);
        arrayList.add(ofFloat3);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new hd0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(332L);
        if (!AndroidUtilities.isTablet() && nd0Var.getContext().getResources().getConfiguration().orientation == 2) {
            if (SharedConfig.passcodeType == 0) {
                f10 = i11 / 2.0f;
            } else {
                f10 = i11;
            }
            f9 = f10 / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        } else {
            f9 = i11 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        }
        animatorSet5.playTogether(ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f9 - dp), ObjectAnimator.ofFloat(aj0Var, View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), nd0Var.D), ObjectAnimator.ofFloat(aj0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(aj0Var, View.SCALE_Y, 0.5f, 1.0f));
        animatorSet5.setInterpolator(jr.f29801g);
        animatorSet5.start();
    }
}
