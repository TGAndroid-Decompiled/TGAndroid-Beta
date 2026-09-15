package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21449a;
    public final int f21450b;
    public final w8 f21451c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21449a = i11;
        this.f21451c = w8Var;
        this.f21450b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21449a) {
            case 0:
                w8 w8Var = this.f21451c;
                w8Var.f21590r = 0;
                w8Var.setBackgroundColor(this.f21450b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21450b;
                w8 w8Var2 = this.f21451c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21590r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
