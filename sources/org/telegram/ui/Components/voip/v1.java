package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c40;
public final class v1 implements t60, org.telegram.ui.ActionBar.q1 {
    public final TLRPC.User f41004a;
    public final TLRPC.Chat f41005b;
    public final String f41006c;
    public final boolean d;
    public final boolean f41007e;
    public final boolean f41008f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.e2 f41009n;
    public final org.telegram.messenger.c f41010r;

    public v1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar) {
        this.f41004a = user;
        this.f41005b = chat;
        this.f41006c = str;
        this.d = z10;
        this.f41007e = z11;
        this.f41008f = z12;
        this.h = activity;
        this.f41009n = e2Var;
        this.f41010r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f41010r;
        TLRPC.Chat chat = this.f41005b;
        String str = this.f41006c;
        if (z13 && z11) {
            c40.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f41004a;
        boolean z14 = this.f41007e;
        boolean z15 = this.f41008f;
        org.telegram.ui.ActionBar.e2 e2Var = this.f41009n;
        if (!z10 && str != null) {
            b2 b2Var = new b2(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, e2Var, cVar, z12);
            if (e2Var != null) {
                e2Var.showDialog(b2Var);
                return;
            }
            return;
        }
        c2.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, e2Var, cVar, false, true, z12);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f41004a;
        final TLRPC.Chat chat = this.f41005b;
        final String str = this.f41006c;
        final boolean z10 = this.d;
        final boolean z11 = this.f41007e;
        final boolean z12 = this.f41008f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.e2 e2Var = this.f41009n;
        final org.telegram.messenger.c cVar = this.f41010r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    c2.f40537a = 0L;
                    c2.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, e2Var, cVar, true, true, false);
                }
            });
        } else {
            c2.b(user, chat, str, null, false, z10, z11, z12, activity, e2Var, cVar, true, true, false);
        }
    }

    public v1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.e2 e2Var) {
        this.d = z10;
        this.h = activity;
        this.f41010r = cVar;
        this.f41005b = chat;
        this.f41006c = str;
        this.f41004a = user;
        this.f41007e = z11;
        this.f41008f = z12;
        this.f41009n = e2Var;
    }
}
