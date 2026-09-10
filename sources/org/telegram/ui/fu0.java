package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fu0 extends AnimatorListenerAdapter {
    public final gu0 f32920a;

    public fu0(gu0 gu0Var) {
        this.f32920a = gu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gu0 gu0Var = this.f32920a;
        PhotoViewer photoViewer = gu0Var.f33189c;
        photoViewer.f30130n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f30049e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f30184t4) {
            PhotoViewer.a0(photoViewer, gu0Var.f33188b.intValue());
        }
        cv0 cv0Var = gu0Var.f33187a;
        if (cv0Var != null) {
            cv0Var.d();
        }
    }
}
