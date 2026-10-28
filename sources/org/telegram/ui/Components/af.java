package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f26544a;
    public final ChatActivityEnterView f26545b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26544a = i10;
        this.f26545b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f26544a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26545b;
                af afVar = chatActivityEnterView.f25952r3;
                if ((!chatActivityEnterView.f0() || !chatActivityEnterView.r()) && !org.telegram.ui.ActionBar.r2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f25912k3 && !chatActivityEnterView.f25994z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Z2;
                    if (ogVar != null) {
                        ogVar.b1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                    return;
                }
                return;
            case 1:
                og ogVar2 = this.f26545b.Z2;
                if (ogVar2 != null) {
                    ogVar2.P1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26545b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
