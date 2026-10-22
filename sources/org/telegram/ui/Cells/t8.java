package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f23210a;
    public final int f23211b;
    public final v8 f23212c;

    public t8(v8 v8Var, int i10, int i11) {
        this.f23210a = i11;
        this.f23212c = v8Var;
        this.f23211b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23210a) {
            case 0:
                v8 v8Var = this.f23212c;
                v8Var.f23660r = 0;
                v8Var.setBackgroundColor(this.f23211b);
                v8Var.invalidate();
                return;
            default:
                int i10 = this.f23211b;
                v8 v8Var2 = this.f23212c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.f23660r = 0;
                v8Var2.invalidate();
                return;
        }
    }
}
