package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c60;
public final class w1 implements w70, org.telegram.ui.ActionBar.c2 {
    public final TLRPC.User f30010a;
    public final TLRPC.Chat f30011b;
    public final String f30012c;
    public final boolean d;
    public final boolean e;
    public final boolean f30013f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.p2 f30014n;
    public final AccountInstance f30015r;

    public w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        this.f30010a = user;
        this.f30011b = chat;
        this.f30012c = str;
        this.d = z4;
        this.e = z10;
        this.f30013f = z11;
        this.h = activity;
        this.f30014n = p2Var;
        this.f30015r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f30015r;
        TLRPC.Chat chat = this.f30011b;
        String str = this.f30012c;
        if (z12 && z10) {
            c60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z4, str);
            return;
        }
        TLRPC.User user = this.f30010a;
        boolean z13 = this.e;
        boolean z14 = this.f30013f;
        org.telegram.ui.ActionBar.p2 p2Var = this.f30014n;
        if (!z4 && str != null) {
            e2 e2Var = new e2(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, p2Var, accountInstance, z11);
            if (p2Var != null) {
                p2Var.showDialog(e2Var);
                return;
            }
            return;
        }
        f2.b(user, chat, str, inputPeer, z4, z13, z14, z12, activity, p2Var, accountInstance, false, true, z11);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f30010a;
        final TLRPC.Chat chat = this.f30011b;
        final String str = this.f30012c;
        final boolean z4 = this.d;
        final boolean z10 = this.e;
        final boolean z11 = this.f30013f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.p2 p2Var = this.f30014n;
        final AccountInstance accountInstance = this.f30015r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f29628a = 0L;
                    f2.b(TLRPC.User.this, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
                }
            });
        } else {
            f2.b(user, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
        }
    }

    public w1(boolean z4, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = z4;
        this.h = activity;
        this.f30015r = accountInstance;
        this.f30011b = chat;
        this.f30012c = str;
        this.f30010a = user;
        this.e = z10;
        this.f30013f = z11;
        this.f30014n = p2Var;
    }
}
