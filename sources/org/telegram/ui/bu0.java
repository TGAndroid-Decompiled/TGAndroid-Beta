package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bu0 extends AnimatorListenerAdapter {
    public final cu0 f32441a;

    public bu0(cu0 cu0Var) {
        this.f32441a = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cu0 cu0Var = this.f32441a;
        PhotoViewer photoViewer = cu0Var.f32795c;
        photoViewer.f31306n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f31225e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31360t4) {
            PhotoViewer.a0(photoViewer, cu0Var.f32794b.intValue());
        }
        wu0 wu0Var = cu0Var.f32793a;
        if (wu0Var != null) {
            wu0Var.d();
        }
    }
}
