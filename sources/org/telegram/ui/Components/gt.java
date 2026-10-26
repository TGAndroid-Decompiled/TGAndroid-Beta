package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gt extends AnimatorListenerAdapter {
    public final int f28711a;
    public final s4.e1 f28712b;
    public final org.telegram.ui.Cells.p2 f28713c;
    public final mt d;

    public gt(mt mtVar, s4.e1 e1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.f28711a = i10;
        this.d = mtVar;
        this.f28712b = e1Var;
        this.f28713c = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28711a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var = this.f28713c;
                p2Var.setClipProgress(0.0f);
                p2Var.setElevation(0.0f);
                mt mtVar = this.d;
                s4.e1 e1Var = this.f28712b;
                mtVar.d(e1Var);
                mtVar.f30749x.remove(e1Var);
                mtVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.f28713c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                mt mtVar2 = this.d;
                s4.e1 e1Var2 = this.f28712b;
                mtVar2.d(e1Var2);
                mtVar2.f30749x.remove(e1Var2);
                mtVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28711a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
