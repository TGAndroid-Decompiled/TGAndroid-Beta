package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class f2 extends k80 {
    public final TLRPC.User f29345c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29346f;
    public final boolean h;
    public final boolean f29347n;
    public final boolean f29348r;
    public final Activity f29349s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29350w;
    public final boolean f29351x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29345c = user;
        this.d = chat2;
        this.e = str;
        this.f29346f = inputPeer;
        this.h = z10;
        this.f29347n = z11;
        this.f29348r = z12;
        this.f29349s = activity;
        this.v = m2Var;
        this.f29350w = accountInstance;
        this.f29351x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29345c, this.d, this.e, this.f29346f, false, this.h, this.f29347n, this.f29348r, this.f29349s, this.v, this.f29350w, false, true, this.f29351x);
    }
}
