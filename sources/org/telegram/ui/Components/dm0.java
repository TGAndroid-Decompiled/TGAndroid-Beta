package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ue1;
public final class dm0 implements Runnable {
    public final int f25791a;
    public final float f25792b;
    public final float f25793c;
    public final Object d;

    public dm0(Object obj, float f7, float f10, int i10) {
        this.f25791a = i10;
        this.d = obj;
        this.f25792b = f7;
        this.f25793c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f25791a;
        float f7 = this.f25793c;
        float f10 = this.f25792b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lm0 lm0Var = (lm0) ((gm0) obj).f26729b;
                if (lm0Var.f28374c1 != null && (view = lm0Var.L1) != null) {
                    lm0Var.j1(view, f10, f7, true);
                    lm0Var.f28374c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47534b;
                ValueAnimator valueAnimator = nVar.f47549c0;
                tg.h hVar = nVar.f47555h0;
                tg.h hVar2 = nVar.f47554g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f47549c0.cancel();
                    nVar.f47549c0 = null;
                }
                AnimatorSet animatorSet = nVar.f47550d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47550d0.cancel();
                    nVar.f47550d0 = null;
                }
                if (Math.abs(nVar.f47546b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47551e0);
                nVar.f47550d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47546b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                zr zrVar = zr.h;
                ofFloat.setInterpolator(zrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47546b.f47514i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(zrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47550d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47550d0.addListener(new ue1(iVar, 20));
                nVar.f47550d0.start();
                return;
        }
    }
}
