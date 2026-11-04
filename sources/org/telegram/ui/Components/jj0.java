package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.i81;
public final class jj0 implements Runnable {
    public final int f35091a;
    public final float f35092b;
    public final float f35093c;
    public final Object d;

    public jj0(Object obj, float f10, float f11, int i3) {
        this.f35091a = i3;
        this.d = obj;
        this.f35092b = f10;
        this.f35093c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i3 = this.f35091a;
        float f10 = this.f35093c;
        float f11 = this.f35092b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                tj0 tj0Var = (tj0) ((mj0) obj).f36172b;
                if (tj0Var.f38439d1 != null && (view = tj0Var.M1) != null) {
                    tj0Var.j1(view, f11, f10, true);
                    tj0Var.f38439d1 = null;
                    return;
                }
                return;
            default:
                wg.h hVar = (wg.h) obj;
                wg.m mVar = hVar.f57654b;
                ValueAnimator valueAnimator = mVar.f57670d0;
                wg.g gVar = mVar.f57677i0;
                wg.g gVar2 = mVar.f57676h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    mVar.f57670d0.cancel();
                    mVar.f57670d0 = null;
                }
                AnimatorSet animatorSet = mVar.f57672e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    mVar.f57672e0.cancel();
                    mVar.f57672e0 = null;
                }
                if (Math.abs(mVar.f57666b.d) > 10.0f) {
                    mVar.l();
                    return;
                }
                org.telegram.messenger.g0.r(mVar.f57674f0);
                mVar.f57672e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.f57666b.d, f11);
                ofFloat.addUpdateListener(gVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                xq xqVar = xq.h;
                ofFloat.setInterpolator(xqVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(gVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = org.telegram.messenger.g0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mVar.f57666b.f57634i, f10);
                ofFloat3.addUpdateListener(gVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(xqVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(gVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                mVar.f57672e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                mVar.f57672e0.addListener(new i81(hVar, 22));
                mVar.f57672e0.start();
                return;
        }
    }
}
