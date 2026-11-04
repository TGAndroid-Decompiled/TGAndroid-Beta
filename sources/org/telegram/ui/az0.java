package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class az0 extends AnimatorListenerAdapter {
    public final int f43860a;
    public final SecretMediaViewer f43861b;

    public az0(SecretMediaViewer secretMediaViewer, int i3) {
        this.f43860a = i3;
        this.f43861b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43860a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f43861b;
                Runnable runnable = secretMediaViewer.f41954n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f41954n0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f43861b;
                AnimatorSet animatorSet = secretMediaViewer2.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.G.setVisibility(8);
                    secretMediaViewer2.H = null;
                    secretMediaViewer2.Z.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f43861b;
                Runnable runnable2 = secretMediaViewer3.f41954n0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f41954n0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f43861b;
                secretMediaViewer4.J0 = null;
                secretMediaViewer4.f41936e.invalidate();
                return;
        }
    }
}
