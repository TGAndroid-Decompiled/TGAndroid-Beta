package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s50;

public final class w1 implements i70, org.telegram.ui.ActionBar.a2 {

    public final TLRPC.User f33967a;

    public final TLRPC.Chat f33968b;

    public final String f33969c;
    public final boolean d;

    public final boolean f33970e;

    public final boolean f33971f;
    public final Activity h;

    public final org.telegram.ui.ActionBar.n2 f33972n;

    public final AccountInstance f33973r;

    public w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f33967a = user;
        this.f33968b = chat;
        this.f33969c = str;
        this.d = z10;
        this.f33970e = z11;
        this.f33971f = z12;
        this.h = activity;
        this.f33972n = n2Var;
        this.f33973r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f33973r;
        TLRPC.Chat chat = this.f33968b;
        String str = this.f33969c;
        if (z13 && z11) {
            s50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f33967a;
        boolean z14 = this.f33970e;
        boolean z15 = this.f33971f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f33972n;
        if (z10 || str == null) {
            e2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, n2Var, accountInstance, false, true, z12);
            return;
        }
        d2 d2Var = new d2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, n2Var, accountInstance, z12);
        if (n2Var != null) {
            n2Var.showDialog(d2Var);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f33967a;
        final TLRPC.Chat chat = this.f33968b;
        final String str = this.f33969c;
        final boolean z10 = this.d;
        final boolean z11 = this.f33970e;
        final boolean z12 = this.f33971f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f33972n;
        final AccountInstance accountInstance = this.f33973r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    e2.f33548a = 0L;
                    e2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
                }
            });
        } else {
            e2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
        }
    }

    public w1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z10;
        this.h = activity;
        this.f33973r = accountInstance;
        this.f33968b = chat;
        this.f33969c = str;
        this.f33967a = user;
        this.f33970e = z11;
        this.f33971f = z12;
        this.f33972n = n2Var;
    }
}
