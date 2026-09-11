package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class bf implements Runnable {
    public final int f24691a;
    public final ChatActivityEnterView f24692b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24691a = i10;
        this.f24692b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f24691a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24692b;
                bf bfVar = chatActivityEnterView.f23758q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f23802y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Y2;
                    if (ogVar != null) {
                        ogVar.l1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(bfVar);
                    AndroidUtilities.runOnUIThread(bfVar, 100L);
                    return;
                }
                return;
            case 1:
                og ogVar2 = this.f24692b.Y2;
                if (ogVar2 != null) {
                    ogVar2.c2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24692b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
