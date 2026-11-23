package org.telegram.ui.Components;
public final class sw extends org.telegram.ui.bn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (rjVar = this.f45903a0) != null) {
            rjVar.W1();
            this.f45903a0.postDelayed(new oo(this, 14), 100L);
        }
    }
}
