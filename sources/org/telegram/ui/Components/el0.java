package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class el0 implements Runnable {
    public final int f23718a;
    public final float f23719b;
    public final float f23720c;
    public final Object d;

    public el0(Object obj, float f7, float f10, int i10) {
        this.f23718a = i10;
        this.d = obj;
        this.f23719b = f7;
        this.f23720c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f23718a;
        float f7 = this.f23720c;
        float f10 = this.f23719b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                ml0 ml0Var = (ml0) ((hl0) obj).f24749b;
                if (ml0Var.f26200e1 != null && (view = ml0Var.N1) != null) {
                    ml0Var.h1(view, f10, f7, true);
                    ml0Var.f26200e1 = null;
                    return;
                }
                return;
            default:
                ai.j6 j6Var = (ai.j6) obj;
                sg.e eVar = (sg.e) j6Var.f1032b;
                ValueAnimator valueAnimator = eVar.S;
                sg.b bVar = eVar.f42888a0;
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
                if (Math.abs(eVar.f42889b.d) > 10.0f) {
                    eVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.T = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(eVar.f42889b.d, f10);
                ofFloat.addUpdateListener(bVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                rr rrVar = rr.h;
                ofFloat.setInterpolator(rrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.f42889b.f42863g, f7);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(rrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                eVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                eVar.T.addListener(new qg.n0(j6Var, 5));
                eVar.T.start();
                return;
        }
    }
}
