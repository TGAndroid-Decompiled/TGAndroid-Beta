package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class c2 extends z70 {
    public final TLRPC.User f31466c;
    public final TLRPC.Chat d;
    public final String f31467e;
    public final TLRPC.InputPeer f31468f;
    public final boolean h;
    public final boolean f31469n;
    public final boolean f31470r;
    public final Activity f31471s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31472w;
    public final boolean f31473x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31466c = user;
        this.d = chat2;
        this.f31467e = str;
        this.f31468f = inputPeer;
        this.h = z10;
        this.f31469n = z11;
        this.f31470r = z12;
        this.f31471s = activity;
        this.v = n2Var;
        this.f31472w = accountInstance;
        this.f31473x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31466c, this.d, this.f31467e, this.f31468f, false, this.h, this.f31469n, this.f31470r, this.f31471s, this.v, this.f31472w, false, true, this.f31473x);
    }
}
