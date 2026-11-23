package org.telegram.ui;

import android.os.Bundle;
public final class b60 extends x5 {
    public final cx f45746f;

    public b60(Bundle bundle, cx cxVar) {
        super(bundle);
        this.f45746f = cxVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f45746f.removeSelfFromStack();
        }
    }
}
