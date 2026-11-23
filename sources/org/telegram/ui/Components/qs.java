package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class qs extends AnimatorListenerAdapter {
    public final int f38984a;
    public final v4.f1 f38985b;
    public final int f38986c;
    public final View d;
    public final int f38987e;
    public final ViewPropertyAnimator f38988f;
    public final v4.h1 h;

    public qs(v4.h1 h1Var, v4.f1 f1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f38984a = i11;
        this.h = h1Var;
        this.f38985b = f1Var;
        this.f38986c = i7;
        this.d = view;
        this.f38987e = i10;
        this.f38988f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38984a) {
            case 0:
                int i7 = this.f38986c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f38987e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f38985b.f59165a;
                if (view2 instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.l) {
                    ((jg.l) view2).f17589a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f38986c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f38987e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38984a) {
            case 0:
                this.f38988f.setListener(null);
                ts tsVar = (ts) this.h;
                v4.f1 f1Var = this.f38985b;
                tsVar.v(f1Var);
                tsVar.f40030w.remove(f1Var);
                tsVar.A();
                View view = f1Var.f59165a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).f17589a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f38988f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.f1 f1Var2 = this.f38985b;
                kVar.P(f1Var2);
                kVar.v(f1Var2);
                kVar.f59222z.remove(f1Var2);
                kVar.G();
                kVar.z(f1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38984a) {
            case 0:
                ((ts) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
