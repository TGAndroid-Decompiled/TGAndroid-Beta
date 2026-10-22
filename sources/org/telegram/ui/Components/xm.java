package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32452a;

    public xm(ym ymVar) {
        this.f32452a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32452a;
        ymVar.f32679b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32971z.invalidate();
    }
}
