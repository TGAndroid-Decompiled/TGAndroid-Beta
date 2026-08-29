package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r50;
public final class y1 implements r70, org.telegram.ui.ActionBar.b2 {
    public final TLRPC.User f34131a;
    public final TLRPC.Chat f34132b;
    public final String f34133c;
    public final boolean d;
    public final boolean f34134e;
    public final boolean f34135f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.o2 f34136n;
    public final AccountInstance f34137r;

    public y1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        this.f34131a = user;
        this.f34132b = chat;
        this.f34133c = str;
        this.d = z10;
        this.f34134e = z11;
        this.f34135f = z12;
        this.h = activity;
        this.f34136n = o2Var;
        this.f34137r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f34137r;
        TLRPC.Chat chat = this.f34132b;
        String str = this.f34133c;
        if (z13 && z11) {
            r50.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f34131a;
        boolean z14 = this.f34134e;
        boolean z15 = this.f34135f;
        org.telegram.ui.ActionBar.o2 o2Var = this.f34136n;
        if (!z10 && str != null) {
            g2 g2Var = new g2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, o2Var, accountInstance, z12);
            if (o2Var != null) {
                o2Var.showDialog(g2Var);
                return;
            }
            return;
        }
        h2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, o2Var, accountInstance, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f34131a;
        final TLRPC.Chat chat = this.f34132b;
        final String str = this.f34133c;
        final boolean z10 = this.d;
        final boolean z11 = this.f34134e;
        final boolean z12 = this.f34135f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.o2 o2Var = this.f34136n;
        final AccountInstance accountInstance = this.f34137r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    h2.f33742a = 0L;
                    h2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
                }
            });
        } else {
            h2.b(user, chat, str, null, false, z10, z11, z12, activity, o2Var, accountInstance, true, true, false);
        }
    }

    public y1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.o2 o2Var) {
        this.d = z10;
        this.h = activity;
        this.f34137r = accountInstance;
        this.f34132b = chat;
        this.f34133c = str;
        this.f34131a = user;
        this.f34134e = z11;
        this.f34135f = z12;
        this.f34136n = o2Var;
    }
}
