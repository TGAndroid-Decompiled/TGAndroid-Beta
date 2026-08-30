package org.telegram.ui;

import android.os.Bundle;
public final class d80 extends d6 {
    public final oy f33531f;

    public d80(Bundle bundle, oy oyVar) {
        super(bundle);
        this.f33531f = oyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && !z10) {
            this.f33531f.removeSelfFromStack();
        }
    }
}
