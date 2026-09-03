package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vs extends AnimatorListenerAdapter {
    public final int f32534a;
    public final f2.m1 f32535b;
    public final org.telegram.ui.Cells.r2 f32536c;
    public final at d;

    public vs(at atVar, f2.m1 m1Var, org.telegram.ui.Cells.r2 r2Var, int i10) {
        this.f32534a = i10;
        this.d = atVar;
        this.f32535b = m1Var;
        this.f32536c = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32534a) {
            case 0:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var = this.f32536c;
                r2Var.setClipProgress(0.0f);
                r2Var.setElevation(0.0f);
                at atVar = this.d;
                f2.m1 m1Var = this.f32535b;
                atVar.d(m1Var);
                atVar.f25370x.remove(m1Var);
                atVar.A();
                return;
            default:
                animator.removeAllListeners();
                org.telegram.ui.Cells.r2 r2Var2 = this.f32536c;
                r2Var2.setClipProgress(0.0f);
                r2Var2.setElevation(0.0f);
                at atVar2 = this.d;
                f2.m1 m1Var2 = this.f32535b;
                atVar2.d(m1Var2);
                atVar2.f25370x.remove(m1Var2);
                atVar2.A();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32534a) {
            case 0:
                this.d.y();
                return;
            default:
                this.d.y();
                return;
        }
    }
}
