package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f22600a;
    public final ChatActivityEnterView f22601b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22600a = i10;
        this.f22601b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f22600a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22601b;
                af afVar = chatActivityEnterView.f22013q3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.O2) && !chatActivityEnterView.X1 && chatActivityEnterView.E0 != null && chatActivityEnterView.j3 && !chatActivityEnterView.f22057y2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    ng ngVar = chatActivityEnterView.Y2;
                    if (ngVar != null) {
                        ngVar.r1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                    return;
                }
                return;
            case 1:
                ng ngVar2 = this.f22601b.Y2;
                if (ngVar2 != null) {
                    ngVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22601b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
