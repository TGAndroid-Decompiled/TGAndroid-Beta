package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.fi1;
public final class em0 implements Runnable {
    public final int f24742a;
    public final float f24743b;
    public final float f24744c;
    public final Object d;

    public em0(Object obj, float f7, float f10, int i10) {
        this.f24742a = i10;
        this.d = obj;
        this.f24743b = f7;
        this.f24744c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f24742a;
        float f7 = this.f24744c;
        float f10 = this.f24743b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                mm0 mm0Var = (mm0) ((hm0) obj).f25711b;
                if (mm0Var.f27417c1 != null && (view = mm0Var.L1) != null) {
                    mm0Var.h1(view, f10, f7, true);
                    mm0Var.f27417c1 = null;
                    return;
                }
                return;
            default:
                tg.i iVar = (tg.i) obj;
                tg.n nVar = iVar.f45728b;
                ValueAnimator valueAnimator = nVar.W;
                tg.h hVar = nVar.f45745e0;
                tg.h hVar2 = nVar.f45744d0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.W.cancel();
                    nVar.W = null;
                }
                AnimatorSet animatorSet = nVar.f45739a0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f45739a0.cancel();
                    nVar.f45739a0 = null;
                }
                if (Math.abs(nVar.f45740b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f45741b0);
                nVar.f45739a0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f45740b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                es esVar = es.h;
                ofFloat.setInterpolator(esVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f45740b.f45708i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(esVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f45739a0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f45739a0.addListener(new fi1(iVar, 17));
                nVar.f45739a0.start();
                return;
        }
    }
}
