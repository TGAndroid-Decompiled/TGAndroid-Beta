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

public final class yc0 implements ViewTreeObserver.OnGlobalLayoutListener {

    public final int f34880a;

    public final int f34881b;

    public final Runnable f34882c;
    public final dd0 d;

    public yc0(dd0 dd0Var, int i10, int i11, Runnable runnable) {
        this.d = dd0Var;
        this.f34880a = i10;
        this.f34881b = i11;
        this.f34882c = runnable;
    }

    @Override
    public final void onGlobalLayout() {
        float f10;
        int iDp;
        AnimatorSet animatorSet;
        dd0 dd0Var = this.d;
        int[] iArr = dd0Var.S;
        dd0Var.setAlpha(1.0f);
        dd0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ri0 ri0Var = dd0Var.E;
        ri0Var.getAnimatedDrawable().L(0, false, false);
        ri0Var.getAnimatedDrawable().N(37);
        ri0Var.d();
        char c10 = 1;
        dd0Var.m(true);
        AndroidUtilities.runOnUIThread(new mb0(this, 4), 350L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y + AndroidUtilities.statusBarHeight;
        int i12 = this.f34880a;
        int i13 = i10 - i12;
        int i14 = i13 * i13;
        int i15 = this.f34881b;
        int i16 = i11 - i15;
        int i17 = i16 * i16;
        double dSqrt = Math.sqrt(i17 + i14);
        int i18 = i12 * i12;
        double dSqrt2 = Math.sqrt(i17 + i18);
        int i19 = i15 * i15;
        final double dMax = Math.max(Math.max(Math.max(dSqrt, dSqrt2), Math.sqrt(i18 + i19)), Math.sqrt(i19 + i14));
        ArrayList arrayList2 = dd0Var.K;
        arrayList2.clear();
        ag.d dVar = dd0Var.f27720e;
        int childCount = dVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            View childAt = dVar.getChildAt(i20);
            childAt.setScaleX(0.7f);
            childAt.setScaleY(0.7f);
            childAt.setAlpha(0.0f);
            ad0 ad0Var = new ad0();
            childAt.getLocationInWindow(iArr);
            int measuredWidth = i12 - ((childAt.getMeasuredWidth() / 2) + iArr[0]);
            int measuredHeight = i15 - ((childAt.getMeasuredHeight() / 2) + iArr[c10]);
            int i21 = (measuredHeight * measuredHeight) + (measuredWidth * measuredWidth);
            ArrayList arrayList3 = arrayList2;
            ad0Var.f26732b = ((float) Math.sqrt(i21)) - AndroidUtilities.dp(40.0f);
            if (i20 != -1) {
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                animatorSet.setDuration(140L);
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                animatorSet = null;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ad0Var.f26731a = animatorSet3;
            ag.d dVar2 = dVar;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i20 == -1 ? 0.9f : 0.6f, i20 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i20 != -1 ? 0.6f : 0.9f, i20 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            ad0Var.f26731a.addListener(new sz(animatorSet, 9));
            ad0Var.f26731a.setDuration(i20 == -1 ? 232L : 200L);
            ad0Var.f26731a.setInterpolator(new DecelerateInterpolator());
            arrayList3.add(ad0Var);
            i20++;
            arrayList2 = arrayList3;
            childCount = childCount;
            iArr = iArr;
            dVar = dVar2;
            c10 = 1;
        }
        arrayList.add(ObjectAnimator.ofFloat(dd0Var.v, (Property<ag.y1, Float>) View.ALPHA, 0.0f, 1.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        arrayList.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                dd0 dd0Var2 = this.f34158a.d;
                double animatedFraction = dMax * ((double) valueAnimator.getAnimatedFraction());
                int i22 = 0;
                while (true) {
                    ArrayList arrayList4 = dd0Var2.K;
                    if (i22 >= arrayList4.size()) {
                        return;
                    }
                    ad0 ad0Var2 = (ad0) arrayList4.get(i22);
                    if (ad0Var2.f26732b <= animatedFraction) {
                        ad0Var2.f26731a.start();
                        arrayList4.remove(i22);
                        i22--;
                    }
                    i22++;
                }
            }
        });
        er erVar = er.h;
        animatorSet2.setInterpolator(erVar);
        animatorSet2.setDuration(500L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(dd0Var.L, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new v60(this, 2));
        valueAnimatorOfFloat2.addListener(new xc0(this, 0));
        valueAnimatorOfFloat2.setDuration(420L);
        valueAnimatorOfFloat2.setInterpolator(erVar);
        arrayList.add(valueAnimatorOfFloat2);
        animatorSet2.playTogether(arrayList);
        animatorSet2.addListener(new xc0(this, 1));
        animatorSet2.start();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.setDuration(332L);
        if (AndroidUtilities.isTablet() || dd0Var.getContext().getResources().getConfiguration().orientation != 2) {
            f10 = i10 / 2.0f;
            iDp = AndroidUtilities.dp(29.0f);
        } else {
            f10 = (SharedConfig.passcodeType == 0 ? i10 / 2.0f : i10) / 2.0f;
            iDp = AndroidUtilities.dp(30.0f);
        }
        animatorSet4.playTogether(ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.TRANSLATION_X, i12 - AndroidUtilities.dp(29.0f), f10 - iDp), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.TRANSLATION_Y, i15 - AndroidUtilities.dp(29.0f), dd0Var.D), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(ri0Var, (Property<ri0, Float>) View.SCALE_Y, 0.5f, 1.0f));
        animatorSet4.setInterpolator(er.f28123g);
        animatorSet4.start();
    }
}
