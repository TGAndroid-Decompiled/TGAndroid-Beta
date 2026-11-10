package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class as extends AnimatorListenerAdapter {
    public final int f31981a;
    public final v4.d1 f31982b;
    public final int f31983c;
    public final View d;
    public final int f31984e;
    public final ViewPropertyAnimator f31985f;
    public final v4.f1 h;

    public as(v4.f1 f1Var, v4.d1 d1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f31981a = i11;
        this.h = f1Var;
        this.f31982b = d1Var;
        this.f31983c = i7;
        this.d = view;
        this.f31984e = i10;
        this.f31985f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f31981a) {
            case 0:
                int i7 = this.f31983c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f31984e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f31982b.f57052a;
                if (view2 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.m) {
                    ((jg.m) view2).f16836a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f31983c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f31984e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31981a) {
            case 0:
                this.f31985f.setListener(null);
                ds dsVar = (ds) this.h;
                v4.d1 d1Var = this.f31982b;
                dsVar.v(d1Var);
                dsVar.f33068w.remove(d1Var);
                dsVar.A();
                View view = d1Var.f57052a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof jg.m) {
                    ((jg.m) view).f16836a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f31985f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.d1 d1Var2 = this.f31982b;
                kVar.P(d1Var2);
                kVar.v(d1Var2);
                kVar.f57118z.remove(d1Var2);
                kVar.G();
                kVar.z(d1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f31981a) {
            case 0:
                ((ds) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
