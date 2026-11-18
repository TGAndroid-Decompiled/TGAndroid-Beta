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
public final class jc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f36404a;
    public final int f36405b;
    public final Runnable f36406c;
    public final pc0 d;

    public jc0(pc0 pc0Var, int i7, int i10, Runnable runnable) {
        this.d = pc0Var;
        this.f36404a = i7;
        this.f36405b = i10;
        this.f36406c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int L;
        float f11;
        bi.p2 p2Var;
        int i7;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        long j3;
        pc0 pc0Var = this.d;
        bi.p2 p2Var2 = pc0Var.f38367e;
        ArrayList arrayList = pc0Var.f38361a0;
        int[] iArr = pc0Var.f38373i0;
        ph0 ph0Var = pc0Var.N;
        pc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!pc0Var.Q && pc0Var.isAttachedToWindow()) {
            pc0Var.setAlpha(1.0f);
            ph0Var.getAnimatedDrawable().N(0, false, false);
            ph0Var.getAnimatedDrawable().P(37);
            ph0Var.d();
            pc0Var.o(true);
            org.telegram.messenger.g0.h3(new gb0(this, 3), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            pc0Var.R = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = org.telegram.messenger.g0.f24121q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.g0.f24115m;
            int i12 = this.f36404a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f36405b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            double sqrt = Math.sqrt(i17 + i14);
            int i18 = i12 * i12;
            int i19 = 1;
            double sqrt2 = Math.sqrt(i17 + i18);
            int i20 = i15 * i15;
            final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i20 + i18)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = p2Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = p2Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[i19]);
                obj.f37095b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
                if (i21 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    p2Var = p2Var2;
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
                    p2Var = p2Var2;
                    i7 = i10;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f37094a = animatorSet3;
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
                obj.f37094a.addListener(new q60(animatorSet, 7));
                AnimatorSet animatorSet4 = obj.f37094a;
                if (i21 == -1) {
                    j3 = 232;
                } else {
                    j3 = 200;
                }
                animatorSet4.setDuration(j3);
                obj.f37094a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                p2Var2 = p2Var;
                i10 = i23;
                i19 = 1;
            }
            int i24 = i10;
            arrayList2.add(ObjectAnimator.ofFloat(pc0Var.f38377w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat4);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    pc0 pc0Var2 = jc0.this.d;
                    double animatedFraction = max * valueAnimator.getAnimatedFraction();
                    int i25 = 0;
                    while (true) {
                        ArrayList arrayList3 = pc0Var2.f38361a0;
                        if (i25 < arrayList3.size()) {
                            lc0 lc0Var = (lc0) arrayList3.get(i25);
                            if (lc0Var.f37095b <= animatedFraction) {
                                lc0Var.f37094a.start();
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
            lr lrVar = lr.h;
            animatorSet2.setInterpolator(lrVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(pc0Var.f38363b0, 1.0f);
            ofFloat5.addUpdateListener(new e60(this, 4));
            ofFloat5.addListener(new ic0(this, 0));
            ofFloat5.setDuration(420L);
            ofFloat5.setInterpolator(lrVar);
            arrayList2.add(ofFloat5);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new ic0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            pc0Var.S = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!org.telegram.messenger.g0.Q1() && pc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (org.telegram.messenger.bz.f23194r == 0) {
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
            animatorSet5.playTogether(ObjectAnimator.ofFloat(ph0Var, View.TRANSLATION_X, i12 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(ph0Var, View.TRANSLATION_Y, i15 - org.telegram.messenger.g0.L(29.0f), pc0Var.M), ObjectAnimator.ofFloat(ph0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ph0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(lr.f37209g);
            animatorSet5.start();
        }
    }
}
