package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pm extends AnimatorListenerAdapter {
    public final qm f29659a;

    public pm(qm qmVar) {
        this.f29659a = qmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.f29659a;
        qmVar.f30075b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.f30465z.invalidate();
    }
}
