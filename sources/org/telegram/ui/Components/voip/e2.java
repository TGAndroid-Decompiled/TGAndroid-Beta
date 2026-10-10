package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b90;
public final class e2 extends b90 {
    public final TLRPC.User f31986c;
    public final TLRPC.Chat d;
    public final String f31987e;
    public final TLRPC.InputPeer f31988f;
    public final boolean h;
    public final boolean f31989n;
    public final boolean f31990r;
    public final Activity f31991s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31992w;
    public final boolean f31993x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31986c = user;
        this.d = chat2;
        this.f31987e = str;
        this.f31988f = inputPeer;
        this.h = z10;
        this.f31989n = z11;
        this.f31990r = z12;
        this.f31991s = activity;
        this.v = n2Var;
        this.f31992w = accountInstance;
        this.f31993x = z13;
    }

    @Override
    public final void o() {
        f2.b(this.f31986c, this.d, this.f31987e, this.f31988f, false, this.h, this.f31989n, this.f31990r, this.f31991s, this.v, this.f31992w, false, true, this.f31993x);
    }
}
