package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vm extends AnimatorListenerAdapter {
    public final wm f31474a;

    public vm(wm wmVar) {
        this.f31474a = wmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        wm wmVar = this.f31474a;
        wmVar.f32267b.isChatPreviewSpoilerRevealed = true;
        wmVar.O.f32658z.invalidate();
    }
}
