package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bu0 extends AnimatorListenerAdapter {
    public final cu0 f35194a;

    public bu0(cu0 cu0Var) {
        this.f35194a = cu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cu0 cu0Var = this.f35194a;
        PhotoViewer photoViewer = cu0Var.f35555c;
        photoViewer.f33976n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33895e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f34030t4) {
            PhotoViewer.Z(photoViewer, cu0Var.f35554b.intValue());
        }
        wu0 wu0Var = cu0Var.f35553a;
        if (wu0Var != null) {
            wu0Var.d();
        }
    }
}
