package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tf1;
public final class bm0 implements Runnable {
    public final int f24987a;
    public final float f24988b;
    public final float f24989c;
    public final Object d;

    public bm0(Object obj, float f7, float f10, int i10) {
        this.f24987a = i10;
        this.d = obj;
        this.f24988b = f7;
        this.f24989c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f24987a;
        float f7 = this.f24989c;
        float f10 = this.f24988b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                jm0 jm0Var = (jm0) ((em0) obj).f25931b;
                if (jm0Var.f27557c1 != null && (view = jm0Var.L1) != null) {
                    jm0Var.h1(view, f10, f7, true);
                    jm0Var.f27557c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47096b;
                ValueAnimator valueAnimator = nVar.f47111c0;
                tg.h hVar = nVar.f47117h0;
                tg.h hVar2 = nVar.f47116g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f47111c0.cancel();
                    nVar.f47111c0 = null;
                }
                AnimatorSet animatorSet = nVar.f47112d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47112d0.cancel();
                    nVar.f47112d0 = null;
                }
                if (Math.abs(nVar.f47108b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47113e0);
                nVar.f47112d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47108b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47108b.f47076i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(bsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47112d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47112d0.addListener(new tf1(iVar, 19));
                nVar.f47112d0.start();
                return;
        }
    }
}
