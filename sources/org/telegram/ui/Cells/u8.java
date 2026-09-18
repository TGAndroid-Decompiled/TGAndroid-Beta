package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21628a;
    public final int f21629b;
    public final w8 f21630c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21628a = i11;
        this.f21630c = w8Var;
        this.f21629b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21628a) {
            case 0:
                w8 w8Var = this.f21630c;
                w8Var.f21782r = 0;
                w8Var.setBackgroundColor(this.f21629b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21629b;
                w8 w8Var2 = this.f21630c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21782r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
