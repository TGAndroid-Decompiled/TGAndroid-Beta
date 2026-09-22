package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class d2 extends k80 {
    public final TLRPC.User f29280c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29281f;
    public final boolean h;
    public final boolean f29282n;
    public final Activity f29283r;
    public final org.telegram.ui.ActionBar.n2 f29284s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29280c = user;
        this.d = chat2;
        this.e = str;
        this.f29281f = inputPeer;
        this.h = z10;
        this.f29282n = z11;
        this.f29283r = activity;
        this.f29284s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f29280c, this.d, this.e, this.f29281f, true, this.h, this.f29282n, false, this.f29283r, this.f29284s, this.v, false, false, false);
    }
}
