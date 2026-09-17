package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fu0 extends AnimatorListenerAdapter {
    public final gu0 f36502a;

    public fu0(gu0 gu0Var) {
        this.f36502a = gu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gu0 gu0Var = this.f36502a;
        PhotoViewer photoViewer = gu0Var.f36818c;
        photoViewer.f33658n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33577e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33712t4) {
            PhotoViewer.a0(photoViewer, gu0Var.f36817b.intValue());
        }
        av0 av0Var = gu0Var.f36816a;
        if (av0Var != null) {
            av0Var.d();
        }
    }
}
