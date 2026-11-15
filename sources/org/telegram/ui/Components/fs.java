package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fs extends AnimatorListenerAdapter {
    public final int f34683a;
    public final v4.e1 f34684b;
    public final org.telegram.ui.Cells.t2 f34685c;
    public final ks d;

    public fs(ks ksVar, v4.e1 e1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.f34683a = i7;
        this.d = ksVar;
        this.f34684b = e1Var;
        this.f34685c = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34683a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var = this.f34685c;
                t2Var.setClipProgress(0.0f);
                t2Var.setElevation(0.0f);
                ks ksVar = this.d;
                v4.e1 e1Var = this.f34684b;
                ksVar.d(e1Var);
                ksVar.f36603x.remove(e1Var);
                ksVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.f34685c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                ks ksVar2 = this.d;
                v4.e1 e1Var2 = this.f34684b;
                ksVar2.d(e1Var2);
                ksVar2.f36603x.remove(e1Var2);
                ksVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f34683a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
