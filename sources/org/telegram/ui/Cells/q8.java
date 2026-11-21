package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q8 extends AnimatorListenerAdapter {
    public final int f31327a;
    public final int f31328b;
    public final s8 f31329c;

    public q8(s8 s8Var, int i7, int i10) {
        this.f31327a = i10;
        this.f31329c = s8Var;
        this.f31328b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31327a) {
            case 0:
                s8 s8Var = this.f31329c;
                s8Var.f31814r = 0;
                s8Var.setBackgroundColor(this.f31328b);
                s8Var.invalidate();
                return;
            default:
                int i7 = this.f31328b;
                s8 s8Var2 = this.f31329c;
                s8Var2.setBackgroundColor(i7);
                s8Var2.f31814r = 0;
                s8Var2.invalidate();
                return;
        }
    }
}
