package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o8 extends AnimatorListenerAdapter {
    public final int f30819a;
    public final int f30820b;
    public final q8 f30821c;

    public o8(q8 q8Var, int i7, int i10) {
        this.f30819a = i10;
        this.f30821c = q8Var;
        this.f30820b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30819a) {
            case 0:
                q8 q8Var = this.f30821c;
                q8Var.f31313r = 0;
                q8Var.setBackgroundColor(this.f30820b);
                q8Var.invalidate();
                return;
            default:
                int i7 = this.f30820b;
                q8 q8Var2 = this.f30821c;
                q8Var2.setBackgroundColor(i7);
                q8Var2.f31313r = 0;
                q8Var2.invalidate();
                return;
        }
    }
}
