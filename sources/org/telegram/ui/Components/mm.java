package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f28495a;

    public mm(nm nmVar) {
        this.f28495a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f28495a;
        nmVar.f28819b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f29158z.invalidate();
    }
}
