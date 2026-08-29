package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
public final class g2 extends w70 {
    public final TLRPC.User f33706c;
    public final TLRPC.Chat d;
    public final String f33707e;
    public final TLRPC.InputPeer f33708f;
    public final boolean h;
    public final boolean f33709n;
    public final boolean f33710r;
    public final Activity f33711s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f33712w;
    public final boolean f33713x;

    public g2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33706c = user;
        this.d = chat2;
        this.f33707e = str;
        this.f33708f = inputPeer;
        this.h = z10;
        this.f33709n = z11;
        this.f33710r = z12;
        this.f33711s = activity;
        this.v = o2Var;
        this.f33712w = accountInstance;
        this.f33713x = z13;
    }

    @Override
    public final void m() {
        h2.b(this.f33706c, this.d, this.f33707e, this.f33708f, false, this.h, this.f33709n, this.f33710r, this.f33711s, this.v, this.f33712w, false, true, this.f33713x);
    }
}
