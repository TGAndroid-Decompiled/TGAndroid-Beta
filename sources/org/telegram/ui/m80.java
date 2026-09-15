package org.telegram.ui;

import android.os.Bundle;
public final class m80 extends b6 {
    public final uy f35649f;

    public m80(Bundle bundle, uy uyVar) {
        super(bundle);
        this.f35649f = uyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f35649f.removeSelfFromStack();
        }
    }
}
