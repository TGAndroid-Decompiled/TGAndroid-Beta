package org.telegram.ui.Components;
public final class ew extends org.telegram.ui.cn {
    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.sj sjVar;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && (sjVar = this.Z) != null) {
            sjVar.s1();
            this.Z.postDelayed(new gp(this, 12), 100L);
        }
    }
}
