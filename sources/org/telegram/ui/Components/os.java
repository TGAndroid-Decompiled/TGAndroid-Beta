package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class os extends AnimatorListenerAdapter {
    public final int f38343a;
    public final v4.f1 f38344b;
    public final org.telegram.ui.Cells.u2 f38345c;
    public final ts d;

    public os(ts tsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.f38343a = i7;
        this.d = tsVar;
        this.f38344b = f1Var;
        this.f38345c = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38343a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var = this.f38345c;
                u2Var.setClipProgress(0.0f);
                u2Var.setElevation(0.0f);
                ts tsVar = this.d;
                v4.f1 f1Var = this.f38344b;
                tsVar.d(f1Var);
                tsVar.f40031x.remove(f1Var);
                tsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.f38345c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                ts tsVar2 = this.d;
                v4.f1 f1Var2 = this.f38344b;
                tsVar2.d(f1Var2);
                tsVar2.f40031x.remove(f1Var2);
                tsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38343a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
