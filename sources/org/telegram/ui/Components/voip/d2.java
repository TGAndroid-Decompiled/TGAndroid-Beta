package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
public final class d2 extends i80 {
    public final TLRPC.User f28095c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28096f;
    public final boolean h;
    public final boolean f28097n;
    public final boolean f28098r;
    public final Activity f28099s;
    public final org.telegram.ui.ActionBar.p2 v;
    public final AccountInstance f28100w;
    public final boolean f28101x;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28095c = user;
        this.d = chat2;
        this.e = str;
        this.f28096f = inputPeer;
        this.h = z10;
        this.f28097n = z11;
        this.f28098r = z12;
        this.f28099s = activity;
        this.v = p2Var;
        this.f28100w = accountInstance;
        this.f28101x = z13;
    }

    @Override
    public final void m() {
        e2.b(this.f28095c, this.d, this.e, this.f28096f, false, this.h, this.f28097n, this.f28098r, this.f28099s, this.v, this.f28100w, false, true, this.f28101x);
    }
}
