package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class a51 extends AnimatorListenerAdapter {
    public final int f35888a;
    public final SecretMediaViewer f35889b;

    public a51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f35888a = i10;
        this.f35889b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35888a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f35889b;
                Runnable runnable = secretMediaViewer.f34472o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34472o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f35889b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34441a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f35889b;
                Runnable runnable2 = secretMediaViewer3.f34472o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34472o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f35889b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34451e.invalidate();
                return;
        }
    }
}
