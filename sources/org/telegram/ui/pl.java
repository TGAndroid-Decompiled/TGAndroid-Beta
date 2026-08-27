package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class pl extends AnimatorListenerAdapter {

    public final boolean f41377a;

    public final boolean f41378b;

    public final boolean f41379c;
    public final rn d;

    public pl(rn rnVar, boolean z10, boolean z11, boolean z12) {
        this.d = rnVar;
        this.f41377a = z10;
        this.f41378b = z11;
        this.f41379c = z12;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rn rnVar = this.d;
        rnVar.I2 = null;
        rnVar.F2.setVisibility(this.f41377a ? 0 : 4);
        rnVar.H2.setVisibility(this.f41378b ? 0 : 4);
        rnVar.G2.setVisibility(this.f41379c ? 0 : 4);
    }
}
