package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f22251a;
    public final int f22252b;
    public final w8 f22253c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f22251a = i11;
        this.f22253c = w8Var;
        this.f22252b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22251a) {
            case 0:
                w8 w8Var = this.f22253c;
                w8Var.f22405r = 0;
                w8Var.setBackgroundColor(this.f22252b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f22252b;
                w8 w8Var2 = this.f22253c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f22405r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
