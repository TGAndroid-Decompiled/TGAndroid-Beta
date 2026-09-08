package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class us extends AnimatorListenerAdapter {
    public final int f30990a;
    public final s4.c1 f30991b;
    public final org.telegram.ui.Cells.r2 f30992c;
    public final zs d;

    public us(zs zsVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f30990a = i10;
        this.d = zsVar;
        this.f30991b = c1Var;
        this.f30992c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30990a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f30992c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                zs zsVar = this.d;
                s4.c1 c1Var = this.f30991b;
                zsVar.d(c1Var);
                zsVar.f33251x.remove(c1Var);
                zsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f30992c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                zs zsVar2 = this.d;
                s4.c1 c1Var2 = this.f30991b;
                zsVar2.d(c1Var2);
                zsVar2.f33251x.remove(c1Var2);
                zsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30990a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
