package org.telegram.ui.Components;
public final class px extends org.telegram.ui.qn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.fk fkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (fkVar = this.Y) != null) {
            fkVar.p1();
            this.Y.postDelayed(new hq(this, 13), 100L);
        }
    }
}
