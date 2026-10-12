package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fn extends AnimatorListenerAdapter {
    public final gn f26144a;

    public fn(gn gnVar) {
        this.f26144a = gnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        gn gnVar = this.f26144a;
        gnVar.f26456b.isChatPreviewSpoilerRevealed = true;
        gnVar.O.f26837z.invalidate();
    }
}
