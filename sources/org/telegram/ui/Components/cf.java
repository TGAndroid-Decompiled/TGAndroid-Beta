package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class cf implements Runnable {
    public final int f23299a;
    public final ChatActivityEnterView f23300b;

    public cf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f23299a = i10;
        this.f23300b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f23299a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23300b;
                cf cfVar = chatActivityEnterView.f22077r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.m2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f22040k3 && !chatActivityEnterView.f22119z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    pg pgVar = chatActivityEnterView.Z2;
                    if (pgVar != null) {
                        pgVar.r1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(cfVar);
                    AndroidUtilities.runOnUIThread(cfVar, 100L);
                    return;
                }
                return;
            case 1:
                pg pgVar2 = this.f23300b.Z2;
                if (pgVar2 != null) {
                    pgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23300b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
