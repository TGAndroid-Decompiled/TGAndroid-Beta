package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et extends AnimatorListenerAdapter {
    public final int f26070a;
    public final s4.b1 f26071b;
    public final org.telegram.ui.Cells.q2 f26072c;
    public final kt d;

    public et(kt ktVar, s4.b1 b1Var, org.telegram.ui.Cells.q2 q2Var, int i10) {
        this.f26070a = i10;
        this.d = ktVar;
        this.f26071b = b1Var;
        this.f26072c = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26070a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var = this.f26072c;
                q2Var.setClipProgress(0.0f);
                q2Var.setElevation(0.0f);
                kt ktVar = this.d;
                s4.b1 b1Var = this.f26071b;
                ktVar.d(b1Var);
                ktVar.f28150x.remove(b1Var);
                ktVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var2 = this.f26072c;
                q2Var2.setClipProgress(0.0f);
                q2Var2.setElevation(0.0f);
                kt ktVar2 = this.d;
                s4.b1 b1Var2 = this.f26071b;
                ktVar2.d(b1Var2);
                ktVar2.f28150x.remove(b1Var2);
                ktVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26070a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
