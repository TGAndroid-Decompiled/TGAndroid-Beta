package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f22623a;
    public final q2 f22624b;

    public k2(q2 q2Var, int i10) {
        this.f22623a = i10;
        this.f22624b = q2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f22623a) {
            case 0:
                q2 q2Var = this.f22624b;
                q2Var.V3 = 1.0f;
                q2Var.Y3 = null;
                q2Var.Z3 = null;
                q2Var.f22921a4 = null;
                q2Var.invalidate();
                return;
            case 1:
                q2 q2Var2 = this.f22624b;
                q2Var2.W3 = 1.0f;
                q2Var2.invalidate();
                return;
            default:
                q2 q2Var3 = this.f22624b;
                boolean z10 = q2Var3.S2;
                if (q2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (q2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = q2Var3.f23027v4;
                if (i14 != i13) {
                    q2Var3.z(i14, i13);
                } else {
                    q2Var3.f23049z4 = false;
                    q2Var3.f23039x4 = i14;
                }
                q2Var3.invalidate();
                return;
        }
    }
}
