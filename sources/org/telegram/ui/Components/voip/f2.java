package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class f2 extends n80 {
    public final TLRPC.User f31857c;
    public final TLRPC.Chat d;
    public final String f31858e;
    public final TLRPC.InputPeer f31859f;
    public final boolean h;
    public final boolean f31860n;
    public final boolean f31861r;
    public final Activity f31862s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31863w;
    public final boolean f31864x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31857c = user;
        this.d = chat2;
        this.f31858e = str;
        this.f31859f = inputPeer;
        this.h = z10;
        this.f31860n = z11;
        this.f31861r = z12;
        this.f31862s = activity;
        this.v = n2Var;
        this.f31863w = accountInstance;
        this.f31864x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f31857c, this.d, this.f31858e, this.f31859f, false, this.h, this.f31860n, this.f31861r, this.f31862s, this.v, this.f31863w, false, true, this.f31864x);
    }
}
