package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31373c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31374f;
    public final boolean h;
    public final boolean f31375n;
    public final boolean f31376r;
    public final Activity f31377s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31378w;
    public final boolean f31379x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31373c = user;
        this.d = chat2;
        this.e = str;
        this.f31374f = inputPeer;
        this.h = z10;
        this.f31375n = z11;
        this.f31376r = z12;
        this.f31377s = activity;
        this.v = n2Var;
        this.f31378w = accountInstance;
        this.f31379x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31373c, this.d, this.e, this.f31374f, false, this.h, this.f31375n, this.f31376r, this.f31377s, this.v, this.f31378w, false, true, this.f31379x);
    }
}
