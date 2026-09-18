package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
public final class d2 extends i80 {
    public final TLRPC.User f29211c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29212f;
    public final boolean h;
    public final boolean f29213n;
    public final Activity f29214r;
    public final org.telegram.ui.ActionBar.n2 f29215s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29211c = user;
        this.d = chat2;
        this.e = str;
        this.f29212f = inputPeer;
        this.h = z10;
        this.f29213n = z11;
        this.f29214r = activity;
        this.f29215s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f29211c, this.d, this.e, this.f29212f, true, this.h, this.f29213n, false, this.f29214r, this.f29215s, this.v, false, false, false);
    }
}
