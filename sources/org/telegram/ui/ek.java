package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ek implements Runnable {
    public final int f37851a;
    public final tn f37852b;

    public ek(tn tnVar, int i10) {
        this.f37851a = i10;
        this.f37852b = tnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.vg vgVar;
        FrameLayout frameLayout;
        switch (this.f37851a) {
            case 0:
                tn tnVar = this.f37852b;
                AnimatorSet animatorSet = tnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    tnVar.R9.start();
                    return;
                }
                return;
            default:
                tn tnVar2 = this.f37852b;
                if (tnVar2.K2 == this && (vgVar = tnVar2.I0) != null && (frameLayout = tnVar2.J2) != null) {
                    vgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
