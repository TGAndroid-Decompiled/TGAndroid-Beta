package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fu0 extends AnimatorListenerAdapter {
    public final gu0 f36474a;

    public fu0(gu0 gu0Var) {
        this.f36474a = gu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gu0 gu0Var = this.f36474a;
        PhotoViewer photoViewer = gu0Var.f36790c;
        photoViewer.f33630n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33549e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33684t4) {
            PhotoViewer.a0(photoViewer, gu0Var.f36789b.intValue());
        }
        av0 av0Var = gu0Var.f36788a;
        if (av0Var != null) {
            av0Var.d();
        }
    }
}
