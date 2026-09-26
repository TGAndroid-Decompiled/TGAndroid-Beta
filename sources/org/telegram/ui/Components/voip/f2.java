package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
public final class f2 extends l80 {
    public final TLRPC.User f29262c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29263f;
    public final boolean h;
    public final boolean f29264n;
    public final boolean f29265r;
    public final Activity f29266s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f29267w;
    public final boolean f29268x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29262c = user;
        this.d = chat2;
        this.e = str;
        this.f29263f = inputPeer;
        this.h = z10;
        this.f29264n = z11;
        this.f29265r = z12;
        this.f29266s = activity;
        this.v = m2Var;
        this.f29267w = accountInstance;
        this.f29268x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29262c, this.d, this.e, this.f29263f, false, this.h, this.f29264n, this.f29265r, this.f29266s, this.v, this.f29267w, false, true, this.f29268x);
    }
}
