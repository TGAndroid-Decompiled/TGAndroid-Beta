package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t8 extends AnimatorListenerAdapter {
    public final int f23207a;
    public final int f23208b;
    public final v8 f23209c;

    public t8(v8 v8Var, int i10, int i11) {
        this.f23207a = i11;
        this.f23209c = v8Var;
        this.f23208b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23207a) {
            case 0:
                v8 v8Var = this.f23209c;
                v8Var.f23657r = 0;
                v8Var.setBackgroundColor(this.f23208b);
                v8Var.invalidate();
                return;
            default:
                int i10 = this.f23208b;
                v8 v8Var2 = this.f23209c;
                v8Var2.setBackgroundColor(i10);
                v8Var2.f23657r = 0;
                v8Var2.invalidate();
                return;
        }
    }
}
