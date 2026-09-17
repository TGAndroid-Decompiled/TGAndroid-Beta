package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29348a;

    public z(u uVar) {
        this.f29348a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29348a.E = false;
    }
}
