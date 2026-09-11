package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class nk implements Runnable {
    public final int f38971a;
    public final co f38972b;

    public nk(co coVar, int i10) {
        this.f38971a = i10;
        this.f38972b = coVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.f38971a) {
            case 0:
                co coVar = this.f38972b;
                AnimatorSet animatorSet = coVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    coVar.V9.start();
                    return;
                }
                return;
            default:
                co coVar2 = this.f38972b;
                if (coVar2.O2 == this && (dhVar = coVar2.M0) != null && (frameLayout = coVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
