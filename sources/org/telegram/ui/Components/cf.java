package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class cf implements Runnable {
    public final int f25410a;
    public final ChatActivityEnterView f25411b;

    public cf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25410a = i10;
        this.f25411b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f25410a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25411b;
                cf cfVar = chatActivityEnterView.f23958r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23921k3 && !chatActivityEnterView.f24000z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                pg pgVar2 = this.f25411b.Z2;
                if (pgVar2 != null) {
                    pgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25411b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
