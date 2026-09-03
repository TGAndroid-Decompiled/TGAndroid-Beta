package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d60;
public final class x1 implements y70, org.telegram.ui.ActionBar.c2 {
    public final TLRPC.User f32462a;
    public final TLRPC.Chat f32463b;
    public final String f32464c;
    public final boolean d;
    public final boolean f32465e;
    public final boolean f32466f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.p2 f32467n;
    public final AccountInstance f32468r;

    public x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        this.f32462a = user;
        this.f32463b = chat;
        this.f32464c = str;
        this.d = z4;
        this.f32465e = z10;
        this.f32466f = z11;
        this.h = activity;
        this.f32467n = p2Var;
        this.f32468r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f32468r;
        TLRPC.Chat chat = this.f32463b;
        String str = this.f32464c;
        if (z12 && z10) {
            d60.c1((LaunchActivity) activity, accountInstance, chat, inputPeer, z4, str);
            return;
        }
        TLRPC.User user = this.f32462a;
        boolean z13 = this.f32465e;
        boolean z14 = this.f32466f;
        org.telegram.ui.ActionBar.p2 p2Var = this.f32467n;
        if (!z4 && str != null) {
            f2 f2Var = new f2(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, p2Var, accountInstance, z11);
            if (p2Var != null) {
                p2Var.showDialog(f2Var);
                return;
            }
            return;
        }
        g2.b(user, chat, str, inputPeer, z4, z13, z14, z12, activity, p2Var, accountInstance, false, true, z11);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f32462a;
        final TLRPC.Chat chat = this.f32463b;
        final String str = this.f32464c;
        final boolean z4 = this.d;
        final boolean z10 = this.f32465e;
        final boolean z11 = this.f32466f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.p2 p2Var = this.f32467n;
        final AccountInstance accountInstance = this.f32468r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    g2.f32052a = 0L;
                    g2.b(TLRPC.User.this, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
                }
            });
        } else {
            g2.b(user, chat, str, null, false, z4, z10, z11, activity, p2Var, accountInstance, true, true, false);
        }
    }

    public x1(boolean z4, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.p2 p2Var) {
        this.d = z4;
        this.h = activity;
        this.f32468r = accountInstance;
        this.f32463b = chat;
        this.f32464c = str;
        this.f32462a = user;
        this.f32465e = z10;
        this.f32466f = z11;
        this.f32467n = p2Var;
    }
}
