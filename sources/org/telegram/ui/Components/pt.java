package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class pt extends AnimatorListenerAdapter {
    public final int f29957a;
    public final s4.d1 f29958b;
    public final int f29959c;
    public final View d;
    public final int f29960e;
    public final ViewPropertyAnimator f29961f;
    public final s4.g1 h;

    public pt(s4.g1 g1Var, s4.d1 d1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f29957a = i12;
        this.h = g1Var;
        this.f29958b = d1Var;
        this.f29959c = i10;
        this.d = view;
        this.f29960e = i11;
        this.f29961f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f29957a) {
            case 0:
                int i10 = this.f29959c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f29960e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f29958b.f47782a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f10710a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f29959c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f29960e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29957a) {
            case 0:
                this.f29961f.setListener(null);
                st stVar = (st) this.h;
                s4.d1 d1Var = this.f29958b;
                stVar.v(d1Var);
                stVar.f30939w.remove(d1Var);
                stVar.A();
                View view = d1Var.f47782a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f10710a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f29961f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.d1 d1Var2 = this.f29958b;
                jVar.P(d1Var2);
                jVar.v(d1Var2);
                jVar.f47852z.remove(d1Var2);
                jVar.G();
                jVar.z(d1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29957a) {
            case 0:
                ((st) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
