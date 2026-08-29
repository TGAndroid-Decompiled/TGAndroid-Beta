package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hm extends AnimatorListenerAdapter {
    public final im f29202a;

    public hm(im imVar) {
        this.f29202a = imVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        im imVar = this.f29202a;
        imVar.f29409b.isChatPreviewSpoilerRevealed = true;
        imVar.O.f29760z.invalidate();
    }
}
