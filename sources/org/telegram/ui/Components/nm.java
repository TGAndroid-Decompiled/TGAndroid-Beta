package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nm extends AnimatorListenerAdapter {
    public final om f26441a;

    public nm(om omVar) {
        this.f26441a = omVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        om omVar = this.f26441a;
        omVar.f26780b.isChatPreviewSpoilerRevealed = true;
        omVar.O.f27105z.invalidate();
    }
}
