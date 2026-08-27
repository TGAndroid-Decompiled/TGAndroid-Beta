package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class ft0 extends AnimatorListenerAdapter {

    public final gt0 f38204a;

    public ft0(gt0 gt0Var) {
        this.f38204a = gt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gt0 gt0Var = this.f38204a;
        PhotoViewer photoViewer = gt0Var.f38474c;
        photoViewer.f35670j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.f35583a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.f35723p4) {
            PhotoViewer.a0(photoViewer, gt0Var.f38473b.intValue());
        }
        au0 au0Var = gt0Var.f38472a;
        if (au0Var != null) {
            au0Var.d();
        }
    }
}
