package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mk implements Runnable {
    public final int f35763a;
    public final zn f35764b;

    public mk(zn znVar, int i10) {
        this.f35763a = i10;
        this.f35764b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f35763a) {
            case 0:
                zn znVar = this.f35764b;
                AnimatorSet animatorSet = znVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.V9.start();
                    return;
                }
                return;
            default:
                zn znVar2 = this.f35764b;
                if (znVar2.O2 == this && (chVar = znVar2.M0) != null && (frameLayout = znVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
