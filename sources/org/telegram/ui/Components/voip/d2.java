package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h80;
public final class d2 extends h80 {
    public final TLRPC.User f29318c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29319f;
    public final boolean h;
    public final boolean f29320n;
    public final Activity f29321r;
    public final org.telegram.ui.ActionBar.n2 f29322s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29318c = user;
        this.d = chat2;
        this.e = str;
        this.f29319f = inputPeer;
        this.h = z10;
        this.f29320n = z11;
        this.f29321r = activity;
        this.f29322s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f29318c, this.d, this.e, this.f29319f, true, this.h, this.f29320n, false, this.f29321r, this.f29322s, this.v, false, false, false);
    }
}
