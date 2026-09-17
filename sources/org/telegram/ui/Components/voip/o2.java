package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29097a;
    public final p2 f29098b;

    public o2(p2 p2Var, int i10) {
        this.f29097a = i10;
        this.f29098b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29097a) {
            case 0:
                this.f29098b.f29139b.setVisibility(8);
                return;
            default:
                this.f29098b.f29140c.setVisibility(8);
                return;
        }
    }
}
