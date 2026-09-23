package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ws extends AnimatorListenerAdapter {
    public final int f29800a;
    public final s4.c1 f29801b;
    public final org.telegram.ui.Cells.r2 f29802c;
    public final bt d;

    public ws(bt btVar, s4.c1 c1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f29800a = i10;
        this.d = btVar;
        this.f29801b = c1Var;
        this.f29802c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29800a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f29802c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                bt btVar = this.d;
                s4.c1 c1Var = this.f29801b;
                btVar.d(c1Var);
                btVar.f22843x.remove(c1Var);
                btVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f29802c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                bt btVar2 = this.d;
                s4.c1 c1Var2 = this.f29801b;
                btVar2.d(c1Var2);
                btVar2.f22843x.remove(c1Var2);
                btVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29800a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
