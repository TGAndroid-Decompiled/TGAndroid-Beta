package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pm extends AnimatorListenerAdapter {
    public final qm f29660a;

    public pm(qm qmVar) {
        this.f29660a = qmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        qm qmVar = this.f29660a;
        qmVar.f30076b.isChatPreviewSpoilerRevealed = true;
        qmVar.O.f30466z.invalidate();
    }
}
