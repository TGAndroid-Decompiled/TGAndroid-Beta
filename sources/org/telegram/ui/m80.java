package org.telegram.ui;

import android.os.Bundle;
public final class m80 extends a6 {
    public final ty f39784f;

    public m80(Bundle bundle, ty tyVar) {
        super(bundle);
        this.f39784f = tyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f39784f.removeSelfFromStack();
        }
    }
}
