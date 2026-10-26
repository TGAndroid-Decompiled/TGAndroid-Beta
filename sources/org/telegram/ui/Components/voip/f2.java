package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class f2 extends v80 {
    public final TLRPC.User f33796c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33797f;
    public final boolean h;
    public final boolean f33798n;
    public final boolean f33799r;
    public final Activity f33800s;
    public final org.telegram.ui.ActionBar.r2 v;
    public final AccountInstance f33801w;
    public final boolean f33802x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33796c = user;
        this.d = chat2;
        this.e = str;
        this.f33797f = inputPeer;
        this.h = z10;
        this.f33798n = z11;
        this.f33799r = z12;
        this.f33800s = activity;
        this.v = r2Var;
        this.f33801w = accountInstance;
        this.f33802x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f33796c, this.d, this.e, this.f33797f, false, this.h, this.f33798n, this.f33799r, this.f33800s, this.v, this.f33801w, false, true, this.f33802x);
    }
}
