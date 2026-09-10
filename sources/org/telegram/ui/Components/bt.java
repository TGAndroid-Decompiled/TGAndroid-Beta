package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bt extends AnimatorListenerAdapter {
    public final int f21898a;
    public final s4.c1 f21899b;
    public final org.telegram.ui.Cells.r2 f21900c;
    public final gt d;

    public bt(gt gtVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f21898a = i10;
        this.d = gtVar;
        this.f21899b = c1Var;
        this.f21900c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21898a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f21900c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                gt gtVar = this.d;
                s4.c1 c1Var = this.f21899b;
                gtVar.d(c1Var);
                gtVar.f23429x.remove(c1Var);
                gtVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f21900c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                gt gtVar2 = this.d;
                s4.c1 c1Var2 = this.f21899b;
                gtVar2.d(c1Var2);
                gtVar2.f23429x.remove(c1Var2);
                gtVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f21898a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
