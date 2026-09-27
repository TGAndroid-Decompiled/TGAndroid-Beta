package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21666a;
    public final int f21667b;
    public final w8 f21668c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21666a = i11;
        this.f21668c = w8Var;
        this.f21667b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21666a) {
            case 0:
                w8 w8Var = this.f21668c;
                w8Var.f21820r = 0;
                w8Var.setBackgroundColor(this.f21667b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21667b;
                w8 w8Var2 = this.f21668c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21820r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
