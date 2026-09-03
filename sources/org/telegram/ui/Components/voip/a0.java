package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final t f29523a;
    public final k0 f29524b;

    public a0(k0 k0Var, t tVar) {
        this.f29524b = k0Var;
        this.f29523a = tVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        k0 k0Var = this.f29524b;
        k0Var.f29713x.unlock();
        k0Var.f29704r = null;
        this.f29523a.f29912r = false;
        if (!k0Var.f29685b) {
            k0Var.d();
            k0Var.f29715y = null;
            k0Var.d = 0L;
        }
        if (k0Var.f29685b) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        k0Var.f29687c = f10;
        k0Var.l();
        k0Var.i(false);
        if (!k0Var.f29685b) {
            k0Var.f29694h0.setVisibility(8);
            k0Var.f29695i0.setVisibility(8);
            k0Var.f29686b0.setVisibility(8);
            k0Var.f29688c0.setVisibility(8);
        }
    }
}
