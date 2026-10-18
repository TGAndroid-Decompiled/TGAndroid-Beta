package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f24575a;
    public final ChatActivityEnterView f24576b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24575a = i10;
        this.f24576b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f24575a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24576b;
                af afVar = chatActivityEnterView.f24008r3;
                if ((!chatActivityEnterView.h0() || !chatActivityEnterView.t()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23971k3 && !chatActivityEnterView.f24050z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Z2;
                    if (ogVar != null) {
                        ogVar.m1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                    return;
                }
                return;
            case 1:
                og ogVar2 = this.f24576b.Z2;
                if (ogVar2 != null) {
                    ogVar2.a2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24576b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
