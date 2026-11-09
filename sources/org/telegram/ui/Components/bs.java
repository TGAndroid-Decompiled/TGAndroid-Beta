package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class bs extends AnimatorListenerAdapter {
    public final int f32398a;
    public final v4.d1 f32399b;
    public final int f32400c;
    public final View d;
    public final int f32401e;
    public final ViewPropertyAnimator f32402f;
    public final v4.f1 h;

    public bs(v4.f1 f1Var, v4.d1 d1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f32398a = i11;
        this.h = f1Var;
        this.f32399b = d1Var;
        this.f32400c = i7;
        this.d = view;
        this.f32401e = i10;
        this.f32402f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32398a) {
            case 0:
                int i7 = this.f32400c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f32401e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f32399b.f57056a;
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
                int i10 = this.f32400c;
                View view3 = this.d;
                if (i10 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f32401e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32398a) {
            case 0:
                this.f32402f.setListener(null);
                es esVar = (es) this.h;
                v4.d1 d1Var = this.f32399b;
                esVar.v(d1Var);
                esVar.f33488w.remove(d1Var);
                esVar.A();
                View view = d1Var.f57056a;
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
                this.f32402f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.d1 d1Var2 = this.f32399b;
                kVar.P(d1Var2);
                kVar.v(d1Var2);
                kVar.f57122z.remove(d1Var2);
                kVar.G();
                kVar.z(d1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f32398a) {
            case 0:
                ((es) this.h).getClass();
                return;
            default:
                ((v4.k) this.h).getClass();
                return;
        }
    }
}
