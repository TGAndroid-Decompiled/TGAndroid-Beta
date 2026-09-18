package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26215a;

    public mm(nm nmVar) {
        this.f26215a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26215a;
        nmVar.f26483b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f26803z.invalidate();
    }
}
