package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ok implements Runnable {
    public final int f40216a;
    public final sn f40217b;

    public ok(sn snVar, int i10) {
        this.f40216a = i10;
        this.f40217b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f40216a) {
            case 0:
                sn snVar = this.f40217b;
                AnimatorSet animatorSet = snVar.ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.ha.start();
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40217b;
                if (snVar2.f41450a3 == this && (chVar = snVar2.Y0) != null && (frameLayout = snVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
