package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final nt0 f39343a;

    public mt0(nt0 nt0Var) {
        this.f39343a = nt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nt0 nt0Var = this.f39343a;
        PhotoViewer photoViewer = nt0Var.f39681c;
        photoViewer.f33354n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33272e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33408t4) {
            PhotoViewer.a0(photoViewer, nt0Var.f39680b.intValue());
        }
        hu0 hu0Var = nt0Var.f39679a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
