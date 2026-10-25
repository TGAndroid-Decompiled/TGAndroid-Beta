package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dm0 implements Runnable {
    public final int f27561a;
    public final float f27562b;
    public final float f27563c;
    public final Object d;

    public dm0(Object obj, float f7, float f10, int i10) {
        this.f27561a = i10;
        this.d = obj;
        this.f27562b = f7;
        this.f27563c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f27561a;
        float f7 = this.f27563c;
        float f10 = this.f27562b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                mm0 mm0Var = (mm0) ((gm0) obj).f28601b;
                if (mm0Var.f30622c1 != null && (view = mm0Var.L1) != null) {
                    mm0Var.k1(view, f10, f7, true);
                    mm0Var.f30622c1 = null;
                    return;
                }
                return;
            default:
                ug.i iVar = (ug.i) obj;
                ug.n nVar = iVar.f49801b;
                ValueAnimator valueAnimator = nVar.f49816c0;
                ug.h hVar = nVar.f49822h0;
                ug.h hVar2 = nVar.f49821g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    nVar.f49816c0.cancel();
                    nVar.f49816c0 = null;
                }
                AnimatorSet animatorSet = nVar.f49817d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    nVar.f49817d0.cancel();
                    nVar.f49817d0 = null;
                }
                if (Math.abs(nVar.f49813b.d) > 10.0f) {
                    nVar.l();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(nVar.f49818e0);
                nVar.f49817d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.f49813b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(nVar.f49813b.f49781i, f7);
                ofFloat3.addUpdateListener(hVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(dsVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(hVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                nVar.f49817d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                nVar.f49817d0.addListener(new org.telegram.ui.fc1(iVar, 22));
                nVar.f49817d0.start();
                return;
        }
    }
}
