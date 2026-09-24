package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ys extends AnimatorListenerAdapter {
    public final int f30667a;
    public final s4.c1 f30668b;
    public final int f30669c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f30670f;
    public final s4.f1 h;

    public ys(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f30667a = i12;
        this.h = f1Var;
        this.f30668b = c1Var;
        this.f30669c = i10;
        this.d = view;
        this.e = i11;
        this.f30670f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f30667a) {
            case 0:
                int i10 = this.f30669c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f30668b.f42946a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f9829a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f30669c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30667a) {
            case 0:
                this.f30670f.setListener(null);
                bt btVar = (bt) this.h;
                s4.c1 c1Var = this.f30668b;
                btVar.v(c1Var);
                btVar.f23060w.remove(c1Var);
                btVar.A();
                View view = c1Var.f42946a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f9829a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f30670f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f30668b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f43013z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f30667a) {
            case 0:
                ((bt) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
