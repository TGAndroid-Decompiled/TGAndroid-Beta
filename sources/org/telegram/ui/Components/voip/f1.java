package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a50;
public final class f1 implements i70, org.telegram.ui.ActionBar.u1 {
    public final TLRPC.User f31483a;
    public final TLRPC.Chat f31484b;
    public final String f31485c;
    public final boolean d;
    public final boolean e;
    public final boolean f31486f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.k2 f31487n;
    public final org.telegram.messenger.c f31488r;

    public f1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        this.f31483a = user;
        this.f31484b = chat;
        this.f31485c = str;
        this.d = z10;
        this.e = z11;
        this.f31486f = z12;
        this.h = activity;
        this.f31487n = k2Var;
        this.f31488r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f31488r;
        TLRPC.Chat chat = this.f31484b;
        String str = this.f31485c;
        if (z13 && z11) {
            a50.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f31483a;
        boolean z14 = this.e;
        boolean z15 = this.f31486f;
        org.telegram.ui.ActionBar.k2 k2Var = this.f31487n;
        if (!z10 && str != null) {
            m1 m1Var = new m1(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, k2Var, cVar, z12);
            if (k2Var != null) {
                k2Var.showDialog(m1Var);
                return;
            }
            return;
        }
        n1.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, k2Var, cVar, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f31483a;
        final TLRPC.Chat chat = this.f31484b;
        final String str = this.f31485c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f31486f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.k2 k2Var = this.f31487n;
        final org.telegram.messenger.c cVar = this.f31488r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    n1.f31626a = 0L;
                    n1.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
                }
            });
        } else {
            n1.b(user, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
        }
    }

    public f1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = z10;
        this.h = activity;
        this.f31488r = cVar;
        this.f31484b = chat;
        this.f31485c = str;
        this.f31483a = user;
        this.e = z11;
        this.f31486f = z12;
        this.f31487n = k2Var;
    }
}
