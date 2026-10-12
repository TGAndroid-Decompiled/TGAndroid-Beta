package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a0 extends AnimatorListenerAdapter {
    public final u f31584a;

    public a0(u uVar) {
        this.f31584a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f31584a.E = false;
    }
}
