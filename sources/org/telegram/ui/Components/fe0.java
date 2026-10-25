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
public final class fe0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f28173a;
    public final int f28174b;
    public final Runnable f28175c;
    public final le0 d;

    public fe0(le0 le0Var, int i10, int i11, Runnable runnable) {
        this.d = le0Var;
        this.f28173a = i10;
        this.f28174b = i11;
        this.f28175c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f7;
        int dp;
        float f10;
        di.i4 i4Var;
        int[] iArr;
        double d;
        View view;
        AnimatorSet animatorSet;
        float f11;
        float f12;
        float f13;
        long j10;
        le0 le0Var = this.d;
        di.i4 i4Var2 = le0Var.e;
        ArrayList arrayList = le0Var.W;
        int[] iArr2 = le0Var.f30194h0;
        ak0 ak0Var = le0Var.M;
        le0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (!le0Var.P && le0Var.isAttachedToWindow()) {
            le0Var.setAlpha(1.0f);
            ak0Var.getAnimatedDrawable().N(0, false, false);
            ak0Var.getAnimatedDrawable().P(37);
            ak0Var.d();
            le0Var.o(true);
            AndroidUtilities.runOnUIThread(new wa0(this, 6), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            le0Var.Q = animatorSet2;
            ArrayList arrayList2 = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            int i11 = point.y + AndroidUtilities.statusBarHeight;
            int i12 = this.f28173a;
            int i13 = i10 - i12;
            int i14 = i13 * i13;
            int i15 = this.f28174b;
            int i16 = i11 - i15;
            int i17 = i16 * i16;
            int i18 = i12 * i12;
            int i19 = 1;
            int i20 = i15 * i15;
            double max = Math.max(Math.max(Math.max(Math.sqrt(i17 + i14), Math.sqrt(i17 + i18)), Math.sqrt(i18 + i20)), Math.sqrt(i20 + i14));
            arrayList.clear();
            int childCount = i4Var2.getChildCount();
            int i21 = 0;
            while (i21 < childCount) {
                View childAt = i4Var2.getChildAt(i21);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                ?? obj = new Object();
                childAt.getLocationInWindow(iArr2);
                int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr2[0]);
                int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr2[i19]);
                obj.f28953b = ((float) Math.sqrt((measuredHeight * measuredHeight) + (measuredWidth * measuredWidth))) - AndroidUtilities.dp(40.0f);
                if (i21 != -1) {
                    animatorSet = new AnimatorSet();
                    Property property = View.SCALE_X;
                    i4Var = i4Var2;
                    float[] fArr = new float[i19];
                    fArr[0] = 1.0f;
                    view = childAt;
                    iArr = iArr2;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, property, fArr), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                    d = max;
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    i4Var = i4Var2;
                    iArr = iArr2;
                    d = max;
                    view = childAt;
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                obj.f28952a = animatorSet3;
                Property property2 = View.SCALE_X;
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
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property2, f11, f12);
                Property property3 = View.SCALE_Y;
                if (i21 == -1) {
                    f13 = 0.9f;
                } else {
                    f13 = 0.6f;
                }
                if (i21 == -1) {
                    f14 = 1.0f;
                }
                animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(view, property3, f13, f14), ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
                obj.f28952a.addListener(new i10(animatorSet, 9));
                AnimatorSet animatorSet4 = obj.f28952a;
                if (i21 == -1) {
                    j10 = 232;
                } else {
                    j10 = 200;
                }
                animatorSet4.setDuration(j10);
                obj.f28952a.setInterpolator(new DecelerateInterpolator());
                arrayList.add(obj);
                i21++;
                i4Var2 = i4Var;
                iArr2 = iArr;
                max = d;
                i19 = 1;
            }
            final double d10 = max;
            arrayList2.add(ObjectAnimator.ofFloat(le0Var.v, View.ALPHA, 0.0f, 1.0f));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList2.add(ofFloat2);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    le0 le0Var2 = fe0.this.d;
                    double animatedFraction = d10 * valueAnimator.getAnimatedFraction();
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList3 = le0Var2.W;
                        if (i22 < arrayList3.size()) {
                            he0 he0Var = (he0) arrayList3.get(i22);
                            if (he0Var.f28953b <= animatedFraction) {
                                he0Var.f28952a.start();
                                arrayList3.remove(i22);
                                i22--;
                            }
                            i22++;
                        } else {
                            return;
                        }
                    }
                }
            });
            ds dsVar = ds.h;
            animatorSet2.setInterpolator(dsVar);
            animatorSet2.setDuration(500L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(le0Var.f30184a0, 1.0f);
            ofFloat3.addUpdateListener(new e80(this, 3));
            ofFloat3.addListener(new ee0(this, 0));
            ofFloat3.setDuration(420L);
            ofFloat3.setInterpolator(dsVar);
            arrayList2.add(ofFloat3);
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new ee0(this, 1));
            animatorSet2.start();
            AnimatorSet animatorSet5 = new AnimatorSet();
            le0Var.R = animatorSet5;
            animatorSet5.setDuration(332L);
            if (!AndroidUtilities.isTablet() && le0Var.getContext().getResources().getConfiguration().orientation == 2) {
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
            animatorSet5.playTogether(ObjectAnimator.ofFloat(ak0Var, View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f7 - dp), ObjectAnimator.ofFloat(ak0Var, View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), le0Var.L), ObjectAnimator.ofFloat(ak0Var, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ak0Var, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet5.setInterpolator(ds.f27585g);
            animatorSet5.start();
        }
    }
}
