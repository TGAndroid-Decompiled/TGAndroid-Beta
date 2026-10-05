package org.telegram.ui;

import android.os.Bundle;
public final class l80 extends b6 {
    public final uy f38252f;

    public l80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f38252f = uyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f38252f.removeSelfFromStack();
        }
    }
}
