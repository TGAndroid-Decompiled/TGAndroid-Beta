package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bh0 extends AnimatorListenerAdapter {
    public final int f25006a;
    public final PipRoundVideoView f25007b;

    public bh0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.f25006a = i10;
        this.f25007b = pipRoundVideoView;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25006a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.f25007b;
                if (animator.equals(pipRoundVideoView.f24246r)) {
                    pipRoundVideoView.f24246r = null;
                    return;
                }
                return;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.f25007b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.f24247s;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
