package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f24278a;
    public final p2 f24279b;

    public j2(p2 p2Var, int i10) {
        this.f24278a = i10;
        this.f24279b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f24278a) {
            case 0:
                p2 p2Var = this.f24279b;
                p2Var.V3 = 1.0f;
                p2Var.Y3 = null;
                p2Var.Z3 = null;
                p2Var.f24632a4 = null;
                p2Var.invalidate();
                return;
            case 1:
                p2 p2Var2 = this.f24279b;
                p2Var2.W3 = 1.0f;
                p2Var2.invalidate();
                return;
            default:
                p2 p2Var3 = this.f24279b;
                boolean z10 = p2Var3.S2;
                if (p2Var3.Q2) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                int i12 = (z10 ? 1 : 0) + i10;
                if (p2Var3.R2) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                int i13 = i12 + i11;
                int i14 = p2Var3.f24738v4;
                if (i14 != i13) {
                    p2Var3.y(i14, i13);
                } else {
                    p2Var3.f24760z4 = false;
                    p2Var3.f24750x4 = i14;
                }
                p2Var3.invalidate();
                return;
        }
    }
}
