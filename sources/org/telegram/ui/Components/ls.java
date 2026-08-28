package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ls extends AnimatorListenerAdapter {
    public final int f30542a;
    public final f2.q1 f30543b;
    public final org.telegram.ui.Cells.r2 f30544c;
    public final ps d;

    public ls(ps psVar, f2.q1 q1Var, org.telegram.ui.Cells.r2 r2Var, int i9) {
        this.f30542a = i9;
        this.d = psVar;
        this.f30543b = q1Var;
        this.f30544c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30542a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f30544c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                ps psVar = this.d;
                f2.q1 q1Var = this.f30543b;
                psVar.d(q1Var);
                psVar.f31743x.remove(q1Var);
                psVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f30544c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                ps psVar2 = this.d;
                f2.q1 q1Var2 = this.f30543b;
                psVar2.d(q1Var2);
                psVar2.f31743x.remove(q1Var2);
                psVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30542a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
