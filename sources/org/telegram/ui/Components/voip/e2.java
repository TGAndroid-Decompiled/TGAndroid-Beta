package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
public final class e2 extends h80 {
    public final TLRPC.User f29337c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29338f;
    public final boolean h;
    public final boolean f29339n;
    public final boolean f29340r;
    public final Activity f29341s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f29342w;
    public final boolean f29343x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29337c = user;
        this.d = chat2;
        this.e = str;
        this.f29338f = inputPeer;
        this.h = z10;
        this.f29339n = z11;
        this.f29340r = z12;
        this.f29341s = activity;
        this.v = n2Var;
        this.f29342w = accountInstance;
        this.f29343x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f29337c, this.d, this.e, this.f29338f, false, this.h, this.f29339n, this.f29340r, this.f29341s, this.v, this.f29342w, false, true, this.f29343x);
    }
}
