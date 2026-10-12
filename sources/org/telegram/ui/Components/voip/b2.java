package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y80;
public final class b2 extends y80 {
    public final TLRPC.User f30115c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f30116f;
    public final boolean h;
    public final boolean f30117n;
    public final Activity f30118r;
    public final org.telegram.ui.ActionBar.m2 f30119s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f30115c = user;
        this.d = chat2;
        this.e = str;
        this.f30116f = inputPeer;
        this.h = z10;
        this.f30117n = z11;
        this.f30118r = activity;
        this.f30119s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f30115c, this.d, this.e, this.f30116f, true, this.h, this.f30117n, false, this.f30118r, this.f30119s, this.v, false, false, false);
    }
}
