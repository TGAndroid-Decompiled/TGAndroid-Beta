package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te0 extends AnimatorListenerAdapter {
    public final int f39986a;
    public final PipRoundVideoView f39987b;

    public te0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.f39986a = i7;
        this.f39987b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39986a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f39987b;
                if (animator.equals(pipRoundVideoView.f33007r)) {
                    pipRoundVideoView.f33007r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f39987b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f33008s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
