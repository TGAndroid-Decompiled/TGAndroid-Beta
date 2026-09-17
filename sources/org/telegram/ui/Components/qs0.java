package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f29814a;
    public final xu0 f29815b;

    public qs0(xu0 xu0Var, int i10) {
        this.f29814a = i10;
        this.f29815b = xu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29814a) {
            case 0:
                this.f29815b.L0 = null;
                return;
            default:
                xu0 xu0Var = this.f29815b;
                org.telegram.ui.ActionBar.v0 v0Var = xu0Var.f32708n0;
                qt0[] qt0VarArr = xu0Var.f32703k0;
                xu0Var.f32694f1 = null;
                int i10 = 4;
                if (xu0Var.f32700i1) {
                    qt0VarArr[1].setVisibility(8);
                    if (v0Var != null && !xu0Var.D()) {
                        if (xu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        xu0Var.f32710o0 = 0.0f;
                    } else {
                        xu0Var.f32710o0 = xu0Var.b0(0.0f);
                        xu0Var.s1(0.0f);
                    }
                    xu0Var.q1(false);
                    xu0Var.f32732x0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (v0Var != null && xu0Var.f32732x0 == 2) {
                        if (xu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    xu0Var.f32732x0 = 0;
                    xu0Var.Z0(1.0f, qt0VarArr[0].F);
                    xu0Var.L0();
                    xu0Var.f1();
                }
                xu0Var.f32696g1 = false;
                xu0Var.f32736y1 = false;
                xu0Var.f32733x1 = false;
                xu0Var.N0(false);
                xu0Var.G.setEnabled(true);
                xu0Var.I0.setEnabled(true);
                return;
        }
    }
}
