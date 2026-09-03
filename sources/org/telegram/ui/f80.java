package org.telegram.ui;

import android.os.Bundle;
public final class f80 extends f6 {
    public final qy f33979f;

    public f80(Bundle bundle, qy qyVar) {
        super(bundle);
        this.f33979f = qyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && !z10) {
            this.f33979f.removeSelfFromStack();
        }
    }
}
