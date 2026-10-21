package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q50;
public final class v1 implements p80, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f31790a;
    public final TLRPC.Chat f31791b;
    public final String f31792c;
    public final boolean d;
    public final boolean e;
    public final boolean f31793f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f31794n;
    public final AccountInstance f31795r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f31790a = user;
        this.f31791b = chat;
        this.f31792c = str;
        this.d = z10;
        this.e = z11;
        this.f31793f = z12;
        this.h = activity;
        this.f31794n = n2Var;
        this.f31795r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f31795r;
        TLRPC.Chat chat = this.f31791b;
        String str = this.f31792c;
        if (z13 && z11) {
            q50.d1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f31790a;
        boolean z14 = this.e;
        boolean z15 = this.f31793f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f31794n;
        if (!z10 && str != null) {
            c2 c2Var = new c2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, n2Var, accountInstance, z12);
            if (n2Var != null) {
                n2Var.showDialog(c2Var);
                return;
            }
            return;
        }
        d2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, n2Var, accountInstance, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f31790a;
        final TLRPC.Chat chat = this.f31791b;
        final String str = this.f31792c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f31793f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f31794n;
        final AccountInstance accountInstance = this.f31795r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    d2.f31379a = 0L;
                    d2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
                }
            });
        } else {
            d2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
        }
    }

    public v1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z10;
        this.h = activity;
        this.f31795r = accountInstance;
        this.f31791b = chat;
        this.f31792c = str;
        this.f31790a = user;
        this.e = z11;
        this.f31793f = z12;
        this.f31794n = n2Var;
    }
}
