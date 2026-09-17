package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class bf implements Runnable {
    public final int f24719a;
    public final ChatActivityEnterView f24720b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24719a = i10;
        this.f24720b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f24719a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24720b;
                bf bfVar = chatActivityEnterView.f23786q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f23830y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                og ogVar2 = this.f24720b.Y2;
                if (ogVar2 != null) {
                    ogVar2.c2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24720b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
