package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nm extends AnimatorListenerAdapter {
    public final om f26743a;

    public nm(om omVar) {
        this.f26743a = omVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        om omVar = this.f26743a;
        omVar.f27120b.isChatPreviewSpoilerRevealed = true;
        omVar.O.f27405z.invalidate();
    }
}
