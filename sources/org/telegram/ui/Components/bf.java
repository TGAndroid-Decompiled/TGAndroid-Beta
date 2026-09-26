package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class bf implements Runnable {
    public final int f22998a;
    public final ChatActivityEnterView f22999b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22998a = i10;
        this.f22999b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f22998a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22999b;
                bf bfVar = chatActivityEnterView.f22055r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.m2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f22018k3 && !chatActivityEnterView.f22097z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Z2;
                    if (ogVar != null) {
                        ogVar.r1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(bfVar);
                    AndroidUtilities.runOnUIThread(bfVar, 100L);
                    return;
                }
                return;
            case 1:
                og ogVar2 = this.f22999b.Z2;
                if (ogVar2 != null) {
                    ogVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22999b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
