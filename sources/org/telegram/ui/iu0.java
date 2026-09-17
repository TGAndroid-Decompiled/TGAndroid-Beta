package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class iu0 extends AnimatorListenerAdapter {
    public final ju0 f34692a;

    public iu0(ju0 ju0Var) {
        this.f34692a = ju0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ju0 ju0Var = this.f34692a;
        PhotoViewer photoViewer = ju0Var.f34940c;
        photoViewer.f31031n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30950e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31085t4) {
            PhotoViewer.a0(photoViewer, ju0Var.f34939b.intValue());
        }
        dv0 dv0Var = ju0Var.f34938a;
        if (dv0Var != null) {
            dv0Var.d();
        }
    }
}
