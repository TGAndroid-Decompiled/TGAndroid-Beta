package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class km extends AnimatorListenerAdapter {
    public final lm f26312a;

    public km(lm lmVar) {
        this.f26312a = lmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        lm lmVar = this.f26312a;
        lmVar.f26791b.isChatPreviewSpoilerRevealed = true;
        lmVar.O.f27074z.invalidate();
    }
}
