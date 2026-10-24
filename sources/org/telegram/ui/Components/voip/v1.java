package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u50;
public final class v1 implements o80, org.telegram.ui.ActionBar.z1 {
    public final TLRPC.User f31945a;
    public final TLRPC.Chat f31946b;
    public final String f31947c;
    public final boolean d;
    public final boolean e;
    public final boolean f31948f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.o2 f31949n;
    public final AccountInstance f31950r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        this.f31945a = user;
        this.f31946b = chat;
        this.f31947c = str;
        this.d = z10;
        this.e = z11;
        this.f31948f = z12;
        this.h = activity;
        this.f31949n = o2Var;
        this.f31950r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f31950r;
        TLRPC.Chat chat = this.f31946b;
        String str = this.f31947c;
        if (z13 && z11) {
            u50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f31945a;
        boolean z14 = this.e;
        boolean z15 = this.f31948f;
        org.telegram.ui.ActionBar.o2 o2Var = this.f31949n;
        if (!z10 && str != null) {
            c2 c2Var = new c2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, o2Var, accountInstance, z12);
            if (o2Var != null) {
                o2Var.showDialog(c2Var);
                return;
            }
            return;
        }
        d2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, o2Var, accountInstance, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f31945a;
        final TLRPC.Chat chat = this.f31946b;
        final String str = this.f31947c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f31948f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.o2 o2Var = this.f31949n;
        final AccountInstance accountInstance = this.f31950r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    d2.f31534a = 0L;
                    d2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
                }
            });
        } else {
            d2.b(user, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
        }
    }

    public v1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = z10;
        this.h = activity;
        this.f31950r = accountInstance;
        this.f31946b = chat;
        this.f31947c = str;
        this.f31945a = user;
        this.e = z11;
        this.f31948f = z12;
        this.f31949n = o2Var;
    }
}
