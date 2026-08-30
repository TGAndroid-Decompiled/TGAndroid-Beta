package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f35760a;
    public final xn f35761b;

    public kk(xn xnVar, int i10) {
        this.f35760a = i10;
        this.f35761b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.f35760a) {
            case 0:
                xn xnVar = this.f35761b;
                AnimatorSet animatorSet = xnVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.S9.start();
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f35761b;
                if (xnVar2.L2 == this && (sgVar = xnVar2.J0) != null && (frameLayout = xnVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
