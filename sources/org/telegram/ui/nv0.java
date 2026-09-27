package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nv0 extends AnimatorListenerAdapter {
    public final int f36092a;
    public final uv0 f36093b;

    public nv0(uv0 uv0Var, int i10) {
        this.f36092a = i10;
        this.f36093b = uv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36092a) {
            case 0:
                this.f36093b.R.setTranslationY(0.0f);
                return;
            case 1:
                this.f36093b.R.setTranslationY(0.0f);
                return;
            default:
                uv0 uv0Var = this.f36093b;
                uv0Var.getClass();
                uv0Var.R.setTranslationY(0.0f);
                uv0Var.l0();
                return;
        }
    }
}
