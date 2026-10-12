package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23290a;
    public final int f23291b;
    public final w8 f23292c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23290a = i11;
        this.f23292c = w8Var;
        this.f23291b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23290a) {
            case 0:
                w8 w8Var = this.f23292c;
                w8Var.f23454r = 0;
                w8Var.setBackgroundColor(this.f23291b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23291b;
                w8 w8Var2 = this.f23292c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23454r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
