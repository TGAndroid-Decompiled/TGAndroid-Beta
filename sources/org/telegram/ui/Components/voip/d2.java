package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n70;

public final class d2 extends n70 {

    public final TLRPC.User f33522c;
    public final TLRPC.Chat d;

    public final String f33523e;

    public final TLRPC.InputPeer f33524f;
    public final boolean h;

    public final boolean f33525n;

    public final boolean f33526r;

    public final Activity f33527s;
    public final org.telegram.ui.ActionBar.n2 v;

    public final AccountInstance f33528w;

    public final boolean f33529x;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33522c = user;
        this.d = chat2;
        this.f33523e = str;
        this.f33524f = inputPeer;
        this.h = z10;
        this.f33525n = z11;
        this.f33526r = z12;
        this.f33527s = activity;
        this.v = n2Var;
        this.f33528w = accountInstance;
        this.f33529x = z13;
    }

    @Override
    public final void m() {
        e2.b(this.f33522c, this.d, this.f33523e, this.f33524f, false, this.h, this.f33525n, this.f33526r, this.f33527s, this.v, this.f33528w, false, true, this.f33529x);
    }
}
