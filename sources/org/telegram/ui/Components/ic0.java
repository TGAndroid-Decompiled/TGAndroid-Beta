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
public final class ic0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f35986a;
    public final int f35987b;
    public final Runnable f35988c;
    public final oc0 d;

    public ic0(oc0 oc0Var, int i7, int i10, Runnable runnable) {
        this.d = oc0Var;
        this.f35986a = i7;
        this.f35987b = i10;
        this.f35988c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int L;
        float f11;
        bi.v2 v2Var;
        int i7;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        long j3;
        oc0 oc0Var = this.d;
        bi.v2 v2Var2 = oc0Var.f38114e;
        ArrayList arrayList = oc0Var.f38108a0;
        int[] iArr = oc0Var.f38120i0;
        qh0 qh0Var = oc0Var.N;
        oc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!oc0Var.Q && oc0Var.isAttachedToWindow()) {
            oc0Var.setAlpha(1.0f);
            qh0Var.getAnimatedDrawable().N(0, false, false);
            qh0Var.getAnimatedDrawable().P(37);
            qh0Var.d();
            oc0Var.o(true);
            org.telegram.messenger.g0.h3(new eb0(this, 3), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            oc0Var.R = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = org.telegram.messenger.g0.f24226q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f24220m;
            int i12 = this.f35986a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f35987b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            double sqrt = Math.sqrt(i17 + i14);
            int i18 = i12 * i12;
            int i19 = 1;
            double sqrt2 = Math.sqrt(i17 + i18);
            int i20 = i15 * i15;
            final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i20 + i18)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = v2Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = v2Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[i19]);
                obj.f36702b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
                if (i21 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    v2Var = v2Var2;
                    int i22 = i19;
                    float[] fArr = new float[i22];
                    fArr[0] = 1.0f;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, property, fArr);
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[i22];
                    fArr2[0] = 1.0f;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, property2, fArr2);
                    Animator[] animatorArr = new Animator[2];
                    animatorArr[0] = ofFloat;
                    animatorArr[i22] = ofFloat2;
                    animatorSet.playTogether(animatorArr);
                    i7 = i10;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    v2Var = v2Var2;
                    i7 = i10;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f36701a = animatorSet3;
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
                int i23 = i7;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, property3, f12, f13);
                Property property4 = View.SCALE_Y;
                if (i21 != -1) {
                    f14 = 0.6f;
                }
                if (i21 == -1) {
                    f15 = 1.0f;
                }
                animatorSet3.playTogether(ofFloat3, ObjectAnimator.ofFloat(childAt, property4, f14, f15), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
                obj.f36701a.addListener(new p60(animatorSet, 7));
                AnimatorSet animatorSet4 = obj.f36701a;
                if (i21 == -1) {
                    j3 = 232;
                } else {
                    j3 = 200;
                }
                animatorSet4.setDuration(j3);
                obj.f36701a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                v2Var2 = v2Var;
                i10 = i23;
                i19 = 1;
            }
            int i24 = i10;
            arrayList2.add(ObjectAnimator.ofFloat(oc0Var.f38124w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat4);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    oc0 oc0Var2 = ic0.this.d;
                    double animatedFraction = max * valueAnimator.getAnimatedFraction();
                    int i25 = 0;
                    while (true) {
                        ArrayList arrayList3 = oc0Var2.f38108a0;
                        if (i25 < arrayList3.size()) {
                            kc0 kc0Var = (kc0) arrayList3.get(i25);
                            if (kc0Var.f36702b <= animatedFraction) {
                                kc0Var.f36701a.start();
                                arrayList3.remove(i25);
                                i25--;
                            }
                            i25++;
                        } else {
                            return;
                        }
                    }
                }
            });
            kr krVar = kr.h;
            animatorSet2.setInterpolator(krVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(oc0Var.f38110b0, 1.0f);
            ofFloat5.addUpdateListener(new e60(this, 4));
            ofFloat5.addListener(new hc0(this, 0));
            ofFloat5.setDuration(420L);
            ofFloat5.setInterpolator(krVar);
            arrayList2.add(ofFloat5);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new hc0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            oc0Var.S = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!org.telegram.messenger.g0.Q1() && oc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (org.telegram.messenger.bz.f23316r == 0) {
                    f11 = i24 / 2.0f;
                } else {
                    f11 = i24;
                }
                f10 = f11 / 2.0f;
                L = org.telegram.messenger.g0.L(30.0f);
            } else {
                f10 = i24 / 2.0f;
                L = org.telegram.messenger.g0.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(qh0Var, View.TRANSLATION_X, i12 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(qh0Var, View.TRANSLATION_Y, i15 - org.telegram.messenger.g0.L(29.0f), oc0Var.M), ObjectAnimator.ofFloat(qh0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(qh0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(kr.f36859g);
            animatorSet5.start();
        }
    }
}
