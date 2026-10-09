package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class im0 implements Runnable {
    public final int f27435a;
    public final float f27436b;
    public final float f27437c;
    public final Object d;

    public im0(Object obj, float f7, float f10, int i10) {
        this.f27435a = i10;
        this.d = obj;
        this.f27436b = f7;
        this.f27437c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f27435a;
        float f7 = this.f27437c;
        float f10 = this.f27436b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                qm0 qm0Var = (qm0) ((lm0) obj).f28488b;
                if (qm0Var.f30194c1 != null && (view = qm0Var.L1) != null) {
                    qm0Var.h1(view, f10, f7, true);
                    qm0Var.f30194c1 = null;
                    return;
                }
                return;
            default:
                sg.i iVar = (sg.i) obj;
                sg.n nVar = iVar.f48066b;
                ValueAnimator valueAnimator = nVar.W;
                sg.h hVar = nVar.f48084e0;
                sg.h hVar2 = nVar.f48082d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f48077a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f48077a0.cancel();
                    nVar.f48077a0 = null;
                }
                if (Math.abs(nVar.f48078b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f48079b0);
                nVar.f48077a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f48078b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                hs hsVar = hs.h;
                ofFloat.setInterpolator(hsVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f48078b.f48046i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(hsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f48077a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f48077a0.addListener(new org.telegram.ui.Wallet.x4(iVar, 14));
                nVar.f48077a0.start();
                return;
        }
    }
}
