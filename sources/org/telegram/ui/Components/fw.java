package org.telegram.ui.Components;
public final class fw extends org.telegram.ui.an {
    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        org.telegram.ui.qj qjVar;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && (qjVar = this.Z) != null) {
            qjVar.s1();
            this.Z.postDelayed(new gp(this, 12), 100L);
        }
    }
}
