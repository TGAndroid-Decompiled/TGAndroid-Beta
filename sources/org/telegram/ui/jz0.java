package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class jz0 extends AnimatorListenerAdapter {
    public final int f47060a;
    public final SecretMediaViewer f47061b;

    public jz0(SecretMediaViewer secretMediaViewer, int i7) {
        this.f47060a = i7;
        this.f47061b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47060a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f47061b;
                Runnable runnable = secretMediaViewer.m0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.m0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f47061b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.Y.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f47061b;
                Runnable runnable2 = secretMediaViewer3.m0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.m0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f47061b;
                secretMediaViewer4.I0 = null;
                secretMediaViewer4.f41908e.invalidate();
                return;
        }
    }
}
