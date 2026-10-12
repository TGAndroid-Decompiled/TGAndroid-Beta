package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final bn f23581a;

    public an(bn bnVar) {
        this.f23581a = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bn bnVar = this.f23581a;
        bnVar.f23804b.isChatPreviewSpoilerRevealed = true;
        bnVar.O.f24139z.invalidate();
    }
}
