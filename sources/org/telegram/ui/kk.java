package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f38432a;
    public final xn f38433b;

    public kk(xn xnVar, int i10) {
        this.f38432a = i10;
        this.f38433b = xnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.f38432a) {
            case 0:
                xn xnVar = this.f38433b;
                AnimatorSet animatorSet = xnVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    xnVar.S9.start();
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f38433b;
                if (xnVar2.L2 == this && (sgVar = xnVar2.J0) != null && (frameLayout = xnVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
