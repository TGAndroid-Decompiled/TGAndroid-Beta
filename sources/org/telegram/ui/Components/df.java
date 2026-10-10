package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class df implements Runnable {
    public final int f25682a;
    public final ChatActivityEnterView f25683b;

    public df(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25682a = i10;
        this.f25683b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f25682a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25683b;
                df dfVar = chatActivityEnterView.f23958r3;
                if ((!chatActivityEnterView.h0() || !chatActivityEnterView.u()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23921k3 && !chatActivityEnterView.f24000z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    qg qgVar = chatActivityEnterView.Z2;
                    if (qgVar != null) {
                        qgVar.x1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(dfVar);
                    AndroidUtilities.runOnUIThread(dfVar, 100L);
                    return;
                }
                return;
            case 1:
                qg qgVar2 = this.f25683b.Z2;
                if (qgVar2 != null) {
                    qgVar2.q2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25683b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
