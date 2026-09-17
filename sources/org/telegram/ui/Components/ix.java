package org.telegram.ui.Components;
public final class ix extends org.telegram.ui.co {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mk mkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (mkVar = this.Y) != null) {
            mkVar.s1();
            this.Y.postDelayed(new wp(this, 13), 100L);
        }
    }
}
