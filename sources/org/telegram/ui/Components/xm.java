package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32424a;

    public xm(ym ymVar) {
        this.f32424a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32424a;
        ymVar.f32687b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32975z.invalidate();
    }
}
