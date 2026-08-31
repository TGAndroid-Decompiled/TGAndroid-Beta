package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg0 extends AnimatorListenerAdapter {
    public final int f26911a;
    public final PipRoundVideoView f26912b;

    public fg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f26911a = i10;
        this.f26912b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26911a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f26912b;
                if (animator.equals(pipRoundVideoView.f24927r)) {
                    pipRoundVideoView.f24927r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f26912b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24928s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
