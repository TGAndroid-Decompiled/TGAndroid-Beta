package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tm extends AnimatorListenerAdapter {
    public final um f27439a;

    public tm(um umVar) {
        this.f27439a = umVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        um umVar = this.f27439a;
        umVar.f27698b.isChatPreviewSpoilerRevealed = true;
        umVar.O.f28029z.invalidate();
    }
}
