package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fs extends AnimatorListenerAdapter {
    public final int f34687a;
    public final v4.e1 f34688b;
    public final org.telegram.ui.Cells.t2 f34689c;
    public final ks d;

    public fs(ks ksVar, v4.e1 e1Var, org.telegram.ui.Cells.t2 t2Var, int i7) {
        this.f34687a = i7;
        this.d = ksVar;
        this.f34688b = e1Var;
        this.f34689c = t2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34687a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var = this.f34689c;
                t2Var.setClipProgress(0.0f);
                t2Var.setElevation(0.0f);
                ks ksVar = this.d;
                v4.e1 e1Var = this.f34688b;
                ksVar.d(e1Var);
                ksVar.f36591x.remove(e1Var);
                ksVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.t2 t2Var2 = this.f34689c;
                t2Var2.setClipProgress(0.0f);
                t2Var2.setElevation(0.0f);
                ks ksVar2 = this.d;
                v4.e1 e1Var2 = this.f34688b;
                ksVar2.d(e1Var2);
                ksVar2.f36591x.remove(e1Var2);
                ksVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f34687a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
