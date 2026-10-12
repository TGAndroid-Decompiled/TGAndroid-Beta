package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class al implements Runnable {
    public final int f34271a;
    public final fo f34272b;

    public al(fo foVar, int i10) {
        this.f34271a = i10;
        this.f34272b = foVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.f34271a) {
            case 0:
                fo foVar = this.f34272b;
                AnimatorSet animatorSet = foVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    foVar.V9.start();
                    return;
                }
                return;
            default:
                fo foVar2 = this.f34272b;
                if (foVar2.O2 == this && (dhVar = foVar2.M0) != null && (frameLayout = foVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
