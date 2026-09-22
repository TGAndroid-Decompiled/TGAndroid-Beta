package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class e2 extends k80 {
    public final TLRPC.User f29299c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29300f;
    public final boolean h;
    public final boolean f29301n;
    public final boolean f29302r;
    public final Activity f29303s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f29304w;
    public final boolean f29305x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29299c = user;
        this.d = chat2;
        this.e = str;
        this.f29300f = inputPeer;
        this.h = z10;
        this.f29301n = z11;
        this.f29302r = z12;
        this.f29303s = activity;
        this.v = n2Var;
        this.f29304w = accountInstance;
        this.f29305x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f29299c, this.d, this.e, this.f29300f, false, this.h, this.f29301n, this.f29302r, this.f29303s, this.v, this.f29304w, false, true, this.f29305x);
    }
}
