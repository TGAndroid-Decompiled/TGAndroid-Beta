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
public final class pd0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f27825a;
    public final int f27826b;
    public final Runnable f27827c;
    public final vd0 d;

    public pd0(vd0 vd0Var, int i10, int i11, Runnable runnable) {
        this.d = vd0Var;
        this.f27825a = i10;
        this.f27826b = i11;
        this.f27827c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int dp;
        float f11;
        int[] iArr;
        sd0 sd0Var;
        int i10;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        long j10;
        vd0 vd0Var = this.d;
        int[] iArr2 = vd0Var.T;
        vd0Var.setAlpha(1.0f);
        vd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        jj0 jj0Var = vd0Var.F;
        jj0Var.getAnimatedDrawable().L(0, false, false);
        jj0Var.getAnimatedDrawable().N(37);
        jj0Var.d();
        vd0Var.m(true);
        AndroidUtilities.runOnUIThread(new cc0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        int i12 = point.y + AndroidUtilities.statusBarHeight;
        int i13 = this.f27825a;
        int i14 = i11 - i13;
        int i15 = i14 * i14;
        int i16 = this.f27826b;
        int i17 = i12 - i16;
        int i18 = i17 * i17;
        double sqrt = Math.sqrt(i18 + i15);
        int i19 = i13 * i13;
        double sqrt2 = Math.sqrt(i18 + i19);
        int i20 = i16 * i16;
        char c3 = 0;
        final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i19 + i20)), Math.sqrt(i20 + i15));
        ArrayList arrayList2 = vd0Var.L;
        arrayList2.clear();
        dh.d dVar = vd0Var.e;
        int childCount = dVar.getChildCount();
        int i21 = 0;
        while (i21 < childCount) {
            View childAt = dVar.getChildAt(i21);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ?? obj = new Object();
            childAt.getLocationInWindow(iArr2);
            int measuredWidth = i13 - ((childAt.getMeasuredWidth() / 2) + iArr2[c3]);
            int measuredHeight = i16 - ((childAt.getMeasuredHeight() / 2) + iArr2[1]);
            int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            int i23 = i11;
            obj.f28689b = ((float) Math.sqrt(i22)) - AndroidUtilities.dp(40.0f);
            if (i21 != -1) {
                animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                iArr = iArr2;
                float[] fArr = new float[1];
                fArr[c3] = 1.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr);
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[1];
                fArr2[c3] = 1.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, property2, fArr2);
                Animator[] animatorArr = new Animator[2];
                animatorArr[c3] = ofFloat;
                animatorArr[1] = ofFloat2;
                sd0Var = obj;
                animatorSet.playTogether(animatorArr);
                i10 = i16;
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                iArr = iArr2;
                sd0Var = obj;
                i10 = i16;
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            sd0Var.f28688a = animatorSet3;
            Property property3 = View.SCALE_X;
            float f14 = 0.9f;
            if (i21 == -1) {
                f12 = 0.9f;
            } else {
                f12 = 0.6f;
            }
            float f15 = 1.04f;
            if (i21 == -1) {
                f13 = 1.0f;
            } else {
                f13 = 1.04f;
            }
            dh.d dVar2 = dVar;
            float[] fArr3 = new float[2];
            fArr3[c3] = f12;
            fArr3[1] = f13;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, property3, fArr3);
            Property property4 = View.SCALE_Y;
            if (i21 != -1) {
                f14 = 0.6f;
            }
            if (i21 == -1) {
                f15 = 1.0f;
            }
            float[] fArr4 = new float[2];
            fArr4[c3] = f14;
            fArr4[1] = f15;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(childAt, property4, fArr4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
            Animator[] animatorArr2 = new Animator[3];
            animatorArr2[c3] = ofFloat3;
            animatorArr2[1] = ofFloat4;
            animatorArr2[2] = ofFloat5;
            animatorSet3.playTogether(animatorArr2);
            sd0Var.f28688a.addListener(new nd0(animatorSet, 0));
            AnimatorSet animatorSet4 = sd0Var.f28688a;
            if (i21 == -1) {
                j10 = 232;
            } else {
                j10 = 200;
            }
            animatorSet4.setDuration(j10);
            sd0Var.f28688a.setInterpolator(new DecelerateInterpolator());
            arrayList2.add(sd0Var);
            i21++;
            i16 = i10;
            iArr2 = iArr;
            i11 = i23;
            dVar = dVar2;
            c3 = 0;
        }
        int i24 = i11;
        int i25 = i16;
        arrayList.add(ObjectAnimator.ofFloat(vd0Var.v, View.ALPHA, 0.0f, 1.0f));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(ofFloat6);
        ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                vd0 vd0Var2 = pd0.this.d;
                double animatedFraction = max * valueAnimator.getAnimatedFraction();
                int i26 = 0;
                while (true) {
                    ArrayList arrayList3 = vd0Var2.L;
                    if (i26 < arrayList3.size()) {
                        sd0 sd0Var2 = (sd0) arrayList3.get(i26);
                        if (sd0Var2.f28689b <= animatedFraction) {
                            sd0Var2.f28688a.start();
                            arrayList3.remove(i26);
                            i26--;
                        }
                        i26++;
                    } else {
                        return;
                    }
                }
            }
        });
        nr nrVar = nr.h;
        animatorSet2.setInterpolator(nrVar);
        animatorSet2.setDuration(500L);
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(vd0Var.M, 1.0f);
        ofFloat7.addUpdateListener(new i70(this, 2));
        ofFloat7.addListener(new od0(this, 0));
        ofFloat7.setDuration(420L);
        ofFloat7.setInterpolator(nrVar);
        arrayList.add(ofFloat7);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new od0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setDuration(332L);
        if (!AndroidUtilities.isTablet() && vd0Var.getContext().getResources().getConfiguration().orientation == 2) {
            if (SharedConfig.passcodeType == 0) {
                f11 = i24 / 2.0f;
            } else {
                f11 = i24;
            }
            f10 = f11 / 2.0f;
            dp = AndroidUtilities.dp(30.0f);
        } else {
            f10 = i24 / 2.0f;
            dp = AndroidUtilities.dp(29.0f);
        }
        animatorSet5.playTogether(ObjectAnimator.ofFloat(jj0Var, View.TRANSLATION_X, i13 - AndroidUtilities.dp(29.0f), f10 - dp), ObjectAnimator.ofFloat(jj0Var, View.TRANSLATION_Y, i25 - AndroidUtilities.dp(29.0f), vd0Var.E), ObjectAnimator.ofFloat(jj0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(jj0Var, View.SCALE_Y, 0.5f, 1.0f));
        animatorSet5.setInterpolator(nr.f27347g);
        animatorSet5.start();
    }
}
