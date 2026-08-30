package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lt0 extends AnimatorListenerAdapter {
    public final mt0 f36134a;

    public lt0(mt0 mt0Var) {
        this.f36134a = mt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        mt0 mt0Var = this.f36134a;
        PhotoViewer photoViewer = mt0Var.f36382c;
        photoViewer.f31790k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.f31705b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.f31843q4) {
            PhotoViewer.a0(photoViewer, mt0Var.f36381b.intValue());
        }
        hu0 hu0Var = mt0Var.f36380a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
