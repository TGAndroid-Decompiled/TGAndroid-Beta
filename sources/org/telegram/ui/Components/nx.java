package org.telegram.ui.Components;
public final class nx extends org.telegram.ui.eo {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ok okVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (okVar = this.Y) != null) {
            okVar.s1();
            this.Y.postDelayed(new dq(this, 13), 100L);
        }
    }
}
