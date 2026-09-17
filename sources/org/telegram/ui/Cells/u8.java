package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23373a;
    public final int f23374b;
    public final w8 f23375c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23373a = i11;
        this.f23375c = w8Var;
        this.f23374b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23373a) {
            case 0:
                w8 w8Var = this.f23375c;
                w8Var.f23521r = 0;
                w8Var.setBackgroundColor(this.f23374b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23374b;
                w8 w8Var2 = this.f23375c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23521r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
