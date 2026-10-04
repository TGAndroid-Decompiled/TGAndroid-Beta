package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class e2 extends n80 {
    public final TLRPC.User f31841c;
    public final TLRPC.Chat d;
    public final String f31842e;
    public final TLRPC.InputPeer f31843f;
    public final boolean h;
    public final boolean f31844n;
    public final Activity f31845r;
    public final org.telegram.ui.ActionBar.n2 f31846s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31841c = user;
        this.d = chat2;
        this.f31842e = str;
        this.f31843f = inputPeer;
        this.h = z10;
        this.f31844n = z11;
        this.f31845r = activity;
        this.f31846s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f31841c, this.d, this.f31842e, this.f31843f, true, this.h, this.f31844n, false, this.f31845r, this.f31846s, this.v, false, false, false);
    }
}
