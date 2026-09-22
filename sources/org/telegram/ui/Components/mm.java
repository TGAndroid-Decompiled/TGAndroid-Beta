package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26177a;

    public mm(nm nmVar) {
        this.f26177a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26177a;
        nmVar.f26497b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f26858z.invalidate();
    }
}
