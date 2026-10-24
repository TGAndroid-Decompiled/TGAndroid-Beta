package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ok implements Runnable {
    public final int f40206a;
    public final sn f40207b;

    public ok(sn snVar, int i10) {
        this.f40206a = i10;
        this.f40207b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ah ahVar;
        FrameLayout frameLayout;
        switch (this.f40206a) {
            case 0:
                sn snVar = this.f40207b;
                AnimatorSet animatorSet = snVar.ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.ha.start();
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40207b;
                if (snVar2.f41447a3 == this && (ahVar = snVar2.Y0) != null && (frameLayout = snVar2.Z2) != null) {
                    ahVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
