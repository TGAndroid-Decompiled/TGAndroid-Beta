package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k60;
public final class x1 implements u70, org.telegram.ui.ActionBar.b2 {
    public final TLRPC.User f29330a;
    public final TLRPC.Chat f29331b;
    public final String f29332c;
    public final boolean d;
    public final boolean e;
    public final boolean f29333f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.o2 f29334n;
    public final AccountInstance f29335r;

    public x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        this.f29330a = user;
        this.f29331b = chat;
        this.f29332c = str;
        this.d = z10;
        this.e = z11;
        this.f29333f = z12;
        this.h = activity;
        this.f29334n = o2Var;
        this.f29335r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f29335r;
        TLRPC.Chat chat = this.f29331b;
        String str = this.f29332c;
        if (z13 && z11) {
            k60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f29330a;
        boolean z14 = this.e;
        boolean z15 = this.f29333f;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29334n;
        if (!z10 && str != null) {
            e2 e2Var = new e2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, o2Var, accountInstance, z12);
            if (o2Var != null) {
                o2Var.showDialog(e2Var);
                return;
            }
            return;
        }
        f2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, o2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f29330a;
        final TLRPC.Chat chat = this.f29331b;
        final String str = this.f29332c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f29333f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.o2 o2Var = this.f29334n;
        final AccountInstance accountInstance = this.f29335r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f28926a = 0L;
                    f2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
                }
            });
        } else {
            f2.b(user, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
        }
    }

    public x1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = z10;
        this.h = activity;
        this.f29335r = accountInstance;
        this.f29331b = chat;
        this.f29332c = str;
        this.f29330a = user;
        this.e = z11;
        this.f29333f = z12;
        this.f29334n = o2Var;
    }
}
