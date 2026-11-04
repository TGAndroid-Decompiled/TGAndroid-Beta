package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x30;
public final class g1 implements m60, org.telegram.ui.ActionBar.p1 {
    public final TLRPC.User f39361a;
    public final TLRPC.Chat f39362b;
    public final String f39363c;
    public final boolean d;
    public final boolean f39364e;
    public final boolean f39365f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.d2 f39366n;
    public final org.telegram.messenger.c f39367r;

    public g1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar) {
        this.f39361a = user;
        this.f39362b = chat;
        this.f39363c = str;
        this.d = z10;
        this.f39364e = z11;
        this.f39365f = z12;
        this.h = activity;
        this.f39366n = d2Var;
        this.f39367r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f39367r;
        TLRPC.Chat chat = this.f39362b;
        String str = this.f39363c;
        if (z13 && z11) {
            x30.e1((LaunchActivity) activity, cVar, chat, inputPeer, z10, str);
            return;
        }
        TLRPC.User user = this.f39361a;
        boolean z14 = this.f39364e;
        boolean z15 = this.f39365f;
        org.telegram.ui.ActionBar.d2 d2Var = this.f39366n;
        if (!z10 && str != null) {
            m1 m1Var = new m1(activity, chat, user, chat, str, inputPeer, z14, z15, z13, activity, d2Var, cVar, z12);
            if (d2Var != null) {
                d2Var.showDialog(m1Var);
                return;
            }
            return;
        }
        n1.b(user, chat, str, inputPeer, z10, z14, z15, z13, activity, d2Var, cVar, false, true, z12);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f39361a;
        final TLRPC.Chat chat = this.f39362b;
        final String str = this.f39363c;
        final boolean z10 = this.d;
        final boolean z11 = this.f39364e;
        final boolean z12 = this.f39365f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.d2 d2Var = this.f39366n;
        final org.telegram.messenger.c cVar = this.f39367r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    n1.f39494a = 0L;
                    n1.b(TLRPC.User.this, chat, str, null, false, z10, z11, z12, activity, d2Var, cVar, true, true, false);
                }
            });
        } else {
            n1.b(user, chat, str, null, false, z10, z11, z12, activity, d2Var, cVar, true, true, false);
        }
    }

    public g1(boolean z10, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z11, boolean z12, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = z10;
        this.h = activity;
        this.f39367r = cVar;
        this.f39362b = chat;
        this.f39363c = str;
        this.f39361a = user;
        this.f39364e = z11;
        this.f39365f = z12;
        this.f39366n = d2Var;
    }
}
