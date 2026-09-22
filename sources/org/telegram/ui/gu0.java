package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gu0 extends AnimatorListenerAdapter {
    public final hu0 f33998a;

    public gu0(hu0 hu0Var) {
        this.f33998a = hu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.f33998a;
        PhotoViewer photoViewer = hu0Var.f34314c;
        photoViewer.f31323n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f31242e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f31377t4) {
            PhotoViewer.a0(photoViewer, hu0Var.f34313b.intValue());
        }
        bv0 bv0Var = hu0Var.f34312a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
