package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f37994a;
    public final yn f37995b;

    public kk(yn ynVar, int i10) {
        this.f37994a = i10;
        this.f37995b = ynVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.eh ehVar;
        FrameLayout frameLayout;
        switch (this.f37994a) {
            case 0:
                yn ynVar = this.f37995b;
                AnimatorSet animatorSet = ynVar.T9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ynVar.T9.start();
                    return;
                }
                return;
            default:
                yn ynVar2 = this.f37995b;
                if (ynVar2.M2 == this && (ehVar = ynVar2.K0) != null && (frameLayout = ynVar2.L2) != null) {
                    ehVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
