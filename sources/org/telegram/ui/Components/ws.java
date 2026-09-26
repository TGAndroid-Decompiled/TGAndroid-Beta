package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ws extends AnimatorListenerAdapter {
    public final int f30174a;
    public final s4.c1 f30175b;
    public final org.telegram.ui.Cells.s2 f30176c;
    public final bt d;

    public ws(bt btVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f30174a = i10;
        this.d = btVar;
        this.f30175b = c1Var;
        this.f30176c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30174a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f30176c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                bt btVar = this.d;
                s4.c1 c1Var = this.f30175b;
                btVar.d(c1Var);
                btVar.f23087x.remove(c1Var);
                btVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f30176c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                bt btVar2 = this.d;
                s4.c1 c1Var2 = this.f30175b;
                btVar2.d(c1Var2);
                btVar2.f23087x.remove(c1Var2);
                btVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30174a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
