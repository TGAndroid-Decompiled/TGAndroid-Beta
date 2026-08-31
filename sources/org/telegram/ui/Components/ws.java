package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ws extends AnimatorListenerAdapter {
    public final int f32841a = 1;
    public final f2.m1 f32842b;
    public final View f32843c;
    public final ViewPropertyAnimator d;
    public final at f32844e;

    public ws(at atVar, f2.m1 m1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f32844e = atVar;
        this.f32842b = m1Var;
        this.d = viewPropertyAnimator;
        this.f32843c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f32841a) {
            case 1:
                this.f32843c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32841a) {
            case 0:
                this.d.setListener(null);
                this.f32843c.setAlpha(1.0f);
                at atVar = this.f32844e;
                f2.m1 m1Var = this.f32842b;
                atVar.d(m1Var);
                atVar.f25343x.remove(m1Var);
                atVar.A();
                return;
            default:
                this.d.setListener(null);
                at atVar2 = this.f32844e;
                f2.m1 m1Var2 = this.f32842b;
                atVar2.u(m1Var2);
                atVar2.v.remove(m1Var2);
                atVar2.A();
                View view = m1Var2.f5875a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32841a) {
            case 0:
                this.f32844e.y();
                return;
            default:
                this.f32844e.getClass();
                return;
        }
    }

    public ws(at atVar, f2.m1 m1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f32844e = atVar;
        this.f32842b = m1Var;
        this.f32843c = view;
        this.d = viewPropertyAnimator;
    }
}
