package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23346a;
    public final int f23347b;
    public final w8 f23348c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23346a = i11;
        this.f23348c = w8Var;
        this.f23347b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23346a) {
            case 0:
                w8 w8Var = this.f23348c;
                w8Var.f23494r = 0;
                w8Var.setBackgroundColor(this.f23347b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23347b;
                w8 w8Var2 = this.f23348c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23494r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
