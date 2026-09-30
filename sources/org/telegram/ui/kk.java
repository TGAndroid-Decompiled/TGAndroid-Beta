package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class kk implements Runnable {
    public final int f35188a;
    public final wn f35189b;

    public kk(wn wnVar, int i10) {
        this.f35188a = i10;
        this.f35189b = wnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.eh ehVar;
        FrameLayout frameLayout;
        switch (this.f35188a) {
            case 0:
                wn wnVar = this.f35189b;
                AnimatorSet animatorSet = wnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    wnVar.V9.start();
                    return;
                }
                return;
            default:
                wn wnVar2 = this.f35189b;
                if (wnVar2.O2 == this && (ehVar = wnVar2.M0) != null && (frameLayout = wnVar2.N2) != null) {
                    ehVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
