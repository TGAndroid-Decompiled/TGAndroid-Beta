package org.telegram.ui.Components;

public final class uw extends org.telegram.ui.rn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ck ckVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (ckVar = this.U) == null) {
            return;
        }
        ckVar.r1();
        this.U.postDelayed(new lp(this, 13), 100L);
    }
}
