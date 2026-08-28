package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o50;
public final class w1 implements e70, org.telegram.ui.ActionBar.b2 {
    public final TLRPC.User f33917a;
    public final TLRPC.Chat f33918b;
    public final String f33919c;
    public final boolean d;
    public final boolean f33920e;
    public final boolean f33921f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.o2 f33922n;
    public final AccountInstance f33923r;

    public w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        this.f33917a = user;
        this.f33918b = chat;
        this.f33919c = str;
        this.d = z10;
        this.f33920e = z11;
        this.f33921f = z12;
        this.h = activity;
        this.f33922n = o2Var;
        this.f33923r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f33923r;
        TLRPC.Chat chat = this.f33918b;
        String str = this.f33919c;
        if (z13 && z11) {
            o50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f33917a;
        boolean z14 = this.f33920e;
        boolean z15 = this.f33921f;
        org.telegram.ui.ActionBar.o2 o2Var = this.f33922n;
        if (!z10 && str != null) {
            d2 d2Var = new d2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, o2Var, accountInstance, z12);
            if (o2Var != null) {
                o2Var.showDialog(d2Var);
                return;
            }
            return;
        }
        e2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, o2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f33917a;
        final TLRPC.Chat chat = this.f33918b;
        final String str = this.f33919c;
        final boolean z10 = this.d;
        final boolean z11 = this.f33920e;
        final boolean z12 = this.f33921f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.o2 o2Var = this.f33922n;
        final AccountInstance accountInstance = this.f33923r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    e2.f33498a = 0L;
                    e2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
                }
            });
        } else {
            e2.b(user, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
        }
    }

    public w1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = z10;
        this.h = activity;
        this.f33923r = accountInstance;
        this.f33918b = chat;
        this.f33919c = str;
        this.f33917a = user;
        this.f33920e = z11;
        this.f33921f = z12;
        this.f33922n = o2Var;
    }
}
