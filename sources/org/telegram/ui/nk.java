package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class nk implements Runnable {
    public final int f36063a;
    public final zn f36064b;

    public nk(zn znVar, int i10) {
        this.f36063a = i10;
        this.f36064b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f36063a) {
            case 0:
                zn znVar = this.f36064b;
                AnimatorSet animatorSet = znVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.V9.start();
                    return;
                }
                return;
            default:
                zn znVar2 = this.f36064b;
                if (znVar2.O2 == this && (chVar = znVar2.M0) != null && (frameLayout = znVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
