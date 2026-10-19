package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f23204a;
    public final int f23205b;
    public final v8 f23206c;

    public t8(v8 v8Var, int i10, int i11) {
        this.f23204a = i11;
        this.f23206c = v8Var;
        this.f23205b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23204a) {
            case 0:
                v8 v8Var = this.f23206c;
                v8Var.f23654r = 0;
                v8Var.setBackgroundColor(this.f23205b);
                v8Var.invalidate();
                return;
            default:
                int i10 = this.f23205b;
                v8 v8Var2 = this.f23206c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.f23654r = 0;
                v8Var2.invalidate();
                return;
        }
    }
}
