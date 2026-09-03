package org.telegram.ui.Components;
public final class gx extends org.telegram.ui.zn {
    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && (lkVar = this.V) != null) {
            lkVar.s1();
            this.V.postDelayed(new up(this, 13), 100L);
        }
    }
}
