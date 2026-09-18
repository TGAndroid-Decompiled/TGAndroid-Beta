package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i60;
public final class x1 implements d80, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f29646a;
    public final TLRPC.Chat f29647b;
    public final String f29648c;
    public final boolean d;
    public final boolean e;
    public final boolean f29649f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f29650n;
    public final AccountInstance f29651r;

    public x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f29646a = user;
        this.f29647b = chat;
        this.f29648c = str;
        this.d = z10;
        this.e = z11;
        this.f29649f = z12;
        this.h = activity;
        this.f29650n = n2Var;
        this.f29651r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f29651r;
        TLRPC.Chat chat = this.f29647b;
        String str = this.f29648c;
        if (z13 && z11) {
            i60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f29646a;
        boolean z14 = this.e;
        boolean z15 = this.f29649f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f29650n;
        if (!z10 && str != null) {
            e2 e2Var = new e2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, n2Var, accountInstance, z12);
            if (n2Var != null) {
                n2Var.showDialog(e2Var);
                return;
            }
            return;
        }
        f2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, n2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f29646a;
        final TLRPC.Chat chat = this.f29647b;
        final String str = this.f29648c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f29649f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f29650n;
        final AccountInstance accountInstance = this.f29651r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f29242a = 0L;
                    f2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
                }
            });
        } else {
            f2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
        }
    }

    public x1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z10;
        this.h = activity;
        this.f29651r = accountInstance;
        this.f29647b = chat;
        this.f29648c = str;
        this.f29646a = user;
        this.e = z11;
        this.f29649f = z12;
        this.f29650n = n2Var;
    }
}
