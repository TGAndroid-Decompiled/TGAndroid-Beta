package org.telegram.ui.Components;
public final class jx extends org.telegram.ui.wn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (jkVar = this.Y) != null) {
            jkVar.s1();
            this.Y.postDelayed(new yp(this, 13), 100L);
        }
    }
}
