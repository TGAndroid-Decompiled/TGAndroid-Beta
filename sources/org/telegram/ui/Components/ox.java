package org.telegram.ui.Components;
public final class ox extends org.telegram.ui.wn {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (jkVar = this.Y) != null) {
            jkVar.o1();
            this.Y.postDelayed(new cp(this, 15), 100L);
        }
    }
}
