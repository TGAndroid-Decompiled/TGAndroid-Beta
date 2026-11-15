package org.telegram.ui.Components;

import android.animation.AnimatorSet;
public final class ke implements Runnable {
    public final int f36388a;
    public final ChatActivityEnterView f36389b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f36388a = i7;
        this.f36389b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        switch (this.f36388a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f36389b;
                ke keVar = chatActivityEnterView.Z3;
                if ((!chatActivityEnterView.v0() || !chatActivityEnterView.y()) && !org.telegram.ui.ActionBar.e2.hasSheets(chatActivityEnterView.f32319x3) && !chatActivityEnterView.G2 && chatActivityEnterView.F0 != null && chatActivityEnterView.S3 && !chatActivityEnterView.f32209h3 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    cg cgVar = chatActivityEnterView.H3;
                    if (cgVar != null) {
                        cgVar.o1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.J3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(keVar);
                    org.telegram.messenger.g0.i3(keVar, 100L);
                    return;
                }
                return;
            case 1:
                cg cgVar2 = this.f36389b.H3;
                if (cgVar2 != null) {
                    cgVar2.o2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.f36389b;
                AnimatorSet animatorSet = chatActivityEnterView2.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView2.W0.start();
                    return;
                }
                return;
        }
    }
}
