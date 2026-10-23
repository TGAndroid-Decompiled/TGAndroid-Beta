package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32453a;

    public xm(ym ymVar) {
        this.f32453a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32453a;
        ymVar.f32680b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32972z.invalidate();
    }
}
