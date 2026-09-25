package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class e2 extends k80 {
    public final TLRPC.User f29337c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29338f;
    public final boolean h;
    public final boolean f29339n;
    public final Activity f29340r;
    public final org.telegram.ui.ActionBar.m2 f29341s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29337c = user;
        this.d = chat2;
        this.e = str;
        this.f29338f = inputPeer;
        this.h = z10;
        this.f29339n = z11;
        this.f29340r = activity;
        this.f29341s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29337c, this.d, this.e, this.f29338f, true, this.h, this.f29339n, false, this.f29340r, this.f29341s, this.v, false, false, false);
    }
}
