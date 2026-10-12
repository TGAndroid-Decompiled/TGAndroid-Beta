package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y80;
public final class c2 extends y80 {
    public final TLRPC.User f30137c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f30138f;
    public final boolean h;
    public final boolean f30139n;
    public final boolean f30140r;
    public final Activity f30141s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f30142w;
    public final boolean f30143x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f30137c = user;
        this.d = chat2;
        this.e = str;
        this.f30138f = inputPeer;
        this.h = z10;
        this.f30139n = z11;
        this.f30140r = z12;
        this.f30141s = activity;
        this.v = m2Var;
        this.f30142w = accountInstance;
        this.f30143x = z13;
    }

    @Override
    public final void n() {
        d2.b(this.f30137c, this.d, this.e, this.f30138f, false, this.h, this.f30139n, this.f30140r, this.f30141s, this.v, this.f30142w, false, true, this.f30143x);
    }
}
