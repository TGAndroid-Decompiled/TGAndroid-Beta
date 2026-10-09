package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dn extends AnimatorListenerAdapter {
    public final en f25742a;

    public dn(en enVar) {
        this.f25742a = enVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        en enVar = this.f25742a;
        enVar.f26114b.isChatPreviewSpoilerRevealed = true;
        enVar.O.f26431z.invalidate();
    }
}
