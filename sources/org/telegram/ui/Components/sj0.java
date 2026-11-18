package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class sj0 implements Runnable {
    public final int f39758a;
    public final float f39759b;
    public final float f39760c;
    public final Object d;

    public sj0(Object obj, float f10, float f11, int i7) {
        this.f39758a = i7;
        this.d = obj;
        this.f39759b = f10;
        this.f39760c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f39758a;
        float f10 = this.f39760c;
        float f11 = this.f39759b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ck0 ck0Var = (ck0) ((vj0) obj).f40689b;
                if (ck0Var.f34054d1 != null && (view = ck0Var.M1) != null) {
                    ck0Var.j1(view, f11, f10, true);
                    ck0Var.f34054d1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f59450b;
                ValueAnimator valueAnimator = mVar.f59466d0;
                vg.g gVar = mVar.f59473i0;
                vg.g gVar2 = mVar.f59472h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f59466d0.cancel();
                    mVar.f59466d0 = null;
                }
                AnimatorSet animatorSet = mVar.f59468e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f59468e0.cancel();
                    mVar.f59468e0 = null;
                }
                if (Math.abs(mVar.f59462b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f59470f0);
                mVar.f59468e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f59462b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                lr lrVar = lr.h;
                ofFloat.setInterpolator(lrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f59462b.f59430i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(lrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f59468e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f59468e0.addListener(new org.telegram.ui.k71(hVar, 23));
                mVar.f59468e0.start();
                return;
        }
    }
}
