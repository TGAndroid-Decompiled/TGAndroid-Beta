package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class mk implements Runnable {
    public final int f36125a;
    public final zn f36126b;

    public mk(zn znVar, int i10) {
        this.f36125a = i10;
        this.f36126b = znVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.f36125a) {
            case 0:
                zn znVar = this.f36126b;
                AnimatorSet animatorSet = znVar.S9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    znVar.S9.start();
                    return;
                }
                return;
            default:
                zn znVar2 = this.f36126b;
                if (znVar2.L2 == this && (sgVar = znVar2.J0) != null && (frameLayout = znVar2.K2) != null) {
                    sgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
