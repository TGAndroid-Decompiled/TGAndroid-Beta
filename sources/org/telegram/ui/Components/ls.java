package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ls extends AnimatorListenerAdapter {
    public final int f37210a;
    public final v4.f1 f37211b;
    public final org.telegram.ui.Cells.u2 f37212c;
    public final qs d;

    public ls(qs qsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.f37210a = i7;
        this.d = qsVar;
        this.f37211b = f1Var;
        this.f37212c = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37210a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var = this.f37212c;
                u2Var.setClipProgress(0.0f);
                u2Var.setElevation(0.0f);
                qs qsVar = this.d;
                v4.f1 f1Var = this.f37211b;
                qsVar.d(f1Var);
                qsVar.f38992x.remove(f1Var);
                qsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.f37212c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                qs qsVar2 = this.d;
                v4.f1 f1Var2 = this.f37211b;
                qsVar2.d(f1Var2);
                qsVar2.f38992x.remove(f1Var2);
                qsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f37210a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
