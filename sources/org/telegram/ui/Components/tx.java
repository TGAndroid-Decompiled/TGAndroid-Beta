package org.telegram.ui.Components;
public final class tx extends org.telegram.ui.fo {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.sk skVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (skVar = this.Y) != null) {
            skVar.p1();
            this.Y.postDelayed(new kq(this, 13), 100L);
        }
    }
}
