package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class i41 extends AnimatorListenerAdapter {
    public final int f37738a;
    public final SecretMediaViewer f37739b;

    public i41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f37738a = i10;
        this.f37739b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37738a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f37739b;
                Runnable runnable = secretMediaViewer.f34786l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f34786l0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f37739b;
                AnimatorSet animatorSet = secretMediaViewer2.D;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.C.setVisibility(8);
                    secretMediaViewer2.D = null;
                    secretMediaViewer2.X.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f37739b;
                Runnable runnable2 = secretMediaViewer3.f34786l0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f34786l0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f37739b;
                secretMediaViewer4.H0 = null;
                secretMediaViewer4.f34770e.invalidate();
                return;
        }
    }
}
