package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xf0 extends AnimatorListenerAdapter {
    public final int f32744a;
    public final zf0 f32745b;

    public xf0(zf0 zf0Var, int i10) {
        this.f32744a = i10;
        this.f32745b = zf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32744a) {
            case 0:
                this.f32745b.f33356s = null;
                return;
            default:
                this.f32745b.v = null;
                return;
        }
    }
}
