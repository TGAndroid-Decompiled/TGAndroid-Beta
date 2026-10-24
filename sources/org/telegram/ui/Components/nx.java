package org.telegram.ui.Components;
public final class nx extends org.telegram.ui.sn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.gk gkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (gkVar = this.Y) != null) {
            gkVar.p1();
            this.Y.postDelayed(new xp(this, 14), 100L);
        }
    }
}
