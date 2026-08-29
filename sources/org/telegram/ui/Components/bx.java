package org.telegram.ui.Components;
public final class bx extends org.telegram.ui.tn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.dk dkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (dkVar = this.U) != null) {
            dkVar.s1();
            this.U.postDelayed(new rp(this, 13), 100L);
        }
    }
}
