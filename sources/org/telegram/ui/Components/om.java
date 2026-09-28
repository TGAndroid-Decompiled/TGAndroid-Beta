package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final pm f27111a;

    public om(pm pmVar) {
        this.f27111a = pmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.f27111a;
        pmVar.f27368b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.f27789z.invalidate();
    }
}
