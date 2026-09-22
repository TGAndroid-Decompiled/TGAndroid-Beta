package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vs extends AnimatorListenerAdapter {
    public final int f29789a;
    public final s4.c1 f29790b;
    public final org.telegram.ui.Cells.s2 f29791c;
    public final at d;

    public vs(at atVar, s4.c1 c1Var, org.telegram.ui.Cells.s2 s2Var, int i10) {
        this.f29789a = i10;
        this.d = atVar;
        this.f29790b = c1Var;
        this.f29791c = s2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29789a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var = this.f29791c;
                s2Var.setClipProgress(0.0f);
                s2Var.setElevation(0.0f);
                at atVar = this.d;
                s4.c1 c1Var = this.f29790b;
                atVar.d(c1Var);
                atVar.f22732x.remove(c1Var);
                atVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.s2 s2Var2 = this.f29791c;
                s2Var2.setClipProgress(0.0f);
                s2Var2.setElevation(0.0f);
                at atVar2 = this.d;
                s4.c1 c1Var2 = this.f29790b;
                atVar2.d(c1Var2);
                atVar2.f22732x.remove(c1Var2);
                atVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29789a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
