package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f28469a;

    public mm(nm nmVar) {
        this.f28469a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f28469a;
        nmVar.f28793b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f29132z.invalidate();
    }
}
