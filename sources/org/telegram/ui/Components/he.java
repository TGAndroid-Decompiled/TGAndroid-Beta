package org.telegram.ui.Components;

import android.animation.AnimatorSet;
public final class he implements Runnable {
    public final int f34371a;
    public final ChatActivityEnterView f34372b;

    public he(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f34371a = i3;
        this.f34372b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f34371a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f34372b;
                he heVar = chatActivityEnterView.f31195s3;
                if ((!chatActivityEnterView.g0() || !chatActivityEnterView.s()) && !org.telegram.ui.ActionBar.d2.hasSheets(chatActivityEnterView.Q2) && !chatActivityEnterView.Z1 && chatActivityEnterView.F0 != null && chatActivityEnterView.f31154l3 && !chatActivityEnterView.A2 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    uf ufVar = chatActivityEnterView.f31087a3;
                    if (ufVar != null) {
                        ufVar.e1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.K3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(heVar);
                    org.telegram.messenger.g0.i3(heVar, 100L);
                    return;
                }
                return;
            case 1:
                uf ufVar2 = this.f34372b.f31087a3;
                if (ufVar2 != null) {
                    ufVar2.d2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f34372b;
                AnimatorSet animatorSet = chatActivityEnterView2.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.W0.start();
                    return;
                }
                return;
        }
    }
}
