package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32421a;

    public xm(ym ymVar) {
        this.f32421a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32421a;
        ymVar.f32674b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32992z.invalidate();
    }
}
