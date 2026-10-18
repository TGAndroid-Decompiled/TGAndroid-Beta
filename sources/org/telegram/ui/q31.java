package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class q31 extends AnimatorListenerAdapter {
    public final int f40312a;
    public final SecretMediaViewer f40313b;

    public q31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f40312a = i10;
        this.f40313b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40312a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f40313b;
                Runnable runnable = secretMediaViewer.f33807o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f33807o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f40313b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f33777a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f40313b;
                Runnable runnable2 = secretMediaViewer3.f33807o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f33807o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f40313b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
