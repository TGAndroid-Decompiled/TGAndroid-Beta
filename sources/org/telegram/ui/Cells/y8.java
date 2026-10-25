package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f25765a;
    public final int f25766b;
    public final a9 f25767c;

    public y8(a9 a9Var, int i10, int i11) {
        this.f25765a = i11;
        this.f25767c = a9Var;
        this.f25766b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25765a) {
            case 0:
                a9 a9Var = this.f25767c;
                a9Var.f23865r = 0;
                a9Var.setBackgroundColor(this.f25766b);
                a9Var.invalidate();
                return;
            default:
                int i10 = this.f25766b;
                a9 a9Var2 = this.f25767c;
                a9Var2.setBackgroundColor(i10);
                a9Var2.f23865r = 0;
                a9Var2.invalidate();
                return;
        }
    }
}
