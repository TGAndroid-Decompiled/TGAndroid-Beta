package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e60;
public final class w1 implements x70, org.telegram.ui.ActionBar.c2 {
    public final TLRPC.User f29982a;
    public final TLRPC.Chat f29983b;
    public final String f29984c;
    public final boolean d;
    public final boolean e;
    public final boolean f29985f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.p2 f29986n;
    public final AccountInstance f29987r;

    public w1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        this.f29982a = user;
        this.f29983b = chat;
        this.f29984c = str;
        this.d = z4;
        this.e = z10;
        this.f29985f = z11;
        this.h = activity;
        this.f29986n = p2Var;
        this.f29987r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f29987r;
        TLRPC.Chat chat = this.f29983b;
        String str = this.f29984c;
        if (z12 && z10) {
            e60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z4, str);
            return;
        }
        TLRPC.User user = this.f29982a;
        boolean z13 = this.e;
        boolean z14 = this.f29985f;
        org.telegram.ui.ActionBar.p2 p2Var = this.f29986n;
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
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f29982a;
        final TLRPC.Chat chat = this.f29983b;
        final String str = this.f29984c;
        final boolean z4 = this.d;
        final boolean z10 = this.e;
        final boolean z11 = this.f29985f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.p2 p2Var = this.f29986n;
        final AccountInstance accountInstance = this.f29987r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f29600a = 0L;
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
        this.f29987r = accountInstance;
        this.f29983b = chat;
        this.f29984c = str;
        this.f29982a = user;
        this.e = z10;
        this.f29985f = z11;
        this.f29986n = p2Var;
    }
}
