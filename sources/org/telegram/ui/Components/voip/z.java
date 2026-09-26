package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z extends AnimatorListenerAdapter {
    public final u f29688a;

    public z(u uVar) {
        this.f29688a = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f29688a.E = false;
    }
}
