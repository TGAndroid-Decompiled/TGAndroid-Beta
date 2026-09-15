package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gu0 extends AnimatorListenerAdapter {
    public final hu0 f34023a;

    public gu0(hu0 hu0Var) {
        this.f34023a = hu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.f34023a;
        PhotoViewer photoViewer = hu0Var.f34347c;
        photoViewer.f31017n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30936e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31071t4) {
            PhotoViewer.a0(photoViewer, hu0Var.f34346b.intValue());
        }
        bv0 bv0Var = hu0Var.f34345a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
