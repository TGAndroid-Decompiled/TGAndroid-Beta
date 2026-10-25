package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class f2 extends v80 {
    public final TLRPC.User f33793c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33794f;
    public final boolean h;
    public final boolean f33795n;
    public final boolean f33796r;
    public final Activity f33797s;
    public final org.telegram.ui.ActionBar.r2 v;
    public final AccountInstance f33798w;
    public final boolean f33799x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33793c = user;
        this.d = chat2;
        this.e = str;
        this.f33794f = inputPeer;
        this.h = z10;
        this.f33795n = z11;
        this.f33796r = z12;
        this.f33797s = activity;
        this.v = r2Var;
        this.f33798w = accountInstance;
        this.f33799x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f33793c, this.d, this.e, this.f33794f, false, this.h, this.f33795n, this.f33796r, this.f33797s, this.v, this.f33798w, false, true, this.f33799x);
    }
}
