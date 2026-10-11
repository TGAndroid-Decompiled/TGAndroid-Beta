package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class km0 implements Runnable {
    public final int f28041a;
    public final float f28042b;
    public final float f28043c;
    public final Object d;

    public km0(Object obj, float f7, float f10, int i10) {
        this.f28041a = i10;
        this.d = obj;
        this.f28042b = f7;
        this.f28043c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f28041a;
        float f7 = this.f28043c;
        float f10 = this.f28042b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sm0 sm0Var = (sm0) ((nm0) obj).f29093b;
                if (sm0Var.f30785c1 != null && (view = sm0Var.L1) != null) {
                    sm0Var.h1(view, f10, f7, true);
                    sm0Var.f30785c1 = null;
                    return;
                }
                return;
            default:
                sg.i iVar = (sg.i) obj;
                sg.n nVar = iVar.f48156b;
                ValueAnimator valueAnimator = nVar.W;
                sg.h hVar = nVar.f48174e0;
                sg.h hVar2 = nVar.f48172d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f48167a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f48167a0.cancel();
                    nVar.f48167a0 = null;
                }
                if (Math.abs(nVar.f48168b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f48169b0);
                nVar.f48167a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f48168b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                is isVar = is.h;
                ofFloat.setInterpolator(isVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f48168b.f48136i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(isVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f48167a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f48167a0.addListener(new org.telegram.ui.Wallet.z4(iVar, 14));
                nVar.f48167a0.start();
                return;
        }
    }
}
