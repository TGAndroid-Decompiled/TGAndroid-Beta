package org.telegram.ui;

import android.os.Bundle;
public final class b60 extends y5 {
    public final bx f45963f;

    public b60(Bundle bundle, bx bxVar) {
        super(bundle);
        this.f45963f = bxVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f45963f.removeSelfFromStack();
        }
    }
}
