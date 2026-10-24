package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
public final class ye implements Runnable {
    public final int f32899a;
    public final ChatActivityEnterView f32900b;

    public ye(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f32899a = i10;
        this.f32900b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f32899a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f32900b;
                ye yeVar = chatActivityEnterView.f24158r3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.t()) && !org.telegram.ui.ActionBar.o2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f24118k3 && !chatActivityEnterView.f24200z2 && !AndroidUtilities.usingHardwareInput && !AndroidUtilities.isInMultiwindow) {
                    mg mgVar = chatActivityEnterView.Z2;
                    if (mgVar != null) {
                        mgVar.m1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    AndroidUtilities.showKeyboard(chatActivityEnterView.E0);
                    AndroidUtilities.cancelRunOnUIThread(yeVar);
                    AndroidUtilities.runOnUIThread(yeVar, 100L);
                    return;
                }
                return;
            case 1:
                mg mgVar2 = this.f32900b.Z2;
                if (mgVar2 != null) {
                    mgVar2.a2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f32900b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
