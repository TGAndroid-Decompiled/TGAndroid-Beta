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
public final class me0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f27381a;
    public final int f27382b;
    public final Runnable f27383c;
    public final re0 d;

    public me0(re0 re0Var, int i10, int i11, Runnable runnable) {
        this.d = re0Var;
        this.f27381a = i10;
        this.f27382b = i11;
        this.f27383c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f7;
        int dp;
        float f10;
        bi.i5 i5Var;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        float f11;
        float f12;
        long j10;
        re0 re0Var = this.d;
        bi.i5 i5Var2 = re0Var.e;
        ArrayList arrayList = re0Var.S;
        int[] iArr = re0Var.f28817d0;
        bk0 bk0Var = re0Var.I;
        re0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!re0Var.L && re0Var.isAttachedToWindow()) {
            re0Var.setAlpha(1.0f);
            bk0Var.getAnimatedDrawable().N(0, false, false);
            bk0Var.getAnimatedDrawable().P(37);
            bk0Var.d();
            re0Var.n(true);
            AndroidUtilities.runOnUIThread(new yc0(this, 5), 350L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            re0Var.M = animatorSet3;
            ArrayList arrayList2 = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight;
            int i12 = this.f27381a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f27382b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            double sqrt = Math.sqrt(i17 + i14);
            int i18 = i12 * i12;
            int i19 = 1;
            double sqrt2 = Math.sqrt(i17 + i18);
            int i20 = i15 * i15;
            final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), Math.sqrt(i20 + i18)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = i5Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = i5Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[i19]);
                obj.f27943b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - AndroidUtilities.dp(40.0f);
                if (i21 != -1) {
                    animatorSet2 = new AnimatorSet();
                    Property property = View.SCALE_X;
                    i5Var = i5Var2;
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
                    animatorSet2.playTogether(animatorArr);
                    animatorSet = animatorSet3;
                    animatorSet2.setDuration(140L);
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                } else {
                    i5Var = i5Var2;
                    animatorSet = animatorSet3;
                    animatorSet2 = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                obj.f27942a = animatorSet4;
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
                AnimatorSet animatorSet5 = animatorSet;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, property3, f11, f12);
                Property property4 = View.SCALE_Y;
                if (i21 != -1) {
                    f13 = 0.6f;
                }
                if (i21 == -1) {
                    f14 = 1.0f;
                }
                animatorSet4.playTogether(ofFloat3, ObjectAnimator.ofFloat(childAt, property4, f13, f14), ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f));
                obj.f27942a.addListener(new k90(animatorSet2, 5));
                AnimatorSet animatorSet6 = obj.f27942a;
                if (i21 == -1) {
                    j10 = 232;
                } else {
                    j10 = 200;
                }
                animatorSet6.setDuration(j10);
                obj.f27942a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                i5Var2 = i5Var;
                animatorSet3 = animatorSet5;
                i19 = 1;
            }
            AnimatorSet animatorSet7 = animatorSet3;
            arrayList2.add(ObjectAnimator.ofFloat(re0Var.v, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat4);
            ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    re0 re0Var2 = me0.this.d;
                    double animatedFraction = max * valueAnimator.getAnimatedFraction();
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList3 = re0Var2.S;
                        if (i23 < arrayList3.size()) {
                            oe0 oe0Var = (oe0) arrayList3.get(i23);
                            if (oe0Var.f27943b <= animatedFraction) {
                                oe0Var.f27942a.start();
                                arrayList3.remove(i23);
                                i23--;
                            }
                            i23++;
                        } else {
                            return;
                        }
                    }
                }
            });
            es esVar = es.h;
            animatorSet7.setInterpolator(esVar);
            animatorSet7.setDuration(500L);
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(re0Var.T, 1.0f);
            ofFloat5.addUpdateListener(new g80(this, 3));
            ofFloat5.addListener(new le0(this, 0));
            ofFloat5.setDuration(420L);
            ofFloat5.setInterpolator(esVar);
            arrayList2.add(ofFloat5);
            animatorSet7.playTogether(arrayList2);
            animatorSet7.addListener(new le0(this, 1));
            animatorSet7.start();
            AnimatorSet animatorSet8 = new AnimatorSet();
            re0Var.N = animatorSet8;
            animatorSet8.setDuration(332L);
            if (!AndroidUtilities.isTablet() && re0Var.getContext().getResources().getConfiguration().orientation == 2) {
                if (SharedConfig.passcodeType == 0) {
                    f10 = i10 / 2.0f;
                } else {
                    f10 = i10;
                }
                f7 = f10 / 2.0f;
                dp = AndroidUtilities.dp(30.0f);
            } else {
                f7 = i10 / 2.0f;
                dp = AndroidUtilities.dp(29.0f);
            }
            animatorSet8.playTogether(ObjectAnimator.ofFloat(bk0Var, View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(bk0Var, View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), re0Var.H), ObjectAnimator.ofFloat(bk0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(bk0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet8.setInterpolator(es.f24772g);
            animatorSet8.start();
        }
    }
}
