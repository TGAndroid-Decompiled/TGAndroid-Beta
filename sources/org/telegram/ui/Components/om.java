package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final pm f27112a;

    public om(pm pmVar) {
        this.f27112a = pmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.f27112a;
        pmVar.f27369b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.f27790z.invalidate();
    }
}
