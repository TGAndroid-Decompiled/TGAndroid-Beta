package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class hz0 extends AnimatorListenerAdapter {
    public final int f47854a;
    public final SecretMediaViewer f47855b;

    public hz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f47854a = i7;
        this.f47855b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47854a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f47855b;
                Runnable runnable = secretMediaViewer.f43298n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f43298n0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f47855b;
                AnimatorSet animatorSet = secretMediaViewer2.H;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.G.setVisibility(8);
                    secretMediaViewer2.H = null;
                    secretMediaViewer2.Z.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f47855b;
                Runnable runnable2 = secretMediaViewer3.f43298n0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f43298n0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f47855b;
                secretMediaViewer4.J0 = null;
                secretMediaViewer4.f43279e.invalidate();
                return;
        }
    }
}
