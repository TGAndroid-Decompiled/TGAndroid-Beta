package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class e2 extends n80 {
    public final TLRPC.User f29254c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29255f;
    public final boolean h;
    public final boolean f29256n;
    public final Activity f29257r;
    public final org.telegram.ui.ActionBar.m2 f29258s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29254c = user;
        this.d = chat2;
        this.e = str;
        this.f29255f = inputPeer;
        this.h = z10;
        this.f29256n = z11;
        this.f29257r = activity;
        this.f29258s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29254c, this.d, this.e, this.f29255f, true, this.h, this.f29256n, false, this.f29257r, this.f29258s, this.v, false, false, false);
    }
}
