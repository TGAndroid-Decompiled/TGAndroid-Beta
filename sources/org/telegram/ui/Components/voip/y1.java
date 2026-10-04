package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h60;
public final class y1 implements i80, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f32300a;
    public final TLRPC.Chat f32301b;
    public final String f32302c;
    public final boolean d;
    public final boolean f32303e;
    public final boolean f32304f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f32305n;
    public final AccountInstance f32306r;

    public y1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f32300a = user;
        this.f32301b = chat;
        this.f32302c = str;
        this.d = z10;
        this.f32303e = z11;
        this.f32304f = z12;
        this.h = activity;
        this.f32305n = n2Var;
        this.f32306r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f32306r;
        TLRPC.Chat chat = this.f32301b;
        String str = this.f32302c;
        if (z13 && z11) {
            h60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f32300a;
        boolean z14 = this.f32303e;
        boolean z15 = this.f32304f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32305n;
        if (!z10 && str != null) {
            f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, n2Var, accountInstance, z12);
            if (n2Var != null) {
                n2Var.showDialog(f2Var);
                return;
            }
            return;
        }
        g2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, n2Var, accountInstance, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f32300a;
        final TLRPC.Chat chat = this.f32301b;
        final String str = this.f32302c;
        final boolean z10 = this.d;
        final boolean z11 = this.f32303e;
        final boolean z12 = this.f32304f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f32305n;
        final AccountInstance accountInstance = this.f32306r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    g2.f31867a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
        }
    }

    public y1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z10;
        this.h = activity;
        this.f32306r = accountInstance;
        this.f32301b = chat;
        this.f32302c = str;
        this.f32300a = user;
        this.f32303e = z11;
        this.f32304f = z12;
        this.f32305n = n2Var;
    }
}
