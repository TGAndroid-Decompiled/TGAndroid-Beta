package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29771a;

    public z(u uVar) {
        this.f29771a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29771a.E = false;
    }
}
