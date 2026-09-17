package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w81 extends AnimatorListenerAdapter {
    public final int f32238a;
    public final x81 f32239b;

    public w81(x81 x81Var, int i10) {
        this.f32238a = i10;
        this.f32239b = x81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32238a) {
            case 0:
                this.f32239b.f32503y = null;
                return;
            default:
                this.f32239b.f32503y = null;
                return;
        }
    }
}
