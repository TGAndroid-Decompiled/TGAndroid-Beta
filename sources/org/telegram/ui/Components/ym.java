package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final zm f35110a;

    public ym(zm zmVar) {
        this.f35110a = zmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        zm zmVar = this.f35110a;
        zmVar.f35378b.isChatPreviewSpoilerRevealed = true;
        zmVar.O.f26633z.invalidate();
    }
}
