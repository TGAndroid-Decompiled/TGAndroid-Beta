package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class d51 extends AnimatorListenerAdapter {
    public final int f36652a;
    public final SecretMediaViewer f36653b;

    public d51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f36652a = i10;
        this.f36653b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36652a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f36653b;
                Runnable runnable = secretMediaViewer.f34283o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34283o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f36653b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f34252a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f36653b;
                Runnable runnable2 = secretMediaViewer3.f34283o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34283o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f36653b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.f34262e.invalidate();
                return;
        }
    }
}
