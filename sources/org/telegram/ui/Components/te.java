package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.os.SystemClock;
public final class te implements Runnable {
    public final int f39876a;
    public final ChatActivityEnterView f39877b;

    public te(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f39876a = i7;
        this.f39877b = chatActivityEnterView;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        long j11;
        switch (this.f39876a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.f39877b;
                te teVar = chatActivityEnterView.f32634h4;
                if ((!chatActivityEnterView.H0() || !chatActivityEnterView.A()) && !org.telegram.ui.ActionBar.g2.hasSheets(chatActivityEnterView.F3) && !chatActivityEnterView.O2 && chatActivityEnterView.F0 != null && chatActivityEnterView.f32575a4 && !chatActivityEnterView.f32691p3 && !org.telegram.messenger.g0.D && !org.telegram.messenger.g0.E) {
                    ng ngVar = chatActivityEnterView.P3;
                    if (ngVar != null) {
                        ngVar.o1();
                    }
                    chatActivityEnterView.F0.requestFocus();
                    org.telegram.messenger.g0.I3(chatActivityEnterView.F0);
                    org.telegram.messenger.g0.r(teVar);
                    org.telegram.messenger.g0.h3(teVar, 100L);
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = this.f39877b;
                ai.o1 o1Var = chatActivityEnterView2.f32686o6;
                if (o1Var != null && o1Var.d) {
                    long j12 = o1Var.f1356e;
                    if (j12 == 0) {
                        j11 = 0;
                    } else {
                        long j13 = j12 + o1Var.f1353a;
                        if (o1Var.C) {
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
                chatActivityEnterView2.f32719s6 = null;
                chatActivityEnterView2.f32702q6 = false;
                chatActivityEnterView2.f32711r6 = true;
                chatActivityEnterView2.t6 = SystemClock.uptimeMillis();
                ai.o1 o1Var2 = chatActivityEnterView2.f32686o6;
                if (o1Var2 != null) {
                    o1Var2.c();
                }
                try {
                    chatActivityEnterView2.v1();
                    return;
                } finally {
                    chatActivityEnterView2.f32711r6 = false;
                    org.telegram.messenger.g0.h3(new td(chatActivityEnterView2, 17), 450L);
                }
            case 2:
                ng ngVar2 = this.f39877b.P3;
                if (ngVar2 != null) {
                    ngVar2.o2(0, 0, 0, 0L, 0L, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView3 = this.f39877b;
                AnimatorSet animatorSet = chatActivityEnterView3.W0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    chatActivityEnterView3.W0.start();
                    return;
                }
                return;
        }
    }
}
