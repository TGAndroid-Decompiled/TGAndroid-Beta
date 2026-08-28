package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class et0 extends AnimatorListenerAdapter {
    public final ft0 f38024a;

    public et0(ft0 ft0Var) {
        this.f38024a = ft0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ft0 ft0Var = this.f38024a;
        PhotoViewer photoViewer = ft0Var.f38346c;
        photoViewer.f35667j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.f35580a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.f35719p4) {
            PhotoViewer.Z(photoViewer, ft0Var.f38345b.intValue());
        }
        zt0 zt0Var = ft0Var.f38344a;
        if (zt0Var != null) {
            zt0Var.d();
        }
    }
}
