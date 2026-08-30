package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
public final class e2 extends b80 {
    public final TLRPC.User f29615c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29616f;
    public final boolean h;
    public final boolean f29617n;
    public final boolean f29618r;
    public final Activity f29619s;
    public final org.telegram.ui.ActionBar.p2 v;
    public final AccountInstance f29620w;
    public final boolean f29621x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z12) {
        super(context, chat);
        this.f29615c = user;
        this.d = chat2;
        this.e = str;
        this.f29616f = inputPeer;
        this.h = z4;
        this.f29617n = z10;
        this.f29618r = z11;
        this.f29619s = activity;
        this.v = p2Var;
        this.f29620w = accountInstance;
        this.f29621x = z12;
    }

    @Override
    public final void m() {
        f2.b(this.f29615c, this.d, this.e, this.f29616f, false, this.h, this.f29617n, this.f29618r, this.f29619s, this.v, this.f29620w, false, true, this.f29621x);
    }
}
