package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class os extends AnimatorListenerAdapter {
    public final int f38165a;
    public final v4.f1 f38166b;
    public final int f38167c;
    public final View d;
    public final int f38168e;
    public final ViewPropertyAnimator f38169f;
    public final v4.h1 h;

    public os(v4.h1 h1Var, v4.f1 f1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f38165a = i11;
        this.h = h1Var;
        this.f38166b = f1Var;
        this.f38167c = i7;
        this.d = view;
        this.f38168e = i10;
        this.f38169f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38165a) {
            case 0:
                int i7 = this.f38167c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f38168e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f38166b.f59122a;
                if (view2 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof jg.l) {
                    ((jg.l) view2).f17564a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f38167c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f38168e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38165a) {
            case 0:
                this.f38169f.setListener(null);
                rs rsVar = (rs) this.h;
                v4.f1 f1Var = this.f38166b;
                rsVar.v(f1Var);
                rsVar.f39288w.remove(f1Var);
                rsVar.A();
                View view = f1Var.f59122a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).f17564a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f38169f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.f1 f1Var2 = this.f38166b;
                kVar.P(f1Var2);
                kVar.v(f1Var2);
                kVar.f59179z.remove(f1Var2);
                kVar.G();
                kVar.z(f1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f38165a) {
            case 0:
                ((rs) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
