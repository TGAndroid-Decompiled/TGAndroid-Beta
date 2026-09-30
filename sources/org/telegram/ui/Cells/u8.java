package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f21665a;
    public final int f21666b;
    public final w8 f21667c;

    public u8(w8 w8Var, int i10, int i11) {
        this.f21665a = i11;
        this.f21667c = w8Var;
        this.f21666b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21665a) {
            case 0:
                w8 w8Var = this.f21667c;
                w8Var.f21819r = 0;
                w8Var.setBackgroundColor(this.f21666b);
                w8Var.invalidate();
                return;
            default:
                int i10 = this.f21666b;
                w8 w8Var2 = this.f21667c;
                w8Var2.setBackgroundColor(i10);
                w8Var2.f21819r = 0;
                w8Var2.invalidate();
                return;
        }
    }
}
