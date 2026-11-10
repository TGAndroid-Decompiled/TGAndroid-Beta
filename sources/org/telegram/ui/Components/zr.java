package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class zr extends AnimatorListenerAdapter {
    public final int f41098a = 1;
    public final v4.d1 f41099b;
    public final View f41100c;
    public final ViewPropertyAnimator d;
    public final ds f41101e;

    public zr(ds dsVar, v4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f41101e = dsVar;
        this.f41099b = d1Var;
        this.d = viewPropertyAnimator;
        this.f41100c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41098a) {
            case 1:
                this.f41100c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41098a) {
            case 0:
                this.d.setListener(null);
                this.f41100c.setAlpha(1.0f);
                ds dsVar = this.f41101e;
                v4.d1 d1Var = this.f41099b;
                dsVar.d(d1Var);
                dsVar.f33069x.remove(d1Var);
                dsVar.A();
                return;
            default:
                this.d.setListener(null);
                ds dsVar2 = this.f41101e;
                v4.d1 d1Var2 = this.f41099b;
                dsVar2.u(d1Var2);
                dsVar2.v.remove(d1Var2);
                dsVar2.A();
                View view = d1Var2.f57052a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f41098a) {
            case 0:
                this.f41101e.y();
                return;
            default:
                this.f41101e.getClass();
                return;
        }
    }

    public zr(ds dsVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f41101e = dsVar;
        this.f41099b = d1Var;
        this.f41100c = view;
        this.d = viewPropertyAnimator;
    }
}
