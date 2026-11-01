package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jr0 extends AnimatorListenerAdapter {
    public final kr0 f38535a;

    public jr0(kr0 kr0Var) {
        this.f38535a = kr0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        kr0 kr0Var = this.f38535a;
        PhotoViewer photoViewer = kr0Var.f38966c;
        photoViewer.f33559n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33477e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33613t4) {
            PhotoViewer.b0(photoViewer, kr0Var.f38965b.intValue());
        }
        ds0 ds0Var = kr0Var.f38964a;
        if (ds0Var != null) {
            ds0Var.d();
        }
    }
}
