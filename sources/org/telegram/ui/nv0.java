package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f39054a;
    public final uv0 f39055b;

    public nv0(uv0 uv0Var, int i10) {
        this.f39054a = i10;
        this.f39055b = uv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39054a) {
            case 0:
                this.f39055b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f39055b.R.setTranslationY(0.0f);
                return;
            default:
                uv0 uv0Var = this.f39055b;
                uv0Var.getClass();
                uv0Var.R.setTranslationY(0.0f);
                uv0Var.l0();
                return;
        }
    }
}
