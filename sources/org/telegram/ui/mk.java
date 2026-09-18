package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mk implements Runnable {
    public final int f35685a;
    public final zn f35686b;

    public mk(zn znVar, int i10) {
        this.f35685a = i10;
        this.f35686b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f35685a) {
            case 0:
                zn znVar = this.f35686b;
                AnimatorSet animatorSet = znVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.V9.start();
                    return;
                }
                return;
            default:
                zn znVar2 = this.f35686b;
                if (znVar2.O2 == this && (chVar = znVar2.M0) != null && (frameLayout = znVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
