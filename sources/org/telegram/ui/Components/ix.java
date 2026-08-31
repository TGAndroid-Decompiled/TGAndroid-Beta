package org.telegram.ui.Components;
public final class ix extends org.telegram.ui.xn {
    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && (jkVar = this.V) != null) {
            jkVar.s1();
            this.V.postDelayed(new xp(this, 13), 100L);
        }
    }
}
