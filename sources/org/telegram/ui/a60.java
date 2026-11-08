package org.telegram.ui;

import android.os.Bundle;
public final class a60 extends x5 {
    public final ww f43579f;

    public a60(Bundle bundle, ww wwVar) {
        super(bundle);
        this.f43579f = wwVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && !z10) {
            this.f43579f.removeSelfFromStack();
        }
    }
}
