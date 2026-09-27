package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mk implements Runnable {
    public final int f35715a;
    public final xn f35716b;

    public mk(xn xnVar, int i10) {
        this.f35715a = i10;
        this.f35716b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.f35715a) {
            case 0:
                xn xnVar = this.f35716b;
                AnimatorSet animatorSet = xnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.V9.start();
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f35716b;
                if (xnVar2.O2 == this && (dhVar = xnVar2.M0) != null && (frameLayout = xnVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
