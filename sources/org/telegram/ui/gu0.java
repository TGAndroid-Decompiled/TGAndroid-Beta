package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gu0 extends AnimatorListenerAdapter {
    public final hu0 f38198a;

    public gu0(hu0 hu0Var) {
        this.f38198a = hu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.f38198a;
        PhotoViewer photoViewer = hu0Var.f38544c;
        photoViewer.f34047n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33966e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f34101t4) {
            PhotoViewer.a0(photoViewer, hu0Var.f38543b.intValue());
        }
        bv0 bv0Var = hu0Var.f38542a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
