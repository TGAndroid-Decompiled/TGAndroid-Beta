package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nm extends AnimatorListenerAdapter {
    public final om f26742a;

    public nm(om omVar) {
        this.f26742a = omVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        om omVar = this.f26742a;
        omVar.f27119b.isChatPreviewSpoilerRevealed = true;
        omVar.O.f27404z.invalidate();
    }
}
