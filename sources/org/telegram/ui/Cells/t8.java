package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f23203a;
    public final int f23204b;
    public final v8 f23205c;

    public t8(v8 v8Var, int i10, int i11) {
        this.f23203a = i11;
        this.f23205c = v8Var;
        this.f23204b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23203a) {
            case 0:
                v8 v8Var = this.f23205c;
                v8Var.f23653r = 0;
                v8Var.setBackgroundColor(this.f23204b);
                v8Var.invalidate();
                return;
            default:
                int i10 = this.f23204b;
                v8 v8Var2 = this.f23205c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.f23653r = 0;
                v8Var2.invalidate();
                return;
        }
    }
}
