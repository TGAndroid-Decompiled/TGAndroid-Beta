package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23345a;
    public final int f23346b;
    public final w8 f23347c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23345a = i11;
        this.f23347c = w8Var;
        this.f23346b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23345a) {
            case 0:
                w8 w8Var = this.f23347c;
                w8Var.f23493r = 0;
                w8Var.setBackgroundColor(this.f23346b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23346b;
                w8 w8Var2 = this.f23347c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23493r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
