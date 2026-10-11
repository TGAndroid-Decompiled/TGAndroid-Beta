package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dn extends AnimatorListenerAdapter {
    public final en f25630a;

    public dn(en enVar) {
        this.f25630a = enVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        en enVar = this.f25630a;
        enVar.f26082b.isChatPreviewSpoilerRevealed = true;
        enVar.O.f26397z.invalidate();
    }
}
