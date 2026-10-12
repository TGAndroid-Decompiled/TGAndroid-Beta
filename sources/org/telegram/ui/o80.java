package org.telegram.ui;

import android.os.Bundle;
public final class o80 extends d6 {
    public final vy f40573f;

    public o80(Bundle bundle, vy vyVar) {
        super(bundle);
        this.f40573f = vyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f40573f.removeSelfFromStack();
        }
    }
}
