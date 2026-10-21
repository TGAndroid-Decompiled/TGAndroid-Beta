package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31369c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31370f;
    public final boolean h;
    public final boolean f31371n;
    public final boolean f31372r;
    public final Activity f31373s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31374w;
    public final boolean f31375x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31369c = user;
        this.d = chat2;
        this.e = str;
        this.f31370f = inputPeer;
        this.h = z10;
        this.f31371n = z11;
        this.f31372r = z12;
        this.f31373s = activity;
        this.v = n2Var;
        this.f31374w = accountInstance;
        this.f31375x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31369c, this.d, this.e, this.f31370f, false, this.h, this.f31371n, this.f31372r, this.f31373s, this.v, this.f31374w, false, true, this.f31375x);
    }
}
