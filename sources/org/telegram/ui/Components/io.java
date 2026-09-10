package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class io extends AnimatorListenerAdapter {
    public final int f24050a;
    public final jo f24051b;

    public io(jo joVar, int i10) {
        this.f24050a = i10;
        this.f24051b = joVar;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24050a) {
            case 0:
                this.f24051b.Q = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24050a) {
            case 0:
                jo joVar = this.f24051b;
                if (joVar.Q == animator) {
                    joVar.getSubtitleTextView().setVisibility(4);
                    joVar.Q = null;
                    return;
                }
                return;
            default:
                this.f24051b.Q = null;
                return;
        }
    }
}
