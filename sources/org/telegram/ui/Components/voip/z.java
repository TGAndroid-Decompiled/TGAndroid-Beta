package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32310a;

    public z(u uVar) {
        this.f32310a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32310a.E = false;
    }
}
