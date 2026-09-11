package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j60;
public final class v1 implements u70, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f31892a;
    public final TLRPC.Chat f31893b;
    public final String f31894c;
    public final boolean d;
    public final boolean f31895e;
    public final boolean f31896f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f31897n;
    public final AccountInstance f31898r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f31892a = user;
        this.f31893b = chat;
        this.f31894c = str;
        this.d = z10;
        this.f31895e = z11;
        this.f31896f = z12;
        this.h = activity;
        this.f31897n = n2Var;
        this.f31898r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f31898r;
        TLRPC.Chat chat = this.f31893b;
        String str = this.f31894c;
        if (z13 && z11) {
            j60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f31892a;
        boolean z14 = this.f31895e;
        boolean z15 = this.f31896f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f31897n;
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
        final TLRPC.User user = this.f31892a;
        final TLRPC.Chat chat = this.f31893b;
        final String str = this.f31894c;
        final boolean z10 = this.d;
        final boolean z11 = this.f31895e;
        final boolean z12 = this.f31896f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f31897n;
        final AccountInstance accountInstance = this.f31898r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    d2.f31450a = 0L;
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
        this.f31898r = accountInstance;
        this.f31893b = chat;
        this.f31894c = str;
        this.f31892a = user;
        this.f31895e = z11;
        this.f31896f = z12;
        this.f31897n = n2Var;
    }
}
