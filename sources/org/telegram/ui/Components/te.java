package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;
public final class te implements Runnable {
    public final int f39984a;
    public final ChatActivityEnterView f39985b;

    public te(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39984a = i7;
        this.f39985b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        long j11;
        switch (this.f39984a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39985b;
                te teVar = chatActivityEnterView.f32587f4;
                if ((!chatActivityEnterView.D0() || !chatActivityEnterView.A()) && !org.telegram.ui.ActionBar.h2.hasSheets(chatActivityEnterView.D3) && !chatActivityEnterView.M2 && chatActivityEnterView.F0 != null && chatActivityEnterView.Y3 && !chatActivityEnterView.f32645n3 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    kg kgVar = chatActivityEnterView.N3;
                    if (kgVar != null) {
                        kgVar.o1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(teVar);
                    org.telegram.messenger.g0.h3(teVar, 100L);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f39985b;
                ai.l1 l1Var = chatActivityEnterView2.f32640m6;
                if (l1Var != null && l1Var.d) {
                    long j12 = l1Var.f1311e;
                    if (j12 == 0) {
                        j11 = 0;
                    } else {
                        long j13 = j12 + l1Var.f1308a;
                        if (l1Var.C) {
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
                chatActivityEnterView2.f32668q6 = null;
                chatActivityEnterView2.f32654o6 = false;
                chatActivityEnterView2.f32661p6 = true;
                chatActivityEnterView2.f32676r6 = SystemClock.uptimeMillis();
                ai.l1 l1Var2 = chatActivityEnterView2.f32640m6;
                if (l1Var2 != null) {
                    l1Var2.c();
                }
                try {
                    chatActivityEnterView2.r1();
                    return;
                } finally {
                    chatActivityEnterView2.f32661p6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                kg kgVar2 = this.f39985b.N3;
                if (kgVar2 != null) {
                    kgVar2.o2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.f39985b;
                AnimatorSet animatorSet = chatActivityEnterView3.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView3.W0.start();
                    return;
                }
                return;
        }
    }
}
