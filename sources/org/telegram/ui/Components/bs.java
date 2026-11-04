package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class bs extends AnimatorListenerAdapter {
    public final int f32376a;
    public final u4.d1 f32377b;
    public final int f32378c;
    public final View d;
    public final int f32379e;
    public final ViewPropertyAnimator f32380f;
    public final u4.f1 h;

    public bs(u4.f1 f1Var, u4.d1 d1Var, int i3, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f32376a = i11;
        this.h = f1Var;
        this.f32377b = d1Var;
        this.f32378c = i3;
        this.d = view;
        this.f32379e = i10;
        this.f32380f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32376a) {
            case 0:
                int i3 = this.f32378c;
                View view = this.d;
                if (i3 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f32379e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f32377b.f55540a;
                if (view2 instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof kg.l) {
                    ((kg.l) view2).f17078a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = this.f32378c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f32379e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32376a) {
            case 0:
                this.f32380f.setListener(null);
                es esVar = (es) this.h;
                u4.d1 d1Var = this.f32377b;
                esVar.v(d1Var);
                esVar.f33460w.remove(d1Var);
                esVar.A();
                View view = d1Var.f55540a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof kg.l) {
                    ((kg.l) view).f17078a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f32380f.setListener(null);
                u4.k kVar = (u4.k) this.h;
                u4.d1 d1Var2 = this.f32377b;
                kVar.P(d1Var2);
                kVar.v(d1Var2);
                kVar.f55607z.remove(d1Var2);
                kVar.G();
                kVar.z(d1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32376a) {
            case 0:
                ((es) this.h).getClass();
                return;
            default:
                ((u4.k) this.h).getClass();
                return;
        }
    }
}
