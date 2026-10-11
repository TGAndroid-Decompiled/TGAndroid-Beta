package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23510a;
    public final int f23511b;
    public final w8 f23512c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23510a = i11;
        this.f23512c = w8Var;
        this.f23511b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23510a) {
            case 0:
                w8 w8Var = this.f23512c;
                w8Var.f23683r = 0;
                w8Var.setBackgroundColor(this.f23511b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23511b;
                w8 w8Var2 = this.f23512c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23683r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
