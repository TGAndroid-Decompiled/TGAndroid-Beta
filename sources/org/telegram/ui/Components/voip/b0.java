package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b0 extends AnimatorListenerAdapter {
    public final int f29570a;
    public final k0 f29571b;

    public b0(k0 k0Var, int i10) {
        this.f29570a = i10;
        this.f29571b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29570a) {
            case 0:
                super.onAnimationEnd(animator);
                k0 k0Var = this.f29571b;
                k0Var.G0 = null;
                k0Var.F0 = 0.0f;
                k0Var.invalidate();
                return;
            default:
                k0 k0Var2 = this.f29571b;
                k0Var2.f29744y0 = null;
                k0Var2.f29738v0 = 1.0f;
                k0Var2.f29729o0 = 0.0f;
                k0Var2.f29730p0 = 0.0f;
                k0Var2.invalidate();
                return;
        }
    }
}
