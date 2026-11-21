package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f31192a;
    public final u2 f31193b;

    public o2(u2 u2Var, int i7) {
        this.f31192a = i7;
        this.f31193b = u2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.f31192a) {
            case 0:
                u2 u2Var = this.f31193b;
                u2Var.W3 = 1.0f;
                u2Var.Z3 = null;
                u2Var.f31923a4 = null;
                u2Var.f31929b4 = null;
                u2Var.invalidate();
                return;
            case 1:
                u2 u2Var2 = this.f31193b;
                u2Var2.X3 = 1.0f;
                u2Var2.invalidate();
                return;
            default:
                u2 u2Var3 = this.f31193b;
                boolean z10 = u2Var3.T2;
                if (u2Var3.R2) {
                    i7 = 2;
                } else {
                    i7 = 0;
                }
                int i11 = (z10 ? 1 : 0) + i7;
                if (u2Var3.S2) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                int i12 = i11 + i10;
                int i13 = u2Var3.f32033w4;
                if (i13 != i12) {
                    u2Var3.F(i13, i12);
                } else {
                    u2Var3.A4 = false;
                    u2Var3.f32045y4 = i13;
                }
                u2Var3.invalidate();
                return;
        }
    }
}
