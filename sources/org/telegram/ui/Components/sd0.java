package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd0 extends AnimatorListenerAdapter {
    public final int f32446a;
    public final wd0 f32447b;

    public sd0(wd0 wd0Var, int i9) {
        this.f32446a = i9;
        this.f32447b = wd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32446a) {
            case 0:
                this.f32447b.f34214x = null;
                return;
            default:
                this.f32447b.f34215y = null;
                return;
        }
    }
}
