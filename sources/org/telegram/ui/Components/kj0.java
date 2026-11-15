package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class kj0 implements Runnable {
    public final int f36523a;
    public final float f36524b;
    public final float f36525c;
    public final Object d;

    public kj0(Object obj, float f10, float f11, int i7) {
        this.f36523a = i7;
        this.d = obj;
        this.f36524b = f10;
        this.f36525c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f36523a;
        float f10 = this.f36525c;
        float f11 = this.f36524b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                uj0 uj0Var = (uj0) ((nj0) obj).f37613b;
                if (uj0Var.f40049d1 != null && (view = uj0Var.M1) != null) {
                    uj0Var.j1(view, f11, f10, true);
                    uj0Var.f40049d1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f58881b;
                ValueAnimator valueAnimator = mVar.f58897d0;
                vg.g gVar = mVar.f58904i0;
                vg.g gVar2 = mVar.f58903h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f58897d0.cancel();
                    mVar.f58897d0 = null;
                }
                AnimatorSet animatorSet = mVar.f58899e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f58899e0.cancel();
                    mVar.f58899e0 = null;
                }
                if (Math.abs(mVar.f58893b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f58901f0);
                mVar.f58899e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f58893b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                er erVar = er.h;
                ofFloat.setInterpolator(erVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f58893b.f58861i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(erVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f58899e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f58899e0.addListener(new org.telegram.ui.g71(hVar, 23));
                mVar.f58899e0.start();
                return;
        }
    }
}
