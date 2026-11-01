package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class ar0 extends AnimatorListenerAdapter {
    public final int f35828a;
    public final int f35829b;
    public final PhotoViewer f35830c;

    public ar0(PhotoViewer photoViewer, int i10, int i11) {
        this.f35828a = i11;
        this.f35830c = photoViewer;
        this.f35829b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35828a) {
            case 0:
                PhotoViewer photoViewer = this.f35830c;
                br0 br0Var = photoViewer.N1;
                br0Var.e.setVisibility(0);
                FrameLayout frameLayout = br0Var.f9883r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.i0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.a30.m(translationY, grVar, 320L);
                br0Var.f9886x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(grVar).setDuration(320L).start();
                photoViewer.f33622u4 = this.f35829b;
                photoViewer.q6 = null;
                photoViewer.f33570o6 = -1;
                return;
            default:
                int i10 = this.f35829b;
                PhotoViewer photoViewer2 = this.f35830c;
                photoViewer2.f33622u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f33570o6 = -1;
                return;
        }
    }
}
