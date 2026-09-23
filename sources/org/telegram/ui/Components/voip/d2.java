package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a80;
public final class d2 extends a80 {
    public final TLRPC.User f28886c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28887f;
    public final boolean h;
    public final boolean f28888n;
    public final Activity f28889r;
    public final org.telegram.ui.ActionBar.n2 f28890s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f28886c = user;
        this.d = chat2;
        this.e = str;
        this.f28887f = inputPeer;
        this.h = z10;
        this.f28888n = z11;
        this.f28889r = activity;
        this.f28890s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f28886c, this.d, this.e, this.f28887f, true, this.h, this.f28888n, false, this.f28889r, this.f28890s, this.v, false, false, false);
    }
}
