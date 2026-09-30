package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class f2 extends n80 {
    public final TLRPC.User f29263c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29264f;
    public final boolean h;
    public final boolean f29265n;
    public final boolean f29266r;
    public final Activity f29267s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29268w;
    public final boolean f29269x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29263c = user;
        this.d = chat2;
        this.e = str;
        this.f29264f = inputPeer;
        this.h = z10;
        this.f29265n = z11;
        this.f29266r = z12;
        this.f29267s = activity;
        this.v = m2Var;
        this.f29268w = accountInstance;
        this.f29269x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29263c, this.d, this.e, this.f29264f, false, this.h, this.f29265n, this.f29266r, this.f29267s, this.v, this.f29268w, false, true, this.f29269x);
    }
}
