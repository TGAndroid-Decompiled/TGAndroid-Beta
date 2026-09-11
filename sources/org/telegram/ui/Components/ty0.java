package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f30742a;
    public final Switch f30743b;

    public ty0(Switch r12, int i10) {
        this.f30742a = i10;
        this.f30743b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30742a) {
            case 0:
                this.f30743b.d = null;
                return;
            default:
                this.f30743b.f24151e = null;
                return;
        }
    }
}
