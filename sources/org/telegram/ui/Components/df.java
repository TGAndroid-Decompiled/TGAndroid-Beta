package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class df implements Runnable {
    public final int f25346a;
    public final ChatActivityEnterView f25347b;

    public df(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25346a = i10;
        this.f25347b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f25346a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25347b;
                df dfVar = chatActivityEnterView.T3;
                if ((!chatActivityEnterView.k0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.m2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.M3 && !chatActivityEnterView.f23772z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    sg sgVar = chatActivityEnterView.Z2;
                    if (sgVar != null) {
                        sgVar.x1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(dfVar);
                    AndroidUtilities.runOnUIThread(dfVar, 100L);
                    return;
                }
                return;
            case 1:
                sg sgVar2 = this.f25347b.Z2;
                if (sgVar2 != null) {
                    sgVar2.q2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25347b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
