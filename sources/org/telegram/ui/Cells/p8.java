package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p8 extends AnimatorListenerAdapter {
    public final int f31249a;
    public final int f31250b;
    public final r8 f31251c;

    public p8(r8 r8Var, int i7, int i10) {
        this.f31249a = i10;
        this.f31251c = r8Var;
        this.f31250b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31249a) {
            case 0:
                r8 r8Var = this.f31251c;
                r8Var.f31733r = 0;
                r8Var.setBackgroundColor(this.f31250b);
                r8Var.invalidate();
                return;
            default:
                int i7 = this.f31250b;
                r8 r8Var2 = this.f31251c;
                r8Var2.setBackgroundColor(i7);
                r8Var2.f31733r = 0;
                r8Var2.invalidate();
                return;
        }
    }
}
