package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f36482a;
    public final ke0 f36483b;

    public je0(ke0 ke0Var, int i7) {
        this.f36482a = i7;
        this.f36483b = ke0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36482a) {
            case 0:
                this.f36483b.f36897a.f37173n.setVisibility(8);
                return;
            default:
                this.f36483b.f36897a.h.setVisibility(8);
                return;
        }
    }
}
