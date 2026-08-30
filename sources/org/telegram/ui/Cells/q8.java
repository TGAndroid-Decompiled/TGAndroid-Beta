package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f21587a;
    public final int f21588b;
    public final s8 f21589c;

    public q8(s8 s8Var, int i10, int i11) {
        this.f21587a = i11;
        this.f21589c = s8Var;
        this.f21588b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21587a) {
            case 0:
                s8 s8Var = this.f21589c;
                s8Var.f21957r = 0;
                s8Var.setBackgroundColor(this.f21588b);
                s8Var.invalidate();
                return;
            default:
                int i10 = this.f21588b;
                s8 s8Var2 = this.f21589c;
                s8Var2.setBackgroundColor(i10);
                s8Var2.f21957r = 0;
                s8Var2.invalidate();
                return;
        }
    }
}
