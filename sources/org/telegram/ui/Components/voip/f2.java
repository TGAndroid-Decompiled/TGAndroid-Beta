package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class f2 extends k80 {
    public final TLRPC.User f29336c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29337f;
    public final boolean h;
    public final boolean f29338n;
    public final boolean f29339r;
    public final Activity f29340s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29341w;
    public final boolean f29342x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29336c = user;
        this.d = chat2;
        this.e = str;
        this.f29337f = inputPeer;
        this.h = z10;
        this.f29338n = z11;
        this.f29339r = z12;
        this.f29340s = activity;
        this.v = m2Var;
        this.f29341w = accountInstance;
        this.f29342x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29336c, this.d, this.e, this.f29337f, false, this.h, this.f29338n, this.f29339r, this.f29340s, this.v, this.f29341w, false, true, this.f29342x);
    }
}
