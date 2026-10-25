package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v80;
public final class e2 extends v80 {
    public final TLRPC.User f33784c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33785f;
    public final boolean h;
    public final boolean f33786n;
    public final Activity f33787r;
    public final org.telegram.ui.ActionBar.r2 f33788s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33784c = user;
        this.d = chat2;
        this.e = str;
        this.f33785f = inputPeer;
        this.h = z10;
        this.f33786n = z11;
        this.f33787r = activity;
        this.f33788s = r2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f33784c, this.d, this.e, this.f33785f, true, this.h, this.f33786n, false, this.f33787r, this.f33788s, this.v, false, false, false);
    }
}
