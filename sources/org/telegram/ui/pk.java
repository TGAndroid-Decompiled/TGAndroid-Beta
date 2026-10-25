package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class pk implements Runnable {
    public final int f42562a;
    public final un f42563b;

    public pk(un unVar, int i10) {
        this.f42562a = i10;
        this.f42563b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f42562a) {
            case 0:
                un unVar = this.f42563b;
                AnimatorSet animatorSet = unVar.f44276ha;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar.f44276ha.start();
                    return;
                }
                return;
            default:
                un unVar2 = this.f42563b;
                if (unVar2.f44179a3 == this && (chVar = unVar2.Y0) != null && (frameLayout = unVar2.Z2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
