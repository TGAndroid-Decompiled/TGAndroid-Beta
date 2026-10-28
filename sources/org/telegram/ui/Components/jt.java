package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class jt extends AnimatorListenerAdapter {
    public final int f29761a;
    public final s4.e1 f29762b;
    public final int f29763c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f29764f;
    public final s4.g1 h;

    public jt(s4.g1 g1Var, s4.e1 e1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f29761a = i12;
        this.h = g1Var;
        this.f29762b = e1Var;
        this.f29763c = i10;
        this.d = view;
        this.e = i11;
        this.f29764f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29761a) {
            case 0:
                int i10 = this.f29763c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f29762b.f47773a;
                if (view2 instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof ig.m) {
                    ((ig.m) view2).f14159a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f29763c;
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
        switch (this.f29761a) {
            case 0:
                this.f29764f.setListener(null);
                mt mtVar = (mt) this.h;
                s4.e1 e1Var = this.f29762b;
                mtVar.v(e1Var);
                mtVar.f30627w.remove(e1Var);
                mtVar.A();
                View view = e1Var.f47773a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                } else if (view instanceof ig.m) {
                    ((ig.m) view).f14159a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f29764f.setListener(null);
                s4.l lVar = (s4.l) this.h;
                s4.e1 e1Var2 = this.f29762b;
                lVar.P(e1Var2);
                lVar.v(e1Var2);
                lVar.f47832z.remove(e1Var2);
                lVar.G();
                lVar.z(e1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29761a) {
            case 0:
                ((mt) this.h).getClass();
                return;
            default:
                ((s4.l) this.h).getClass();
                return;
        }
    }
}
