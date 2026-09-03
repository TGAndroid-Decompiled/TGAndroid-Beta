package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f21519a;
    public final int f21520b;
    public final r8 f21521c;

    public p8(r8 r8Var, int i10, int i11) {
        this.f21519a = i11;
        this.f21521c = r8Var;
        this.f21520b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21519a) {
            case 0:
                r8 r8Var = this.f21521c;
                r8Var.f21888r = 0;
                r8Var.setBackgroundColor(this.f21520b);
                r8Var.invalidate();
                return;
            default:
                int i10 = this.f21520b;
                r8 r8Var2 = this.f21521c;
                r8Var2.setBackgroundColor(i10);
                r8Var2.f21888r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
