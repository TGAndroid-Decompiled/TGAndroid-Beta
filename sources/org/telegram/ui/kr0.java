package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kr0 extends AnimatorListenerAdapter {
    public final lr0 f38930a;

    public kr0(lr0 lr0Var) {
        this.f38930a = lr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        lr0 lr0Var = this.f38930a;
        PhotoViewer photoViewer = lr0Var.f39375c;
        photoViewer.f33552n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33470e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33606t4) {
            PhotoViewer.b0(photoViewer, lr0Var.f39374b.intValue());
        }
        es0 es0Var = lr0Var.f39373a;
        if (es0Var != null) {
            es0Var.d();
        }
    }
}
