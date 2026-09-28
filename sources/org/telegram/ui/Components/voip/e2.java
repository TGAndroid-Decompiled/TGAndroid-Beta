package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class e2 extends m80 {
    public final TLRPC.User f29257c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29258f;
    public final boolean h;
    public final boolean f29259n;
    public final Activity f29260r;
    public final org.telegram.ui.ActionBar.m2 f29261s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29257c = user;
        this.d = chat2;
        this.e = str;
        this.f29258f = inputPeer;
        this.h = z10;
        this.f29259n = z11;
        this.f29260r = activity;
        this.f29261s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29257c, this.d, this.e, this.f29258f, true, this.h, this.f29259n, false, this.f29260r, this.f29261s, this.v, false, false, false);
    }
}
