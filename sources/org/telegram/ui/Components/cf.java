package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class cf implements Runnable {
    public final int f24067a;
    public final ChatActivityEnterView f24068b;

    public cf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24067a = i10;
        this.f24068b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f24067a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24068b;
                cf cfVar = chatActivityEnterView.f22953r3;
                if ((!chatActivityEnterView.h0() || !chatActivityEnterView.u()) && !org.telegram.ui.ActionBar.m2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f22916k3 && !chatActivityEnterView.f22995z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    pg pgVar = chatActivityEnterView.Z2;
                    if (pgVar != null) {
                        pgVar.m1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(cfVar);
                    AndroidUtilities.runOnUIThread(cfVar, 100L);
                    return;
                }
                return;
            case 1:
                pg pgVar2 = this.f24068b.Z2;
                if (pgVar2 != null) {
                    pgVar2.a2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24068b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
