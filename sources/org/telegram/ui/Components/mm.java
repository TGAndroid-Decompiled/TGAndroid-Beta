package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f28496a;

    public mm(nm nmVar) {
        this.f28496a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f28496a;
        nmVar.f28820b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f29159z.invalidate();
    }
}
