package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y8 extends AnimatorListenerAdapter {
    public final int f25769a;
    public final int f25770b;
    public final a9 f25771c;

    public y8(a9 a9Var, int i10, int i11) {
        this.f25769a = i11;
        this.f25771c = a9Var;
        this.f25770b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25769a) {
            case 0:
                a9 a9Var = this.f25771c;
                a9Var.f23868r = 0;
                a9Var.setBackgroundColor(this.f25770b);
                a9Var.invalidate();
                return;
            default:
                int i10 = this.f25770b;
                a9 a9Var2 = this.f25771c;
                a9Var2.setBackgroundColor(i10);
                a9Var2.f23868r = 0;
                a9Var2.invalidate();
                return;
        }
    }
}
