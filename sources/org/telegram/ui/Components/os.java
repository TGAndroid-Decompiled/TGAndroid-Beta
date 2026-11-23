package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class os extends AnimatorListenerAdapter {
    public final int f38313a;
    public final v4.e1 f38314b;
    public final org.telegram.ui.Cells.u2 f38315c;
    public final ts d;

    public os(ts tsVar, v4.e1 e1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.f38313a = i7;
        this.d = tsVar;
        this.f38314b = e1Var;
        this.f38315c = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38313a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var = this.f38315c;
                u2Var.setClipProgress(0.0f);
                u2Var.setElevation(0.0f);
                ts tsVar = this.d;
                v4.e1 e1Var = this.f38314b;
                tsVar.d(e1Var);
                tsVar.f40009x.remove(e1Var);
                tsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.f38315c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                ts tsVar2 = this.d;
                v4.e1 e1Var2 = this.f38314b;
                tsVar2.d(e1Var2);
                tsVar2.f40009x.remove(e1Var2);
                tsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38313a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
