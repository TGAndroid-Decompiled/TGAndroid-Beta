package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y extends AnimatorListenerAdapter {
    public final u f32303a;

    public y(u uVar) {
        this.f32303a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f32303a.E = false;
    }
}
