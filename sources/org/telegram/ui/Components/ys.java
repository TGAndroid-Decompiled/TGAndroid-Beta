package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ys extends AnimatorListenerAdapter {
    public final int f33342a;
    public final s4.c1 f33343b;
    public final org.telegram.ui.Cells.s2 f33344c;
    public final dt d;

    public ys(dt dtVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f33342a = i10;
        this.d = dtVar;
        this.f33343b = c1Var;
        this.f33344c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33342a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f33344c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                dt dtVar = this.d;
                s4.c1 c1Var = this.f33343b;
                dtVar.d(c1Var);
                dtVar.f25867x.remove(c1Var);
                dtVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f33344c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                dt dtVar2 = this.d;
                s4.c1 c1Var2 = this.f33343b;
                dtVar2.d(c1Var2);
                dtVar2.f25867x.remove(c1Var2);
                dtVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f33342a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
