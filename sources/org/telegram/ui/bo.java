package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bo extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cd0 f34357a;

    public bo(org.telegram.ui.Components.cd0 cd0Var) {
        this.f34357a = cd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f34357a.s(1.0f);
    }
}
