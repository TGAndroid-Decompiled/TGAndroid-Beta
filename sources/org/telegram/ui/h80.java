package org.telegram.ui;

import android.os.Bundle;
public final class h80 extends a6 {
    public final qy f34146f;

    public h80(Bundle bundle, qy qyVar) {
        super(bundle);
        this.f34146f = qyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f34146f.removeSelfFromStack();
        }
    }
}
