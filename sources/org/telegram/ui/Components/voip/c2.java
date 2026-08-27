package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;

public final class c2 extends n70 {

    public final TLRPC.User f33514c;
    public final TLRPC.Chat d;

    public final String f33515e;

    public final TLRPC.InputPeer f33516f;
    public final boolean h;

    public final boolean f33517n;

    public final Activity f33518r;

    public final org.telegram.ui.ActionBar.n2 f33519s;
    public final AccountInstance v;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33514c = user;
        this.d = chat2;
        this.f33515e = str;
        this.f33516f = inputPeer;
        this.h = z10;
        this.f33517n = z11;
        this.f33518r = activity;
        this.f33519s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        e2.b(this.f33514c, this.d, this.f33515e, this.f33516f, true, this.h, this.f33517n, false, this.f33518r, this.f33519s, this.v, false, false, false);
    }
}
