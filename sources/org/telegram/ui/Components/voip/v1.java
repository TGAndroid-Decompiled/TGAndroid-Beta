package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n60;
public final class v1 implements t80, org.telegram.ui.ActionBar.z1 {
    public final TLRPC.User f30223a;
    public final TLRPC.Chat f30224b;
    public final String f30225c;
    public final boolean d;
    public final boolean e;
    public final boolean f30226f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.m2 f30227n;
    public final AccountInstance f30228r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        this.f30223a = user;
        this.f30224b = chat;
        this.f30225c = str;
        this.d = z10;
        this.e = z11;
        this.f30226f = z12;
        this.h = activity;
        this.f30227n = m2Var;
        this.f30228r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f30228r;
        TLRPC.Chat chat = this.f30224b;
        String str = this.f30225c;
        if (z13 && z11) {
            n60.d1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f30223a;
        boolean z14 = this.e;
        boolean z15 = this.f30226f;
        org.telegram.ui.ActionBar.m2 m2Var = this.f30227n;
        if (!z10 && str != null) {
            c2 c2Var = new c2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, m2Var, accountInstance, z12);
            if (m2Var != null) {
                m2Var.showDialog(c2Var);
                return;
            }
            return;
        }
        d2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, m2Var, accountInstance, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f30223a;
        final TLRPC.Chat chat = this.f30224b;
        final String str = this.f30225c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f30226f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.m2 m2Var = this.f30227n;
        final AccountInstance accountInstance = this.f30228r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    d2.f29814a = 0L;
                    d2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
                }
            });
        } else {
            d2.b(user, chat, str, null, false, z10, z11, z12, activity, m2Var, accountInstance, true, true, false);
        }
    }

    public v1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.m2 m2Var) {
        this.d = z10;
        this.h = activity;
        this.f30228r = accountInstance;
        this.f30224b = chat;
        this.f30225c = str;
        this.f30223a = user;
        this.e = z11;
        this.f30226f = z12;
        this.f30227n = m2Var;
    }
}
