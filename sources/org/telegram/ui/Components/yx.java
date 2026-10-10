package org.telegram.ui.Components;
public final class yx extends org.telegram.ui.zn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ok okVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (okVar = this.Y) != null) {
            okVar.q1();
            this.Y.postDelayed(new nq(this, 13), 100L);
        }
    }
}
