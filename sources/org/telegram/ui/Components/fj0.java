package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.u81;
public final class fj0 implements Runnable {
    public final int f33556a;
    public final float f33557b;
    public final float f33558c;
    public final Object d;

    public fj0(Object obj, float f10, float f11, int i7) {
        this.f33556a = i7;
        this.d = obj;
        this.f33557b = f10;
        this.f33558c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f33556a;
        float f10 = this.f33558c;
        float f11 = this.f33557b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                pj0 pj0Var = (pj0) ((ij0) obj).f34689b;
                if (pj0Var.f36960c1 != null && (view = pj0Var.L1) != null) {
                    pj0Var.j1(view, f11, f10, true);
                    pj0Var.f36960c1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f57408b;
                ValueAnimator valueAnimator = mVar.f57423c0;
                vg.g gVar = mVar.f57430h0;
                vg.g gVar2 = mVar.f57429g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f57423c0.cancel();
                    mVar.f57423c0 = null;
                }
                AnimatorSet animatorSet = mVar.f57424d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f57424d0.cancel();
                    mVar.f57424d0 = null;
                }
                if (Math.abs(mVar.f57420b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f57426e0);
                mVar.f57424d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f57420b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                wq wqVar = wq.h;
                ofFloat.setInterpolator(wqVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f57420b.f57388i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(wqVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f57424d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f57424d0.addListener(new u81(hVar, 22));
                mVar.f57424d0.start();
                return;
        }
    }
}
