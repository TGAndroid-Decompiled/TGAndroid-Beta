package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final zm f35078a;

    public ym(zm zmVar) {
        this.f35078a = zmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zm zmVar = this.f35078a;
        zmVar.f35355b.isChatPreviewSpoilerRevealed = true;
        zmVar.O.f26575z.invalidate();
    }
}
