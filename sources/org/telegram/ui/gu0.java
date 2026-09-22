package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gu0 extends AnimatorListenerAdapter {
    public final hu0 f33952a;

    public gu0(hu0 hu0Var) {
        this.f33952a = hu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.f33952a;
        PhotoViewer photoViewer = hu0Var.f34360c;
        photoViewer.f31015n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30934e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31069t4) {
            PhotoViewer.a0(photoViewer, hu0Var.f34359b.intValue());
        }
        bv0 bv0Var = hu0Var.f34358a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
