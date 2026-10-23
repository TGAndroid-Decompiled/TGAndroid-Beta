package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f23211a;
    public final int f23212b;
    public final v8 f23213c;

    public t8(v8 v8Var, int i10, int i11) {
        this.f23211a = i11;
        this.f23213c = v8Var;
        this.f23212b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23211a) {
            case 0:
                v8 v8Var = this.f23213c;
                v8Var.f23661r = 0;
                v8Var.setBackgroundColor(this.f23212b);
                v8Var.invalidate();
                return;
            default:
                int i10 = this.f23212b;
                v8 v8Var2 = this.f23213c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.f23661r = 0;
                v8Var2.invalidate();
                return;
        }
    }
}
