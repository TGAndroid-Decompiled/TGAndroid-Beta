package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class e2 extends n80 {
    public final TLRPC.User f31840c;
    public final TLRPC.Chat d;
    public final String f31841e;
    public final TLRPC.InputPeer f31842f;
    public final boolean h;
    public final boolean f31843n;
    public final Activity f31844r;
    public final org.telegram.ui.ActionBar.n2 f31845s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31840c = user;
        this.d = chat2;
        this.f31841e = str;
        this.f31842f = inputPeer;
        this.h = z10;
        this.f31843n = z11;
        this.f31844r = activity;
        this.f31845s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f31840c, this.d, this.f31841e, this.f31842f, true, this.h, this.f31843n, false, this.f31844r, this.f31845s, this.v, false, false, false);
    }
}
