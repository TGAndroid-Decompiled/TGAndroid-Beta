package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class re implements Runnable {
    public final int f32144a;
    public final ChatActivityEnterView f32145b;

    public re(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f32144a = i9;
        this.f32145b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f32144a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32145b;
                re reVar = chatActivityEnterView.f26147m3;
                if ((!chatActivityEnterView.i0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f26111f3 && !chatActivityEnterView.f26189u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    eg egVar = chatActivityEnterView.U2;
                    if (egVar != null) {
                        egVar.i1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(reVar);
                    AndroidUtilities.runOnUIThread(reVar, 100L);
                    return;
                }
                return;
            case 1:
                eg egVar2 = this.f32145b.U2;
                if (egVar2 != null) {
                    egVar2.U1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32145b;
                AnimatorSet animatorSet = chatActivityEnterView2.R0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.R0.start();
                    return;
                }
                return;
        }
    }
}
