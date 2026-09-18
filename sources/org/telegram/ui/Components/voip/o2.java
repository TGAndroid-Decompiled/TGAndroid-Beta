package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29100a;
    public final p2 f29101b;

    public o2(p2 p2Var, int i10) {
        this.f29100a = i10;
        this.f29101b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29100a) {
            case 0:
                this.f29101b.f29142b.setVisibility(8);
                return;
            default:
                this.f29101b.f29143c.setVisibility(8);
                return;
        }
    }
}
