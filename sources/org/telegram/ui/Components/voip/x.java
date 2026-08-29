package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x extends AnimatorListenerAdapter {
    public final u f34106a;

    public x(u uVar) {
        this.f34106a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34106a.A = false;
    }
}
