package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e80 extends AnimatorListenerAdapter {
    public final int f25625a;
    public final f80 f25626b;

    public e80(f80 f80Var, int i10) {
        this.f25625a = i10;
        this.f25626b = f80Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25625a) {
            case 0:
                f80 f80Var = this.f25626b;
                f80Var.f25962e.f26326d0 = null;
                f80Var.requestLayout();
                return;
            default:
                f80 f80Var2 = this.f25626b;
                f80Var2.f25962e.f26326d0 = null;
                f80Var2.f25959a = false;
                return;
        }
    }
}
