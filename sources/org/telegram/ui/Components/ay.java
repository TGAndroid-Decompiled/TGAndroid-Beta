package org.telegram.ui.Components;
public final class ay extends org.telegram.ui.eo {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.sk skVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (skVar = this.Y) != null) {
            skVar.u1();
            this.Y.postDelayed(new pq(this, 13), 100L);
        }
    }
}
