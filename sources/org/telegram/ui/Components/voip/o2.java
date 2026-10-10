package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o2 extends AnimatorListenerAdapter {
    public final int f32185a;
    public final p2 f32186b;

    public o2(p2 p2Var, int i10) {
        this.f32185a = i10;
        this.f32186b = p2Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32185a) {
            case 0:
                this.f32186b.f32229b.setVisibility(8);
                return;
            default:
                this.f32186b.f32230c.setVisibility(8);
                return;
        }
    }
}
