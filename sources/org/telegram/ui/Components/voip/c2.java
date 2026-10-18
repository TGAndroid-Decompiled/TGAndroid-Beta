package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31415c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31416f;
    public final boolean h;
    public final boolean f31417n;
    public final boolean f31418r;
    public final Activity f31419s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31420w;
    public final boolean f31421x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31415c = user;
        this.d = chat2;
        this.e = str;
        this.f31416f = inputPeer;
        this.h = z10;
        this.f31417n = z11;
        this.f31418r = z12;
        this.f31419s = activity;
        this.v = n2Var;
        this.f31420w = accountInstance;
        this.f31421x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31415c, this.d, this.e, this.f31416f, false, this.h, this.f31417n, this.f31418r, this.f31419s, this.v, this.f31420w, false, true, this.f31421x);
    }
}
