package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class al implements Runnable {
    public final int f35893a;
    public final eo f35894b;

    public al(eo eoVar, int i10) {
        this.f35893a = i10;
        this.f35894b = eoVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hh hhVar;
        FrameLayout frameLayout;
        switch (this.f35893a) {
            case 0:
                eo eoVar = this.f35894b;
                AnimatorSet animatorSet = eoVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    eoVar.V9.start();
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f35894b;
                if (eoVar2.O2 == this && (hhVar = eoVar2.M0) != null && (frameLayout = eoVar2.N2) != null) {
                    hhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
