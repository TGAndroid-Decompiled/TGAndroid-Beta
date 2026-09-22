package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21440a;
    public final int f21441b;
    public final w8 f21442c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21440a = i11;
        this.f21442c = w8Var;
        this.f21441b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21440a) {
            case 0:
                w8 w8Var = this.f21442c;
                w8Var.f21584r = 0;
                w8Var.setBackgroundColor(this.f21441b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21441b;
                w8 w8Var2 = this.f21442c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21584r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
