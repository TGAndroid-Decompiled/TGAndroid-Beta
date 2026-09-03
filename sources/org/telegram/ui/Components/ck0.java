package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ck0 extends AnimatorListenerAdapter {
    public final int f23959a;
    public final pk0 f23960b;

    public ck0(pk0 pk0Var, int i10) {
        this.f23959a = i10;
        this.f23960b = pk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23959a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f23960b.I0.unlock();
                return;
            case 1:
                super.onAnimationEnd(animator);
                pk0 pk0Var = this.f23960b;
                pk0Var.N = null;
                pk0Var.f27901k0 = 0.0f;
                pk0Var.f27899i0 = null;
                pk0Var.invalidate();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f23960b);
                return;
        }
    }
}
