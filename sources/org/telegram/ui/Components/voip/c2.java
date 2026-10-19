package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31419c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31420f;
    public final boolean h;
    public final boolean f31421n;
    public final boolean f31422r;
    public final Activity f31423s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31424w;
    public final boolean f31425x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31419c = user;
        this.d = chat2;
        this.e = str;
        this.f31420f = inputPeer;
        this.h = z10;
        this.f31421n = z11;
        this.f31422r = z12;
        this.f31423s = activity;
        this.v = n2Var;
        this.f31424w = accountInstance;
        this.f31425x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31419c, this.d, this.e, this.f31420f, false, this.h, this.f31421n, this.f31422r, this.f31423s, this.v, this.f31424w, false, true, this.f31425x);
    }
}
