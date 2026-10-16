package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jt extends AnimatorListenerAdapter {
    public final int f26130a;
    public final s4.b1 f26131b;
    public final org.telegram.ui.Cells.s2 f26132c;
    public final ot d;

    public jt(ot otVar, s4.b1 b1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f26130a = i10;
        this.d = otVar;
        this.f26131b = b1Var;
        this.f26132c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26130a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f26132c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                ot otVar = this.d;
                s4.b1 b1Var = this.f26131b;
                otVar.d(b1Var);
                otVar.f27737x.remove(b1Var);
                otVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f26132c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                ot otVar2 = this.d;
                s4.b1 b1Var2 = this.f26131b;
                otVar2.d(b1Var2);
                otVar2.f27737x.remove(b1Var2);
                otVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26130a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
