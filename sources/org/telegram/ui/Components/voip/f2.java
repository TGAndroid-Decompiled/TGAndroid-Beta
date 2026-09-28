package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class f2 extends m80 {
    public final TLRPC.User f29267c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29268f;
    public final boolean h;
    public final boolean f29269n;
    public final boolean f29270r;
    public final Activity f29271s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29272w;
    public final boolean f29273x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29267c = user;
        this.d = chat2;
        this.e = str;
        this.f29268f = inputPeer;
        this.h = z10;
        this.f29269n = z11;
        this.f29270r = z12;
        this.f29271s = activity;
        this.v = m2Var;
        this.f29272w = accountInstance;
        this.f29273x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29267c, this.d, this.e, this.f29268f, false, this.h, this.f29269n, this.f29270r, this.f29271s, this.v, this.f29272w, false, true, this.f29273x);
    }
}
