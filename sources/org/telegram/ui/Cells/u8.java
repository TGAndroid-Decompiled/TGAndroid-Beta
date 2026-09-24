package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21649a;
    public final int f21650b;
    public final w8 f21651c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21649a = i11;
        this.f21651c = w8Var;
        this.f21650b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21649a) {
            case 0:
                w8 w8Var = this.f21651c;
                w8Var.f21803r = 0;
                w8Var.setBackgroundColor(this.f21650b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21650b;
                w8 w8Var2 = this.f21651c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21803r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
