package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final zm f35081a;

    public ym(zm zmVar) {
        this.f35081a = zmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zm zmVar = this.f35081a;
        zmVar.f35358b.isChatPreviewSpoilerRevealed = true;
        zmVar.O.f26577z.invalidate();
    }
}
