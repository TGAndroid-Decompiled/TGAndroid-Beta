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
public final class tb0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f38385a;
    public final int f38386b;
    public final Runnable f38387c;
    public final zb0 d;

    public tb0(zb0 zb0Var, int i3, int i10, Runnable runnable) {
        this.d = zb0Var;
        this.f38385a = i3;
        this.f38386b = i10;
        this.f38387c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int L;
        float f11;
        ai.d2 d2Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        float f14;
        long j10;
        zb0 zb0Var = this.d;
        ai.d2 d2Var2 = zb0Var.f41005e;
        ArrayList arrayList = zb0Var.f40999a0;
        int[] iArr2 = zb0Var.f41011i0;
        fh0 fh0Var = zb0Var.N;
        zb0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!zb0Var.Q && zb0Var.isAttachedToWindow()) {
            zb0Var.setAlpha(1.0f);
            fh0Var.getAnimatedDrawable().N(0, false, false);
            fh0Var.getAnimatedDrawable().P(37);
            fh0Var.d();
            zb0Var.o(true);
            org.telegram.messenger.g0.i3(new jb0(this, 1), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            zb0Var.R = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = org.telegram.messenger.g0.f22608q;
            int i3 = point.x;
            int i10 = point.y + org.telegram.messenger.g0.f22602m;
            int i11 = this.f38385a;
            int i12 = i3 - i11;
            int i13 = i12 * i12;
            int i14 = this.f38386b;
            int i15 = i10 - i14;
            int i16 = i15 * i15;
            int i17 = i11 * i11;
            int i18 = 1;
            int i19 = i14 * i14;
            double max = Math.max(Math.max(Math.max(Math.sqrt(i16 + i13), Math.sqrt(i16 + i17)), Math.sqrt(i17 + i19)), Math.sqrt(i19 + i13));
            arrayList.clear();
            int childCount = d2Var2.getChildCount();
            int i20 = 0;
            while (i20 < childCount) {
                View childAt = d2Var2.getChildAt(i20);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr2);
                int measuredWidth = i11 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
                int measuredHeight = i14 - ((childAt.getMeasuredHeight() / 2) + iArr2[i18]);
                obj.f39062b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
                if (i20 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    d2Var = d2Var2;
                    float[] fArr = new float[i18];
                    fArr[0] = 1.0f;
                    view = childAt;
                    iArr = iArr2;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, property, fArr), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                    d = max;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    d2Var = d2Var2;
                    iArr = iArr2;
                    d = max;
                    view = childAt;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f39061a = animatorSet3;
                Property property2 = View.SCALE_X;
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property2, f12, f13);
                Property property3 = View.SCALE_Y;
                if (i20 == -1) {
                    f14 = 0.9f;
                } else {
                    f14 = 0.6f;
                }
                if (i20 == -1) {
                    f15 = 1.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property3, f14, f15), ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
                obj.f39061a.addListener(new a60(animatorSet, 7));
                AnimatorSet animatorSet4 = obj.f39061a;
                if (i20 == -1) {
                    j10 = 232;
                } else {
                    j10 = 200;
                }
                animatorSet4.setDuration(j10);
                obj.f39061a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i20++;
                d2Var2 = d2Var;
                iArr2 = iArr;
                max = d;
                i18 = 1;
            }
            final double d10 = max;
            arrayList2.add(ObjectAnimator.ofFloat(zb0Var.f41015w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    zb0 zb0Var2 = tb0.this.d;
                    double animatedFraction = d10 * valueAnimator.getAnimatedFraction();
                    int i21 = 0;
                    while (true) {
                        ArrayList arrayList3 = zb0Var2.f40999a0;
                        if (i21 < arrayList3.size()) {
                            vb0 vb0Var = (vb0) arrayList3.get(i21);
                            if (vb0Var.f39062b <= animatedFraction) {
                                vb0Var.f39061a.start();
                                arrayList3.remove(i21);
                                i21--;
                            }
                            i21++;
                        } else {
                            return;
                        }
                    }
                }
            });
            xq xqVar = xq.h;
            animatorSet2.setInterpolator(xqVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(zb0Var.f41001b0, 1.0f);
            ofFloat3.addUpdateListener(new y50(this, 2));
            ofFloat3.addListener(new sb0(this, 0));
            ofFloat3.setDuration(420L);
            ofFloat3.setInterpolator(xqVar);
            arrayList2.add(ofFloat3);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new sb0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            zb0Var.S = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!org.telegram.messenger.g0.Q1() && zb0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (org.telegram.messenger.az.f21658r == 0) {
                    f11 = i3 / 2.0f;
                } else {
                    f11 = i3;
                }
                f10 = f11 / 2.0f;
                L = org.telegram.messenger.g0.L(30.0f);
            } else {
                f10 = i3 / 2.0f;
                L = org.telegram.messenger.g0.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(fh0Var, View.TRANSLATION_X, i11 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(fh0Var, View.TRANSLATION_Y, i14 - org.telegram.messenger.g0.L(29.0f), zb0Var.M), ObjectAnimator.ofFloat(fh0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(fh0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(xq.f40453g);
            animatorSet5.start();
        }
    }
}
