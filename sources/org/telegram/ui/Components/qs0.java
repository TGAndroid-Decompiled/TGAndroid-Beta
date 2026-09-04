package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f29813a;
    public final xu0 f29814b;

    public qs0(xu0 xu0Var, int i10) {
        this.f29813a = i10;
        this.f29814b = xu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29813a) {
            case 0:
                this.f29814b.L0 = null;
                return;
            default:
                xu0 xu0Var = this.f29814b;
                org.telegram.ui.ActionBar.v0 v0Var = xu0Var.f32707n0;
                qt0[] qt0VarArr = xu0Var.f32702k0;
                xu0Var.f32693f1 = null;
                int i10 = 4;
                if (xu0Var.f32699i1) {
                    qt0VarArr[1].setVisibility(8);
                    if (v0Var != null && !xu0Var.D()) {
                        if (xu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                        xu0Var.f32709o0 = 0.0f;
                    } else {
                        xu0Var.f32709o0 = xu0Var.b0(0.0f);
                        xu0Var.s1(0.0f);
                    }
                    xu0Var.q1(false);
                    xu0Var.f32731x0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (v0Var != null && xu0Var.f32731x0 == 2) {
                        if (xu0Var.v0()) {
                            i10 = 8;
                        }
                        v0Var.setVisibility(i10);
                    }
                    xu0Var.f32731x0 = 0;
                    xu0Var.Z0(1.0f, qt0VarArr[0].F);
                    xu0Var.L0();
                    xu0Var.f1();
                }
                xu0Var.f32695g1 = false;
                xu0Var.f32735y1 = false;
                xu0Var.f32732x1 = false;
                xu0Var.N0(false);
                xu0Var.G.setEnabled(true);
                xu0Var.I0.setEnabled(true);
                return;
        }
    }
}
