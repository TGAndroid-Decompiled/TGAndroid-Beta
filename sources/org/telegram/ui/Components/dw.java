package org.telegram.ui.Components;
public final class dw extends org.telegram.ui.wm {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mj mjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (mjVar = this.f51237a0) != null) {
            mjVar.r1();
            this.f51237a0.postDelayed(new gp(this, 12), 100L);
        }
    }
}
