package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final ym f32448a;

    public xm(ym ymVar) {
        this.f32448a = ymVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ym ymVar = this.f32448a;
        ymVar.f32675b.isChatPreviewSpoilerRevealed = true;
        ymVar.O.f32967z.invalidate();
    }
}
