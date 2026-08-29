package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ps extends AnimatorListenerAdapter {
    public final int f31760a;
    public final f2.n1 f31761b;
    public final org.telegram.ui.Cells.p2 f31762c;
    public final us d;

    public ps(us usVar, f2.n1 n1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.f31760a = i10;
        this.d = usVar;
        this.f31761b = n1Var;
        this.f31762c = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31760a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var = this.f31762c;
                p2Var.setClipProgress(0.0f);
                p2Var.setElevation(0.0f);
                us usVar = this.d;
                f2.n1 n1Var = this.f31761b;
                usVar.d(n1Var);
                usVar.f33312x.remove(n1Var);
                usVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.f31762c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                us usVar2 = this.d;
                f2.n1 n1Var2 = this.f31761b;
                usVar2.d(n1Var2);
                usVar2.f33312x.remove(n1Var2);
                usVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31760a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
