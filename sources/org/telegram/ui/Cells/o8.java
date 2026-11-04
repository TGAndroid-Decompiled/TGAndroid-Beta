package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o8 extends AnimatorListenerAdapter {
    public final int f29758a;
    public final int f29759b;
    public final q8 f29760c;

    public o8(q8 q8Var, int i3, int i10) {
        this.f29758a = i10;
        this.f29760c = q8Var;
        this.f29759b = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29758a) {
            case 0:
                q8 q8Var = this.f29760c;
                q8Var.f30237r = 0;
                q8Var.setBackgroundColor(this.f29759b);
                q8Var.invalidate();
                return;
            default:
                int i3 = this.f29759b;
                q8 q8Var2 = this.f29760c;
                q8Var2.setBackgroundColor(i3);
                q8Var2.f30237r = 0;
                q8Var2.invalidate();
                return;
        }
    }
}
