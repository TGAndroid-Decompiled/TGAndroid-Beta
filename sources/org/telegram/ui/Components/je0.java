package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f36440a;
    public final ke0 f36441b;

    public je0(ke0 ke0Var, int i7) {
        this.f36440a = i7;
        this.f36441b = ke0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36440a) {
            case 0:
                this.f36441b.f36862a.f37129n.setVisibility(8);
                return;
            default:
                this.f36441b.f36862a.h.setVisibility(8);
                return;
        }
    }
}
