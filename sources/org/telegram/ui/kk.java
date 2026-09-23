package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f34738a;
    public final xn f34739b;

    public kk(xn xnVar, int i10) {
        this.f34738a = i10;
        this.f34739b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f34738a) {
            case 0:
                xn xnVar = this.f34739b;
                AnimatorSet animatorSet = xnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.V9.start();
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f34739b;
                if (xnVar2.O2 == this && (chVar = xnVar2.M0) != null && (frameLayout = xnVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
