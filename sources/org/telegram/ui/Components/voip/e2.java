package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class e2 extends v80 {
    public final TLRPC.User f33787c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33788f;
    public final boolean h;
    public final boolean f33789n;
    public final Activity f33790r;
    public final org.telegram.ui.ActionBar.r2 f33791s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33787c = user;
        this.d = chat2;
        this.e = str;
        this.f33788f = inputPeer;
        this.h = z10;
        this.f33789n = z11;
        this.f33790r = activity;
        this.f33791s = r2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f33787c, this.d, this.e, this.f33788f, true, this.h, this.f33789n, false, this.f33790r, this.f33791s, this.v, false, false, false);
    }
}
