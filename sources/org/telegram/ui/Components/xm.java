package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32449a;

    public xm(ym ymVar) {
        this.f32449a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32449a;
        ymVar.f32676b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32968z.invalidate();
    }
}
