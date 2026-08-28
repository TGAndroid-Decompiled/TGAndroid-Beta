package org.telegram.ui.Components;
public final class uw extends org.telegram.ui.qn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ak akVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (akVar = this.U) != null) {
            akVar.s1();
            this.U.postDelayed(new np(this, 13), 100L);
        }
    }
}
