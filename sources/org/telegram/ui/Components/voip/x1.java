package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g60;
public final class x1 implements w80, org.telegram.ui.ActionBar.a2 {
    public final TLRPC.User f32369a;
    public final TLRPC.Chat f32370b;
    public final String f32371c;
    public final boolean d;
    public final boolean f32372e;
    public final boolean f32373f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.n2 f32374n;
    public final AccountInstance f32375r;

    public x1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        this.f32369a = user;
        this.f32370b = chat;
        this.f32371c = str;
        this.d = z10;
        this.f32372e = z11;
        this.f32373f = z12;
        this.h = activity;
        this.f32374n = n2Var;
        this.f32375r = accountInstance;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        AccountInstance accountInstance = this.f32375r;
        TLRPC.Chat chat = this.f32370b;
        String str = this.f32371c;
        if (z13 && z11) {
            g60.d1((LaunchActivity) activity, accountInstance, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f32369a;
        boolean z14 = this.f32372e;
        boolean z15 = this.f32373f;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32374n;
        if (!z10 && str != null) {
            e2 e2Var = new e2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, n2Var, accountInstance, z12);
            if (n2Var != null) {
                n2Var.showDialog(e2Var);
                return;
            }
            return;
        }
        f2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, n2Var, accountInstance, false, true, z12);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f32369a;
        final TLRPC.Chat chat = this.f32370b;
        final String str = this.f32371c;
        final boolean z10 = this.d;
        final boolean z11 = this.f32372e;
        final boolean z12 = this.f32373f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.n2 n2Var = this.f32374n;
        final AccountInstance accountInstance = this.f32375r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    f2.f31934a = 0L;
                    f2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
                }
            });
        } else {
            f2.b(user, chat, str, null, false, z10, z11, z12, activity, n2Var, accountInstance, true, true, false);
        }
    }

    public x1(boolean z10, Activity activity, AccountInstance accountInstance, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.n2 n2Var) {
        this.d = z10;
        this.h = activity;
        this.f32375r = accountInstance;
        this.f32370b = chat;
        this.f32371c = str;
        this.f32369a = user;
        this.f32372e = z11;
        this.f32373f = z12;
        this.f32374n = n2Var;
    }
}
