package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class b2 extends t80 {
    public final TLRPC.User f31403c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31404f;
    public final boolean h;
    public final boolean f31405n;
    public final Activity f31406r;
    public final org.telegram.ui.ActionBar.n2 f31407s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31403c = user;
        this.d = chat2;
        this.e = str;
        this.f31404f = inputPeer;
        this.h = z10;
        this.f31405n = z11;
        this.f31406r = activity;
        this.f31407s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f31403c, this.d, this.e, this.f31404f, true, this.h, this.f31405n, false, this.f31406r, this.f31407s, this.v, false, false, false);
    }
}
