package org.telegram.ui;

import android.os.Bundle;
public final class m80 extends b6 {
    public final wy f34864f;

    public m80(Bundle bundle, wy wyVar) {
        super(bundle);
        this.f34864f = wyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f34864f.removeSelfFromStack();
        }
    }
}
