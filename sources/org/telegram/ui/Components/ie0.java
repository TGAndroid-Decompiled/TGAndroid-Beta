package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ie0 extends AnimatorListenerAdapter {
    public final int f36110a;
    public final je0 f36111b;

    public ie0(je0 je0Var, int i7) {
        this.f36110a = i7;
        this.f36111b = je0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36110a) {
            case 0:
                this.f36111b.f36422a.f36748n.setVisibility(8);
                return;
            default:
                this.f36111b.f36422a.h.setVisibility(8);
                return;
        }
    }
}
