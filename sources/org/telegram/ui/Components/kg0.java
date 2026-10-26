package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kg0 extends AnimatorListenerAdapter {
    public final int f29919a;
    public final lg0 f29920b;

    public kg0(lg0 lg0Var, int i10) {
        this.f29919a = i10;
        this.f29920b = lg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29919a) {
            case 0:
                this.f29920b.f30208a.f30578n.setVisibility(8);
                return;
            default:
                this.f29920b.f30208a.h.setVisibility(8);
                return;
        }
    }
}
