package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class c2 extends z70 {
    public final TLRPC.User f31440c;
    public final TLRPC.Chat d;
    public final String f31441e;
    public final TLRPC.InputPeer f31442f;
    public final boolean h;
    public final boolean f31443n;
    public final boolean f31444r;
    public final Activity f31445s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31446w;
    public final boolean f31447x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31440c = user;
        this.d = chat2;
        this.f31441e = str;
        this.f31442f = inputPeer;
        this.h = z10;
        this.f31443n = z11;
        this.f31444r = z12;
        this.f31445s = activity;
        this.v = n2Var;
        this.f31446w = accountInstance;
        this.f31447x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31440c, this.d, this.f31441e, this.f31442f, false, this.h, this.f31443n, this.f31444r, this.f31445s, this.v, this.f31446w, false, true, this.f31447x);
    }
}
