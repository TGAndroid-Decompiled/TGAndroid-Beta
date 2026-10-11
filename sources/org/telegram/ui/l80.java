package org.telegram.ui;

import android.os.Bundle;
public final class l80 extends z5 {
    public final sy f39574f;

    public l80(Bundle bundle, sy syVar) {
        super(bundle);
        this.f39574f = syVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f39574f.removeSelfFromStack();
        }
    }
}
