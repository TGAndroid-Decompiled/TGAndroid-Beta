package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ts extends AnimatorListenerAdapter {
    public final int f29030a;
    public final f2.l1 f29031b;
    public final org.telegram.ui.Cells.r2 f29032c;
    public final ys d;

    public ts(ys ysVar, f2.l1 l1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f29030a = i10;
        this.d = ysVar;
        this.f29031b = l1Var;
        this.f29032c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29030a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f29032c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                ys ysVar = this.d;
                f2.l1 l1Var = this.f29031b;
                ysVar.d(l1Var);
                ysVar.f31093x.remove(l1Var);
                ysVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f29032c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                ys ysVar2 = this.d;
                f2.l1 l1Var2 = this.f29031b;
                ysVar2.d(l1Var2);
                ysVar2.f31093x.remove(l1Var2);
                ysVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29030a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
