package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ss extends AnimatorListenerAdapter {
    public final int f28799a;
    public final f2.l1 f28800b;
    public final org.telegram.ui.Cells.q2 f28801c;
    public final xs d;

    public ss(xs xsVar, f2.l1 l1Var, org.telegram.ui.Cells.q2 q2Var, int i10) {
        this.f28799a = i10;
        this.d = xsVar;
        this.f28800b = l1Var;
        this.f28801c = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28799a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var = this.f28801c;
                q2Var.setClipProgress(0.0f);
                q2Var.setElevation(0.0f);
                xs xsVar = this.d;
                f2.l1 l1Var = this.f28800b;
                xsVar.d(l1Var);
                xsVar.f30707x.remove(l1Var);
                xsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var2 = this.f28801c;
                q2Var2.setClipProgress(0.0f);
                q2Var2.setElevation(0.0f);
                xs xsVar2 = this.d;
                f2.l1 l1Var2 = this.f28800b;
                xsVar2.d(l1Var2);
                xsVar2.f30707x.remove(l1Var2);
                xsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28799a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
