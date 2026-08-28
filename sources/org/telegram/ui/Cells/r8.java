package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r8 extends AnimatorListenerAdapter {
    public final int f25126a;
    public final int f25127b;
    public final t8 f25128c;

    public r8(t8 t8Var, int i9, int i10) {
        this.f25126a = i10;
        this.f25128c = t8Var;
        this.f25127b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25126a) {
            case 0:
                t8 t8Var = this.f25128c;
                t8Var.f25714r = 0;
                t8Var.setBackgroundColor(this.f25127b);
                t8Var.invalidate();
                return;
            default:
                int i9 = this.f25127b;
                t8 t8Var2 = this.f25128c;
                t8Var2.setBackgroundColor(i9);
                t8Var2.f25714r = 0;
                t8Var2.invalidate();
                return;
        }
    }
}
