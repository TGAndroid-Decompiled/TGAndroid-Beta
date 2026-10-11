package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jm0 implements Runnable {
    public final int f27788a;
    public final float f27789b;
    public final float f27790c;
    public final Object d;

    public jm0(Object obj, float f7, float f10, int i10) {
        this.f27788a = i10;
        this.d = obj;
        this.f27789b = f7;
        this.f27790c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f27788a;
        float f7 = this.f27790c;
        float f10 = this.f27789b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                rm0 rm0Var = (rm0) ((mm0) obj).f28890b;
                if (rm0Var.f30548c1 != null && (view = rm0Var.L1) != null) {
                    rm0Var.h1(view, f10, f7, true);
                    rm0Var.f30548c1 = null;
                    return;
                }
                return;
            default:
                sg.i iVar = (sg.i) obj;
                sg.n nVar = iVar.f48190b;
                ValueAnimator valueAnimator = nVar.W;
                sg.h hVar = nVar.f48208e0;
                sg.h hVar2 = nVar.f48206d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f48201a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f48201a0.cancel();
                    nVar.f48201a0 = null;
                }
                if (Math.abs(nVar.f48202b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f48203b0);
                nVar.f48201a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f48202b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f48202b.f48170i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(isVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f48201a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f48201a0.addListener(new org.telegram.ui.Wallet.z4(iVar, 14));
                nVar.f48201a0.start();
                return;
        }
    }
}
