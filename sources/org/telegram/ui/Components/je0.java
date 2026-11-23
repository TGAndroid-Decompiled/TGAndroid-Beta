package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f36481a;
    public final ke0 f36482b;

    public je0(ke0 ke0Var, int i7) {
        this.f36481a = i7;
        this.f36482b = ke0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36481a) {
            case 0:
                this.f36482b.f36896a.f37172n.setVisibility(8);
                return;
            default:
                this.f36482b.f36896a.h.setVisibility(8);
                return;
        }
    }
}
