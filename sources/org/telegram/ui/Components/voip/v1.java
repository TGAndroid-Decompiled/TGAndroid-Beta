package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
public final class v1 implements d70, org.telegram.ui.ActionBar.q1 {
    public final TLRPC.User f41280a;
    public final TLRPC.Chat f41281b;
    public final String f41282c;
    public final boolean d;
    public final boolean f41283e;
    public final boolean f41284f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.g2 f41285n;
    public final org.telegram.messenger.c f41286r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        this.f41280a = user;
        this.f41281b = chat;
        this.f41282c = str;
        this.d = z10;
        this.f41283e = z11;
        this.f41284f = z12;
        this.h = activity;
        this.f41285n = g2Var;
        this.f41286r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f41286r;
        TLRPC.Chat chat = this.f41281b;
        String str = this.f41282c;
        if (z13 && z11) {
            e40.f1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f41280a;
        boolean z14 = this.f41283e;
        boolean z15 = this.f41284f;
        org.telegram.ui.ActionBar.g2 g2Var = this.f41285n;
        if (!z10 && str != null) {
            b2 b2Var = new b2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, g2Var, cVar, z12);
            if (g2Var != null) {
                g2Var.showDialog(b2Var);
                return;
            }
            return;
        }
        c2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, g2Var, cVar, false, true, z12);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f41280a;
        final TLRPC.Chat chat = this.f41281b;
        final String str = this.f41282c;
        final boolean z10 = this.d;
        final boolean z11 = this.f41283e;
        final boolean z12 = this.f41284f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.g2 g2Var = this.f41285n;
        final org.telegram.messenger.c cVar = this.f41286r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    c2.f40813a = 0L;
                    c2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, g2Var, cVar, true, true, false);
                }
            });
        } else {
            c2.b(user, chat, str, null, false, z10, z11, z12, activity, g2Var, cVar, true, true, false);
        }
    }

    public v1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = z10;
        this.h = activity;
        this.f41286r = cVar;
        this.f41281b = chat;
        this.f41282c = str;
        this.f41280a = user;
        this.f41283e = z11;
        this.f41284f = z12;
        this.f41285n = g2Var;
    }
}
