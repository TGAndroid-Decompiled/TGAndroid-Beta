package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f29749a;
    public final int f29750b;
    public final r8 f29751c;

    public p8(r8 r8Var, int i7, int i10) {
        this.f29749a = i10;
        this.f29751c = r8Var;
        this.f29750b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29749a) {
            case 0:
                r8 r8Var = this.f29751c;
                r8Var.f30217r = 0;
                r8Var.setBackgroundColor(this.f29750b);
                r8Var.invalidate();
                return;
            default:
                int i7 = this.f29750b;
                r8 r8Var2 = this.f29751c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.f30217r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
