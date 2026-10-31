package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b50;
public final class e1 implements i70, org.telegram.ui.ActionBar.u1 {
    public final TLRPC.User f31405a;
    public final TLRPC.Chat f31406b;
    public final String f31407c;
    public final boolean d;
    public final boolean e;
    public final boolean f31408f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.k2 f31409n;
    public final org.telegram.messenger.c f31410r;

    public e1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        this.f31405a = user;
        this.f31406b = chat;
        this.f31407c = str;
        this.d = z10;
        this.e = z11;
        this.f31408f = z12;
        this.h = activity;
        this.f31409n = k2Var;
        this.f31410r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f31410r;
        TLRPC.Chat chat = this.f31406b;
        String str = this.f31407c;
        if (z13 && z11) {
            b50.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f31405a;
        boolean z14 = this.e;
        boolean z15 = this.f31408f;
        org.telegram.ui.ActionBar.k2 k2Var = this.f31409n;
        if (!z10 && str != null) {
            l1 l1Var = new l1(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, k2Var, cVar, z12);
            if (k2Var != null) {
                k2Var.showDialog(l1Var);
                return;
            }
            return;
        }
        m1.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, k2Var, cVar, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f31405a;
        final TLRPC.Chat chat = this.f31406b;
        final String str = this.f31407c;
        final boolean z10 = this.d;
        final boolean z11 = this.e;
        final boolean z12 = this.f31408f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.k2 k2Var = this.f31409n;
        final org.telegram.messenger.c cVar = this.f31410r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    m1.f31537a = 0L;
                    m1.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
                }
            });
        } else {
            m1.b(user, chat, str, null, false, z10, z11, z12, activity, k2Var, cVar, true, true, false);
        }
    }

    public e1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = z10;
        this.h = activity;
        this.f31410r = cVar;
        this.f31406b = chat;
        this.f31407c = str;
        this.f31405a = user;
        this.e = z11;
        this.f31408f = z12;
        this.f31409n = k2Var;
    }
}
