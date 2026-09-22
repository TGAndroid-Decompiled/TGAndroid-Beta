package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class e2 extends z70 {
    public final TLRPC.User f28931c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28932f;
    public final boolean h;
    public final boolean f28933n;
    public final boolean f28934r;
    public final Activity f28935s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f28936w;
    public final boolean f28937x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28931c = user;
        this.d = chat2;
        this.e = str;
        this.f28932f = inputPeer;
        this.h = z10;
        this.f28933n = z11;
        this.f28934r = z12;
        this.f28935s = activity;
        this.v = n2Var;
        this.f28936w = accountInstance;
        this.f28937x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f28931c, this.d, this.e, this.f28932f, false, this.h, this.f28933n, this.f28934r, this.f28935s, this.v, this.f28936w, false, true, this.f28937x);
    }
}
