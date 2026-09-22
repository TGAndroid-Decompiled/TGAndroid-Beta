package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f22642a;
    public final ChatActivityEnterView f22643b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f22642a = i10;
        this.f22643b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f22642a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f22643b;
                af afVar = chatActivityEnterView.f22070r3;
                if ((!chatActivityEnterView.j0() || !chatActivityEnterView.v()) && !org.telegram.ui.ActionBar.n2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f22033k3 && !chatActivityEnterView.f22112z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    ng ngVar = chatActivityEnterView.Z2;
                    if (ngVar != null) {
                        ngVar.s1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                    return;
                }
                return;
            case 1:
                ng ngVar2 = this.f22643b.Z2;
                if (ngVar2 != null) {
                    ngVar2.k2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f22643b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
