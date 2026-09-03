package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lm extends AnimatorListenerAdapter {
    public final mm f28807a;

    public lm(mm mmVar) {
        this.f28807a = mmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mm mmVar = this.f28807a;
        mmVar.f29157b.isChatPreviewSpoilerRevealed = true;
        mmVar.O.f29538z.invalidate();
    }
}
