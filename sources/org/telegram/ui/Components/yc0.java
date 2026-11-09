package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yc0 extends AnimatorListenerAdapter {
    public final int f40700a;
    public final bd0 f40701b;

    public yc0(bd0 bd0Var, int i7) {
        this.f40700a = i7;
        this.f40701b = bd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40700a) {
            case 0:
                this.f40701b.f32229t1 = null;
                return;
            default:
                this.f40701b.f32230u1 = null;
                return;
        }
    }
}
