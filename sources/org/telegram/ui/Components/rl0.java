package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rl0 implements Runnable {
    public final int f28062a;
    public final float f28063b;
    public final float f28064c;
    public final Object d;

    public rl0(Object obj, float f7, float f10, int i10) {
        this.f28062a = i10;
        this.d = obj;
        this.f28063b = f7;
        this.f28064c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f28062a;
        float f7 = this.f28064c;
        float f10 = this.f28063b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                zl0 zl0Var = (zl0) ((ul0) obj).f28891b;
                if (zl0Var.f30993e1 != null && (view = zl0Var.N1) != null) {
                    zl0Var.k1(view, f10, f7, true);
                    zl0Var.f30993e1 = null;
                    return;
                }
                return;
            default:
                ai.j6 j6Var = (ai.j6) obj;
                sg.e eVar = (sg.e) j6Var.f1034b;
                ValueAnimator valueAnimator = eVar.S;
                sg.b bVar = eVar.f43332a0;
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
                if (Math.abs(eVar.f43333b.d) > 10.0f) {
                    eVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.T = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(eVar.f43333b.d, f10);
                ofFloat.addUpdateListener(bVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                tr trVar = tr.h;
                ofFloat.setInterpolator(trVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.f43333b.f43307g, f7);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(trVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                eVar.T.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                eVar.T.addListener(new pg.d0(j6Var, 6));
                eVar.T.start();
                return;
        }
    }
}
