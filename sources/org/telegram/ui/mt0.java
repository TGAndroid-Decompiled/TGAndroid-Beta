package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final nt0 f39352a;

    public mt0(nt0 nt0Var) {
        this.f39352a = nt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nt0 nt0Var = this.f39352a;
        PhotoViewer photoViewer = nt0Var.f39690c;
        photoViewer.f33364n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33282e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33418t4) {
            PhotoViewer.b0(photoViewer, nt0Var.f39689b.intValue());
        }
        hu0 hu0Var = nt0Var.f39688a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
