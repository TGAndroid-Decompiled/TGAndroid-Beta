package org.telegram.ui.Components;
public final class px extends org.telegram.ui.sn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.hk hkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (hkVar = this.Y) != null) {
            hkVar.q1();
            this.Y.postDelayed(new hq(this, 13), 100L);
        }
    }
}
