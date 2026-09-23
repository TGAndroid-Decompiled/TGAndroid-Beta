package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
public final class e2 extends a80 {
    public final TLRPC.User f28905c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28906f;
    public final boolean h;
    public final boolean f28907n;
    public final boolean f28908r;
    public final Activity f28909s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f28910w;
    public final boolean f28911x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28905c = user;
        this.d = chat2;
        this.e = str;
        this.f28906f = inputPeer;
        this.h = z10;
        this.f28907n = z11;
        this.f28908r = z12;
        this.f28909s = activity;
        this.v = n2Var;
        this.f28910w = accountInstance;
        this.f28911x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f28905c, this.d, this.e, this.f28906f, false, this.h, this.f28907n, this.f28908r, this.f28909s, this.v, this.f28910w, false, true, this.f28911x);
    }
}
