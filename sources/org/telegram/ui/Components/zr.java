package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zr extends AnimatorListenerAdapter {
    public final int f41129a;
    public final v4.d1 f41130b;
    public final org.telegram.ui.Cells.t2 f41131c;
    public final es d;

    public zr(es esVar, v4.d1 d1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.f41129a = i7;
        this.d = esVar;
        this.f41130b = d1Var;
        this.f41131c = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41129a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var = this.f41131c;
                t2Var.setClipProgress(0.0f);
                t2Var.setElevation(0.0f);
                es esVar = this.d;
                v4.d1 d1Var = this.f41130b;
                esVar.d(d1Var);
                esVar.f33374x.remove(d1Var);
                esVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.f41131c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                es esVar2 = this.d;
                v4.d1 d1Var2 = this.f41130b;
                esVar2.d(d1Var2);
                esVar2.f33374x.remove(d1Var2);
                esVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f41129a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
