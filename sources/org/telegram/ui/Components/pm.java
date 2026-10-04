package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pm extends AnimatorListenerAdapter {
    public final qm f29665a;

    public pm(qm qmVar) {
        this.f29665a = qmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.f29665a;
        qmVar.f30081b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.f30472z.invalidate();
    }
}
