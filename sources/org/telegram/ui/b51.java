package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class b51 extends AnimatorListenerAdapter {
    public final int f32051a;
    public final SecretMediaViewer f32052b;

    public b51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f32051a = i10;
        this.f32052b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32051a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f32052b;
                Runnable runnable = secretMediaViewer.f31480o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f31480o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f32052b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f31450a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f32052b;
                Runnable runnable2 = secretMediaViewer3.f31480o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f31480o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f32052b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
