package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
public final class e2 extends a90 {
    public final TLRPC.User f31921c;
    public final TLRPC.Chat d;
    public final String f31922e;
    public final TLRPC.InputPeer f31923f;
    public final boolean h;
    public final boolean f31924n;
    public final boolean f31925r;
    public final Activity f31926s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31927w;
    public final boolean f31928x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31921c = user;
        this.d = chat2;
        this.f31922e = str;
        this.f31923f = inputPeer;
        this.h = z10;
        this.f31924n = z11;
        this.f31925r = z12;
        this.f31926s = activity;
        this.v = n2Var;
        this.f31927w = accountInstance;
        this.f31928x = z13;
    }

    @Override
    public final void o() {
        f2.b(this.f31921c, this.d, this.f31922e, this.f31923f, false, this.h, this.f31924n, this.f31925r, this.f31926s, this.v, this.f31927w, false, true, this.f31928x);
    }
}
