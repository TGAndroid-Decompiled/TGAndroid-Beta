package org.telegram.ui;

import android.os.Bundle;
public final class m80 extends a6 {
    public final uy f38619f;

    public m80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f38619f = uyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f38619f.removeSelfFromStack();
        }
    }
}
