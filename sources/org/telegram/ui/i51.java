package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class i51 extends AnimatorListenerAdapter {
    public final int f36727a;
    public final SecretMediaViewer f36728b;

    public i51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f36727a = i10;
        this.f36728b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36727a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f36728b;
                Runnable runnable = secretMediaViewer.f32460o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f32460o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f36728b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f32430a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f36728b;
                Runnable runnable2 = secretMediaViewer3.f32460o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f32460o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f36728b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
