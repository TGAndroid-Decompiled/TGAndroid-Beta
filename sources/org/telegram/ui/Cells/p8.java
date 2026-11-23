package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f31335a;
    public final int f31336b;
    public final r8 f31337c;

    public p8(r8 r8Var, int i7, int i10) {
        this.f31335a = i10;
        this.f31337c = r8Var;
        this.f31336b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31335a) {
            case 0:
                r8 r8Var = this.f31337c;
                r8Var.f31816r = 0;
                r8Var.setBackgroundColor(this.f31336b);
                r8Var.invalidate();
                return;
            default:
                int i7 = this.f31336b;
                r8 r8Var2 = this.f31337c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.f31816r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
