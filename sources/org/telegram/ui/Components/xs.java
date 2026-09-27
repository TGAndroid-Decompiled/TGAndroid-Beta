package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xs extends AnimatorListenerAdapter {
    public final int f30477a;
    public final s4.c1 f30478b;
    public final org.telegram.ui.Cells.s2 f30479c;
    public final ct d;

    public xs(ct ctVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f30477a = i10;
        this.d = ctVar;
        this.f30478b = c1Var;
        this.f30479c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30477a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f30479c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                ct ctVar = this.d;
                s4.c1 c1Var = this.f30478b;
                ctVar.d(c1Var);
                ctVar.f23404x.remove(c1Var);
                ctVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f30479c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                ct ctVar2 = this.d;
                s4.c1 c1Var2 = this.f30478b;
                ctVar2.d(c1Var2);
                ctVar2.f23404x.remove(c1Var2);
                ctVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30477a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
