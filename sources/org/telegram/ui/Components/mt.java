package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt extends AnimatorListenerAdapter {
    public final int f28932a;
    public final s4.d1 f28933b;
    public final org.telegram.ui.Cells.s2 f28934c;
    public final rt d;

    public mt(rt rtVar, s4.d1 d1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f28932a = i10;
        this.d = rtVar;
        this.f28933b = d1Var;
        this.f28934c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28932a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f28934c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                rt rtVar = this.d;
                s4.d1 d1Var = this.f28933b;
                rtVar.d(d1Var);
                rtVar.f30508x.remove(d1Var);
                rtVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f28934c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                rt rtVar2 = this.d;
                s4.d1 d1Var2 = this.f28933b;
                rtVar2.d(d1Var2);
                rtVar2.f30508x.remove(d1Var2);
                rtVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28932a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
