package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26452a;

    public mm(nm nmVar) {
        this.f26452a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26452a;
        nmVar.f26705b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f27009z.invalidate();
    }
}
