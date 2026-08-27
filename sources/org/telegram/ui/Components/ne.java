package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;

public final class ne implements Runnable {

    public final int f30961a;

    public final ChatActivityEnterView f30962b;

    public ne(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30961a = i10;
        this.f30962b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f30961a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30962b;
                ne neVar = chatActivityEnterView.f26143m3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.K2) && !chatActivityEnterView.T1 && chatActivityEnterView.A0 != null && chatActivityEnterView.f26107f3 && !chatActivityEnterView.f26185u2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    ag agVar = chatActivityEnterView.U2;
                    if (agVar != null) {
                        agVar.j1();
                    }
                    chatActivityEnterView.A0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.A0);
                    AndroidUtilities.cancelRunOnUIThread(neVar);
                    AndroidUtilities.runOnUIThread(neVar, 100L);
                }
                break;
            case 1:
                ag agVar2 = this.f30962b.U2;
                if (agVar2 != null) {
                    agVar2.X1(0, 0, 0, 0L, 0L, true);
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30962b;
                AnimatorSet animatorSet = chatActivityEnterView2.R0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.R0.start();
                    break;
                }
                break;
        }
    }
}
