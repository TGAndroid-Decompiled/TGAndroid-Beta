package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.t81;
public final class gj0 implements Runnable {
    public final int f33961a;
    public final float f33962b;
    public final float f33963c;
    public final Object d;

    public gj0(Object obj, float f10, float f11, int i7) {
        this.f33961a = i7;
        this.d = obj;
        this.f33962b = f10;
        this.f33963c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i7 = this.f33961a;
        float f10 = this.f33963c;
        float f11 = this.f33962b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                qj0 qj0Var = (qj0) ((jj0) obj).f35080b;
                if (qj0Var.f37361c1 != null && (view = qj0Var.L1) != null) {
                    qj0Var.j1(view, f11, f10, true);
                    qj0Var.f37361c1 = null;
                    return;
                }
                return;
            default:
                vg.h hVar = (vg.h) obj;
                vg.m mVar = hVar.f57412b;
                ValueAnimator valueAnimator = mVar.f57427c0;
                vg.g gVar = mVar.f57434h0;
                vg.g gVar2 = mVar.f57433g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f57427c0.cancel();
                    mVar.f57427c0 = null;
                }
                AnimatorSet animatorSet = mVar.f57428d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f57428d0.cancel();
                    mVar.f57428d0 = null;
                }
                if (Math.abs(mVar.f57424b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f57430e0);
                mVar.f57428d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f57424b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                xq xqVar = xq.h;
                ofFloat.setInterpolator(xqVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f57424b.f57392i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(xqVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f57428d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f57428d0.addListener(new t81(hVar, 22));
                mVar.f57428d0.start();
                return;
        }
    }
}
