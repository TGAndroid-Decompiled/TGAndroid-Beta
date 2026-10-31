package org.telegram.ui.Components;
public final class tw extends org.telegram.ui.un {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mk mkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (mkVar = this.Z) != null) {
            mkVar.q1();
            this.Z.postDelayed(new ho(this, 14), 100L);
        }
    }
}
