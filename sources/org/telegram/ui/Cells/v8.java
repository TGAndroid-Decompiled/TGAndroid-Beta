package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v8 extends AnimatorListenerAdapter {
    public final int f21453a;
    public final int f21454b;
    public final x8 f21455c;

    public v8(x8 x8Var, int i10, int i11) {
        this.f21453a = i11;
        this.f21455c = x8Var;
        this.f21454b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f21453a) {
            case 0:
                x8 x8Var = this.f21455c;
                x8Var.f21606r = 0;
                x8Var.setBackgroundColor(this.f21454b);
                x8Var.invalidate();
                return;
            default:
                int i10 = this.f21454b;
                x8 x8Var2 = this.f21455c;
                x8Var2.setBackgroundColor(i10);
                x8Var2.f21606r = 0;
                x8Var2.invalidate();
                return;
        }
    }
}
