package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class q31 extends AnimatorListenerAdapter {
    public final int f40270a;
    public final SecretMediaViewer f40271b;

    public q31(SecretMediaViewer secretMediaViewer, int i10) {
        this.f40270a = i10;
        this.f40271b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40270a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f40271b;
                Runnable runnable = secretMediaViewer.f33800o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f33800o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f40271b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f33770a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f40271b;
                Runnable runnable2 = secretMediaViewer3.f33800o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f33800o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f40271b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
