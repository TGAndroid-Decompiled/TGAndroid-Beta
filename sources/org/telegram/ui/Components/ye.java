package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class ye implements Runnable {
    public final int f30180a;
    public final ChatActivityEnterView f30181b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30180a = i10;
        this.f30181b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f30180a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f30181b;
                ye yeVar = chatActivityEnterView.f21837q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f21881y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
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
                mg mgVar2 = this.f30181b.Y2;
                if (mgVar2 != null) {
                    mgVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f30181b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
