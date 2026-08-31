package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f29153a;

    public mm(nm nmVar) {
        this.f29153a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f29153a;
        nmVar.f29542b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f29820z.invalidate();
    }
}
