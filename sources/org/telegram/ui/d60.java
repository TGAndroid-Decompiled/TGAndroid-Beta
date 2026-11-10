package org.telegram.ui;

import android.os.Bundle;
public final class d60 extends x5 {
    public final zw f44908f;

    public d60(Bundle bundle, zw zwVar) {
        super(bundle);
        this.f44908f = zwVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && !z10) {
            this.f44908f.removeSelfFromStack();
        }
    }
}
