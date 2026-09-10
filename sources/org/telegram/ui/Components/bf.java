package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class bf implements Runnable {
    public final int f21818a;
    public final ChatActivityEnterView f21819b;

    public bf(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f21818a = i10;
        this.f21819b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f21818a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f21819b;
                bf bfVar = chatActivityEnterView.f20912q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.p2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f20956y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    qg qgVar = chatActivityEnterView.Y2;
                    if (qgVar != null) {
                        qgVar.q1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(bfVar);
                    AndroidUtilities.runOnUIThread(bfVar, 100L);
                    return;
                }
                return;
            case 1:
                qg qgVar2 = this.f21819b.Y2;
                if (qgVar2 != null) {
                    qgVar2.i2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f21819b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
