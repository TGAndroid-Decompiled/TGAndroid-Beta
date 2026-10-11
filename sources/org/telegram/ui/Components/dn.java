package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dn extends AnimatorListenerAdapter {
    public final en f25847a;

    public dn(en enVar) {
        this.f25847a = enVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        en enVar = this.f25847a;
        enVar.f26120b.isChatPreviewSpoilerRevealed = true;
        enVar.O.f26512z.invalidate();
    }
}
