package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class uj0 implements Runnable {
    public final int f40466a;
    public final float f40467b;
    public final float f40468c;
    public final Object d;

    public uj0(Object obj, float f10, float f11, int i7) {
        this.f40466a = i7;
        this.d = obj;
        this.f40467b = f10;
        this.f40468c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f40466a;
        float f10 = this.f40468c;
        float f11 = this.f40467b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ek0 ek0Var = (ek0) ((xj0) obj).f42152b;
                if (ek0Var.f34853d1 != null && (view = ek0Var.M1) != null) {
                    ek0Var.j1(view, f11, f10, true);
                    ek0Var.f34853d1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f59493b;
                ValueAnimator valueAnimator = mVar.f59509d0;
                vg.g gVar = mVar.f59516i0;
                vg.g gVar2 = mVar.f59515h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f59509d0.cancel();
                    mVar.f59509d0 = null;
                }
                AnimatorSet animatorSet = mVar.f59511e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f59511e0.cancel();
                    mVar.f59511e0 = null;
                }
                if (Math.abs(mVar.f59505b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f59513f0);
                mVar.f59511e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f59505b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                nr nrVar = nr.h;
                ofFloat.setInterpolator(nrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f59505b.f59473i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(nrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f59511e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f59511e0.addListener(new org.telegram.ui.k71(hVar, 23));
                mVar.f59511e0.start();
                return;
        }
    }
}
