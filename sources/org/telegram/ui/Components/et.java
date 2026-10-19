package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et extends AnimatorListenerAdapter {
    public final int f26018a;
    public final s4.b1 f26019b;
    public final org.telegram.ui.Cells.r2 f26020c;
    public final kt d;

    public et(kt ktVar, s4.b1 b1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f26018a = i10;
        this.d = ktVar;
        this.f26019b = b1Var;
        this.f26020c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26018a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f26020c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                kt ktVar = this.d;
                s4.b1 b1Var = this.f26019b;
                ktVar.d(b1Var);
                ktVar.f27968x.remove(b1Var);
                ktVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f26020c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                kt ktVar2 = this.d;
                s4.b1 b1Var2 = this.f26019b;
                ktVar2.d(b1Var2);
                ktVar2.f27968x.remove(b1Var2);
                ktVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26018a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
