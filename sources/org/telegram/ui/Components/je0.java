package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class je0 extends AnimatorListenerAdapter {
    public final int f36487a;
    public final ke0 f36488b;

    public je0(ke0 ke0Var, int i7) {
        this.f36487a = i7;
        this.f36488b = ke0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36487a) {
            case 0:
                this.f36488b.f36894a.f37167n.setVisibility(8);
                return;
            default:
                this.f36488b.f36894a.h.setVisibility(8);
                return;
        }
    }
}
