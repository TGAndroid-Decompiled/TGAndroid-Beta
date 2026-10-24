package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ot0 extends AnimatorListenerAdapter {
    public final pt0 f40254a;

    public ot0(pt0 pt0Var) {
        this.f40254a = pt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        pt0 pt0Var = this.f40254a;
        PhotoViewer photoViewer = pt0Var.f40634c;
        photoViewer.f33664n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33582e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33718t4) {
            PhotoViewer.b0(photoViewer, pt0Var.f40633b.intValue());
        }
        ju0 ju0Var = pt0Var.f40632a;
        if (ju0Var != null) {
            ju0Var.d();
        }
    }
}
