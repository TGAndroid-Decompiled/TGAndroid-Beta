package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class f2 extends e90 {
    public final TLRPC.User f31664c;
    public final TLRPC.Chat d;
    public final String f31665e;
    public final TLRPC.InputPeer f31666f;
    public final boolean h;
    public final boolean f31667n;
    public final boolean f31668r;
    public final Activity f31669s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f31670w;
    public final boolean f31671x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31664c = user;
        this.d = chat2;
        this.f31665e = str;
        this.f31666f = inputPeer;
        this.h = z10;
        this.f31667n = z11;
        this.f31668r = z12;
        this.f31669s = activity;
        this.v = m2Var;
        this.f31670w = accountInstance;
        this.f31671x = z13;
    }

    @Override
    public final void o() {
        g2.b(this.f31664c, this.d, this.f31665e, this.f31666f, false, this.h, this.f31667n, this.f31668r, this.f31669s, this.v, this.f31670w, false, true, this.f31671x);
    }
}
