package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29799a;
    public final p2 f29800b;

    public o2(p2 p2Var, int i10) {
        this.f29799a = i10;
        this.f29800b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29799a) {
            case 0:
                this.f29800b.f29829b.setVisibility(8);
                return;
            default:
                this.f29800b.f29830c.setVisibility(8);
                return;
        }
    }
}
