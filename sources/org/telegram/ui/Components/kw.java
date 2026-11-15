package org.telegram.ui.Components;
public final class kw extends org.telegram.ui.an {
    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.qj qjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (qjVar = this.f45118a0) != null) {
            qjVar.K1();
            this.f45118a0.postDelayed(new fo(this, 14), 100L);
        }
    }
}
