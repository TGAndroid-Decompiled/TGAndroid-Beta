package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mm extends AnimatorListenerAdapter {
    public final nm f26417a;

    public mm(nm nmVar) {
        this.f26417a = nmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nm nmVar = this.f26417a;
        nmVar.f26687b.isChatPreviewSpoilerRevealed = true;
        nmVar.O.f26996z.invalidate();
    }
}
