package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class pt extends AnimatorListenerAdapter {
    public final int f29587a = 1;
    public final s4.d1 f29588b;
    public final View f29589c;
    public final ViewPropertyAnimator d;
    public final tt f29590e;

    public pt(tt ttVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f29590e = ttVar;
        this.f29588b = d1Var;
        this.d = viewPropertyAnimator;
        this.f29589c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f29587a) {
            case 1:
                this.f29589c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29587a) {
            case 0:
                this.d.setListener(null);
                this.f29589c.setAlpha(1.0f);
                tt ttVar = this.f29590e;
                s4.d1 d1Var = this.f29588b;
                ttVar.d(d1Var);
                ttVar.f30975x.remove(d1Var);
                ttVar.A();
                return;
            default:
                this.d.setListener(null);
                tt ttVar2 = this.f29590e;
                s4.d1 d1Var2 = this.f29588b;
                ttVar2.u(d1Var2);
                ttVar2.v.remove(d1Var2);
                ttVar2.A();
                View view = d1Var2.f47889a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f29587a) {
            case 0:
                this.f29590e.y();
                return;
            default:
                this.f29590e.getClass();
                return;
        }
    }

    public pt(tt ttVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f29590e = ttVar;
        this.f29588b = d1Var;
        this.f29589c = view;
        this.d = viewPropertyAnimator;
    }
}
