package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class pk implements Runnable {
    public final int f35855a;
    public final eo f35856b;

    public pk(eo eoVar, int i10) {
        this.f35855a = i10;
        this.f35856b = eoVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.fh fhVar;
        FrameLayout frameLayout;
        switch (this.f35855a) {
            case 0:
                eo eoVar = this.f35856b;
                AnimatorSet animatorSet = eoVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    eoVar.V9.start();
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f35856b;
                if (eoVar2.O2 == this && (fhVar = eoVar2.M0) != null && (frameLayout = eoVar2.N2) != null) {
                    fhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
