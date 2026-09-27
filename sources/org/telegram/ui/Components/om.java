package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class om extends AnimatorListenerAdapter {
    public final pm f27139a;

    public om(pm pmVar) {
        this.f27139a = pmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pm pmVar = this.f27139a;
        pmVar.f27392b.isChatPreviewSpoilerRevealed = true;
        pmVar.O.f27803z.invalidate();
    }
}
