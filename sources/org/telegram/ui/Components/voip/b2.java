package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class b2 extends t80 {
    public final TLRPC.User f31396c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31397f;
    public final boolean h;
    public final boolean f31398n;
    public final Activity f31399r;
    public final org.telegram.ui.ActionBar.n2 f31400s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31396c = user;
        this.d = chat2;
        this.e = str;
        this.f31397f = inputPeer;
        this.h = z10;
        this.f31398n = z11;
        this.f31399r = activity;
        this.f31400s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f31396c, this.d, this.e, this.f31397f, true, this.h, this.f31398n, false, this.f31399r, this.f31400s, this.v, false, false, false);
    }
}
