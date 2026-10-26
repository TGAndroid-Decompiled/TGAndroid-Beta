package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class af implements Runnable {
    public final int f26493a;
    public final ChatActivityEnterView f26494b;

    public af(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26493a = i10;
        this.f26494b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f26493a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f26494b;
                af afVar = chatActivityEnterView.f25950r3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.r2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f25910k3 && !chatActivityEnterView.f25992z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    og ogVar = chatActivityEnterView.Z2;
                    if (ogVar != null) {
                        ogVar.b1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(afVar);
                    AndroidUtilities.runOnUIThread(afVar, 100L);
                    return;
                }
                return;
            case 1:
                og ogVar2 = this.f26494b.Z2;
                if (ogVar2 != null) {
                    ogVar2.P1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f26494b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
