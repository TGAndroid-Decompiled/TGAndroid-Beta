package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class ci implements Runnable {
    public final int f36468a;
    public final un f36469b;

    public ci(un unVar, int i10) {
        this.f36468a = i10;
        this.f36469b = unVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.hg hgVar;
        FrameLayout frameLayout;
        switch (this.f36468a) {
            case 0:
                un unVar = this.f36469b;
                if (unVar.f42209c3 == this && (hgVar = unVar.f42180a1) != null && (frameLayout = unVar.f42195b3) != null) {
                    hgVar.i(frameLayout, false, true);
                    return;
                }
                return;
            default:
                un unVar2 = this.f36469b;
                AnimatorSet animatorSet = unVar2.f42364oa;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    unVar2.f42364oa.start();
                    return;
                }
                return;
        }
    }
}
