package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class f2 extends m80 {
    public final TLRPC.User f29266c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29267f;
    public final boolean h;
    public final boolean f29268n;
    public final boolean f29269r;
    public final Activity f29270s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29271w;
    public final boolean f29272x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29266c = user;
        this.d = chat2;
        this.e = str;
        this.f29267f = inputPeer;
        this.h = z10;
        this.f29268n = z11;
        this.f29269r = z12;
        this.f29270s = activity;
        this.v = m2Var;
        this.f29271w = accountInstance;
        this.f29272x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29266c, this.d, this.e, this.f29267f, false, this.h, this.f29268n, this.f29269r, this.f29270s, this.v, this.f29271w, false, true, this.f29272x);
    }
}
