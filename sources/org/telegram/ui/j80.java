package org.telegram.ui;

import android.os.Bundle;
public final class j80 extends b6 {
    public final ry f34359f;

    public j80(Bundle bundle, ry ryVar) {
        super(bundle);
        this.f34359f = ryVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f34359f.removeSelfFromStack();
        }
    }
}
