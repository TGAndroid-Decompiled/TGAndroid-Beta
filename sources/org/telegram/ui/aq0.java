package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class aq0 extends AnimatorListenerAdapter {
    public final bq0 f44074a;

    public aq0(bq0 bq0Var) {
        this.f44074a = bq0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        bq0 bq0Var = this.f44074a;
        PhotoViewer photoViewer = bq0Var.f44475c;
        photoViewer.f41452m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f41380e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f41507s4) {
            PhotoViewer.S(photoViewer, bq0Var.f44474b.intValue());
        }
        uq0 uq0Var = bq0Var.f44473a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
