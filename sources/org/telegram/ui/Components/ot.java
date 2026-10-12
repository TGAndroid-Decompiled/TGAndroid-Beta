package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ot extends AnimatorListenerAdapter {
    public final int f29290a;
    public final s4.d1 f29291b;
    public final org.telegram.ui.Cells.s2 f29292c;
    public final tt d;

    public ot(tt ttVar, s4.d1 d1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f29290a = i10;
        this.d = ttVar;
        this.f29291b = d1Var;
        this.f29292c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29290a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f29292c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                tt ttVar = this.d;
                s4.d1 d1Var = this.f29291b;
                ttVar.d(d1Var);
                ttVar.f30975x.remove(d1Var);
                ttVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f29292c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                tt ttVar2 = this.d;
                s4.d1 d1Var2 = this.f29291b;
                ttVar2.d(d1Var2);
                ttVar2.f30975x.remove(d1Var2);
                ttVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29290a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
