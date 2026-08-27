package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class am extends AnimatorListenerAdapter {

    public final bm f26765a;

    public am(bm bmVar) {
        this.f26765a = bmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bm bmVar = this.f26765a;
        bmVar.f27138b.isChatPreviewSpoilerRevealed = true;
        bmVar.O.f27505z.invalidate();
    }
}
