package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dm extends AnimatorListenerAdapter {
    public final em f27777a;

    public dm(em emVar) {
        this.f27777a = emVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        em emVar = this.f27777a;
        emVar.f28063b.isChatPreviewSpoilerRevealed = true;
        emVar.O.f28512z.invalidate();
    }
}
