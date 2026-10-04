package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23535a;
    public final int f23536b;
    public final w8 f23537c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23535a = i11;
        this.f23537c = w8Var;
        this.f23536b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23535a) {
            case 0:
                w8 w8Var = this.f23537c;
                w8Var.f23699r = 0;
                w8Var.setBackgroundColor(this.f23536b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23536b;
                w8 w8Var2 = this.f23537c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23699r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
