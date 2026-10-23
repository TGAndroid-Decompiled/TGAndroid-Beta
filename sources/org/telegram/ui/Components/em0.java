package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ve1;
public final class em0 implements Runnable {
    public final int f26009a;
    public final float f26010b;
    public final float f26011c;
    public final Object d;

    public em0(Object obj, float f7, float f10, int i10) {
        this.f26009a = i10;
        this.d = obj;
        this.f26010b = f7;
        this.f26011c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f26009a;
        float f7 = this.f26011c;
        float f10 = this.f26010b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                mm0 mm0Var = (mm0) ((hm0) obj).f26986b;
                if (mm0Var.f28683c1 != null && (view = mm0Var.L1) != null) {
                    mm0Var.j1(view, f10, f7, true);
                    mm0Var.f28683c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47535b;
                ValueAnimator valueAnimator = nVar.f47550c0;
                tg.h hVar = nVar.f47556h0;
                tg.h hVar2 = nVar.f47555g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f47550c0.cancel();
                    nVar.f47550c0 = null;
                }
                AnimatorSet animatorSet = nVar.f47551d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47551d0.cancel();
                    nVar.f47551d0 = null;
                }
                if (Math.abs(nVar.f47547b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47552e0);
                nVar.f47551d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47547b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                bs bsVar = bs.h;
                ofFloat.setInterpolator(bsVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47547b.f47515i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(bsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47551d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47551d0.addListener(new ve1(iVar, 20));
                nVar.f47551d0.start();
                return;
        }
    }
}
