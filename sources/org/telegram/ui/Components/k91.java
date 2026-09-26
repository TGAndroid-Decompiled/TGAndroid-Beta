package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k91 extends AnimatorListenerAdapter {
    public final int f25678a;
    public final l91 f25679b;

    public k91(l91 l91Var, int i10) {
        this.f25678a = i10;
        this.f25679b = l91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25678a) {
            case 0:
                this.f25679b.f26025y = null;
                return;
            default:
                this.f25679b.f26025y = null;
                return;
        }
    }
}
