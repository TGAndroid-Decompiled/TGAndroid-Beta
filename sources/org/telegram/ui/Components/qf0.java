package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qf0 extends AnimatorListenerAdapter {
    public final int f31928a;
    public final rf0 f31929b;

    public qf0(rf0 rf0Var, int i10) {
        this.f31928a = i10;
        this.f31929b = rf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31928a) {
            case 0:
                rf0 rf0Var = this.f31929b;
                rf0Var.h = false;
                rf0Var.f32282a = rf0Var.f32284c;
                rf0Var.invalidate();
                int i10 = rf0Var.F;
                if (i10 >= 0) {
                    rf0Var.b(i10);
                    rf0Var.F = -1;
                    return;
                }
                return;
            default:
                rf0 rf0Var2 = this.f31929b;
                rf0Var2.f32287n = false;
                rf0Var2.h = false;
                rf0Var2.invalidate();
                int i11 = rf0Var2.F;
                if (i11 >= 0) {
                    rf0Var2.b(i11);
                    rf0Var2.F = -1;
                }
                rf0Var2.a();
                return;
        }
    }
}
