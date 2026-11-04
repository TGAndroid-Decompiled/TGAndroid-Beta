package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class in extends AnimatorListenerAdapter {
    public final int f34772a;
    public final jn f34773b;

    public in(jn jnVar, int i3) {
        this.f34772a = i3;
        this.f34773b = jnVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34772a) {
            case 0:
                this.f34773b.R = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34772a) {
            case 0:
                jn jnVar = this.f34773b;
                if (jnVar.R == animator) {
                    jnVar.getSubtitleTextView().setVisibility(4);
                    jnVar.R = null;
                    return;
                }
                return;
            default:
                this.f34773b.R = null;
                return;
        }
    }
}
