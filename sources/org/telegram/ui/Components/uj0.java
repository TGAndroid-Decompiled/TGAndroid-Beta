package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class uj0 implements Runnable {
    public final int f40394a;
    public final float f40395b;
    public final float f40396c;
    public final Object d;

    public uj0(Object obj, float f10, float f11, int i7) {
        this.f40394a = i7;
        this.d = obj;
        this.f40395b = f10;
        this.f40396c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f40394a;
        float f10 = this.f40396c;
        float f11 = this.f40395b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ek0 ek0Var = (ek0) ((xj0) obj).f42058b;
                if (ek0Var.f34747d1 != null && (view = ek0Var.M1) != null) {
                    ek0Var.j1(view, f11, f10, true);
                    ek0Var.f34747d1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f59578b;
                ValueAnimator valueAnimator = mVar.f59594d0;
                vg.g gVar = mVar.f59601i0;
                vg.g gVar2 = mVar.f59600h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f59594d0.cancel();
                    mVar.f59594d0 = null;
                }
                AnimatorSet animatorSet = mVar.f59596e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f59596e0.cancel();
                    mVar.f59596e0 = null;
                }
                if (Math.abs(mVar.f59590b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f59598f0);
                mVar.f59596e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f59590b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                kr krVar = kr.h;
                ofFloat.setInterpolator(krVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f59590b.f59558i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(krVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f59596e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f59596e0.addListener(new org.telegram.ui.i71(hVar, 23));
                mVar.f59596e0.start();
                return;
        }
    }
}
