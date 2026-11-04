package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLRPC;
public final class o70 implements Runnable {
    public final LaunchActivity f48210a;
    public final org.telegram.ui.ActionBar.d2 f48211b;
    public final int f48212c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f48213e;
    public final AtomicBoolean f48214f;
    public final String h;
    public final boolean f48215n;
    public final boolean f48216r;
    public final boolean f48217s;
    public final boolean f48218w;

    public o70(LaunchActivity launchActivity, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f48210a = launchActivity;
        this.f48211b = d2Var;
        this.f48212c = i3;
        this.d = user;
        this.f48213e = tL_messages_botApp;
        this.f48214f = atomicBoolean;
        this.h = str;
        this.f48215n = z10;
        this.f48216r = z11;
        this.f48217s = z12;
        this.f48218w = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String a02;
        String str = LaunchActivity.E1;
        org.telegram.ui.ActionBar.d2 d2Var = this.f48211b;
        if (d2Var != null && LaunchActivity.G1) {
            LaunchActivity launchActivity = this.f48210a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f27150id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f48213e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f48214f.get();
                int i3 = this.f48212c;
                String str2 = this.h;
                boolean z11 = this.f48215n;
                boolean z12 = this.f48216r;
                ii.q4 b10 = ii.q4.b(i3, j10, j10, null, null, 3, 0, 0L, botApp, z10, str2, user, 0, z11, z12);
                if (launchActivity.O() == null || launchActivity.O().k(b10) == null) {
                    org.telegram.messenger.b6.n(launchActivity.P, user.f27150id);
                    ii.a3 a3Var = new ii.a3(launchActivity, d2Var.getResourceProvider());
                    ii.s2 s2Var = a3Var.E;
                    if (s2Var != null) {
                        s2Var.setWasOpenedByLinkIntent(this.f48217s);
                    }
                    a3Var.B(!z11);
                    if (z12) {
                        a3Var.C(true, false, a3Var.f14804g0);
                    }
                    a3Var.C0 = false;
                    a3Var.m0 = launchActivity;
                    a3Var.x(d2Var, b10);
                    a3Var.show();
                    if (tL_messages_botApp.inactive || this.f48218w) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = org.telegram.messenger.li.b0(a3Var.I).f24011b.bots;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                                i10++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == a3Var.J) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z13 = tL_attachMenuBot.show_in_side_menu;
                            if (z13 && tL_attachMenuBot.show_in_attach_menu) {
                                a02 = org.telegram.messenger.bd.a0(null, null, 2131753138, a22.first_name);
                            } else if (z13) {
                                a02 = org.telegram.messenger.bd.a0(null, null, 2131753137, a22.first_name);
                            } else {
                                a02 = org.telegram.messenger.bd.a0(null, null, 2131753139, a22.first_name);
                            }
                            org.telegram.messenger.g0.i3(new ii.e(3, a3Var, a02), 200L);
                        }
                    }
                }
            }
        }
    }
}
