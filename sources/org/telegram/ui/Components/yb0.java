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
public final class yb0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f40642a;
    public final int f40643b;
    public final Runnable f40644c;
    public final ec0 d;

    public yb0(ec0 ec0Var, int i7, int i10, Runnable runnable) {
        this.d = ec0Var;
        this.f40642a = i7;
        this.f40643b = i10;
        this.f40644c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int L;
        float f11;
        di.a4 a4Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f12;
        float f13;
        float f14;
        long j3;
        ec0 ec0Var = this.d;
        di.a4 a4Var2 = ec0Var.f33251e;
        ArrayList arrayList = ec0Var.W;
        int[] iArr2 = ec0Var.f33256h0;
        ch0 ch0Var = ec0Var.M;
        ec0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!ec0Var.P && ec0Var.isAttachedToWindow()) {
            ec0Var.setAlpha(1.0f);
            ch0Var.getAnimatedDrawable().N(0, false, false);
            ch0Var.getAnimatedDrawable().P(37);
            ch0Var.d();
            ec0Var.o(true);
            org.telegram.messenger.g0.i3(new ob0(this, 1), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ec0Var.Q = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = org.telegram.messenger.g0.f22563q;
            int i7 = point.x;
            int i10 = point.y + org.telegram.messenger.g0.f22557m;
            int i11 = this.f40642a;
            int i12 = i7 - i11;
            int i13 = i12 * i12;
            int i14 = this.f40643b;
            int i15 = i10 - i14;
            int i16 = i15 * i15;
            int i17 = i11 * i11;
            int i18 = 1;
            int i19 = i14 * i14;
            double max = Math.max(Math.max(Math.max(Math.sqrt(i16 + i13), Math.sqrt(i16 + i17)), Math.sqrt(i17 + i19)), Math.sqrt(i19 + i13));
            arrayList.clear();
            int childCount = a4Var2.getChildCount();
            int i20 = 0;
            while (i20 < childCount) {
                View childAt = a4Var2.getChildAt(i20);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr2);
                int measuredWidth = i11 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
                int measuredHeight = i14 - ((childAt.getMeasuredHeight() / 2) + iArr2[i18]);
                obj.f31771b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - org.telegram.messenger.g0.L(40.0f);
                if (i20 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    a4Var = a4Var2;
                    float[] fArr = new float[i18];
                    fArr[0] = 1.0f;
                    view = childAt;
                    iArr = iArr2;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, property, fArr), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                    d = max;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    a4Var = a4Var2;
                    iArr = iArr2;
                    d = max;
                    view = childAt;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f31770a = animatorSet3;
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
                obj.f31770a.addListener(new e60(animatorSet, 7));
                AnimatorSet animatorSet4 = obj.f31770a;
                if (i20 == -1) {
                    j3 = 232;
                } else {
                    j3 = 200;
                }
                animatorSet4.setDuration(j3);
                obj.f31770a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i20++;
                a4Var2 = a4Var;
                iArr2 = iArr;
                max = d;
                i18 = 1;
            }
            final double d2 = max;
            arrayList2.add(ObjectAnimator.ofFloat(ec0Var.f33260w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ec0 ec0Var2 = yb0.this.d;
                    double animatedFraction = d2 * valueAnimator.getAnimatedFraction();
                    int i21 = 0;
                    while (true) {
                        ArrayList arrayList3 = ec0Var2.W;
                        if (i21 < arrayList3.size()) {
                            ac0 ac0Var = (ac0) arrayList3.get(i21);
                            if (ac0Var.f31771b <= animatedFraction) {
                                ac0Var.f31770a.start();
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
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(ec0Var.f33245a0, 1.0f);
            ofFloat3.addUpdateListener(new c60(this, 2));
            ofFloat3.addListener(new xb0(this, 0));
            ofFloat3.setDuration(420L);
            ofFloat3.setInterpolator(xqVar);
            arrayList2.add(ofFloat3);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new xb0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            ec0Var.R = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!org.telegram.messenger.g0.Q1() && ec0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (org.telegram.messenger.iz.f23431r == 0) {
                    f11 = i7 / 2.0f;
                } else {
                    f11 = i7;
                }
                f10 = f11 / 2.0f;
                L = org.telegram.messenger.g0.L(30.0f);
            } else {
                f10 = i7 / 2.0f;
                L = org.telegram.messenger.g0.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(ch0Var, View.TRANSLATION_X, i11 - org.telegram.messenger.g0.L(29.0f), f10 - L), ObjectAnimator.ofFloat(ch0Var, View.TRANSLATION_Y, i14 - org.telegram.messenger.g0.L(29.0f), ec0Var.L), ObjectAnimator.ofFloat(ch0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ch0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(xq.f40367g);
            animatorSet5.start();
        }
    }
}
