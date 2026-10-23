package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final nt0 f39353a;

    public mt0(nt0 nt0Var) {
        this.f39353a = nt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nt0 nt0Var = this.f39353a;
        PhotoViewer photoViewer = nt0Var.f39691c;
        photoViewer.f33365n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33283e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33419t4) {
            PhotoViewer.b0(photoViewer, nt0Var.f39690b.intValue());
        }
        hu0 hu0Var = nt0Var.f39689a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
