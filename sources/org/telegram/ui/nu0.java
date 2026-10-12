package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nu0 extends AnimatorListenerAdapter {
    public final ou0 f38799a;

    public nu0(ou0 ou0Var) {
        this.f38799a = ou0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ou0 ou0Var = this.f38799a;
        PhotoViewer photoViewer = ou0Var.f39043c;
        photoViewer.f32308n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f32226e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f32362t4) {
            PhotoViewer.a0(photoViewer, ou0Var.f39042b.intValue());
        }
        iv0 iv0Var = ou0Var.f39041a;
        if (iv0Var != null) {
            iv0Var.d();
        }
    }
}
