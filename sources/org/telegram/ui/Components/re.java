package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class re implements Runnable {
    public final int f28463a;
    public final ChatActivityEnterView f28464b;

    public re(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28463a = i10;
        this.f28464b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f28463a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f28464b;
                re reVar = chatActivityEnterView.f22781n3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.p2.hasSheets(chatActivityEnterView.L2) && !chatActivityEnterView.U1 && chatActivityEnterView.B0 != null && chatActivityEnterView.f22744g3 && !chatActivityEnterView.f22822v2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    eg egVar = chatActivityEnterView.V2;
                    if (egVar != null) {
                        egVar.w1();
                    }
                    chatActivityEnterView.B0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.B0);
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                    return;
                }
                return;
            case 1:
                eg egVar2 = this.f28464b.V2;
                if (egVar2 != null) {
                    egVar2.p2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f28464b;
                AnimatorSet animatorSet = chatActivityEnterView2.S0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.S0.start();
                    return;
                }
                return;
        }
    }
}
