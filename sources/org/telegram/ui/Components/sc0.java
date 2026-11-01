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
public final class sc0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f30265a;
    public final int f30266b;
    public final Runnable f30267c;
    public final zc0 d;

    public sc0(zc0 zc0Var, int i10, int i11, Runnable runnable) {
        this.d = zc0Var;
        this.f30265a = i10;
        this.f30266b = i11;
        this.f30267c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f7;
        int L;
        float f10;
        org.telegram.ui.Cells.a5 a5Var;
        fi0 fi0Var;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        long j10;
        zc0 zc0Var = this.d;
        org.telegram.ui.Cells.a5 a5Var2 = zc0Var.e;
        ArrayList arrayList = zc0Var.W;
        int[] iArr = zc0Var.f33113h0;
        fi0 fi0Var2 = zc0Var.M;
        zc0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!zc0Var.P && zc0Var.isAttachedToWindow()) {
            zc0Var.setAlpha(1.0f);
            fi0Var2.getAnimatedDrawable().N(0, false, false);
            fi0Var2.getAnimatedDrawable().P(37);
            fi0Var2.d();
            zc0Var.o(true);
            org.telegram.messenger.i0.h3(new eb0(this, 4), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            zc0Var.Q = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = org.telegram.messenger.i0.f16172q;
            int i10 = point.x;
            int i11 = point.y + org.telegram.messenger.i0.f16166m;
            int i12 = this.f30265a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f30266b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            double sqrt = Math.sqrt(i17 + i14);
            int i18 = i12 * i12;
            int i19 = 1;
            double sqrt2 = Math.sqrt(i17 + i18);
            int i20 = i15 * i15;
            fi0 fi0Var3 = fi0Var2;
            final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i18 + i20)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = a5Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = a5Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[i19]);
                int i22 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
                ArrayList arrayList3 = arrayList2;
                obj.f31249b = ((float) Math.sqrt(i22)) - org.telegram.messenger.i0.L(40.0f);
                if (i21 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    a5Var = a5Var2;
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
                    fi0Var = fi0Var3;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    a5Var = a5Var2;
                    fi0Var = fi0Var3;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f31248a = animatorSet3;
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
                fi0 fi0Var4 = fi0Var;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, property3, f11, f12);
                Property property4 = View.SCALE_Y;
                if (i21 != -1) {
                    f13 = 0.6f;
                }
                if (i21 == -1) {
                    f14 = 1.0f;
                }
                animatorSet3.playTogether(ofFloat3, ObjectAnimator.ofFloat(childAt, property4, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
                obj.f31248a.addListener(new t60(animatorSet, 7));
                AnimatorSet animatorSet4 = obj.f31248a;
                if (i21 == -1) {
                    j10 = 232;
                } else {
                    j10 = 200;
                }
                animatorSet4.setDuration(j10);
                obj.f31248a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                arrayList2 = arrayList3;
                a5Var2 = a5Var;
                fi0Var3 = fi0Var4;
                i19 = 1;
            }
            ArrayList arrayList4 = arrayList2;
            fi0 fi0Var5 = fi0Var3;
            arrayList4.add(ObjectAnimator.ofFloat(zc0Var.f33117w, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList4.add(ofFloat4);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    zc0 zc0Var2 = sc0.this.d;
                    double animatedFraction = max * valueAnimator.getAnimatedFraction();
                    int i24 = 0;
                    while (true) {
                        ArrayList arrayList5 = zc0Var2.W;
                        if (i24 < arrayList5.size()) {
                            vc0 vc0Var = (vc0) arrayList5.get(i24);
                            if (vc0Var.f31249b <= animatedFraction) {
                                vc0Var.f31248a.start();
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
            gr grVar = gr.h;
            animatorSet2.setInterpolator(grVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(zc0Var.f33103a0, 1.0f);
            ofFloat5.addUpdateListener(new r60(this, 2));
            ofFloat5.addListener(new rc0(this, 0));
            ofFloat5.setDuration(420L);
            ofFloat5.setInterpolator(grVar);
            arrayList4.add(ofFloat5);
            animatorSet2.playTogether(arrayList4);
            animatorSet2.addListener(new rc0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            zc0Var.R = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!org.telegram.messenger.i0.Q1() && zc0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (org.telegram.messenger.uz.f18546r == 0) {
                    f10 = i10 / 2.0f;
                } else {
                    f10 = i10;
                }
                f7 = f10 / 2.0f;
                L = org.telegram.messenger.i0.L(30.0f);
            } else {
                f7 = i10 / 2.0f;
                L = org.telegram.messenger.i0.L(29.0f);
            }
            animatorSet5.playTogether(ObjectAnimator.ofFloat(fi0Var5, View.TRANSLATION_X, i12 - org.telegram.messenger.i0.L(29.0f), f7 - L), ObjectAnimator.ofFloat(fi0Var5, View.TRANSLATION_Y, i15 - org.telegram.messenger.i0.L(29.0f), zc0Var.L), ObjectAnimator.ofFloat(fi0Var5, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(fi0Var5, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(gr.f26524g);
            animatorSet5.start();
        }
    }
}
