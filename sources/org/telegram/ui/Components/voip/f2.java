package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class f2 extends n80 {
    public final TLRPC.User f31850c;
    public final TLRPC.Chat d;
    public final String f31851e;
    public final TLRPC.InputPeer f31852f;
    public final boolean h;
    public final boolean f31853n;
    public final boolean f31854r;
    public final Activity f31855s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31856w;
    public final boolean f31857x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31850c = user;
        this.d = chat2;
        this.f31851e = str;
        this.f31852f = inputPeer;
        this.h = z10;
        this.f31853n = z11;
        this.f31854r = z12;
        this.f31855s = activity;
        this.v = n2Var;
        this.f31856w = accountInstance;
        this.f31857x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f31850c, this.d, this.f31851e, this.f31852f, false, this.h, this.f31853n, this.f31854r, this.f31855s, this.v, this.f31856w, false, true, this.f31857x);
    }
}
