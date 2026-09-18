package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
public final class e2 extends i80 {
    public final TLRPC.User f29230c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29231f;
    public final boolean h;
    public final boolean f29232n;
    public final boolean f29233r;
    public final Activity f29234s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f29235w;
    public final boolean f29236x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29230c = user;
        this.d = chat2;
        this.e = str;
        this.f29231f = inputPeer;
        this.h = z10;
        this.f29232n = z11;
        this.f29233r = z12;
        this.f29234s = activity;
        this.v = n2Var;
        this.f29235w = accountInstance;
        this.f29236x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f29230c, this.d, this.e, this.f29231f, false, this.h, this.f29232n, this.f29233r, this.f29234s, this.v, this.f29235w, false, true, this.f29236x);
    }
}
