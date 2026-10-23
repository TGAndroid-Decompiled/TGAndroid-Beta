package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32594a;

    public xm(ym ymVar) {
        this.f32594a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32594a;
        ymVar.f32977b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f33280z.invalidate();
    }
}
