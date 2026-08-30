package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ck0 extends AnimatorListenerAdapter {
    public final int f24018a;
    public final pk0 f24019b;

    public ck0(pk0 pk0Var, int i10) {
        this.f24018a = i10;
        this.f24019b = pk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24018a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f24019b.I0.unlock();
                return;
            case 1:
                super.onAnimationEnd(animator);
                pk0 pk0Var = this.f24019b;
                pk0Var.N = null;
                pk0Var.f27906k0 = 0.0f;
                pk0Var.f27904i0 = null;
                pk0Var.invalidate();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f24019b);
                return;
        }
    }
}
