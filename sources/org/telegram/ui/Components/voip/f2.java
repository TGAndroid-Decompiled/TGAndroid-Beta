package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class f2 extends e90 {
    public final TLRPC.User f31679c;
    public final TLRPC.Chat d;
    public final String f31680e;
    public final TLRPC.InputPeer f31681f;
    public final boolean h;
    public final boolean f31682n;
    public final boolean f31683r;
    public final Activity f31684s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f31685w;
    public final boolean f31686x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31679c = user;
        this.d = chat2;
        this.f31680e = str;
        this.f31681f = inputPeer;
        this.h = z10;
        this.f31682n = z11;
        this.f31683r = z12;
        this.f31684s = activity;
        this.v = m2Var;
        this.f31685w = accountInstance;
        this.f31686x = z13;
    }

    @Override
    public final void o() {
        g2.b(this.f31679c, this.d, this.f31680e, this.f31681f, false, this.h, this.f31682n, this.f31683r, this.f31684s, this.v, this.f31685w, false, true, this.f31686x);
    }
}
