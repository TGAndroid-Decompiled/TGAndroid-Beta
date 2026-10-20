package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mt0 extends AnimatorListenerAdapter {
    public final nt0 f39349a;

    public mt0(nt0 nt0Var) {
        this.f39349a = nt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nt0 nt0Var = this.f39349a;
        PhotoViewer photoViewer = nt0Var.f39687c;
        photoViewer.f33360n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33278e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33414t4) {
            PhotoViewer.b0(photoViewer, nt0Var.f39686b.intValue());
        }
        hu0 hu0Var = nt0Var.f39685a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
