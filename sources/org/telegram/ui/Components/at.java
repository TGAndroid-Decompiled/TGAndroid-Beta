package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
public final class at extends AnimatorListenerAdapter {
    public final int f24726a;
    public final s4.c1 f24727b;
    public final int f24728c;
    public final View d;
    public final int f24729e;
    public final ViewPropertyAnimator f24730f;
    public final s4.f1 h;

    public at(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f24726a = i12;
        this.h = f1Var;
        this.f24727b = c1Var;
        this.f24728c = i10;
        this.d = view;
        this.f24729e = i11;
        this.f24730f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f24726a) {
            case 0:
                int i10 = this.f24728c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f24729e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.f24727b.f46538a;
                if (view2 instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view2).setMoving(false);
                    return;
                } else if (view2 instanceof gg.l) {
                    ((gg.l) view2).f10702a = false;
                    return;
                } else {
                    return;
                }
            default:
                int i11 = this.f24728c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.f24729e != 0) {
                    view3.setTranslationY(0.0f);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24726a) {
            case 0:
                this.f24730f.setListener(null);
                dt dtVar = (dt) this.h;
                s4.c1 c1Var = this.f24727b;
                dtVar.v(c1Var);
                dtVar.f25866w.remove(c1Var);
                dtVar.A();
                View view = c1Var.f46538a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
                } else if (view instanceof gg.l) {
                    ((gg.l) view).f10702a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
            default:
                this.f24730f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.f24727b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.f46613z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f24726a) {
            case 0:
                ((dt) this.h).getClass();
                return;
            default:
                ((s4.j) this.h).getClass();
                return;
        }
    }
}
