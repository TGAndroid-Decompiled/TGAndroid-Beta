package org.telegram.ui.Components;

import android.animation.AnimatorSet;
public final class ie implements Runnable {
    public final int f34593a;
    public final ChatActivityEnterView f34594b;

    public ie(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f34593a = i7;
        this.f34594b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f34593a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34594b;
                ie ieVar = chatActivityEnterView.f31135r3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.f2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f31095k3 && !chatActivityEnterView.f31179z2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    vf vfVar = chatActivityEnterView.Z2;
                    if (vfVar != null) {
                        vfVar.f1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    org.telegram.messenger.g0.K3(chatActivityEnterView.E0);
                    org.telegram.messenger.g0.r(ieVar);
                    org.telegram.messenger.g0.i3(ieVar, 100L);
                    return;
                }
                return;
            case 1:
                vf vfVar2 = this.f34594b.Z2;
                if (vfVar2 != null) {
                    vfVar2.Z1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34594b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
