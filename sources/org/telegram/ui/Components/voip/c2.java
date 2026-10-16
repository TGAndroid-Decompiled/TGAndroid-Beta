package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x80;
public final class c2 extends x80 {
    public final TLRPC.User f29806c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29807f;
    public final boolean h;
    public final boolean f29808n;
    public final boolean f29809r;
    public final Activity f29810s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29811w;
    public final boolean f29812x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29806c = user;
        this.d = chat2;
        this.e = str;
        this.f29807f = inputPeer;
        this.h = z10;
        this.f29808n = z11;
        this.f29809r = z12;
        this.f29810s = activity;
        this.v = m2Var;
        this.f29811w = accountInstance;
        this.f29812x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f29806c, this.d, this.e, this.f29807f, false, this.h, this.f29808n, this.f29809r, this.f29810s, this.v, this.f29811w, false, true, this.f29812x);
    }
}
