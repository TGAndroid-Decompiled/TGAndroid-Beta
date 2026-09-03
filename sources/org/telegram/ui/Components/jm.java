package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jm extends AnimatorListenerAdapter {
    public final km f25982a;

    public jm(km kmVar) {
        this.f25982a = kmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        km kmVar = this.f25982a;
        kmVar.f26331b.isChatPreviewSpoilerRevealed = true;
        kmVar.O.f26801z.invalidate();
    }
}
