package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ft0 extends AnimatorListenerAdapter {
    public final int f37016a;
    public final int f37017b;
    public final PhotoViewer f37018c;

    public ft0(PhotoViewer photoViewer, int i10, int i11) {
        this.f37016a = i11;
        this.f37018c = photoViewer;
        this.f37017b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37016a) {
            case 0:
                PhotoViewer photoViewer = this.f37018c;
                gt0 gt0Var = photoViewer.K1;
                gt0Var.f5391e.setVisibility(0);
                FrameLayout frameLayout = gt0Var.f5394r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                b.p(translationY, prVar, 320L);
                gt0Var.f5396w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(prVar).setDuration(320L).start();
                photoViewer.f34379r4 = this.f37017b;
                photoViewer.f34344n6 = null;
                photoViewer.f34326l6 = -1;
                return;
            default:
                int i10 = this.f37017b;
                PhotoViewer photoViewer2 = this.f37018c;
                photoViewer2.f34379r4 = i10;
                photoViewer2.f34344n6 = null;
                photoViewer2.f34326l6 = -1;
                return;
        }
    }
}
