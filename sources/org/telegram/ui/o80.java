package org.telegram.ui;

import android.os.Bundle;
public final class o80 extends b6 {
    public final wy f36244f;

    public o80(Bundle bundle, wy wyVar) {
        super(bundle);
        this.f36244f = wyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f36244f.removeSelfFromStack();
        }
    }
}
