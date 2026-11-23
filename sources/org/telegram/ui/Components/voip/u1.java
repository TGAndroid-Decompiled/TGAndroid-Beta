package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f40;
public final class u1 implements g70, org.telegram.ui.ActionBar.q1 {
    public final TLRPC.User f41385a;
    public final TLRPC.Chat f41386b;
    public final String f41387c;
    public final boolean d;
    public final boolean f41388e;
    public final boolean f41389f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.g2 f41390n;
    public final org.telegram.messenger.c f41391r;

    public u1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        this.f41385a = user;
        this.f41386b = chat;
        this.f41387c = str;
        this.d = z10;
        this.f41388e = z11;
        this.f41389f = z12;
        this.h = activity;
        this.f41390n = g2Var;
        this.f41391r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f41391r;
        TLRPC.Chat chat = this.f41386b;
        String str = this.f41387c;
        if (z13 && z11) {
            f40.f1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f41385a;
        boolean z14 = this.f41388e;
        boolean z15 = this.f41389f;
        org.telegram.ui.ActionBar.g2 g2Var = this.f41390n;
        if (!z10 && str != null) {
            a2 a2Var = new a2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, g2Var, cVar, z12);
            if (g2Var != null) {
                g2Var.showDialog(a2Var);
                return;
            }
            return;
        }
        b2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, g2Var, cVar, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f41385a;
        final TLRPC.Chat chat = this.f41386b;
        final String str = this.f41387c;
        final boolean z10 = this.d;
        final boolean z11 = this.f41388e;
        final boolean z12 = this.f41389f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.g2 g2Var = this.f41390n;
        final org.telegram.messenger.c cVar = this.f41391r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    b2.f40917a = 0L;
                    b2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, g2Var, cVar, true, true, false);
                }
            });
        } else {
            b2.b(user, chat, str, null, false, z10, z11, z12, activity, g2Var, cVar, true, true, false);
        }
    }

    public u1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = z10;
        this.h = activity;
        this.f41391r = cVar;
        this.f41386b = chat;
        this.f41387c = str;
        this.f41385a = user;
        this.f41388e = z11;
        this.f41389f = z12;
        this.f41390n = g2Var;
    }
}
