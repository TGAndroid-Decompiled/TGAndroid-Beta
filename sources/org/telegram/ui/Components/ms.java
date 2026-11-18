package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ms extends AnimatorListenerAdapter {
    public final int f37620a;
    public final v4.f1 f37621b;
    public final org.telegram.ui.Cells.u2 f37622c;
    public final rs d;

    public ms(rs rsVar, v4.f1 f1Var, org.telegram.ui.Cells.u2 u2Var, int i7) {
        this.f37620a = i7;
        this.d = rsVar;
        this.f37621b = f1Var;
        this.f37622c = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37620a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var = this.f37622c;
                u2Var.setClipProgress(0.0f);
                u2Var.setElevation(0.0f);
                rs rsVar = this.d;
                v4.f1 f1Var = this.f37621b;
                rsVar.d(f1Var);
                rsVar.f39289x.remove(f1Var);
                rsVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.u2 u2Var2 = this.f37622c;
                u2Var2.setClipProgress(0.0f);
                u2Var2.setElevation(0.0f);
                rs rsVar2 = this.d;
                v4.f1 f1Var2 = this.f37621b;
                rsVar2.d(f1Var2);
                rsVar2.f39289x.remove(f1Var2);
                rsVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f37620a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
