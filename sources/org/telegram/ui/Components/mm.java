package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26212a;

    public mm(nm nmVar) {
        this.f26212a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26212a;
        nmVar.f26480b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f26800z.invalidate();
    }
}
