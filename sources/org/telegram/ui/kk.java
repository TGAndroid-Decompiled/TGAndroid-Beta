package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f38336a;
    public final xn f38337b;

    public kk(xn xnVar, int i10) {
        this.f38336a = i10;
        this.f38337b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.f38336a) {
            case 0:
                xn xnVar = this.f38337b;
                AnimatorSet animatorSet = xnVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.S9.start();
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f38337b;
                if (xnVar2.L2 == this && (sgVar = xnVar2.J0) != null && (frameLayout = xnVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
