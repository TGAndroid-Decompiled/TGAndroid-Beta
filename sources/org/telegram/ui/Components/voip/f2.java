package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class f2 extends n80 {
    public final TLRPC.User f31924c;
    public final TLRPC.Chat d;
    public final String f31925e;
    public final TLRPC.InputPeer f31926f;
    public final boolean h;
    public final boolean f31927n;
    public final boolean f31928r;
    public final Activity f31929s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31930w;
    public final boolean f31931x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31924c = user;
        this.d = chat2;
        this.f31925e = str;
        this.f31926f = inputPeer;
        this.h = z10;
        this.f31927n = z11;
        this.f31928r = z12;
        this.f31929s = activity;
        this.v = n2Var;
        this.f31930w = accountInstance;
        this.f31931x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f31924c, this.d, this.f31925e, this.f31926f, false, this.h, this.f31927n, this.f31928r, this.f31929s, this.v, this.f31930w, false, true, this.f31931x);
    }
}
