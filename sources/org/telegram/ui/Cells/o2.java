package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f22379a;
    public final v2 f22380b;

    public o2(v2 v2Var, int i10) {
        this.f22379a = i10;
        this.f22380b = v2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f22379a) {
            case 0:
                v2 v2Var = this.f22380b;
                v2Var.V3 = 1.0f;
                v2Var.Y3 = null;
                v2Var.Z3 = null;
                v2Var.f23177a4 = null;
                v2Var.invalidate();
                return;
            case 1:
                v2 v2Var2 = this.f22380b;
                v2Var2.W3 = 1.0f;
                v2Var2.invalidate();
                return;
            default:
                v2 v2Var3 = this.f22380b;
                boolean z10 = v2Var3.S2;
                if (v2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (v2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = v2Var3.f23283v4;
                if (i14 != i13) {
                    v2Var3.H(i14, i13);
                } else {
                    v2Var3.f23305z4 = false;
                    v2Var3.f23295x4 = i14;
                }
                v2Var3.invalidate();
                return;
        }
    }
}
