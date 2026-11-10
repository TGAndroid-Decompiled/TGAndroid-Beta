package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dq0 extends AnimatorListenerAdapter {
    public final eq0 f45035a;

    public dq0(eq0 eq0Var) {
        this.f45035a = eq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eq0 eq0Var = this.f45035a;
        PhotoViewer photoViewer = eq0Var.f45433c;
        photoViewer.f41454m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f41382e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f41509s4) {
            PhotoViewer.S(photoViewer, eq0Var.f45432b.intValue());
        }
        xq0 xq0Var = eq0Var.f45431a;
        if (xq0Var != null) {
            xq0Var.d();
        }
    }
}
