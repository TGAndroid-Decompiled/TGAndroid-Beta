package org.telegram.ui.Components;

import android.animation.AnimatorSet;
public final class ee implements Runnable {
    public final int f25766a;
    public final ChatActivityEnterView f25767b;

    public ee(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25766a = i10;
        this.f25767b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f25766a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f25767b;
                ee eeVar = chatActivityEnterView.f23779r3;
                if ((!chatActivityEnterView.f0() || !chatActivityEnterView.r()) && !org.telegram.ui.ActionBar.k2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f23739k3 && !chatActivityEnterView.f23822z2 && !org.telegram.messenger.i0.D && !org.telegram.messenger.i0.E) {
                    sf sfVar = chatActivityEnterView.Z2;
                    if (sfVar != null) {
                        sfVar.b1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    org.telegram.messenger.i0.J3(chatActivityEnterView.E0);
                    org.telegram.messenger.i0.r(eeVar);
                    org.telegram.messenger.i0.h3(eeVar, 100L);
                    return;
                }
                return;
            case 1:
                sf sfVar2 = this.f25767b.Z2;
                if (sfVar2 != null) {
                    sfVar2.V1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f25767b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
