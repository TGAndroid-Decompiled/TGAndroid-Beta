package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class nk implements Runnable {
    public final int f39637a;
    public final qn f39638b;

    public nk(qn qnVar, int i10) {
        this.f39637a = i10;
        this.f39638b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.ch chVar;
        FrameLayout frameLayout;
        switch (this.f39637a) {
            case 0:
                qn qnVar = this.f39638b;
                AnimatorSet animatorSet = qnVar.V9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    qnVar.V9.start();
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f39638b;
                if (qnVar2.O2 == this && (chVar = qnVar2.M0) != null && (frameLayout = qnVar2.N2) != null) {
                    chVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
