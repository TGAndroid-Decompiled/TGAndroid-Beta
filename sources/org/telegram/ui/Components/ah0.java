package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ah0 extends AnimatorListenerAdapter {
    public final int f24688a;
    public final PipRoundVideoView f24689b;

    public ah0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f24688a = i10;
        this.f24689b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24688a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f24689b;
                if (animator.equals(pipRoundVideoView.f24218r)) {
                    pipRoundVideoView.f24218r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f24689b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24219s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
