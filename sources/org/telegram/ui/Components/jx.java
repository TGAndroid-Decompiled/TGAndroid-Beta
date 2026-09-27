package org.telegram.ui.Components;
public final class jx extends org.telegram.ui.xn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (lkVar = this.Y) != null) {
            lkVar.r1();
            this.Y.postDelayed(new zp(this, 13), 100L);
        }
    }
}
