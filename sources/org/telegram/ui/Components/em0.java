package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class em0 implements Runnable {
    public final int f27887a;
    public final float f27888b;
    public final float f27889c;
    public final Object d;

    public em0(Object obj, float f7, float f10, int i10) {
        this.f27887a = i10;
        this.d = obj;
        this.f27888b = f7;
        this.f27889c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f27887a;
        float f7 = this.f27889c;
        float f10 = this.f27888b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                nm0 nm0Var = (nm0) ((hm0) obj).f29026b;
                if (nm0Var.f30966c1 != null && (view = nm0Var.L1) != null) {
                    nm0Var.k1(view, f10, f7, true);
                    nm0Var.f30966c1 = null;
                    return;
                }
                return;
            default:
                ug.i iVar = (ug.i) obj;
                ug.n nVar = iVar.f49839b;
                ValueAnimator valueAnimator = nVar.f49854c0;
                ug.h hVar = nVar.f49860h0;
                ug.h hVar2 = nVar.f49859g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f49854c0.cancel();
                    nVar.f49854c0 = null;
                }
                AnimatorSet animatorSet = nVar.f49855d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f49855d0.cancel();
                    nVar.f49855d0 = null;
                }
                if (Math.abs(nVar.f49851b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f49856e0);
                nVar.f49855d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f49851b.d, f10);
                ofFloat.addUpdateListener(hVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                ds dsVar = ds.h;
                ofFloat.setInterpolator(dsVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(hVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f49851b.f49819i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(dsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f49855d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f49855d0.addListener(new org.telegram.ui.hc1(iVar, 22));
                nVar.f49855d0.start();
                return;
        }
    }
}
