package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class ye implements Runnable {
    public final int f30183a;
    public final ChatActivityEnterView f30184b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30183a = i10;
        this.f30184b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f30183a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30184b;
                ye yeVar = chatActivityEnterView.f21840q3;
                if ((!chatActivityEnterView.k0() || !chatActivityEnterView.w()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f21884y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                mg mgVar2 = this.f30184b.Y2;
                if (mgVar2 != null) {
                    mgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30184b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
