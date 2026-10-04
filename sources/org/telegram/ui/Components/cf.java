package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class cf implements Runnable {
    public final int f25362a;
    public final ChatActivityEnterView f25363b;

    public cf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25362a = i10;
        this.f25363b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f25362a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25363b;
                cf cfVar = chatActivityEnterView.f23955r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23918k3 && !chatActivityEnterView.f23997z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                pg pgVar2 = this.f25363b.Z2;
                if (pgVar2 != null) {
                    pgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25363b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
