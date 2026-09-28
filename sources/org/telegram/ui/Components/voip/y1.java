package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d60;
public final class y1 implements h80, org.telegram.ui.ActionBar.z1 {
    public final TLRPC.User f29684a;
    public final TLRPC.Chat f29685b;
    public final String f29686c;
    public final boolean d;
    public final boolean e;
    public final boolean f29687f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.m2 f29688n;
    public final AccountInstance f29689r;

    public y1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        this.f29684a = user;
        this.f29685b = chat;
        this.f29686c = str;
        this.d = z10;
        this.e = z11;
        this.f29687f = z12;
        this.h = activity;
        this.f29688n = m2Var;
        this.f29689r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f29689r;
        TLRPC.Chat chat = this.f29685b;
        String str = this.f29686c;
        if (z13 && z11) {
            d60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f29684a;
        boolean z14 = this.e;
        boolean z15 = this.f29687f;
        org.telegram.ui.ActionBar.m2 m2Var = this.f29688n;
        if (!z10 && str != null) {
            f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, m2Var, accountInstance, z12);
            if (m2Var != null) {
                m2Var.showDialog(f2Var);
                return;
            }
            return;
        }
        g2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, m2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f29684a;
        final TLRPC.Chat chat = this.f29685b;
        final String str = this.f29686c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f29687f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.m2 m2Var = this.f29688n;
        final AccountInstance accountInstance = this.f29689r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    g2.f29282a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
        }
    }

    public y1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = z10;
        this.h = activity;
        this.f29689r = accountInstance;
        this.f29685b = chat;
        this.f29686c = str;
        this.f29684a = user;
        this.e = z11;
        this.f29687f = z12;
        this.f29688n = m2Var;
    }
}
