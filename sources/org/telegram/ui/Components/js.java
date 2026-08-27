package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class js extends AnimatorListenerAdapter {

    public final int f29803a;

    public final f2.o1 f29804b;

    public final org.telegram.ui.Cells.p2 f29805c;
    public final os d;

    public js(os osVar, f2.o1 o1Var, org.telegram.ui.Cells.p2 p2Var, int i10) {
        this.f29803a = i10;
        this.d = osVar;
        this.f29804b = o1Var;
        this.f29805c = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29803a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var = this.f29805c;
                p2Var.setClipProgress(0.0f);
                p2Var.setElevation(0.0f);
                os osVar = this.d;
                f2.o1 o1Var = this.f29804b;
                osVar.d(o1Var);
                osVar.f31404x.remove(o1Var);
                osVar.A();
                break;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.p2 p2Var2 = this.f29805c;
                p2Var2.setClipProgress(0.0f);
                p2Var2.setElevation(0.0f);
                os osVar2 = this.d;
                f2.o1 o1Var2 = this.f29804b;
                osVar2.d(o1Var2);
                osVar2.f31404x.remove(o1Var2);
                osVar2.A();
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29803a) {
            case 0:
                this.d.y();
                break;
            default:
                this.d.y();
                break;
        }
    }
}
