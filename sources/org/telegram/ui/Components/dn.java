package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dn extends AnimatorListenerAdapter {
    public final en f25769a;

    public dn(en enVar) {
        this.f25769a = enVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        en enVar = this.f25769a;
        enVar.f26082b.isChatPreviewSpoilerRevealed = true;
        enVar.O.f26463z.invalidate();
    }
}
