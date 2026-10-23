package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f24587a;
    public final ChatActivityEnterView f24588b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f24587a = i10;
        this.f24588b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f24587a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f24588b;
                af afVar = chatActivityEnterView.f24016r3;
                if ((!chatActivityEnterView.h0() || !chatActivityEnterView.u()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23979k3 && !chatActivityEnterView.f24058z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                og ogVar2 = this.f24588b.Z2;
                if (ogVar2 != null) {
                    ogVar2.a2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f24588b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
