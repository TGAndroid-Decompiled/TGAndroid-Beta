package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class c2 extends z70 {
    public final TLRPC.User f31439c;
    public final TLRPC.Chat d;
    public final String f31440e;
    public final TLRPC.InputPeer f31441f;
    public final boolean h;
    public final boolean f31442n;
    public final boolean f31443r;
    public final Activity f31444s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31445w;
    public final boolean f31446x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31439c = user;
        this.d = chat2;
        this.f31440e = str;
        this.f31441f = inputPeer;
        this.h = z10;
        this.f31442n = z11;
        this.f31443r = z12;
        this.f31444s = activity;
        this.v = n2Var;
        this.f31445w = accountInstance;
        this.f31446x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31439c, this.d, this.f31440e, this.f31441f, false, this.h, this.f31442n, this.f31443r, this.f31444s, this.v, this.f31445w, false, true, this.f31446x);
    }
}
