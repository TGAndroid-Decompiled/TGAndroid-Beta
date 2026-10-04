package org.telegram.ui.Components;
public final class lx extends org.telegram.ui.yn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (jkVar = this.W) != null) {
            jkVar.r1();
            this.W.postDelayed(new aq(this, 13), 100L);
        }
    }
}
