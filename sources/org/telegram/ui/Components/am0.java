package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vf1;
public final class am0 implements Runnable {
    public final int f24669a;
    public final float f24670b;
    public final float f24671c;
    public final Object d;

    public am0(Object obj, float f7, float f10, int i10) {
        this.f24669a = i10;
        this.d = obj;
        this.f24670b = f7;
        this.f24671c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f24669a;
        float f7 = this.f24671c;
        float f10 = this.f24670b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                im0 im0Var = (im0) ((dm0) obj).f25628b;
                if (im0Var.f27269c1 != null && (view = im0Var.L1) != null) {
                    im0Var.h1(view, f10, f7, true);
                    im0Var.f27269c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47137b;
                ValueAnimator valueAnimator = nVar.f47152c0;
                tg.h hVar = nVar.f47158h0;
                tg.h hVar2 = nVar.f47157g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f47152c0.cancel();
                    nVar.f47152c0 = null;
                }
                AnimatorSet animatorSet = nVar.f47153d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47153d0.cancel();
                    nVar.f47153d0 = null;
                }
                if (Math.abs(nVar.f47149b.d) > 10.0f) {
                    nVar.n();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47154e0);
                nVar.f47153d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47149b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47149b.f47117i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(bsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47153d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47153d0.addListener(new vf1(iVar, 20));
                nVar.f47153d0.start();
                return;
        }
    }
}
