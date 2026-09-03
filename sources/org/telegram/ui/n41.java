package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class n41 extends AnimatorListenerAdapter {
    public final int f36385a;
    public final SecretMediaViewer f36386b;

    public n41(SecretMediaViewer secretMediaViewer, int i10) {
        this.f36385a = i10;
        this.f36386b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36385a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f36386b;
                Runnable runnable = secretMediaViewer.f32224l0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f32224l0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f36386b;
                AnimatorSet animatorSet = secretMediaViewer2.D;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.C.setVisibility(8);
                    secretMediaViewer2.D = null;
                    secretMediaViewer2.X.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f36386b;
                Runnable runnable2 = secretMediaViewer3.f32224l0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f32224l0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f36386b;
                secretMediaViewer4.H0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
