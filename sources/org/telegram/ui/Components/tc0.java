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
public final class tc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f32680a;
    public final int f32681b;
    public final Runnable f32682c;
    public final yc0 d;

    public tc0(yc0 yc0Var, int i9, int i10, Runnable runnable) {
        this.d = yc0Var;
        this.f32680a = i9;
        this.f32681b = i10;
        this.f32682c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int dp;
        float f11;
        int[] iArr;
        dh.g gVar;
        int i9;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        long j10;
        yc0 yc0Var = this.d;
        int[] iArr2 = yc0Var.S;
        yc0Var.setAlpha(1.0f);
        yc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pi0 pi0Var = yc0Var.E;
        pi0Var.getAnimatedDrawable().L(0, false, false);
        pi0Var.getAnimatedDrawable().N(37);
        pi0Var.d();
        char c10 = 1;
        yc0Var.m(true);
        AndroidUtilities.runOnUIThread(new ib0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y + AndroidUtilities.statusBarHeight;
        int i12 = this.f32680a;
        int i13 = i10 - i12;
        int i14 = i13 * i13;
        int i15 = this.f32681b;
        int i16 = i11 - i15;
        int i17 = i16 * i16;
        double sqrt = Math.sqrt(i17 + i14);
        int i18 = i12 * i12;
        double sqrt2 = Math.sqrt(i17 + i18);
        int i19 = i15 * i15;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i18 + i19)), Math.sqrt(i19 + i14));
        ArrayList arrayList2 = yc0Var.K;
        arrayList2.clear();
        dh.g gVar2 = yc0Var.f34943e;
        int childCount = gVar2.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt = gVar2.getChildAt(i20);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ?? obj = new Object();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
            int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr2[c10]);
            int i21 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            obj.f33346b = ((float) Math.sqrt(i21)) - AndroidUtilities.dp(40.0f);
            if (i20 != -1) {
                animatorSet = new AnimatorSet();
                iArr = iArr2;
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, View.SCALE_Y, 1.0f));
                gVar = gVar2;
                i9 = childCount;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                gVar = gVar2;
                i9 = childCount;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            obj.f33345a = animatorSet3;
            Property property = View.SCALE_X;
            float f14 = 0.9f;
            if (i20 == -1) {
                f12 = 0.9f;
            } else {
                f12 = 0.6f;
            }
            float f15 = 1.04f;
            if (i20 == -1) {
                f13 = 1.0f;
            } else {
                f13 = 1.04f;
            }
            dh.g gVar3 = gVar;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, f12, f13);
            Property property2 = View.SCALE_Y;
            if (i20 != -1) {
                f14 = 0.6f;
            }
            if (i20 == -1) {
                f15 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(childAt, property2, f14, f15), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
            obj.f33345a.addListener(new r60(animatorSet, 7));
            AnimatorSet animatorSet4 = obj.f33345a;
            if (i20 == -1) {
                j10 = 232;
            } else {
                j10 = 200;
            }
            animatorSet4.setDuration(j10);
            obj.f33345a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(obj);
            i20++;
            arrayList2 = arrayList3;
            childCount = i9;
            iArr2 = iArr;
            gVar2 = gVar3;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(yc0Var.v, View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat2);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yc0 yc0Var2 = tc0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i22 = 0;
                while (true) {
                    ArrayList arrayList4 = yc0Var2.K;
                    if (i22 < arrayList4.size()) {
                        vc0 vc0Var = (vc0) arrayList4.get(i22);
                        if (vc0Var.f33346b <= animatedFraction) {
                            vc0Var.f33345a.start();
                            arrayList4.remove(i22);
                            i22--;
                        }
                        i22++;
                    } else {
                        return;
                    }
                }
            }
        });
        gr grVar = gr.h;
        animatorSet2.setInterpolator(grVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(yc0Var.L, 1.0f);
        ofFloat3.addUpdateListener(new q60(this, 2));
        ofFloat3.addListener(new sc0(this, 0));
        ofFloat3.setDuration(420L);
        ofFloat3.setInterpolator(grVar);
        arrayList.add(ofFloat3);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new sc0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(332L);
        if (!AndroidUtilities.isTablet() && yc0Var.getContext().getResources().getConfiguration().orientation == 2) {
            if (SharedConfig.passcodeType == 0) {
                f11 = i10 / 2.0f;
            } else {
                f11 = i10;
            }
            f10 = f11 / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        } else {
            f10 = i10 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        }
        animatorSet5.playTogether(ObjectAnimator.ofFloat(pi0Var, View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(pi0Var, View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), yc0Var.D), ObjectAnimator.ofFloat(pi0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(pi0Var, View.SCALE_Y, 0.5f, 1.0f));
        animatorSet5.setInterpolator(gr.f28845g);
        animatorSet5.start();
    }
}
