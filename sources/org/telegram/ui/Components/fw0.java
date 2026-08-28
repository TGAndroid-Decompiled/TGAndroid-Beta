package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fw0 extends AnimatorListenerAdapter {
    public final int f28586a;
    public final gw0 f28587b;

    public fw0(gw0 gw0Var, int i9) {
        this.f28586a = i9;
        this.f28587b = gw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28586a) {
            case 0:
                this.f28587b.f28889s.setVisibility(8);
                return;
            case 1:
                this.f28587b.f28889s.setVisibility(8);
                return;
            default:
                this.f28587b.f28889s.setVisibility(8);
                return;
        }
    }
}
