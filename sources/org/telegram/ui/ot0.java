package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ot0 extends AnimatorListenerAdapter {
    public final pt0 f39864a;

    public ot0(pt0 pt0Var) {
        this.f39864a = pt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        pt0 pt0Var = this.f39864a;
        PhotoViewer photoViewer = pt0Var.f40203c;
        photoViewer.f33348n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33266e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33402t4) {
            PhotoViewer.a0(photoViewer, pt0Var.f40202b.intValue());
        }
        ju0 ju0Var = pt0Var.f40201a;
        if (ju0Var != null) {
            ju0Var.d();
        }
    }
}
