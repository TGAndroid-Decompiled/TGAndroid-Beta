package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vs extends AnimatorListenerAdapter {
    public final int f29398a;
    public final s4.c1 f29399b;
    public final org.telegram.ui.Cells.r2 f29400c;
    public final at d;

    public vs(at atVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f29398a = i10;
        this.d = atVar;
        this.f29399b = c1Var;
        this.f29400c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29398a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f29400c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                at atVar = this.d;
                s4.c1 c1Var = this.f29399b;
                atVar.d(c1Var);
                atVar.f22482x.remove(c1Var);
                atVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f29400c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                at atVar2 = this.d;
                s4.c1 c1Var2 = this.f29399b;
                atVar2.d(c1Var2);
                atVar2.f22482x.remove(c1Var2);
                atVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29398a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
