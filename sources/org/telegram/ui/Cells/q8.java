package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f31296a;
    public final int f31297b;
    public final s8 f31298c;

    public q8(s8 s8Var, int i7, int i10) {
        this.f31296a = i10;
        this.f31298c = s8Var;
        this.f31297b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31296a) {
            case 0:
                s8 s8Var = this.f31298c;
                s8Var.f31783r = 0;
                s8Var.setBackgroundColor(this.f31297b);
                s8Var.invalidate();
                return;
            default:
                int i7 = this.f31297b;
                s8 s8Var2 = this.f31298c;
                s8Var2.setBackgroundColor(i7);
                s8Var2.f31783r = 0;
                s8Var2.invalidate();
                return;
        }
    }
}
