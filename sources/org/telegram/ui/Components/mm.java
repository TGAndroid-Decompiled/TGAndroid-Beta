package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26178a;

    public mm(nm nmVar) {
        this.f26178a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26178a;
        nmVar.f26498b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f26861z.invalidate();
    }
}
