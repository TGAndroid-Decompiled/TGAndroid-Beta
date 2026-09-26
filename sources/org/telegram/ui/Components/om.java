package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final pm f27057a;

    public om(pm pmVar) {
        this.f27057a = pmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.f27057a;
        pmVar.f27424b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.f27736z.invalidate();
    }
}
