package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class om0 implements Runnable {
    public final int f29248a;
    public final float f29249b;
    public final float f29250c;
    public final Object d;

    public om0(Object obj, float f7, float f10, int i10) {
        this.f29248a = i10;
        this.d = obj;
        this.f29249b = f7;
        this.f29250c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f29248a;
        float f7 = this.f29250c;
        float f10 = this.f29249b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                wm0 wm0Var = (wm0) ((rm0) obj).f30192b;
                if (wm0Var.f32445c1 != null && (view = wm0Var.L1) != null) {
                    wm0Var.h1(view, f10, f7, true);
                    wm0Var.f32445c1 = null;
                    return;
                }
                return;
            default:
                sg.i iVar = (sg.i) obj;
                sg.n nVar = iVar.f48297b;
                ValueAnimator valueAnimator = nVar.W;
                sg.h hVar = nVar.f48315e0;
                sg.h hVar2 = nVar.f48313d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f48308a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f48308a0.cancel();
                    nVar.f48308a0 = null;
                }
                if (Math.abs(nVar.f48309b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f48310b0);
                nVar.f48308a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f48309b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j3 = 220;
                ofFloat.setDuration(j3);
                js jsVar = js.h;
                ofFloat.setInterpolator(jsVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j3);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f48309b.f48277i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j3);
                ofFloat3.setInterpolator(jsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j3);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f48308a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f48308a0.addListener(new org.telegram.ui.Wallet.z4(iVar, 14));
                nVar.f48308a0.start();
                return;
        }
    }
}
