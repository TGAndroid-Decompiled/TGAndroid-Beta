package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jv0 extends AnimatorListenerAdapter {
    public final int f36540a;
    public final kv0 f36541b;

    public jv0(kv0 kv0Var, int i7) {
        this.f36540a = i7;
        this.f36541b = kv0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36540a) {
            case 0:
                this.f36541b.f36900s.setVisibility(8);
                return;
            case 1:
                this.f36541b.f36900s.setVisibility(8);
                return;
            default:
                this.f36541b.f36900s.setVisibility(8);
                return;
        }
    }
}
