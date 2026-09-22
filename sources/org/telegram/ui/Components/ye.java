package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class ye implements Runnable {
    public final int f30220a;
    public final ChatActivityEnterView f30221b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30220a = i10;
        this.f30221b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f30220a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30221b;
                ye yeVar = chatActivityEnterView.f21824q3;
                if ((!chatActivityEnterView.k0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f21868y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    mg mgVar = chatActivityEnterView.Y2;
                    if (mgVar != null) {
                        mgVar.r1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(yeVar);
                    AndroidUtilities.runOnUIThread(yeVar, 100L);
                    return;
                }
                return;
            case 1:
                mg mgVar2 = this.f30221b.Y2;
                if (mgVar2 != null) {
                    mgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30221b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
