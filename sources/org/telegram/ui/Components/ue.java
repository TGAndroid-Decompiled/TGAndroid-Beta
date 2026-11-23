package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;
public final class ue implements Runnable {
    public final int f40361a;
    public final ChatActivityEnterView f40362b;

    public ue(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40361a = i7;
        this.f40362b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        long j11;
        switch (this.f40361a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f40362b;
                ue ueVar = chatActivityEnterView.f32698h4;
                if ((!chatActivityEnterView.H0() || !chatActivityEnterView.A()) && !org.telegram.ui.ActionBar.g2.hasSheets(chatActivityEnterView.F3) && !chatActivityEnterView.O2 && chatActivityEnterView.F0 != null && chatActivityEnterView.f32639a4 && !chatActivityEnterView.f32755p3 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    mg mgVar = chatActivityEnterView.P3;
                    if (mgVar != null) {
                        mgVar.o1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(ueVar);
                    org.telegram.messenger.g0.h3(ueVar, 100L);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f40362b;
                ai.j1 j1Var = chatActivityEnterView2.f32750o6;
                if (j1Var != null && j1Var.d) {
                    long j12 = j1Var.f1291e;
                    if (j12 == 0) {
                        j11 = 0;
                    } else {
                        long j13 = j12 + j1Var.f1288a;
                        if (j1Var.C) {
                            j10 = 180;
                        } else {
                            j10 = 0;
                        }
                        j11 = j13 + j10;
                    }
                    j3 = j11 - SystemClock.uptimeMillis();
                } else {
                    j3 = 0;
                }
                if (j3 > 0) {
                    org.telegram.messenger.g0.h3(this, j3 + 16);
                    return;
                }
                chatActivityEnterView2.f32783s6 = null;
                chatActivityEnterView2.f32766q6 = false;
                chatActivityEnterView2.f32775r6 = true;
                chatActivityEnterView2.t6 = SystemClock.uptimeMillis();
                ai.j1 j1Var2 = chatActivityEnterView2.f32750o6;
                if (j1Var2 != null) {
                    j1Var2.c();
                }
                try {
                    chatActivityEnterView2.w1();
                    return;
                } finally {
                    chatActivityEnterView2.f32775r6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                mg mgVar2 = this.f40362b.P3;
                if (mgVar2 != null) {
                    mgVar2.o2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.f40362b;
                AnimatorSet animatorSet = chatActivityEnterView3.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView3.W0.start();
                    return;
                }
                return;
        }
    }
}
