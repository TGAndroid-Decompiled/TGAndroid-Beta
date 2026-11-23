package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ie0 extends AnimatorListenerAdapter {
    public final int f35996a;
    public final je0 f35997b;

    public ie0(je0 je0Var, int i7) {
        this.f35996a = i7;
        this.f35997b = je0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35996a) {
            case 0:
                this.f35997b.f36396a.f36725n.setVisibility(8);
                return;
            default:
                this.f35997b.f36396a.h.setVisibility(8);
                return;
        }
    }
}
