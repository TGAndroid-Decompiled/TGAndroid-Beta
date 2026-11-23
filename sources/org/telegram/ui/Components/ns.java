package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ns extends AnimatorListenerAdapter {
    public final int f37902a;
    public final v4.f1 f37903b;
    public final int f37904c;
    public final View d;
    public final int f37905e;
    public final ViewPropertyAnimator f37906f;
    public final v4.h1 h;

    public ns(v4.h1 h1Var, v4.f1 f1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f37902a = i11;
        this.h = h1Var;
        this.f37903b = f1Var;
        this.f37904c = i7;
        this.d = view;
        this.f37905e = i10;
        this.f37906f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37902a) {
            case 0:
                int i7 = this.f37904c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f37905e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f37903b.f59245a;
                if (view2 instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.l) {
                    ((jg.l) view2).f17657a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f37904c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f37905e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37902a) {
            case 0:
                this.f37906f.setListener(null);
                qs qsVar = (qs) this.h;
                v4.f1 f1Var = this.f37903b;
                qsVar.v(f1Var);
                qsVar.f38991w.remove(f1Var);
                qsVar.A();
                View view = f1Var.f59245a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).f17657a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f37906f.setListener(null);
                v4.l lVar = (v4.l) this.h;
                v4.f1 f1Var2 = this.f37903b;
                lVar.P(f1Var2);
                lVar.v(f1Var2);
                lVar.f59306z.remove(f1Var2);
                lVar.G();
                lVar.z(f1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f37902a) {
            case 0:
                ((qs) this.h).getClass();
                return;
            default:
                ((v4.l) this.h).getClass();
                return;
        }
    }
}
