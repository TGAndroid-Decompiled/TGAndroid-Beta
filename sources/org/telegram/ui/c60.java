package org.telegram.ui;

import android.os.Bundle;
public final class c60 extends x5 {
    public final yw f44230f;

    public c60(Bundle bundle, yw ywVar) {
        super(bundle);
        this.f44230f = ywVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && !z10) {
            this.f44230f.removeSelfFromStack();
        }
    }
}
