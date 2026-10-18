package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31408c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31409f;
    public final boolean h;
    public final boolean f31410n;
    public final boolean f31411r;
    public final Activity f31412s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31413w;
    public final boolean f31414x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31408c = user;
        this.d = chat2;
        this.e = str;
        this.f31409f = inputPeer;
        this.h = z10;
        this.f31410n = z11;
        this.f31411r = z12;
        this.f31412s = activity;
        this.v = n2Var;
        this.f31413w = accountInstance;
        this.f31414x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31408c, this.d, this.e, this.f31409f, false, this.h, this.f31410n, this.f31411r, this.f31412s, this.v, this.f31413w, false, true, this.f31414x);
    }
}
