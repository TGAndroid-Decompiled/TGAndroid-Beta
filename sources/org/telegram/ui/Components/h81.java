package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h81 extends AnimatorListenerAdapter {
    public final int f26648a;
    public final i81 f26649b;

    public h81(i81 i81Var, int i10) {
        this.f26648a = i10;
        this.f26649b = i81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26648a) {
            case 0:
                this.f26649b.D = null;
                return;
            default:
                this.f26649b.D = null;
                return;
        }
    }
}
