package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class pk implements Runnable {
    public final int f42565a;
    public final un f42566b;

    public pk(un unVar, int i10) {
        this.f42565a = i10;
        this.f42566b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f42565a) {
            case 0:
                un unVar = this.f42566b;
                AnimatorSet animatorSet = unVar.f44279ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar.f44279ha.start();
                    return;
                }
                return;
            default:
                un unVar2 = this.f42566b;
                if (unVar2.f44182a3 == this && (chVar = unVar2.Y0) != null && (frameLayout = unVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
