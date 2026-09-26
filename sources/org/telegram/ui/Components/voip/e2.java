package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
public final class e2 extends l80 {
    public final TLRPC.User f29253c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29254f;
    public final boolean h;
    public final boolean f29255n;
    public final Activity f29256r;
    public final org.telegram.ui.ActionBar.m2 f29257s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29253c = user;
        this.d = chat2;
        this.e = str;
        this.f29254f = inputPeer;
        this.h = z10;
        this.f29255n = z11;
        this.f29256r = activity;
        this.f29257s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29253c, this.d, this.e, this.f29254f, true, this.h, this.f29255n, false, this.f29256r, this.f29257s, this.v, false, false, false);
    }
}
