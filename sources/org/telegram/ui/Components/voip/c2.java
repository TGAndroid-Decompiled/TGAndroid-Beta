package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31417c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31418f;
    public final boolean h;
    public final boolean f31419n;
    public final boolean f31420r;
    public final Activity f31421s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31422w;
    public final boolean f31423x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31417c = user;
        this.d = chat2;
        this.e = str;
        this.f31418f = inputPeer;
        this.h = z10;
        this.f31419n = z11;
        this.f31420r = z12;
        this.f31421s = activity;
        this.v = n2Var;
        this.f31422w = accountInstance;
        this.f31423x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31417c, this.d, this.e, this.f31418f, false, this.h, this.f31419n, this.f31420r, this.f31421s, this.v, this.f31422w, false, true, this.f31423x);
    }
}
