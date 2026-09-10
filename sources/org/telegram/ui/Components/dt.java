package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class dt extends AnimatorListenerAdapter {
    public final int f22474a;
    public final s4.c1 f22475b;
    public final int f22476c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f22477f;
    public final s4.f1 h;

    public dt(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f22474a = i12;
        this.h = f1Var;
        this.f22475b = c1Var;
        this.f22476c = i10;
        this.d = view;
        this.e = i11;
        this.f22477f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f22474a) {
            case 0:
                int i10 = this.f22476c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f22475b.f41610a;
                if (view2 instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof fg.l) {
                    ((fg.l) view2).f8100a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f22476c;
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
        switch (this.f22474a) {
            case 0:
                this.f22477f.setListener(null);
                gt gtVar = (gt) this.h;
                s4.c1 c1Var = this.f22475b;
                gtVar.v(c1Var);
                gtVar.f23428w.remove(c1Var);
                gtVar.A();
                View view = c1Var.f41610a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
                } else if (view instanceof fg.l) {
                    ((fg.l) view).f8100a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f22477f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f22475b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f41677z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f22474a) {
            case 0:
                ((gt) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
