package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct extends AnimatorListenerAdapter {
    public final int f25466a;
    public final s4.b1 f25467b;
    public final org.telegram.ui.Cells.q2 f25468c;
    public final ht d;

    public ct(ht htVar, s4.b1 b1Var, org.telegram.ui.Cells.q2 q2Var, int i10) {
        this.f25466a = i10;
        this.d = htVar;
        this.f25467b = b1Var;
        this.f25468c = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25466a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var = this.f25468c;
                q2Var.setClipProgress(0.0f);
                q2Var.setElevation(0.0f);
                ht htVar = this.d;
                s4.b1 b1Var = this.f25467b;
                htVar.d(b1Var);
                htVar.f27168x.remove(b1Var);
                htVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.q2 q2Var2 = this.f25468c;
                q2Var2.setClipProgress(0.0f);
                q2Var2.setElevation(0.0f);
                ht htVar2 = this.d;
                s4.b1 b1Var2 = this.f25467b;
                htVar2.d(b1Var2);
                htVar2.f27168x.remove(b1Var2);
                htVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f25466a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
