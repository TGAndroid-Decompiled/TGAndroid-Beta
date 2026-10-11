package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b90;
public final class f2 extends b90 {
    public final TLRPC.User f31978c;
    public final TLRPC.Chat d;
    public final String f31979e;
    public final TLRPC.InputPeer f31980f;
    public final boolean h;
    public final boolean f31981n;
    public final boolean f31982r;
    public final Activity f31983s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f31984w;
    public final boolean f31985x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31978c = user;
        this.d = chat2;
        this.f31979e = str;
        this.f31980f = inputPeer;
        this.h = z10;
        this.f31981n = z11;
        this.f31982r = z12;
        this.f31983s = activity;
        this.v = m2Var;
        this.f31984w = accountInstance;
        this.f31985x = z13;
    }

    @Override
    public final void o() {
        g2.b(this.f31978c, this.d, this.f31979e, this.f31980f, false, this.h, this.f31981n, this.f31982r, this.f31983s, this.v, this.f31984w, false, true, this.f31985x);
    }
}
