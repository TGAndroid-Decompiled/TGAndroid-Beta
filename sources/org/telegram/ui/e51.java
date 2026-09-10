package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class e51 extends AnimatorListenerAdapter {
    public final int f32063a;
    public final SecretMediaViewer f32064b;

    public e51(SecretMediaViewer secretMediaViewer, int i10) {
        this.f32063a = i10;
        this.f32064b = secretMediaViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32063a) {
            case 0:
                SecretMediaViewer secretMediaViewer = this.f32064b;
                Runnable runnable = secretMediaViewer.f30579o0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.f30579o0 = null;
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer2 = this.f32064b;
                AnimatorSet animatorSet = secretMediaViewer2.G;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    secretMediaViewer2.F.setVisibility(8);
                    secretMediaViewer2.G = null;
                    secretMediaViewer2.f30549a0.scrollTo(0, 0);
                    return;
                }
                return;
            case 2:
                SecretMediaViewer secretMediaViewer3 = this.f32064b;
                Runnable runnable2 = secretMediaViewer3.f30579o0;
                if (runnable2 != null) {
                    runnable2.run();
                    secretMediaViewer3.f30579o0 = null;
                    return;
                }
                return;
            default:
                SecretMediaViewer secretMediaViewer4 = this.f32064b;
                secretMediaViewer4.K0 = null;
                secretMediaViewer4.e.invalidate();
                return;
        }
    }
}
