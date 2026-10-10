package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g60;
public final class x1 implements x80, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f32434a;
    public final TLRPC.Chat f32435b;
    public final String f32436c;
    public final boolean d;
    public final boolean f32437e;
    public final boolean f32438f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f32439n;
    public final AccountInstance f32440r;

    public x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f32434a = user;
        this.f32435b = chat;
        this.f32436c = str;
        this.d = z10;
        this.f32437e = z11;
        this.f32438f = z12;
        this.h = activity;
        this.f32439n = n2Var;
        this.f32440r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f32440r;
        TLRPC.Chat chat = this.f32435b;
        String str = this.f32436c;
        if (z13 && z11) {
            g60.d1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f32434a;
        boolean z14 = this.f32437e;
        boolean z15 = this.f32438f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32439n;
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
        final TLRPC.User user = this.f32434a;
        final TLRPC.Chat chat = this.f32435b;
        final String str = this.f32436c;
        final boolean z10 = this.d;
        final boolean z11 = this.f32437e;
        final boolean z12 = this.f32438f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f32439n;
        final AccountInstance accountInstance = this.f32440r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f31999a = 0L;
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
        this.f32440r = accountInstance;
        this.f32435b = chat;
        this.f32436c = str;
        this.f32434a = user;
        this.f32437e = z11;
        this.f32438f = z12;
        this.f32439n = n2Var;
    }
}
