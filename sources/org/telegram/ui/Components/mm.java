package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f28468a;

    public mm(nm nmVar) {
        this.f28468a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f28468a;
        nmVar.f28792b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f29131z.invalidate();
    }
}
