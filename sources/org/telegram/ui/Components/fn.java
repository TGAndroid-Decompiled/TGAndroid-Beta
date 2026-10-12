package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fn extends AnimatorListenerAdapter {
    public final gn f26146a;

    public fn(gn gnVar) {
        this.f26146a = gnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gn gnVar = this.f26146a;
        gnVar.f26458b.isChatPreviewSpoilerRevealed = true;
        gnVar.O.f26823z.invalidate();
    }
}
