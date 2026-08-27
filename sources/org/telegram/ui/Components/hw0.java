package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class hw0 extends AnimatorListenerAdapter {

    public final int f29174a;

    public final iw0 f29175b;

    public hw0(iw0 iw0Var, int i10) {
        this.f29174a = i10;
        this.f29175b = iw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29174a) {
            case 0:
                this.f29175b.f29510s.setVisibility(8);
                break;
            case 1:
                this.f29175b.f29510s.setVisibility(8);
                break;
            default:
                this.f29175b.f29510s.setVisibility(8);
                break;
        }
    }
}
