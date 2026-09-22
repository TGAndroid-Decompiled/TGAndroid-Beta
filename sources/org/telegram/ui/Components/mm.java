package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26468a;

    public mm(nm nmVar) {
        this.f26468a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26468a;
        nmVar.f26806b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f27146z.invalidate();
    }
}
