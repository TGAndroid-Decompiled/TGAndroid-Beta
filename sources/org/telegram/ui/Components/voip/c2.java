package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
public final class c2 extends u80 {
    public final TLRPC.User f31554c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31555f;
    public final boolean h;
    public final boolean f31556n;
    public final boolean f31557r;
    public final Activity f31558s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f31559w;
    public final boolean f31560x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31554c = user;
        this.d = chat2;
        this.e = str;
        this.f31555f = inputPeer;
        this.h = z10;
        this.f31556n = z11;
        this.f31557r = z12;
        this.f31558s = activity;
        this.v = o2Var;
        this.f31559w = accountInstance;
        this.f31560x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31554c, this.d, this.e, this.f31555f, false, this.h, this.f31556n, this.f31557r, this.f31558s, this.v, this.f31559w, false, true, this.f31560x);
    }
}
