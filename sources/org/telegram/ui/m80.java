package org.telegram.ui;

import android.os.Bundle;
public final class m80 extends a6 {
    public final uy f38592f;

    public m80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f38592f = uyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f38592f.removeSelfFromStack();
        }
    }
}
