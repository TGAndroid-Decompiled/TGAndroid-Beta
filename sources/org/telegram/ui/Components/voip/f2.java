package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class f2 extends m80 {
    public final TLRPC.User f29257c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29258f;
    public final boolean h;
    public final boolean f29259n;
    public final boolean f29260r;
    public final Activity f29261s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29262w;
    public final boolean f29263x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29257c = user;
        this.d = chat2;
        this.e = str;
        this.f29258f = inputPeer;
        this.h = z10;
        this.f29259n = z11;
        this.f29260r = z12;
        this.f29261s = activity;
        this.v = m2Var;
        this.f29262w = accountInstance;
        this.f29263x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29257c, this.d, this.e, this.f29258f, false, this.h, this.f29259n, this.f29260r, this.f29261s, this.v, this.f29262w, false, true, this.f29263x);
    }
}
