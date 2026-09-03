package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class dk0 extends AnimatorListenerAdapter {
    public final int f26294a;
    public final qk0 f26295b;

    public dk0(qk0 qk0Var, int i10) {
        this.f26294a = i10;
        this.f26295b = qk0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26294a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f26295b.I0.unlock();
                return;
            case 1:
                super.onAnimationEnd(animator);
                qk0 qk0Var = this.f26295b;
                qk0Var.N = null;
                qk0Var.f30445k0 = 0.0f;
                qk0Var.f30443i0 = null;
                qk0Var.invalidate();
                return;
            default:
                AndroidUtilities.removeFromParent(this.f26295b);
                return;
        }
    }
}
