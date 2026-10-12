package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ju0 extends AnimatorListenerAdapter {
    public final ku0 f39284a;

    public ju0(ku0 ku0Var) {
        this.f39284a = ku0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ku0 ku0Var = this.f39284a;
        PhotoViewer photoViewer = ku0Var.f39588c;
        photoViewer.f33822n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33741e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33876t4) {
            PhotoViewer.a0(photoViewer, ku0Var.f39587b.intValue());
        }
        ev0 ev0Var = ku0Var.f39586a;
        if (ev0Var != null) {
            ev0Var.d();
        }
    }
}
