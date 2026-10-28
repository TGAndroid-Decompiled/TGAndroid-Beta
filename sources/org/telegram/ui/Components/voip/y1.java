package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x50;
public final class y1 implements s80, org.telegram.ui.ActionBar.b2 {
    public final TLRPC.User f34321a;
    public final TLRPC.Chat f34322b;
    public final String f34323c;
    public final boolean d;
    public final boolean e;
    public final boolean f34324f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.r2 f34325n;
    public final AccountInstance f34326r;

    public y1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance) {
        this.f34321a = user;
        this.f34322b = chat;
        this.f34323c = str;
        this.d = z10;
        this.e = z11;
        this.f34324f = z12;
        this.h = activity;
        this.f34325n = r2Var;
        this.f34326r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f34326r;
        TLRPC.Chat chat = this.f34322b;
        String str = this.f34323c;
        if (z13 && z11) {
            x50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f34321a;
        boolean z14 = this.e;
        boolean z15 = this.f34324f;
        org.telegram.ui.ActionBar.r2 r2Var = this.f34325n;
        if (!z10 && str != null) {
            f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, r2Var, accountInstance, z12);
            if (r2Var != null) {
                r2Var.showDialog(f2Var);
                return;
            }
            return;
        }
        g2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, r2Var, accountInstance, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f34321a;
        final TLRPC.Chat chat = this.f34322b;
        final String str = this.f34323c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f34324f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.r2 r2Var = this.f34325n;
        final AccountInstance accountInstance = this.f34326r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    g2.f33918a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, r2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z10, z11, z12, activity, r2Var, accountInstance, true, true, false);
        }
    }

    public y1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.r2 r2Var) {
        this.d = z10;
        this.h = activity;
        this.f34326r = accountInstance;
        this.f34322b = chat;
        this.f34323c = str;
        this.f34321a = user;
        this.e = z11;
        this.f34324f = z12;
        this.f34325n = r2Var;
    }
}
