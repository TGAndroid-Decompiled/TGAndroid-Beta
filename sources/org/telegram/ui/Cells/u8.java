package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21459a;
    public final int f21460b;
    public final w8 f21461c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21459a = i11;
        this.f21461c = w8Var;
        this.f21460b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21459a) {
            case 0:
                w8 w8Var = this.f21461c;
                w8Var.f21600r = 0;
                w8Var.setBackgroundColor(this.f21460b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21460b;
                w8 w8Var2 = this.f21461c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21600r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
