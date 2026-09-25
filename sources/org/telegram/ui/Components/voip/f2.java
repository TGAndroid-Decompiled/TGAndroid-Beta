package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class f2 extends k80 {
    public final TLRPC.User f29346c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29347f;
    public final boolean h;
    public final boolean f29348n;
    public final boolean f29349r;
    public final Activity f29350s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29351w;
    public final boolean f29352x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29346c = user;
        this.d = chat2;
        this.e = str;
        this.f29347f = inputPeer;
        this.h = z10;
        this.f29348n = z11;
        this.f29349r = z12;
        this.f29350s = activity;
        this.v = m2Var;
        this.f29351w = accountInstance;
        this.f29352x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29346c, this.d, this.e, this.f29347f, false, this.h, this.f29348n, this.f29349r, this.f29350s, this.v, this.f29351w, false, true, this.f29352x);
    }
}
