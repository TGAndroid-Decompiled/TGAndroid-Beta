package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ci implements Runnable {
    public final int f36324a;
    public final un f36325b;

    public ci(un unVar, int i10) {
        this.f36324a = i10;
        this.f36325b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hg hgVar;
        FrameLayout frameLayout;
        switch (this.f36324a) {
            case 0:
                un unVar = this.f36325b;
                if (unVar.f42020c3 == this && (hgVar = unVar.f41990a1) != null && (frameLayout = unVar.f42006b3) != null) {
                    hgVar.i(frameLayout, false, true);
                    return;
                }
                return;
            default:
                un unVar2 = this.f36325b;
                AnimatorSet animatorSet = unVar2.f42175oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar2.f42175oa.start();
                    return;
                }
                return;
        }
    }
}
