package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nt extends AnimatorListenerAdapter {
    public final int f29229a;
    public final s4.d1 f29230b;
    public final org.telegram.ui.Cells.s2 f29231c;
    public final st d;

    public nt(st stVar, s4.d1 d1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f29229a = i10;
        this.d = stVar;
        this.f29230b = d1Var;
        this.f29231c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29229a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f29231c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                st stVar = this.d;
                s4.d1 d1Var = this.f29230b;
                stVar.d(d1Var);
                stVar.f30860x.remove(d1Var);
                stVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f29231c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                st stVar2 = this.d;
                s4.d1 d1Var2 = this.f29230b;
                stVar2.d(d1Var2);
                stVar2.f30860x.remove(d1Var2);
                stVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29229a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
