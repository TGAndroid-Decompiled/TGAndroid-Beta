package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f20366a;
    public final r2 f20367b;

    public k2(r2 r2Var, int i10) {
        this.f20366a = i10;
        this.f20367b = r2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f20366a) {
            case 0:
                r2 r2Var = this.f20367b;
                r2Var.R3 = 1.0f;
                r2Var.U3 = null;
                r2Var.V3 = null;
                r2Var.W3 = null;
                r2Var.invalidate();
                return;
            case 1:
                r2 r2Var2 = this.f20367b;
                r2Var2.S3 = 1.0f;
                r2Var2.invalidate();
                return;
            default:
                r2 r2Var3 = this.f20367b;
                boolean z10 = r2Var3.S2;
                if (r2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (r2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = r2Var3.f20757r4;
                if (i14 != i13) {
                    r2Var3.z(i14, i13);
                } else {
                    r2Var3.f20778v4 = false;
                    r2Var3.f20768t4 = i14;
                }
                r2Var3.invalidate();
                return;
        }
    }
}
