package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f38000a;
    public final yn f38001b;

    public kk(yn ynVar, int i10) {
        this.f38000a = i10;
        this.f38001b = ynVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.eh ehVar;
        FrameLayout frameLayout;
        switch (this.f38000a) {
            case 0:
                yn ynVar = this.f38001b;
                AnimatorSet animatorSet = ynVar.T9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ynVar.T9.start();
                    return;
                }
                return;
            default:
                yn ynVar2 = this.f38001b;
                if (ynVar2.M2 == this && (ehVar = ynVar2.K0) != null && (frameLayout = ynVar2.L2) != null) {
                    ehVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
