package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class ue implements Runnable {
    public final int f33217a;
    public final ChatActivityEnterView f33218b;

    public ue(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f33217a = i10;
        this.f33218b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f33217a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f33218b;
                ue ueVar = chatActivityEnterView.f26158m3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f26122f3 && !chatActivityEnterView.f26200u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    hg hgVar = chatActivityEnterView.U2;
                    if (hgVar != null) {
                        hgVar.r1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(ueVar);
                    AndroidUtilities.runOnUIThread(ueVar, 100L);
                    return;
                }
                return;
            case 1:
                hg hgVar2 = this.f33218b.U2;
                if (hgVar2 != null) {
                    hgVar2.l2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f33218b;
                AnimatorSet animatorSet = chatActivityEnterView2.R0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.R0.start();
                    return;
                }
                return;
        }
    }
}
