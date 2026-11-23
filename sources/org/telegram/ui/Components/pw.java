package org.telegram.ui.Components;
public final class pw extends org.telegram.ui.bn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (rjVar = this.f46118a0) != null) {
            rjVar.Y1();
            this.f46118a0.postDelayed(new lo(this, 14), 100L);
        }
    }
}
