package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ks extends AnimatorListenerAdapter {
    public final int f27950a;
    public final s4.c1 f27951b;
    public final org.telegram.ui.Cells.v2 f27952c;
    public final ps d;

    public ks(ps psVar, s4.c1 c1Var, org.telegram.ui.Cells.v2 v2Var, int i10) {
        this.f27950a = i10;
        this.d = psVar;
        this.f27951b = c1Var;
        this.f27952c = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27950a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.v2 v2Var = this.f27952c;
                v2Var.setClipProgress(0.0f);
                v2Var.setElevation(0.0f);
                ps psVar = this.d;
                s4.c1 c1Var = this.f27951b;
                psVar.d(c1Var);
                psVar.f29527x.remove(c1Var);
                psVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.v2 v2Var2 = this.f27952c;
                v2Var2.setClipProgress(0.0f);
                v2Var2.setElevation(0.0f);
                ps psVar2 = this.d;
                s4.c1 c1Var2 = this.f27951b;
                psVar2.d(c1Var2);
                psVar2.f29527x.remove(c1Var2);
                psVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f27950a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
