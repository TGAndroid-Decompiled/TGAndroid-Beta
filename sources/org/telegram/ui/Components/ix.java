package org.telegram.ui.Components;
public final class ix extends org.telegram.ui.zn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (lkVar = this.Y) != null) {
            lkVar.r1();
            this.Y.postDelayed(new xp(this, 13), 100L);
        }
    }
}
