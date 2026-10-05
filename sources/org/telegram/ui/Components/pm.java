package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pm extends AnimatorListenerAdapter {
    public final qm f29758a;

    public pm(qm qmVar) {
        this.f29758a = qmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.f29758a;
        qmVar.f30103b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.f30554z.invalidate();
    }
}
