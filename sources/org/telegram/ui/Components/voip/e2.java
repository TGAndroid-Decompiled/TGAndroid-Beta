package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k80;
public final class e2 extends k80 {
    public final TLRPC.User f29327c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29328f;
    public final boolean h;
    public final boolean f29329n;
    public final Activity f29330r;
    public final org.telegram.ui.ActionBar.m2 f29331s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29327c = user;
        this.d = chat2;
        this.e = str;
        this.f29328f = inputPeer;
        this.h = z10;
        this.f29329n = z11;
        this.f29330r = activity;
        this.f29331s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29327c, this.d, this.e, this.f29328f, true, this.h, this.f29329n, false, this.f29330r, this.f29331s, this.v, false, false, false);
    }
}
