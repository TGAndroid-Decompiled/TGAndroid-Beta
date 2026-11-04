package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
public final class jp0 extends AnimatorListenerAdapter {
    public final int f46665a;
    public final int f46666b;
    public final PhotoViewer f46667c;

    public jp0(PhotoViewer photoViewer, int i3, int i10) {
        this.f46665a = i10;
        this.f46667c = photoViewer;
        this.f46666b = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46665a) {
            case 0:
                PhotoViewer photoViewer = this.f46667c;
                kp0 kp0Var = photoViewer.O1;
                kp0Var.f56170e.setVisibility(0);
                FrameLayout frameLayout = kp0Var.f56173r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.g0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 320L);
                kp0Var.f56176x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(xqVar).setDuration(320L).start();
                photoViewer.f41562v4 = this.f46666b;
                photoViewer.f41528r6 = null;
                photoViewer.f41510p6 = -1;
                return;
            default:
                int i3 = this.f46666b;
                PhotoViewer photoViewer2 = this.f46667c;
                photoViewer2.f41562v4 = i3;
                photoViewer2.f41528r6 = null;
                photoViewer2.f41510p6 = -1;
                return;
        }
    }
}
