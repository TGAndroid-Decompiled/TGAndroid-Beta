package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pt extends AnimatorListenerAdapter {
    public final int f29566a;
    public final s4.d1 f29567b;
    public final org.telegram.ui.Cells.s2 f29568c;
    public final ut d;

    public pt(ut utVar, s4.d1 d1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f29566a = i10;
        this.d = utVar;
        this.f29567b = d1Var;
        this.f29568c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29566a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f29568c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                ut utVar = this.d;
                s4.d1 d1Var = this.f29567b;
                utVar.d(d1Var);
                utVar.f31259x.remove(d1Var);
                utVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f29568c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                ut utVar2 = this.d;
                s4.d1 d1Var2 = this.f29567b;
                utVar2.d(d1Var2);
                utVar2.f31259x.remove(d1Var2);
                utVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29566a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
