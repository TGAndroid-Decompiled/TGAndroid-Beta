package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31368c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31369f;
    public final boolean h;
    public final boolean f31370n;
    public final boolean f31371r;
    public final Activity f31372s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31373w;
    public final boolean f31374x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31368c = user;
        this.d = chat2;
        this.e = str;
        this.f31369f = inputPeer;
        this.h = z10;
        this.f31370n = z11;
        this.f31371r = z12;
        this.f31372s = activity;
        this.v = n2Var;
        this.f31373w = accountInstance;
        this.f31374x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31368c, this.d, this.e, this.f31369f, false, this.h, this.f31370n, this.f31371r, this.f31372s, this.v, this.f31373w, false, true, this.f31374x);
    }
}
