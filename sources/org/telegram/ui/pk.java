package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class pk implements Runnable {
    public final int f40150a;
    public final sn f40151b;

    public pk(sn snVar, int i10) {
        this.f40150a = i10;
        this.f40151b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f40150a) {
            case 0:
                sn snVar = this.f40151b;
                AnimatorSet animatorSet = snVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.V9.start();
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40151b;
                if (snVar2.O2 == this && (chVar = snVar2.M0) != null && (frameLayout = snVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
