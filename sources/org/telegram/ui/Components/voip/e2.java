package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class e2 extends e90 {
    public final TLRPC.User f31655c;
    public final TLRPC.Chat d;
    public final String f31656e;
    public final TLRPC.InputPeer f31657f;
    public final boolean h;
    public final boolean f31658n;
    public final Activity f31659r;
    public final org.telegram.ui.ActionBar.m2 f31660s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31655c = user;
        this.d = chat2;
        this.f31656e = str;
        this.f31657f = inputPeer;
        this.h = z10;
        this.f31658n = z11;
        this.f31659r = activity;
        this.f31660s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        g2.b(this.f31655c, this.d, this.f31656e, this.f31657f, true, this.h, this.f31658n, false, this.f31659r, this.f31660s, this.v, false, false, false);
    }
}
