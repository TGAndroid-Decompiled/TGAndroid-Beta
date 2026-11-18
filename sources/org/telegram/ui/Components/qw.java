package org.telegram.ui.Components;
public final class qw extends org.telegram.ui.bn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (rjVar = this.f45923a0) != null) {
            rjVar.S1();
            this.f45923a0.postDelayed(new mo(this, 14), 100L);
        }
    }
}
