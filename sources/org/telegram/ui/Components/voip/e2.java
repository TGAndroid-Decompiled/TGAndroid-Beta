package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class e2 extends m80 {
    public final TLRPC.User f29258c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29259f;
    public final boolean h;
    public final boolean f29260n;
    public final Activity f29261r;
    public final org.telegram.ui.ActionBar.m2 f29262s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29258c = user;
        this.d = chat2;
        this.e = str;
        this.f29259f = inputPeer;
        this.h = z10;
        this.f29260n = z11;
        this.f29261r = activity;
        this.f29262s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29258c, this.d, this.e, this.f29259f, true, this.h, this.f29260n, false, this.f29261r, this.f29262s, this.v, false, false, false);
    }
}
