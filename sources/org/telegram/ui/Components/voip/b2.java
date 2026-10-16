package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x80;
public final class b2 extends x80 {
    public final TLRPC.User f29784c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29785f;
    public final boolean h;
    public final boolean f29786n;
    public final Activity f29787r;
    public final org.telegram.ui.ActionBar.m2 f29788s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29784c = user;
        this.d = chat2;
        this.e = str;
        this.f29785f = inputPeer;
        this.h = z10;
        this.f29786n = z11;
        this.f29787r = activity;
        this.f29788s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f29784c, this.d, this.e, this.f29785f, true, this.h, this.f29786n, false, this.f29787r, this.f29788s, this.v, false, false, false);
    }
}
