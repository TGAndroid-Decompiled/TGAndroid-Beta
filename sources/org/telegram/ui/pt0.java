package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pt0 extends AnimatorListenerAdapter {
    public final qt0 f40542a;

    public pt0(qt0 qt0Var) {
        this.f40542a = qt0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        qt0 qt0Var = this.f40542a;
        PhotoViewer photoViewer = qt0Var.f40917c;
        photoViewer.f33662n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.f33580e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.f33716t4) {
            PhotoViewer.b0(photoViewer, qt0Var.f40916b.intValue());
        }
        ku0 ku0Var = qt0Var.f40915a;
        if (ku0Var != null) {
            ku0Var.d();
        }
    }
}
