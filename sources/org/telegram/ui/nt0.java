package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nt0 extends AnimatorListenerAdapter {
    public final ot0 f39515a;

    public nt0(ot0 ot0Var) {
        this.f39515a = ot0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ot0 ot0Var = this.f39515a;
        PhotoViewer photoViewer = ot0Var.f39841c;
        photoViewer.f34316k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.f34230b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.f34369q4) {
            PhotoViewer.a0(photoViewer, ot0Var.f39840b.intValue());
        }
        ju0 ju0Var = ot0Var.f39839a;
        if (ju0Var != null) {
            ju0Var.d();
        }
    }
}
