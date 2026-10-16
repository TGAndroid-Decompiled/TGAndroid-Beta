package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class an extends AnimatorListenerAdapter {
    public final bn f23271a;

    public an(bn bnVar) {
        this.f23271a = bnVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        bn bnVar = this.f23271a;
        bnVar.f23497b.isChatPreviewSpoilerRevealed = true;
        bnVar.O.f23826z.invalidate();
    }
}
