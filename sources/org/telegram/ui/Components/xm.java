package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32417a;

    public xm(ym ymVar) {
        this.f32417a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32417a;
        ymVar.f32680b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32968z.invalidate();
    }
}
