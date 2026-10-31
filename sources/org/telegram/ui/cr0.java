package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class cr0 extends AnimatorListenerAdapter {
    public final int f36527a;
    public final int f36528b;
    public final PhotoViewer f36529c;

    public cr0(PhotoViewer photoViewer, int i10, int i11) {
        this.f36527a = i11;
        this.f36529c = photoViewer;
        this.f36528b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36527a) {
            case 0:
                PhotoViewer photoViewer = this.f36529c;
                dr0 dr0Var = photoViewer.N1;
                dr0Var.e.setVisibility(0);
                FrameLayout frameLayout = dr0Var.f9882r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.i0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.z20.m(translationY, grVar, 320L);
                dr0Var.f9885x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(grVar).setDuration(320L).start();
                photoViewer.f33615u4 = this.f36528b;
                photoViewer.q6 = null;
                photoViewer.f33563o6 = -1;
                return;
            default:
                int i10 = this.f36528b;
                PhotoViewer photoViewer2 = this.f36529c;
                photoViewer2.f33615u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33563o6 = -1;
                return;
        }
    }
}
