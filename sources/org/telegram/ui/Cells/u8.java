package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f23742a;
    public final int f23743b;
    public final w8 f23744c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f23742a = i11;
        this.f23744c = w8Var;
        this.f23743b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23742a) {
            case 0:
                w8 w8Var = this.f23744c;
                w8Var.f23919r = 0;
                w8Var.setBackgroundColor(this.f23743b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f23743b;
                w8 w8Var2 = this.f23744c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f23919r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
