package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final u f32459a;

    public x(u uVar) {
        this.f32459a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32459a.B = false;
    }
}
