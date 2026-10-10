package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hu0 extends AnimatorListenerAdapter {
    public final iu0 f38447a;

    public hu0(iu0 iu0Var) {
        this.f38447a = iu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        iu0 iu0Var = this.f38447a;
        PhotoViewer photoViewer = iu0Var.f38804c;
        photoViewer.f34023n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33942e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f34077t4) {
            PhotoViewer.a0(photoViewer, iu0Var.f38803b.intValue());
        }
        cv0 cv0Var = iu0Var.f38802a;
        if (cv0Var != null) {
            cv0Var.d();
        }
    }
}
