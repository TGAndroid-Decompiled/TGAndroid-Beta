package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class hs extends AnimatorListenerAdapter {
    public final int f35332a;
    public final v4.e1 f35333b;
    public final int f35334c;
    public final View d;
    public final int f35335e;
    public final ViewPropertyAnimator f35336f;
    public final v4.g1 h;

    public hs(v4.g1 g1Var, v4.e1 e1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f35332a = i11;
        this.h = g1Var;
        this.f35333b = e1Var;
        this.f35334c = i7;
        this.d = view;
        this.f35335e = i10;
        this.f35336f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f35332a) {
            case 0:
                int i7 = this.f35334c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f35335e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f35333b.f58535a;
                if (view2 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.l) {
                    ((jg.l) view2).f17178a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f35334c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f35335e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35332a) {
            case 0:
                this.f35336f.setListener(null);
                ks ksVar = (ks) this.h;
                v4.e1 e1Var = this.f35333b;
                ksVar.v(e1Var);
                ksVar.f36602w.remove(e1Var);
                ksVar.A();
                View view = e1Var.f58535a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).f17178a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f35336f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.e1 e1Var2 = this.f35333b;
                kVar.P(e1Var2);
                kVar.v(e1Var2);
                kVar.f58596z.remove(e1Var2);
                kVar.G();
                kVar.z(e1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f35332a) {
            case 0:
                ((ks) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
