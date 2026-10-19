package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class oz0 extends AnimatorListenerAdapter {
    public final int f29121a;
    public final Switch f29122b;

    public oz0(Switch r12, int i10) {
        this.f29121a = i10;
        this.f29122b = r12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29121a) {
            case 0:
                this.f29122b.d = null;
                return;
            default:
                this.f29122b.e = null;
                return;
        }
    }
}
