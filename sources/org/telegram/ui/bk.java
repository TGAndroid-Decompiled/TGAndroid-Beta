package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class bk implements Runnable {
    public final int f36894a;
    public final qn f36895b;

    public bk(qn qnVar, int i9) {
        this.f36894a = i9;
        this.f36895b = qnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.sg sgVar;
        FrameLayout frameLayout;
        switch (this.f36894a) {
            case 0:
                qn qnVar = this.f36895b;
                AnimatorSet animatorSet = qnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    qnVar.R9.start();
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f36895b;
                if (qnVar2.K2 == this && (sgVar = qnVar2.I0) != null && (frameLayout = qnVar2.J2) != null) {
                    sgVar.i(frameLayout, false, true);
                    return;
                }
                return;
        }
    }
}
