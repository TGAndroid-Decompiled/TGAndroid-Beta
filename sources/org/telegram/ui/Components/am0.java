package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vf1;
public final class am0 implements Runnable {
    public final int f24662a;
    public final float f24663b;
    public final float f24664c;
    public final Object d;

    public am0(Object obj, float f7, float f10, int i10) {
        this.f24662a = i10;
        this.d = obj;
        this.f24663b = f7;
        this.f24664c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f24662a;
        float f7 = this.f24664c;
        float f10 = this.f24663b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                im0 im0Var = (im0) ((dm0) obj).f25621b;
                if (im0Var.f27262c1 != null && (view = im0Var.L1) != null) {
                    im0Var.h1(view, f10, f7, true);
                    im0Var.f27262c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47115b;
                ValueAnimator valueAnimator = nVar.W;
                tg.h hVar = nVar.f47132e0;
                tg.h hVar2 = nVar.f47131d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f47126a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47126a0.cancel();
                    nVar.f47126a0 = null;
                }
                if (Math.abs(nVar.f47127b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47128b0);
                nVar.f47126a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47127b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47127b.f47095i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(bsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47126a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47126a0.addListener(new vf1(iVar, 20));
                nVar.f47126a0.start();
                return;
        }
    }
}
