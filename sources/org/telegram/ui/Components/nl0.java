package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class nl0 implements Runnable {
    public final int f26683a;
    public final float f26684b;
    public final float f26685c;
    public final Object d;

    public nl0(Object obj, float f7, float f10, int i10) {
        this.f26683a = i10;
        this.d = obj;
        this.f26684b = f7;
        this.f26685c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f26683a;
        float f7 = this.f26685c;
        float f10 = this.f26684b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                vl0 vl0Var = (vl0) ((ql0) obj).f27606b;
                if (vl0Var.f29185e1 != null && (view = vl0Var.N1) != null) {
                    vl0Var.i1(view, f10, f7, true);
                    vl0Var.f29185e1 = null;
                    return;
                }
                return;
            default:
                ai.k6 k6Var = (ai.k6) obj;
                sg.e eVar = (sg.e) k6Var.f1136b;
                ValueAnimator valueAnimator = eVar.S;
                sg.b bVar = eVar.f43238a0;
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
                if (Math.abs(eVar.f43239b.d) > 10.0f) {
                    eVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(eVar.U);
                eVar.T = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(eVar.f43239b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(eVar.f43239b.f43213g, f7);
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
