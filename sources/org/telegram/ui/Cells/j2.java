package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class j2 extends AnimatorListenerAdapter {

    public final int f24516a;

    public final p2 f24517b;

    public j2(p2 p2Var, int i10) {
        this.f24516a = i10;
        this.f24517b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24516a) {
            case 0:
                p2 p2Var = this.f24517b;
                p2Var.N3 = 1.0f;
                p2Var.Q3 = null;
                p2Var.R3 = null;
                p2Var.S3 = null;
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.f24517b;
                p2Var2.O3 = 1.0f;
                p2Var2.invalidate();
                break;
            default:
                p2 p2Var3 = this.f24517b;
                int i10 = (p2Var3.O2 ? 1 : 0) + (p2Var3.M2 ? 2 : 0) + (p2Var3.N2 ? 4 : 0);
                int i11 = p2Var3.f24904n4;
                if (i11 != i10) {
                    p2Var3.B(i11, i10);
                } else {
                    p2Var3.f24925r4 = false;
                    p2Var3.f24914p4 = i11;
                }
                p2Var3.invalidate();
                break;
        }
    }
}
