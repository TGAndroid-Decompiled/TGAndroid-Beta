package org.telegram.ui;

import android.os.Bundle;
public final class e80 extends d6 {
    public final py f36418f;

    public e80(Bundle bundle, py pyVar) {
        super(bundle);
        this.f36418f = pyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && !z10) {
            this.f36418f.removeSelfFromStack();
        }
    }
}
