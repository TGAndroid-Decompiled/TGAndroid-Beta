package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ju0 extends AnimatorListenerAdapter {
    public final ku0 f39287a;

    public ju0(ku0 ku0Var) {
        this.f39287a = ku0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ku0 ku0Var = this.f39287a;
        PhotoViewer photoViewer = ku0Var.f39582c;
        photoViewer.f33824n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33743e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33878t4) {
            PhotoViewer.a0(photoViewer, ku0Var.f39581b.intValue());
        }
        ev0 ev0Var = ku0Var.f39580a;
        if (ev0Var != null) {
            ev0Var.d();
        }
    }
}
