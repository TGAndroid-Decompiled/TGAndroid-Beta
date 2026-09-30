package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pm extends AnimatorListenerAdapter {
    public final qm f27397a;

    public pm(qm qmVar) {
        this.f27397a = qmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.f27397a;
        qmVar.f27674b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.f28086z.invalidate();
    }
}
