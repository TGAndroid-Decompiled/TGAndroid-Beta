package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class b2 extends t80 {
    public final TLRPC.User f31405c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31406f;
    public final boolean h;
    public final boolean f31407n;
    public final Activity f31408r;
    public final org.telegram.ui.ActionBar.n2 f31409s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31405c = user;
        this.d = chat2;
        this.e = str;
        this.f31406f = inputPeer;
        this.h = z10;
        this.f31407n = z11;
        this.f31408r = activity;
        this.f31409s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f31405c, this.d, this.e, this.f31406f, true, this.h, this.f31407n, false, this.f31408r, this.f31409s, this.v, false, false, false);
    }
}
