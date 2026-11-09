package org.telegram.ui.Components.voip;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e40;
public final class r1 implements s60, org.telegram.ui.ActionBar.r1 {
    public final TLRPC.User f39587a;
    public final TLRPC.Chat f39588b;
    public final String f39589c;
    public final boolean d;
    public final boolean f39590e;
    public final boolean f39591f;
    public final Activity h;
    public final org.telegram.ui.ActionBar.f2 f39592n;
    public final org.telegram.messenger.c f39593r;

    public r1(TLRPC.User user, TLRPC.Chat chat, String str, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        this.f39587a = user;
        this.f39588b = chat;
        this.f39589c = str;
        this.d = z9;
        this.f39590e = z10;
        this.f39591f = z11;
        this.h = activity;
        this.f39592n = f2Var;
        this.f39593r = cVar;
    }

    @Override
    public void a(TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11) {
        boolean z12 = this.d;
        Activity activity = this.h;
        org.telegram.messenger.c cVar = this.f39593r;
        TLRPC.Chat chat = this.f39588b;
        String str = this.f39589c;
        if (z12 && z10) {
            e40.e1((LaunchActivity) activity, cVar, chat, inputPeer, z9, str);
            return;
        }
        TLRPC.User user = this.f39587a;
        boolean z13 = this.f39590e;
        boolean z14 = this.f39591f;
        org.telegram.ui.ActionBar.f2 f2Var = this.f39592n;
        if (!z9 && str != null) {
            x1 x1Var = new x1(activity, chat, user, chat, str, inputPeer, z13, z14, z12, activity, f2Var, cVar, z11);
            if (f2Var != null) {
                f2Var.showDialog(x1Var);
                return;
            }
            return;
        }
        y1.b(user, chat, str, inputPeer, z9, z13, z14, z12, activity, f2Var, cVar, false, true, z11);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.f39587a;
        final TLRPC.Chat chat = this.f39588b;
        final String str = this.f39589c;
        final boolean z9 = this.d;
        final boolean z10 = this.f39590e;
        final boolean z11 = this.f39591f;
        final Activity activity = this.h;
        final org.telegram.ui.ActionBar.f2 f2Var = this.f39592n;
        final org.telegram.messenger.c cVar = this.f39593r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    y1.f39750a = 0L;
                    y1.b(TLRPC.User.this, chat, str, null, false, z9, z10, z11, activity, f2Var, cVar, true, true, false);
                }
            });
        } else {
            y1.b(user, chat, str, null, false, z9, z10, z11, activity, f2Var, cVar, true, true, false);
        }
    }

    public r1(boolean z9, Activity activity, org.telegram.messenger.c cVar, TLRPC.Chat chat, String str, TLRPC.User user, boolean z10, boolean z11, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = z9;
        this.h = activity;
        this.f39593r = cVar;
        this.f39588b = chat;
        this.f39589c = str;
        this.f39587a = user;
        this.f39590e = z10;
        this.f39591f = z11;
        this.f39592n = f2Var;
    }
}
