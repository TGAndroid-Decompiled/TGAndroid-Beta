package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f35097a;
    public final wn f35098b;

    public kk(wn wnVar, int i10) {
        this.f35097a = i10;
        this.f35098b = wnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.dh dhVar;
        FrameLayout frameLayout;
        switch (this.f35097a) {
            case 0:
                wn wnVar = this.f35098b;
                AnimatorSet animatorSet = wnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wnVar.V9.start();
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f35098b;
                if (wnVar2.O2 == this && (dhVar = wnVar2.M0) != null && (frameLayout = wnVar2.N2) != null) {
                    dhVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
