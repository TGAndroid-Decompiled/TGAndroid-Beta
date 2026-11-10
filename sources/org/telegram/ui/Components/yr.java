package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yr extends AnimatorListenerAdapter {
    public final int f40638a;
    public final v4.d1 f40639b;
    public final org.telegram.ui.Cells.t2 f40640c;
    public final ds d;

    public yr(ds dsVar, v4.d1 d1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.f40638a = i7;
        this.d = dsVar;
        this.f40639b = d1Var;
        this.f40640c = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40638a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var = this.f40640c;
                t2Var.setClipProgress(0.0f);
                t2Var.setElevation(0.0f);
                ds dsVar = this.d;
                v4.d1 d1Var = this.f40639b;
                dsVar.d(d1Var);
                dsVar.f33069x.remove(d1Var);
                dsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.f40640c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                ds dsVar2 = this.d;
                v4.d1 d1Var2 = this.f40639b;
                dsVar2.d(d1Var2);
                dsVar2.f33069x.remove(d1Var2);
                dsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f40638a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
