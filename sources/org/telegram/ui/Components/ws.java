package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ws extends AnimatorListenerAdapter {
    public final int f32330a;
    public final s4.c1 f32331b;
    public final int f32332c;
    public final View d;
    public final int f32333e;
    public final ViewPropertyAnimator f32334f;
    public final s4.f1 h;

    public ws(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f32330a = i12;
        this.h = f1Var;
        this.f32331b = c1Var;
        this.f32332c = i10;
        this.d = view;
        this.f32333e = i11;
        this.f32334f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32330a) {
            case 0:
                int i10 = this.f32332c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f32333e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f32331b.f45739a;
                if (view2 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof hg.l) {
                    ((hg.l) view2).f11162a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f32332c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f32333e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32330a) {
            case 0:
                this.f32334f.setListener(null);
                zs zsVar = (zs) this.h;
                s4.c1 c1Var = this.f32331b;
                zsVar.v(c1Var);
                zsVar.f33224w.remove(c1Var);
                zsVar.A();
                View view = c1Var.f45739a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                } else if (view instanceof hg.l) {
                    ((hg.l) view).f11162a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f32334f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f32331b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f45814z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32330a) {
            case 0:
                ((zs) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
