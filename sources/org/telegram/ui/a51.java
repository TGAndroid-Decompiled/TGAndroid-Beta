package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class a51 extends AnimatorListenerAdapter {
    public final int f35922a;
    public final SecretMediaViewer f35923b;

    public a51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f35922a = i10;
        this.f35923b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35922a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f35923b;
                Runnable runnable = secretMediaViewer.f34506o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34506o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f35923b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34475a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f35923b;
                Runnable runnable2 = secretMediaViewer3.f34506o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34506o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f35923b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34485e.invalidate();
                return;
        }
    }
}
