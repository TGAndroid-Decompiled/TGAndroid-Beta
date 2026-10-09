package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f32393a;

    public z(u uVar) {
        this.f32393a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32393a.E = false;
    }
}
