package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ue0 extends AnimatorListenerAdapter {
    public final int f28681a;
    public final ye0 f28682b;

    public ue0(ye0 ye0Var, int i10) {
        this.f28681a = i10;
        this.f28682b = ye0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28681a) {
            case 0:
                this.f28682b.f30567x = null;
                return;
            default:
                this.f28682b.f30568y = null;
                return;
        }
    }
}
