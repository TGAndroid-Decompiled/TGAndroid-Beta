package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f29120a;
    public final p2 f29121b;

    public o2(p2 p2Var, int i10) {
        this.f29120a = i10;
        this.f29121b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29120a) {
            case 0:
                this.f29121b.f29162b.setVisibility(8);
                return;
            default:
                this.f29121b.f29163c.setVisibility(8);
                return;
        }
    }
}
