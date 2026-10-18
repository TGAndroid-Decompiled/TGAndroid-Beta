package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et extends AnimatorListenerAdapter {
    public final int f25994a;
    public final s4.b1 f25995b;
    public final org.telegram.ui.Cells.r2 f25996c;
    public final kt d;

    public et(kt ktVar, s4.b1 b1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f25994a = i10;
        this.d = ktVar;
        this.f25995b = b1Var;
        this.f25996c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25994a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f25996c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                kt ktVar = this.d;
                s4.b1 b1Var = this.f25995b;
                ktVar.d(b1Var);
                ktVar.f27982x.remove(b1Var);
                ktVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f25996c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                kt ktVar2 = this.d;
                s4.b1 b1Var2 = this.f25995b;
                ktVar2.d(b1Var2);
                ktVar2.f27982x.remove(b1Var2);
                ktVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f25994a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
