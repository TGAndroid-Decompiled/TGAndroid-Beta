package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ql0 implements Runnable {
    public final int f27600a;
    public final float f27601b;
    public final float f27602c;
    public final Object d;

    public ql0(Object obj, float f7, float f10, int i10) {
        this.f27600a = i10;
        this.d = obj;
        this.f27601b = f7;
        this.f27602c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f27600a;
        float f7 = this.f27602c;
        float f10 = this.f27601b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                yl0 yl0Var = (yl0) ((tl0) obj).f28496b;
                if (yl0Var.f30682e1 != null && (view = yl0Var.N1) != null) {
                    yl0Var.i1(view, f10, f7, true);
                    yl0Var.f30682e1 = null;
                    return;
                }
                return;
            default:
                ai.k6 k6Var = (ai.k6) obj;
                sg.e eVar = (sg.e) k6Var.f1133b;
                ValueAnimator valueAnimator = eVar.S;
                sg.b bVar = eVar.f43259a0;
                sg.b bVar2 = eVar.W;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    eVar.S.cancel();
                    eVar.S = null;
                }
                AnimatorSet animatorSet = eVar.T;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    eVar.T.cancel();
                    eVar.T = null;
                }
                if (Math.abs(eVar.f43260b.d) > 10.0f) {
                    eVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.T = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(eVar.f43260b.d, f10);
                ofFloat.addUpdateListener(bVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                qr qrVar = qr.h;
                ofFloat.setInterpolator(qrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.f43260b.f43234g, f7);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(qrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                eVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                eVar.T.addListener(new pg.d0(k6Var, 6));
                eVar.T.start();
                return;
        }
    }
}
