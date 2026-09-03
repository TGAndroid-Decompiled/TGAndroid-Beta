package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f23379a;
    public final int f23380b;
    public final s8 f23381c;

    public q8(s8 s8Var, int i10, int i11) {
        this.f23379a = i11;
        this.f23381c = s8Var;
        this.f23380b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23379a) {
            case 0:
                s8 s8Var = this.f23381c;
                s8Var.f23758r = 0;
                s8Var.setBackgroundColor(this.f23380b);
                s8Var.invalidate();
                return;
            default:
                int i10 = this.f23380b;
                s8 s8Var2 = this.f23381c;
                s8Var2.setBackgroundColor(i10);
                s8Var2.f23758r = 0;
                s8Var2.invalidate();
                return;
        }
    }
}
