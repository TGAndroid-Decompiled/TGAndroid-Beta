package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f22542a;
    public final int f22543b;
    public final w8 f22544c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f22542a = i11;
        this.f22544c = w8Var;
        this.f22543b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22542a) {
            case 0:
                w8 w8Var = this.f22544c;
                w8Var.f22635r = 0;
                w8Var.setBackgroundColor(this.f22543b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f22543b;
                w8 w8Var2 = this.f22544c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f22635r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
