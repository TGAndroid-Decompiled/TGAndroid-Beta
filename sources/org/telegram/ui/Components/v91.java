package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v91 extends AnimatorListenerAdapter {
    public final int f31697a;
    public final w91 f31698b;

    public v91(w91 w91Var, int i10) {
        this.f31697a = i10;
        this.f31698b = w91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31697a) {
            case 0:
                this.f31698b.f32593y = null;
                return;
            default:
                this.f31698b.f32593y = null;
                return;
        }
    }
}
