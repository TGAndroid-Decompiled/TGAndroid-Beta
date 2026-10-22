package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class c2 extends t80 {
    public final TLRPC.User f31372c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31373f;
    public final boolean h;
    public final boolean f31374n;
    public final boolean f31375r;
    public final Activity f31376s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31377w;
    public final boolean f31378x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31372c = user;
        this.d = chat2;
        this.e = str;
        this.f31373f = inputPeer;
        this.h = z10;
        this.f31374n = z11;
        this.f31375r = z12;
        this.f31376s = activity;
        this.v = n2Var;
        this.f31377w = accountInstance;
        this.f31378x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f31372c, this.d, this.e, this.f31373f, false, this.h, this.f31374n, this.f31375r, this.f31376s, this.v, this.f31377w, false, true, this.f31378x);
    }
}
