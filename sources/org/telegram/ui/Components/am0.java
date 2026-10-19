package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tf1;
public final class am0 implements Runnable {
    public final int f24644a;
    public final float f24645b;
    public final float f24646c;
    public final Object d;

    public am0(Object obj, float f7, float f10, int i10) {
        this.f24644a = i10;
        this.d = obj;
        this.f24645b = f7;
        this.f24646c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f24644a;
        float f7 = this.f24646c;
        float f10 = this.f24645b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                im0 im0Var = (im0) ((dm0) obj).f25594b;
                if (im0Var.f27279c1 != null && (view = im0Var.L1) != null) {
                    im0Var.h1(view, f10, f7, true);
                    im0Var.f27279c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f47089b;
                ValueAnimator valueAnimator = nVar.f47104c0;
                tg.h hVar = nVar.f47110h0;
                tg.h hVar2 = nVar.f47109g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f47104c0.cancel();
                    nVar.f47104c0 = null;
                }
                AnimatorSet animatorSet = nVar.f47105d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f47105d0.cancel();
                    nVar.f47105d0 = null;
                }
                if (Math.abs(nVar.f47101b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f47106e0);
                nVar.f47105d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f47101b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f47101b.f47069i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(bsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f47105d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f47105d0.addListener(new tf1(iVar, 19));
                nVar.f47105d0.start();
                return;
        }
    }
}
