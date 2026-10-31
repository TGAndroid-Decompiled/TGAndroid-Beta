package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class ms extends AnimatorListenerAdapter {
    public final int f28587a;
    public final s4.c1 f28588b;
    public final int f28589c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f28590f;
    public final s4.f1 h;

    public ms(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f28587a = i12;
        this.h = f1Var;
        this.f28588b = c1Var;
        this.f28589c = i10;
        this.d = view;
        this.e = i11;
        this.f28590f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f28587a) {
            case 0:
                int i10 = this.f28589c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f28588b.f47898a;
                if (view2 instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof zf.l) {
                    ((zf.l) view2).f55558a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f28589c;
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
        switch (this.f28587a) {
            case 0:
                this.f28590f.setListener(null);
                ps psVar = (ps) this.h;
                s4.c1 c1Var = this.f28588b;
                psVar.v(c1Var);
                psVar.f29416w.remove(c1Var);
                psVar.A();
                View view = c1Var.f47898a;
                if (view instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view).setMoving(false);
                } else if (view instanceof zf.l) {
                    ((zf.l) view).f55558a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f28590f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f28588b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f47955z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f28587a) {
            case 0:
                ((ps) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
