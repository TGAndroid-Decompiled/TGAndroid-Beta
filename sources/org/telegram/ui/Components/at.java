package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class at extends AnimatorListenerAdapter {
    public final int f24652a;
    public final s4.c1 f24653b;
    public final int f24654c;
    public final View d;
    public final int f24655e;
    public final ViewPropertyAnimator f24656f;
    public final s4.f1 h;

    public at(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f24652a = i12;
        this.h = f1Var;
        this.f24653b = c1Var;
        this.f24654c = i10;
        this.d = view;
        this.f24655e = i11;
        this.f24656f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24652a) {
            case 0:
                int i10 = this.f24654c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f24655e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f24653b.f46523a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f10701a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f24654c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f24655e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24652a) {
            case 0:
                this.f24656f.setListener(null);
                dt dtVar = (dt) this.h;
                s4.c1 c1Var = this.f24653b;
                dtVar.v(c1Var);
                dtVar.f25818w.remove(c1Var);
                dtVar.A();
                View view = c1Var.f46523a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f10701a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f24656f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f24653b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f46598z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24652a) {
            case 0:
                ((dt) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
