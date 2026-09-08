package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class b2 extends z70 {
    public final TLRPC.User f31452c;
    public final TLRPC.Chat d;
    public final String f31453e;
    public final TLRPC.InputPeer f31454f;
    public final boolean h;
    public final boolean f31455n;
    public final Activity f31456r;
    public final org.telegram.ui.ActionBar.n2 f31457s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31452c = user;
        this.d = chat2;
        this.f31453e = str;
        this.f31454f = inputPeer;
        this.h = z10;
        this.f31455n = z11;
        this.f31456r = activity;
        this.f31457s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31452c, this.d, this.f31453e, this.f31454f, true, this.h, this.f31455n, false, this.f31456r, this.f31457s, this.v, false, false, false);
    }
}
