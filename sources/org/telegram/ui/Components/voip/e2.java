package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c80;
public final class e2 extends c80 {
    public final TLRPC.User f29587c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29588f;
    public final boolean h;
    public final boolean f29589n;
    public final boolean f29590r;
    public final Activity f29591s;
    public final org.telegram.ui.ActionBar.p2 v;
    public final AccountInstance f29592w;
    public final boolean f29593x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z12) {
        super(context, chat);
        this.f29587c = user;
        this.d = chat2;
        this.e = str;
        this.f29588f = inputPeer;
        this.h = z4;
        this.f29589n = z10;
        this.f29590r = z11;
        this.f29591s = activity;
        this.v = p2Var;
        this.f29592w = accountInstance;
        this.f29593x = z12;
    }

    @Override
    public final void m() {
        f2.b(this.f29587c, this.d, this.e, this.f29588f, false, this.h, this.f29589n, this.f29590r, this.f29591s, this.v, this.f29592w, false, true, this.f29593x);
    }
}
