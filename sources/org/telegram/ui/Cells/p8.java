package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f29760a;
    public final int f29761b;
    public final r8 f29762c;

    public p8(r8 r8Var, int i7, int i10) {
        this.f29760a = i10;
        this.f29762c = r8Var;
        this.f29761b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29760a) {
            case 0:
                r8 r8Var = this.f29762c;
                r8Var.f30228r = 0;
                r8Var.setBackgroundColor(this.f29761b);
                r8Var.invalidate();
                return;
            default:
                int i7 = this.f29761b;
                r8 r8Var2 = this.f29762c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.f30228r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
