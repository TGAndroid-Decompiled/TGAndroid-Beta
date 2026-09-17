package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class au0 extends AnimatorListenerAdapter {
    public final int f31981a;
    public final int f31982b;
    public final PhotoViewer f31983c;

    public au0(PhotoViewer photoViewer, int i10, int i11) {
        this.f31981a = i11;
        this.f31983c = photoViewer;
        this.f31982b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31981a) {
            case 0:
                PhotoViewer photoViewer = this.f31983c;
                bu0 bu0Var = photoViewer.N1;
                bu0Var.e.setVisibility(0);
                FrameLayout frameLayout = bu0Var.f41751r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wl.q(translationY, qrVar, 320L);
                bu0Var.f41753w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(qrVar).setDuration(320L).start();
                photoViewer.f31094u4 = this.f31982b;
                photoViewer.q6 = null;
                photoViewer.f31042o6 = -1;
                return;
            default:
                int i10 = this.f31982b;
                PhotoViewer photoViewer2 = this.f31983c;
                photoViewer2.f31094u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.f31042o6 = -1;
                return;
        }
    }
}
