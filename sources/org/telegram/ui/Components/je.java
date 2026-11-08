package org.telegram.ui.Components;

import android.animation.AnimatorSet;
public final class je implements Runnable {
    public final int f34967a;
    public final ChatActivityEnterView f34968b;

    public je(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f34967a = i7;
        this.f34968b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f34967a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34968b;
                je jeVar = chatActivityEnterView.f31119r3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.f2.hasSheets(chatActivityEnterView.P2) && !chatActivityEnterView.Y1 && chatActivityEnterView.E0 != null && chatActivityEnterView.f31079k3 && !chatActivityEnterView.f31163z2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    wf wfVar = chatActivityEnterView.Z2;
                    if (wfVar != null) {
                        wfVar.f1();
                    }
                    chatActivityEnterView.E0.requestFocus();
                    org.telegram.messenger.g0.K3(chatActivityEnterView.E0);
                    org.telegram.messenger.g0.r(jeVar);
                    org.telegram.messenger.g0.i3(jeVar, 100L);
                    return;
                }
                return;
            case 1:
                wf wfVar2 = this.f34968b.Z2;
                if (wfVar2 != null) {
                    wfVar2.Z1(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34968b;
                AnimatorSet animatorSet = chatActivityEnterView2.V0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.V0.start();
                    return;
                }
                return;
        }
    }
}
