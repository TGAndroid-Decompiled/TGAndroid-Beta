package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f40;
public final class u1 implements e70, org.telegram.ui.ActionBar.r1 {
    public final TLRPC.User f41248a;
    public final TLRPC.Chat f41249b;
    public final String f41250c;
    public final boolean d;
    public final boolean f41251e;
    public final boolean f41252f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.h2 f41253n;
    public final org.telegram.messenger.c f41254r;

    public u1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.c cVar) {
        this.f41248a = user;
        this.f41249b = chat;
        this.f41250c = str;
        this.d = z10;
        this.f41251e = z11;
        this.f41252f = z12;
        this.h = activity;
        this.f41253n = h2Var;
        this.f41254r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f41254r;
        TLRPC.Chat chat = this.f41249b;
        String str = this.f41250c;
        if (z13 && z11) {
            f40.f1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f41248a;
        boolean z14 = this.f41251e;
        boolean z15 = this.f41252f;
        org.telegram.ui.ActionBar.h2 h2Var = this.f41253n;
        if (!z10 && str != null) {
            a2 a2Var = new a2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, h2Var, cVar, z12);
            if (h2Var != null) {
                h2Var.showDialog(a2Var);
                return;
            }
            return;
        }
        b2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, h2Var, cVar, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f41248a;
        final TLRPC.Chat chat = this.f41249b;
        final String str = this.f41250c;
        final boolean z10 = this.d;
        final boolean z11 = this.f41251e;
        final boolean z12 = this.f41252f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.h2 h2Var = this.f41253n;
        final org.telegram.messenger.c cVar = this.f41254r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    b2.f40780a = 0L;
                    b2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, h2Var, cVar, true, true, false);
                }
            });
        } else {
            b2.b(user, chat, str, null, false, z10, z11, z12, activity, h2Var, cVar, true, true, false);
        }
    }

    public u1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.h2 h2Var) {
        this.d = z10;
        this.h = activity;
        this.f41254r = cVar;
        this.f41249b = chat;
        this.f41250c = str;
        this.f41248a = user;
        this.f41251e = z11;
        this.f41252f = z12;
        this.f41253n = h2Var;
    }
}
