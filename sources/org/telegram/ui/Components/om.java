package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final pm f27110a;

    public om(pm pmVar) {
        this.f27110a = pmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.f27110a;
        pmVar.f27370b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.f27781z.invalidate();
    }
}
