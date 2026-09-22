package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class nk implements Runnable {
    public final int f36000a;
    public final bo f36001b;

    public nk(bo boVar, int i10) {
        this.f36000a = i10;
        this.f36001b = boVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.bh bhVar;
        FrameLayout frameLayout;
        switch (this.f36000a) {
            case 0:
                bo boVar = this.f36001b;
                AnimatorSet animatorSet = boVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    boVar.V9.start();
                    return;
                }
                return;
            default:
                bo boVar2 = this.f36001b;
                if (boVar2.O2 == this && (bhVar = boVar2.M0) != null && (frameLayout = boVar2.N2) != null) {
                    bhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
