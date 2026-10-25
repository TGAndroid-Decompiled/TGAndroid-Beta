package org.telegram.ui.Components;
public final class ox extends org.telegram.ui.un {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.hk hkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (hkVar = this.Y) != null) {
            hkVar.p1();
            this.Y.postDelayed(new bq(this, 14), 100L);
        }
    }
}
