package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class bf implements Runnable {
    public final int f22999a;
    public final ChatActivityEnterView f23000b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22999a = i10;
        this.f23000b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f22999a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f23000b;
                bf bfVar = chatActivityEnterView.f22056r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.m2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f22019k3 && !chatActivityEnterView.f22098z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                og ogVar2 = this.f23000b.Z2;
                if (ogVar2 != null) {
                    ogVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f23000b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
