package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iu0 extends AnimatorListenerAdapter {
    public final ju0 f34697a;

    public iu0(ju0 ju0Var) {
        this.f34697a = ju0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ju0 ju0Var = this.f34697a;
        PhotoViewer photoViewer = ju0Var.f34945c;
        photoViewer.f31035n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30954e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31089t4) {
            PhotoViewer.a0(photoViewer, ju0Var.f34944b.intValue());
        }
        dv0 dv0Var = ju0Var.f34943a;
        if (dv0Var != null) {
            dv0Var.d();
        }
    }
}
