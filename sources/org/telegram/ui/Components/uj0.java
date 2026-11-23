package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class uj0 implements Runnable {
    public final int f40451a;
    public final float f40452b;
    public final float f40453c;
    public final Object d;

    public uj0(Object obj, float f10, float f11, int i7) {
        this.f40451a = i7;
        this.d = obj;
        this.f40452b = f10;
        this.f40453c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f40451a;
        float f10 = this.f40453c;
        float f11 = this.f40452b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ek0 ek0Var = (ek0) ((xj0) obj).f42107b;
                if (ek0Var.f34839d1 != null && (view = ek0Var.M1) != null) {
                    ek0Var.j1(view, f11, f10, true);
                    ek0Var.f34839d1 = null;
                    return;
                }
                return;
            default:
                vg.i iVar = (vg.i) obj;
                vg.n nVar = iVar.f59458b;
                ValueAnimator valueAnimator = nVar.f59474d0;
                vg.h hVar = nVar.f59481i0;
                vg.h hVar2 = nVar.f59480h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f59474d0.cancel();
                    nVar.f59474d0 = null;
                }
                AnimatorSet animatorSet = nVar.f59476e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f59476e0.cancel();
                    nVar.f59476e0 = null;
                }
                if (Math.abs(nVar.f59470b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(nVar.f59478f0);
                nVar.f59476e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f59470b.d, f11);
                ofFloat.addUpdateListener(hVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                nr nrVar = nr.h;
                ofFloat.setInterpolator(nrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f59470b.f59438i, f10);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(nrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                nVar.f59476e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f59476e0.addListener(new org.telegram.ui.k71(iVar, 23));
                nVar.f59476e0.start();
                return;
        }
    }
}
