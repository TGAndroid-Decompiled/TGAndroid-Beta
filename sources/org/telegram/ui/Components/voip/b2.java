package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class b2 extends z70 {
    public final TLRPC.User f31453c;
    public final TLRPC.Chat d;
    public final String f31454e;
    public final TLRPC.InputPeer f31455f;
    public final boolean h;
    public final boolean f31456n;
    public final Activity f31457r;
    public final org.telegram.ui.ActionBar.n2 f31458s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31453c = user;
        this.d = chat2;
        this.f31454e = str;
        this.f31455f = inputPeer;
        this.h = z10;
        this.f31456n = z11;
        this.f31457r = activity;
        this.f31458s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31453c, this.d, this.f31454e, this.f31455f, true, this.h, this.f31456n, false, this.f31457r, this.f31458s, this.v, false, false, false);
    }
}
