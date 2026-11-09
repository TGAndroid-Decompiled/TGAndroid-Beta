package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f40963a;
    public final ae0 f40964b;

    public zd0(ae0 ae0Var, int i7) {
        this.f40963a = i7;
        this.f40964b = ae0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40963a) {
            case 0:
                this.f40964b.f31777a.f32243n.setVisibility(8);
                return;
            default:
                this.f40964b.f31777a.h.setVisibility(8);
                return;
        }
    }
}
