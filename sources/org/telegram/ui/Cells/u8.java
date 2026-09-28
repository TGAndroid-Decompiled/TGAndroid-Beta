package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21664a;
    public final int f21665b;
    public final w8 f21666c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21664a = i11;
        this.f21666c = w8Var;
        this.f21665b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21664a) {
            case 0:
                w8 w8Var = this.f21666c;
                w8Var.f21818r = 0;
                w8Var.setBackgroundColor(this.f21665b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21665b;
                w8 w8Var2 = this.f21666c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21818r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
