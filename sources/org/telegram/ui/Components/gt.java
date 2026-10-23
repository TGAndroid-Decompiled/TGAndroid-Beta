package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class gt extends AnimatorListenerAdapter {
    public final int f26711a;
    public final s4.b1 f26712b;
    public final int f26713c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f26714f;
    public final s4.e1 h;

    public gt(s4.e1 e1Var, s4.b1 b1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f26711a = i12;
        this.h = e1Var;
        this.f26712b = b1Var;
        this.f26713c = i10;
        this.d = view;
        this.e = i11;
        this.f26714f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f26711a) {
            case 0:
                int i10 = this.f26713c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f26712b.f46343a;
                if (view2 instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof hg.l) {
                    ((hg.l) view2).f11990a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f26713c;
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
        switch (this.f26711a) {
            case 0:
                this.f26714f.setListener(null);
                kt ktVar = (kt) this.h;
                s4.b1 b1Var = this.f26712b;
                ktVar.v(b1Var);
                ktVar.f28149w.remove(b1Var);
                ktVar.A();
                View view = b1Var.f46343a;
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setMoving(false);
                } else if (view instanceof hg.l) {
                    ((hg.l) view).f11990a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f26714f.setListener(null);
                s4.k kVar = (s4.k) this.h;
                s4.b1 b1Var2 = this.f26712b;
                kVar.P(b1Var2);
                kVar.v(b1Var2);
                kVar.f46416z.remove(b1Var2);
                kVar.G();
                kVar.z(b1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f26711a) {
            case 0:
                ((kt) this.h).getClass();
                return;
            default:
                ((s4.k) this.h).getClass();
                return;
        }
    }
}
