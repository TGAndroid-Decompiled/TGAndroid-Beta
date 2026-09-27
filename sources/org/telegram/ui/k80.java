package org.telegram.ui;

import android.os.Bundle;
public final class k80 extends c6 {
    public final ty f34947f;

    public k80(Bundle bundle, ty tyVar) {
        super(bundle);
        this.f34947f = tyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f34947f.removeSelfFromStack();
        }
    }
}
