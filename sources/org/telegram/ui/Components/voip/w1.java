package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j60;
public final class w1 implements d80, org.telegram.ui.ActionBar.c2 {
    public final TLRPC.User f28515a;
    public final TLRPC.Chat f28516b;
    public final String f28517c;
    public final boolean d;
    public final boolean e;
    public final boolean f28518f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.p2 f28519n;
    public final AccountInstance f28520r;

    public w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        this.f28515a = user;
        this.f28516b = chat;
        this.f28517c = str;
        this.d = z10;
        this.e = z11;
        this.f28518f = z12;
        this.h = activity;
        this.f28519n = p2Var;
        this.f28520r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f28520r;
        TLRPC.Chat chat = this.f28516b;
        String str = this.f28517c;
        if (z13 && z11) {
            j60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f28515a;
        boolean z14 = this.e;
        boolean z15 = this.f28518f;
        org.telegram.ui.ActionBar.p2 p2Var = this.f28519n;
        if (!z10 && str != null) {
            d2 d2Var = new d2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, p2Var, accountInstance, z12);
            if (p2Var != null) {
                p2Var.showDialog(d2Var);
                return;
            }
            return;
        }
        e2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, p2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f28515a;
        final TLRPC.Chat chat = this.f28516b;
        final String str = this.f28517c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f28518f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.p2 p2Var = this.f28519n;
        final AccountInstance accountInstance = this.f28520r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    e2.f28115a = 0L;
                    e2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, p2Var, accountInstance, true, true, false);
                }
            });
        } else {
            e2.b(user, chat, str, null, false, z10, z11, z12, activity, p2Var, accountInstance, true, true, false);
        }
    }

    public w1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = z10;
        this.h = activity;
        this.f28520r = accountInstance;
        this.f28516b = chat;
        this.f28517c = str;
        this.f28515a = user;
        this.e = z11;
        this.f28518f = z12;
        this.f28519n = p2Var;
    }
}
