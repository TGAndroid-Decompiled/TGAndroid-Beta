package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f29741a;
    public final int f29742b;
    public final r8 f29743c;

    public p8(r8 r8Var, int i7, int i10) {
        this.f29741a = i10;
        this.f29743c = r8Var;
        this.f29742b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29741a) {
            case 0:
                r8 r8Var = this.f29743c;
                r8Var.f30208r = 0;
                r8Var.setBackgroundColor(this.f29742b);
                r8Var.invalidate();
                return;
            default:
                int i7 = this.f29742b;
                r8 r8Var2 = this.f29743c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.f30208r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
