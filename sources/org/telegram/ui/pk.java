package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class pk implements Runnable {
    public final int f40173a;
    public final sn f40174b;

    public pk(sn snVar, int i10) {
        this.f40173a = i10;
        this.f40174b = snVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f40173a) {
            case 0:
                sn snVar = this.f40174b;
                AnimatorSet animatorSet = snVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    snVar.V9.start();
                    return;
                }
                return;
            default:
                sn snVar2 = this.f40174b;
                if (snVar2.O2 == this && (chVar = snVar2.M0) != null && (frameLayout = snVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
